
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
package org.sireum.aadl.osate.securitymodel.formatting2;

import com.google.inject.Inject;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.osate.xtext.aadl2.properties.formatting2.PropertiesFormatter;
import org.sireum.aadl.osate.securitymodel.secMF.SMFClassification;
import org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification;
import org.sireum.aadl.osate.securitymodel.secMF.SecMFRoot;
import org.sireum.aadl.osate.securitymodel.secMF.SecModelSubclause;
import org.sireum.aadl.osate.securitymodel.services.SecMFGrammarAccess;

class SecMFFormatter extends PropertiesFormatter {
	
	@Inject extension SecMFGrammarAccess

	def dispatch void format(SecMFRoot secmfroot, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (SecModelSubclause subclauses : secmfroot.getSubclauses()) {
			format(subclauses, document);
		}
	}

	def dispatch void format(SecModelSubclause secmodelsubclause, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (SMFClassification classification : secmodelsubclause.getClassification()) {
			format(classification, document);
		}
		for (SMFDeclassification declassification : secmodelsubclause.getDeclassification()) {
			format(declassification, document);
		}
	}

	def dispatch void format(SMFClassification smfclassification, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(smfclassification.getFeature(), document);
		format(smfclassification.getTypeRef(), document);
	}

	def dispatch void format(SMFDeclassification smfdeclassification, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(smfdeclassification.getSrcName(), document);
		format(smfdeclassification.getSnkName(), document);
	}
}
