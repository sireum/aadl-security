package org.sireum.aadl.osate.securitymodel.parsing;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.osate.annexsupport.AnnexLinkingService;
import org.sireum.aadl.osate.securitymodel.naming.SMFQualifiedNameProvider;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class SMFAnnexLinkingService implements AnnexLinkingService {

	@Inject
	private DefaultLinkingService linkingService;

	@Inject
	private SMFQualifiedNameProvider nameProvider;

	public SMFAnnexLinkingService() {
		Injector injector = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createFileURI("dummy.smf")).get(Injector.class);
		injector.injectMembers(this);
	}

	@Override
	public List<EObject> resolveAnnexReference(String annexName, EObject context, EReference reference, INode node) {
		// TODO Auto-generated method stub
		if (annexName.equalsIgnoreCase("SMF")) {
			return linkingService.getLinkedObjects(context, reference, node);
		} else {
			return Collections.<EObject> emptyList();
		}
	}

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		// TODO Auto-generated method stub
		QualifiedName t = nameProvider.getFullyQualifiedName(obj);
		return t;
	}

}
