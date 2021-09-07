package org.sireum.aadl.osate.securitymodel.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.NamedElement;
import org.sireum.aadl.osate.securitymodel.secMF.SMFClassification;
import org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification;
import org.sireum.aadl.osate.securitymodel.secMF.SMFTypeRef;
import org.sireum.aadl.osate.securitymodel.secMF.SecMFRoot;
import org.sireum.aadl.osate.securitymodel.secMF.SecModelLibrary;
import org.sireum.aadl.osate.securitymodel.secMF.SecModelSubclause;

public class SMFQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	@Override
	public QualifiedName getFullyQualifiedName(final EObject obj) {
		if (obj instanceof SecModelLibrary || obj instanceof SecModelSubclause || obj instanceof SMFTypeRef
				|| obj instanceof SMFClassification || obj instanceof SMFDeclassification) {
			;
			NamedElement namedElement = (NamedElement) obj;
			NamedElement root = namedElement.getElementRoot();
			if (namedElement.getName() == null || !(root instanceof AadlPackage || root instanceof SecMFRoot)
					|| (obj instanceof SecModelSubclause && !(root instanceof SecMFRoot))) {
				return null;
			}
			return getConverter().toQualifiedName(getTheName(namedElement));
		}
		if (obj instanceof AadlPackage) {
			return getConverter().toQualifiedName(((AadlPackage) obj).getName());
		}
		return null;
	}

	protected String getTheName(NamedElement nameElement) {
		NamedElement root = nameElement.getElementRoot();
		if (root instanceof SecMFRoot) {
			if (nameElement instanceof SecModelLibrary || nameElement instanceof SecModelSubclause) {
				return nameElement.getName();
			}
			SecModelLibrary sml = null;// ((SecMFRoot) root).getLibrary();
			if(sml != null) {
				return root.getName()+"::"+nameElement.getName();
			}
		}
		if(nameElement instanceof SecModelLibrary) {
			return "smf$"+root.getName();
		}
		return "smf$" + root.getName() + "::" + nameElement.getName();
	}
}
