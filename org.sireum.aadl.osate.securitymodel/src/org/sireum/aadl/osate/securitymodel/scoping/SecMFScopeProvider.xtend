
/** Copyright (c) 2020, Hariharan Thiagarajan, Kansas State University
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.sireum.aadl.osate.securitymodel.scoping

import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.emf.ecore.EReference
import org.osate.aadl2.BasicPropertyAssociation
import org.osate.aadl2.PropertyType
import org.sireum.aadl.osate.securitymodel.serializer.SecMFCrossReferenceSerializer
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.EObjectDescription
import org.sireum.aadl.osate.securitymodel.secMF.SecModelLibrary

import static extension org.eclipse.emf.ecore.util.EcoreUtil.resolve
import static extension org.eclipse.xtext.EcoreUtil2.getContainerOfType
import org.sireum.aadl.osate.securitymodel.secMF.SMFTypeRef
import org.sireum.aadl.osate.securitymodel.secMF.SMFClassification
import org.osate.aadl2.Classifier
import org.osate.aadl2.ComponentImplementation
import org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification
import org.osate.aadl2.ComponentType
import org.osate.aadl2.AadlPackage
import org.osate.aadl2.PackageSection
import org.osate.aadl2.impl.AadlPackageImpl
import org.osate.aadl2.DefaultAnnexLibrary

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 *
 */
class SecMFScopeProvider extends org.osate.xtext.aadl2.properties.scoping.PropertiesScopeProvider {
	@Inject
	IQualifiedNameConverter qualifiedNameConverter
	
	def scope_SMFTypeRef(SecModelLibrary context, EReference reference) {
		scopeWithoutSMFPrefix(context, reference)
	}

	def scope_SecModelLibrary(EObject context, EReference reference) {
		scopeWithoutSMFPrefix(context, reference)
	}
	
	def scope_SMFClassification_feature(SMFClassification context, EReference reference) {
		val classifier = context.getContainerOfType(Classifier)
		
		
		(classifier.getAllFeatures +
					if (classifier instanceof ComponentImplementation) {
						classifier.allInternalFeatures
					} else {
						emptyList
					}).scopeFor
	}
	
	def scope_SMFClassification_typeRef(PackageSection context, EReference reference) {
		scopeForTypes(context, reference)
	}
	
	def scope_SMFDeclassification_flow(SMFDeclassification context, EReference reference) {
		val classifier = context.getContainerOfType(Classifier)
	
		(if(classifier instanceof ComponentType){
			classifier.getAllFlowSpecifications
		} else{
			emptyList
		}).scopeFor
	}

	def private scopeWithoutSMFPrefix(EObject context, EReference reference) {
		new SimpleScope(delegateGetScope(context, reference).allElements.map [
			val nameAsString = name.toString("::")
			if (nameAsString.startsWith(SecMFCrossReferenceSerializer.PREFIX)) {
				val strippedName = nameAsString.substring(SecMFCrossReferenceSerializer.PREFIX.length)
				EObjectDescription.create(qualifiedNameConverter.toQualifiedName(strippedName), EObjectOrProxy)
			} else {
				it
			}
		], true)
	}
	
	def scope_SMFDeclassification_srcName(PackageSection context, EReference reference) {
		scopeForTypes(context, reference)
	}
	
	def scope_SMFDeclassification_snkName(PackageSection context, EReference reference) {
		scopeForTypes(context, reference)
	}
	
	def private scopeForTypes(PackageSection context, EReference reference) {
		(context.getImportedUnits.map[mu | 
			if(mu instanceof AadlPackageImpl) {
				val al = (mu as AadlPackageImpl).getPublicSection
				val sl = al.getOwnedAnnexLibraries.map[(it as DefaultAnnexLibrary).getParsedAnnexLibrary].filter[it instanceof SecModelLibrary]
				val sll = sl.map[it as SecModelLibrary]
				sll.map[it.getTypes].flatten
			} else {
				emptyList
			}
		]).flatten.scopeFor
	}

}
