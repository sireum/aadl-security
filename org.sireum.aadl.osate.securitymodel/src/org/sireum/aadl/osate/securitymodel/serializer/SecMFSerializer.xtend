package org.sireum.aadl.osate.securitymodel.serializer

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.serializer.impl.Serializer
import org.sireum.aadl.osate.securitymodel.services.SecMFGrammarAccess
import org.sireum.aadl.osate.securitymodel.secMF.SecModelLibrary
import org.sireum.aadl.osate.securitymodel.secMF.SecModelSubclause

class SecMFSerializer extends Serializer {
	@Inject SecMFGrammarAccess grammarAccess
	
	override protected getIContext(EObject semanticObject) {
		switch semanticObject {
			SecModelLibrary: contextFinder.findByContents(semanticObject, null).findFirst[parserRule == grammarAccess.secModelLibraryRule]
			SecModelSubclause: contextFinder.findByContents(semanticObject, null).findFirst[parserRule == grammarAccess.getSecModelSubclauseRule]
		}
	}
}