package org.sireum.aadl.osate.securitymodel.serializer

import org.eclipse.xtext.serializer.tokens.CrossReferenceSerializer
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor
import org.eclipse.xtext.GrammarUtil
import org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage
import org.sireum.aadl.osate.securitymodel.secMF.SMFTypeRef
import org.eclipse.xtext.naming.QualifiedName

import static extension org.eclipse.xtext.EcoreUtil2.getContainerOfType
import org.osate.aadl2.AadlPackage

class SecMFCrossReferenceSerializer extends CrossReferenceSerializer {
	val public static PREFIX = "smf$"
	
	override serializeCrossRef(EObject semanticObject, CrossReference crossref, EObject target, INode node, Acceptor errors) {
		val crossRefString = super.serializeCrossRef(semanticObject, crossref, target, node, errors)
		if (crossRefString.startsWith(PREFIX)) {
			crossRefString.substring(PREFIX.length)
		} else {
			crossRefString
		}
	}
	
	override protected getCrossReferenceNameFromScope(EObject semanticObject, CrossReference crossref, EObject target,
		IScope scope, Acceptor errors) {
		/*
		 * For references to ErrorType or TypeSet that must be qualified, use the package name where the ErrorType or
		 * TypeSet is actually declared. This fixes a problem where the reference was being qualified with an error
		 * library which extends the library that contains the definition. If the reference does not need to be
		 * qualified, then use a simple name.
		 * 
		 * getCrossReferenceNameFromScope is only called if there is no node model. If there is a node model, then the
		 * reference is serialized based on the original text.
		 * 
		 * See https://github.com/osate/osate2/issues/1399
		 */
		switch GrammarUtil.getReference(crossref) {
			case SecMFPackage.Literals.SMF_TYPE_DEF__TYPE :{
				val simpleName = (target as SMFTypeRef).name
				if (scope.getSingleElement(QualifiedName.create(simpleName)) === null) {
					target.getContainerOfType(AadlPackage).name + "::" + simpleName
				} else {
					simpleName
				}
			}
			default: super.getCrossReferenceNameFromScope(semanticObject, crossref, target, scope, errors)
		}
		
		}
		
}