
/** Copyright (c) 2021, Kansas State University
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
parser grammar InternalSecMFParser;

options {
	tokenVocab=InternalSecMFLexer;
	superClass=AbstractInternalContentAssistParser;
}

@header {
package org.sireum.aadl.osate.securitymodel.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.sireum.aadl.osate.securitymodel.services.SecMFGrammarAccess;

}
@members {
	private SecMFGrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
		tokenNameToValue.put("LeftParenthesis", "'('");
		tokenNameToValue.put("RightParenthesis", "')'");
		tokenNameToValue.put("Asterisk", "'*'");
		tokenNameToValue.put("PlusSign", "'+'");
		tokenNameToValue.put("Comma", "','");
		tokenNameToValue.put("HyphenMinus", "'-'");
		tokenNameToValue.put("FullStop", "'.'");
		tokenNameToValue.put("Colon", "':'");
		tokenNameToValue.put("Semicolon", "';'");
		tokenNameToValue.put("LeftSquareBracket", "'['");
		tokenNameToValue.put("RightSquareBracket", "']'");
		tokenNameToValue.put("LeftCurlyBracket", "'{'");
		tokenNameToValue.put("RightCurlyBracket", "'}'");
		tokenNameToValue.put("HyphenMinusGreaterThanSign", "'->'");
		tokenNameToValue.put("FullStopFullStop", "'..'");
		tokenNameToValue.put("ColonColon", "'::'");
		tokenNameToValue.put("EqualsSignGreaterThanSign", "'=>'");
		tokenNameToValue.put("In", "'in'");
		tokenNameToValue.put("To", "'to'");
		tokenNameToValue.put("AsteriskAsteriskRightCurlyBracket", "'**}'");
		tokenNameToValue.put("PlusSignEqualsSignGreaterThanSign", "'+=>'");
		tokenNameToValue.put("Any", "'any'");
		tokenNameToValue.put("End", "'end'");
		tokenNameToValue.put("LeftCurlyBracketAsteriskAsterisk", "'{**'");
		tokenNameToValue.put("True", "'true'");
		tokenNameToValue.put("Type", "'type'");
		tokenNameToValue.put("Annex", "'annex'");
		tokenNameToValue.put("Delta", "'delta'");
		tokenNameToValue.put("False", "'false'");
		tokenNameToValue.put("Modes", "'modes'");
		tokenNameToValue.put("Types", "'types'");
		tokenNameToValue.put("Domain", "'domain'");
		tokenNameToValue.put("Public", "'public'");
		tokenNameToValue.put("Applies", "'applies'");
		tokenNameToValue.put("Binding", "'binding'");
		tokenNameToValue.put("Compute", "'compute'");
		tokenNameToValue.put("Extends", "'extends'");
		tokenNameToValue.put("Library", "'library'");
		tokenNameToValue.put("Package", "'package'");
		tokenNameToValue.put("Constant", "'constant'");
		tokenNameToValue.put("Reference", "'reference'");
		tokenNameToValue.put("Subclause", "'subclause'");
		tokenNameToValue.put("Classifier", "'classifier'");
		tokenNameToValue.put("Classification", "'classification'");
		tokenNameToValue.put("DeClassification", "'de-classification'");
	}

	public void setGrammarAccess(SecMFGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		String result = tokenNameToValue.get(tokenName);
		if (result == null)
			result = tokenName;
		return result;
	}
}

// Entry rule entryRuleSecMFRoot
entryRuleSecMFRoot
:
{ before(grammarAccess.getSecMFRootRule()); }
	 ruleSecMFRoot
{ after(grammarAccess.getSecMFRootRule()); } 
	 EOF 
;

// Rule SecMFRoot
ruleSecMFRoot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSecMFRootAccess().getGroup()); }
		(rule__SecMFRoot__Group__0)
		{ after(grammarAccess.getSecMFRootAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSecModelLibrary
entryRuleSecModelLibrary
:
{ before(grammarAccess.getSecModelLibraryRule()); }
	 ruleSecModelLibrary
{ after(grammarAccess.getSecModelLibraryRule()); } 
	 EOF 
;

// Rule SecModelLibrary
ruleSecModelLibrary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSecModelLibraryAccess().getGroup()); }
		(rule__SecModelLibrary__Group__0)
		{ after(grammarAccess.getSecModelLibraryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSMFLibrary
entryRuleSMFLibrary
:
{ before(grammarAccess.getSMFLibraryRule()); }
	 ruleSMFLibrary
{ after(grammarAccess.getSMFLibraryRule()); } 
	 EOF 
;

// Rule SMFLibrary
ruleSMFLibrary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSMFLibraryAccess().getAlternatives()); }
		(rule__SMFLibrary__Alternatives)
		{ after(grammarAccess.getSMFLibraryAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSMFSubclause
entryRuleSMFSubclause
:
{ before(grammarAccess.getSMFSubclauseRule()); }
	 ruleSMFSubclause
{ after(grammarAccess.getSMFSubclauseRule()); } 
	 EOF 
;

// Rule SMFSubclause
ruleSMFSubclause 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSMFSubclauseAccess().getGroup()); }
		(rule__SMFSubclause__Group__0)
		{ after(grammarAccess.getSMFSubclauseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSecModelSubclause
entryRuleSecModelSubclause
:
{ before(grammarAccess.getSecModelSubclauseRule()); }
	 ruleSecModelSubclause
{ after(grammarAccess.getSecModelSubclauseRule()); } 
	 EOF 
;

// Rule SecModelSubclause
ruleSecModelSubclause 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSecModelSubclauseAccess().getGroup()); }
		(rule__SecModelSubclause__Group__0)
		{ after(grammarAccess.getSecModelSubclauseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSMFClassification
entryRuleSMFClassification
:
{ before(grammarAccess.getSMFClassificationRule()); }
	 ruleSMFClassification
{ after(grammarAccess.getSMFClassificationRule()); } 
	 EOF 
;

// Rule SMFClassification
ruleSMFClassification 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSMFClassificationAccess().getGroup()); }
		(rule__SMFClassification__Group__0)
		{ after(grammarAccess.getSMFClassificationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSMFTypeRef
entryRuleSMFTypeRef
:
{ before(grammarAccess.getSMFTypeRefRule()); }
	 ruleSMFTypeRef
{ after(grammarAccess.getSMFTypeRefRule()); } 
	 EOF 
;

// Rule SMFTypeRef
ruleSMFTypeRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSMFTypeRefAccess().getSMFTypeDefParserRuleCall()); }
		ruleSMFTypeDef
		{ after(grammarAccess.getSMFTypeRefAccess().getSMFTypeDefParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSMFDeclassification
entryRuleSMFDeclassification
:
{ before(grammarAccess.getSMFDeclassificationRule()); }
	 ruleSMFDeclassification
{ after(grammarAccess.getSMFDeclassificationRule()); } 
	 EOF 
;

// Rule SMFDeclassification
ruleSMFDeclassification 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSMFDeclassificationAccess().getGroup()); }
		(rule__SMFDeclassification__Group__0)
		{ after(grammarAccess.getSMFDeclassificationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSMFTypeDef
entryRuleSMFTypeDef
:
{ before(grammarAccess.getSMFTypeDefRule()); }
	 ruleSMFTypeDef
{ after(grammarAccess.getSMFTypeDefRule()); } 
	 EOF 
;

// Rule SMFTypeDef
ruleSMFTypeDef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSMFTypeDefAccess().getGroup()); }
		(rule__SMFTypeDef__Group__0)
		{ after(grammarAccess.getSMFTypeDefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClassificationKeywords
entryRuleClassificationKeywords
:
{ before(grammarAccess.getClassificationKeywordsRule()); }
	 ruleClassificationKeywords
{ after(grammarAccess.getClassificationKeywordsRule()); } 
	 EOF 
;

// Rule ClassificationKeywords
ruleClassificationKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClassificationKeywordsAccess().getClassificationKeyword()); }
		Classification
		{ after(grammarAccess.getClassificationKeywordsAccess().getClassificationKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDeclassificationKeywords
entryRuleDeclassificationKeywords
:
{ before(grammarAccess.getDeclassificationKeywordsRule()); }
	 ruleDeclassificationKeywords
{ after(grammarAccess.getDeclassificationKeywordsRule()); } 
	 EOF 
;

// Rule DeclassificationKeywords
ruleDeclassificationKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeclassificationKeywordsAccess().getDeClassificationKeyword()); }
		DeClassification
		{ after(grammarAccess.getDeclassificationKeywordsAccess().getDeClassificationKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDomainTypesKeywords
entryRuleDomainTypesKeywords
:
{ before(grammarAccess.getDomainTypesKeywordsRule()); }
	 ruleDomainTypesKeywords
{ after(grammarAccess.getDomainTypesKeywordsRule()); } 
	 EOF 
;

// Rule DomainTypesKeywords
ruleDomainTypesKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDomainTypesKeywordsAccess().getGroup()); }
		(rule__DomainTypesKeywords__Group__0)
		{ after(grammarAccess.getDomainTypesKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEndTypesKeywords
entryRuleEndTypesKeywords
:
{ before(grammarAccess.getEndTypesKeywordsRule()); }
	 ruleEndTypesKeywords
{ after(grammarAccess.getEndTypesKeywordsRule()); } 
	 EOF 
;

// Rule EndTypesKeywords
ruleEndTypesKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEndTypesKeywordsAccess().getGroup()); }
		(rule__EndTypesKeywords__Group__0)
		{ after(grammarAccess.getEndTypesKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQEMREF
entryRuleQEMREF
:
{ before(grammarAccess.getQEMREFRule()); }
	 ruleQEMREF
{ after(grammarAccess.getQEMREFRule()); } 
	 EOF 
;

// Rule QEMREF
ruleQEMREF 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQEMREFAccess().getGroup()); }
		(rule__QEMREF__Group__0)
		{ after(grammarAccess.getQEMREFAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleContainedPropertyAssociation
entryRuleContainedPropertyAssociation
:
{ before(grammarAccess.getContainedPropertyAssociationRule()); }
	 ruleContainedPropertyAssociation
{ after(grammarAccess.getContainedPropertyAssociationRule()); } 
	 EOF 
;

// Rule ContainedPropertyAssociation
ruleContainedPropertyAssociation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getGroup()); }
		(rule__ContainedPropertyAssociation__Group__0)
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleContainmentPath
entryRuleContainmentPath
:
{ before(grammarAccess.getContainmentPathRule()); }
	 ruleContainmentPath
{ after(grammarAccess.getContainmentPathRule()); } 
	 EOF 
;

// Rule ContainmentPath
ruleContainmentPath 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getContainmentPathAccess().getPathAssignment()); }
		(rule__ContainmentPath__PathAssignment)
		{ after(grammarAccess.getContainmentPathAccess().getPathAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOptionalModalPropertyValue
entryRuleOptionalModalPropertyValue
:
{ before(grammarAccess.getOptionalModalPropertyValueRule()); }
	 ruleOptionalModalPropertyValue
{ after(grammarAccess.getOptionalModalPropertyValueRule()); } 
	 EOF 
;

// Rule OptionalModalPropertyValue
ruleOptionalModalPropertyValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOptionalModalPropertyValueAccess().getGroup()); }
		(rule__OptionalModalPropertyValue__Group__0)
		{ after(grammarAccess.getOptionalModalPropertyValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropertyValue
entryRulePropertyValue
:
{ before(grammarAccess.getPropertyValueRule()); }
	 rulePropertyValue
{ after(grammarAccess.getPropertyValueRule()); } 
	 EOF 
;

// Rule PropertyValue
rulePropertyValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyValueAccess().getOwnedValueAssignment()); }
		(rule__PropertyValue__OwnedValueAssignment)
		{ after(grammarAccess.getPropertyValueAccess().getOwnedValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropertyExpression
entryRulePropertyExpression
:
{ before(grammarAccess.getPropertyExpressionRule()); }
	 rulePropertyExpression
{ after(grammarAccess.getPropertyExpressionRule()); } 
	 EOF 
;

// Rule PropertyExpression
rulePropertyExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getAlternatives()); }
		(rule__PropertyExpression__Alternatives)
		{ after(grammarAccess.getPropertyExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLiteralorReferenceTerm
entryRuleLiteralorReferenceTerm
:
{ before(grammarAccess.getLiteralorReferenceTermRule()); }
	 ruleLiteralorReferenceTerm
{ after(grammarAccess.getLiteralorReferenceTermRule()); } 
	 EOF 
;

// Rule LiteralorReferenceTerm
ruleLiteralorReferenceTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAssignment()); }
		(rule__LiteralorReferenceTerm__NamedValueAssignment)
		{ after(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBooleanLiteral
entryRuleBooleanLiteral
:
{ before(grammarAccess.getBooleanLiteralRule()); }
	 ruleBooleanLiteral
{ after(grammarAccess.getBooleanLiteralRule()); } 
	 EOF 
;

// Rule BooleanLiteral
ruleBooleanLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getGroup()); }
		(rule__BooleanLiteral__Group__0)
		{ after(grammarAccess.getBooleanLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConstantValue
entryRuleConstantValue
:
{ before(grammarAccess.getConstantValueRule()); }
	 ruleConstantValue
{ after(grammarAccess.getConstantValueRule()); } 
	 EOF 
;

// Rule ConstantValue
ruleConstantValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConstantValueAccess().getNamedValueAssignment()); }
		(rule__ConstantValue__NamedValueAssignment)
		{ after(grammarAccess.getConstantValueAccess().getNamedValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReferenceTerm
entryRuleReferenceTerm
:
{ before(grammarAccess.getReferenceTermRule()); }
	 ruleReferenceTerm
{ after(grammarAccess.getReferenceTermRule()); } 
	 EOF 
;

// Rule ReferenceTerm
ruleReferenceTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReferenceTermAccess().getGroup()); }
		(rule__ReferenceTerm__Group__0)
		{ after(grammarAccess.getReferenceTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRecordTerm
entryRuleRecordTerm
:
{ before(grammarAccess.getRecordTermRule()); }
	 ruleRecordTerm
{ after(grammarAccess.getRecordTermRule()); } 
	 EOF 
;

// Rule RecordTerm
ruleRecordTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRecordTermAccess().getGroup()); }
		(rule__RecordTerm__Group__0)
		{ after(grammarAccess.getRecordTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComputedTerm
entryRuleComputedTerm
:
{ before(grammarAccess.getComputedTermRule()); }
	 ruleComputedTerm
{ after(grammarAccess.getComputedTermRule()); } 
	 EOF 
;

// Rule ComputedTerm
ruleComputedTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComputedTermAccess().getGroup()); }
		(rule__ComputedTerm__Group__0)
		{ after(grammarAccess.getComputedTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentClassifierTerm
entryRuleComponentClassifierTerm
:
{ before(grammarAccess.getComponentClassifierTermRule()); }
	 ruleComponentClassifierTerm
{ after(grammarAccess.getComponentClassifierTermRule()); } 
	 EOF 
;

// Rule ComponentClassifierTerm
ruleComponentClassifierTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentClassifierTermAccess().getGroup()); }
		(rule__ComponentClassifierTerm__Group__0)
		{ after(grammarAccess.getComponentClassifierTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleListTerm
entryRuleListTerm
:
{ before(grammarAccess.getListTermRule()); }
	 ruleListTerm
{ after(grammarAccess.getListTermRule()); } 
	 EOF 
;

// Rule ListTerm
ruleListTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getListTermAccess().getGroup()); }
		(rule__ListTerm__Group__0)
		{ after(grammarAccess.getListTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFieldPropertyAssociation
entryRuleFieldPropertyAssociation
:
{ before(grammarAccess.getFieldPropertyAssociationRule()); }
	 ruleFieldPropertyAssociation
{ after(grammarAccess.getFieldPropertyAssociationRule()); } 
	 EOF 
;

// Rule FieldPropertyAssociation
ruleFieldPropertyAssociation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFieldPropertyAssociationAccess().getGroup()); }
		(rule__FieldPropertyAssociation__Group__0)
		{ after(grammarAccess.getFieldPropertyAssociationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleContainmentPathElement
entryRuleContainmentPathElement
:
{ before(grammarAccess.getContainmentPathElementRule()); }
	 ruleContainmentPathElement
{ after(grammarAccess.getContainmentPathElementRule()); } 
	 EOF 
;

// Rule ContainmentPathElement
ruleContainmentPathElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getContainmentPathElementAccess().getGroup()); }
		(rule__ContainmentPathElement__Group__0)
		{ after(grammarAccess.getContainmentPathElementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePlusMinus
entryRulePlusMinus
:
{ before(grammarAccess.getPlusMinusRule()); }
	 rulePlusMinus
{ after(grammarAccess.getPlusMinusRule()); } 
	 EOF 
;

// Rule PlusMinus
rulePlusMinus 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlusMinusAccess().getAlternatives()); }
		(rule__PlusMinus__Alternatives)
		{ after(grammarAccess.getPlusMinusAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringTerm
entryRuleStringTerm
:
{ before(grammarAccess.getStringTermRule()); }
	 ruleStringTerm
{ after(grammarAccess.getStringTermRule()); } 
	 EOF 
;

// Rule StringTerm
ruleStringTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringTermAccess().getValueAssignment()); }
		(rule__StringTerm__ValueAssignment)
		{ after(grammarAccess.getStringTermAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNoQuoteString
entryRuleNoQuoteString
:
{ before(grammarAccess.getNoQuoteStringRule()); }
	 ruleNoQuoteString
{ after(grammarAccess.getNoQuoteStringRule()); } 
	 EOF 
;

// Rule NoQuoteString
ruleNoQuoteString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall()); }
		RULE_STRING
		{ after(grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArrayRange
entryRuleArrayRange
:
{ before(grammarAccess.getArrayRangeRule()); }
	 ruleArrayRange
{ after(grammarAccess.getArrayRangeRule()); } 
	 EOF 
;

// Rule ArrayRange
ruleArrayRange 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArrayRangeAccess().getGroup()); }
		(rule__ArrayRange__Group__0)
		{ after(grammarAccess.getArrayRangeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSignedConstant
entryRuleSignedConstant
:
{ before(grammarAccess.getSignedConstantRule()); }
	 ruleSignedConstant
{ after(grammarAccess.getSignedConstantRule()); } 
	 EOF 
;

// Rule SignedConstant
ruleSignedConstant 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSignedConstantAccess().getGroup()); }
		(rule__SignedConstant__Group__0)
		{ after(grammarAccess.getSignedConstantAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerTerm
entryRuleIntegerTerm
:
{ before(grammarAccess.getIntegerTermRule()); }
	 ruleIntegerTerm
{ after(grammarAccess.getIntegerTermRule()); } 
	 EOF 
;

// Rule IntegerTerm
ruleIntegerTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerTermAccess().getGroup()); }
		(rule__IntegerTerm__Group__0)
		{ after(grammarAccess.getIntegerTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSignedInt
entryRuleSignedInt
:
{ before(grammarAccess.getSignedIntRule()); }
	 ruleSignedInt
{ after(grammarAccess.getSignedIntRule()); } 
	 EOF 
;

// Rule SignedInt
ruleSignedInt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSignedIntAccess().getGroup()); }
		(rule__SignedInt__Group__0)
		{ after(grammarAccess.getSignedIntAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRealTerm
entryRuleRealTerm
:
{ before(grammarAccess.getRealTermRule()); }
	 ruleRealTerm
{ after(grammarAccess.getRealTermRule()); } 
	 EOF 
;

// Rule RealTerm
ruleRealTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRealTermAccess().getGroup()); }
		(rule__RealTerm__Group__0)
		{ after(grammarAccess.getRealTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSignedReal
entryRuleSignedReal
:
{ before(grammarAccess.getSignedRealRule()); }
	 ruleSignedReal
{ after(grammarAccess.getSignedRealRule()); } 
	 EOF 
;

// Rule SignedReal
ruleSignedReal 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSignedRealAccess().getGroup()); }
		(rule__SignedReal__Group__0)
		{ after(grammarAccess.getSignedRealAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNumericRangeTerm
entryRuleNumericRangeTerm
:
{ before(grammarAccess.getNumericRangeTermRule()); }
	 ruleNumericRangeTerm
{ after(grammarAccess.getNumericRangeTermRule()); } 
	 EOF 
;

// Rule NumericRangeTerm
ruleNumericRangeTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNumericRangeTermAccess().getGroup()); }
		(rule__NumericRangeTerm__Group__0)
		{ after(grammarAccess.getNumericRangeTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNumAlt
entryRuleNumAlt
:
{ before(grammarAccess.getNumAltRule()); }
	 ruleNumAlt
{ after(grammarAccess.getNumAltRule()); } 
	 EOF 
;

// Rule NumAlt
ruleNumAlt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNumAltAccess().getAlternatives()); }
		(rule__NumAlt__Alternatives)
		{ after(grammarAccess.getNumAltAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAppliesToKeywords
entryRuleAppliesToKeywords
:
{ before(grammarAccess.getAppliesToKeywordsRule()); }
	 ruleAppliesToKeywords
{ after(grammarAccess.getAppliesToKeywordsRule()); } 
	 EOF 
;

// Rule AppliesToKeywords
ruleAppliesToKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAppliesToKeywordsAccess().getGroup()); }
		(rule__AppliesToKeywords__Group__0)
		{ after(grammarAccess.getAppliesToKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInBindingKeywords
entryRuleInBindingKeywords
:
{ before(grammarAccess.getInBindingKeywordsRule()); }
	 ruleInBindingKeywords
{ after(grammarAccess.getInBindingKeywordsRule()); } 
	 EOF 
;

// Rule InBindingKeywords
ruleInBindingKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInBindingKeywordsAccess().getGroup()); }
		(rule__InBindingKeywords__Group__0)
		{ after(grammarAccess.getInBindingKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInModesKeywords
entryRuleInModesKeywords
:
{ before(grammarAccess.getInModesKeywordsRule()); }
	 ruleInModesKeywords
{ after(grammarAccess.getInModesKeywordsRule()); } 
	 EOF 
;

// Rule InModesKeywords
ruleInModesKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInModesKeywordsAccess().getGroup()); }
		(rule__InModesKeywords__Group__0)
		{ after(grammarAccess.getInModesKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleINTVALUE
entryRuleINTVALUE
:
{ before(grammarAccess.getINTVALUERule()); }
	 ruleINTVALUE
{ after(grammarAccess.getINTVALUERule()); } 
	 EOF 
;

// Rule INTVALUE
ruleINTVALUE 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getINTVALUEAccess().getINTEGER_LITTerminalRuleCall()); }
		RULE_INTEGER_LIT
		{ after(grammarAccess.getINTVALUEAccess().getINTEGER_LITTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQPREF
entryRuleQPREF
:
{ before(grammarAccess.getQPREFRule()); }
	 ruleQPREF
{ after(grammarAccess.getQPREFRule()); } 
	 EOF 
;

// Rule QPREF
ruleQPREF 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQPREFAccess().getGroup()); }
		(rule__QPREF__Group__0)
		{ after(grammarAccess.getQPREFAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQCREF
entryRuleQCREF
:
{ before(grammarAccess.getQCREFRule()); }
	 ruleQCREF
{ after(grammarAccess.getQCREFRule()); } 
	 EOF 
;

// Rule QCREF
ruleQCREF 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQCREFAccess().getGroup()); }
		(rule__QCREF__Group__0)
		{ after(grammarAccess.getQCREFAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSTAR
entryRuleSTAR
:
{ before(grammarAccess.getSTARRule()); }
	 ruleSTAR
{ after(grammarAccess.getSTARRule()); } 
	 EOF 
;

// Rule STAR
ruleSTAR 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSTARAccess().getAsteriskKeyword()); }
		Asterisk
		{ after(grammarAccess.getSTARAccess().getAsteriskKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecMFRoot__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSecMFRootAccess().getLibraryAssignment_1_0()); }
		(rule__SecMFRoot__LibraryAssignment_1_0)
		{ after(grammarAccess.getSecMFRootAccess().getLibraryAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getSecMFRootAccess().getSubclausesAssignment_1_1()); }
		(rule__SecMFRoot__SubclausesAssignment_1_1)*
		{ after(grammarAccess.getSecMFRootAccess().getSubclausesAssignment_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFLibraryAccess().getGroup_0()); }
		(rule__SMFLibrary__Group_0__0)
		{ after(grammarAccess.getSMFLibraryAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getSMFLibraryAccess().getGroup_1()); }
		(rule__SMFLibrary__Group_1__0)
		{ after(grammarAccess.getSMFLibraryAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFDeclassificationAccess().getSrcNameAssignment_3_0()); }
		(rule__SMFDeclassification__SrcNameAssignment_3_0)
		{ after(grammarAccess.getSMFDeclassificationAccess().getSrcNameAssignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getSMFDeclassificationAccess().getAnyAssignment_3_1()); }
		(rule__SMFDeclassification__AnyAssignment_3_1)
		{ after(grammarAccess.getSMFDeclassificationAccess().getAnyAssignment_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFTypeDefAccess().getGroup_1_0()); }
		(rule__SMFTypeDef__Group_1_0__0)
		{ after(grammarAccess.getSMFTypeDefAccess().getGroup_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getSMFTypeDefAccess().getGroup_1_1()); }
		(rule__SMFTypeDef__Group_1_1__0)
		{ after(grammarAccess.getSMFTypeDefAccess().getGroup_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0()); }
		EqualsSignGreaterThanSign
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getAppendAssignment_1_1()); }
		(rule__ContainedPropertyAssociation__AppendAssignment_1_1)
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getAppendAssignment_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyExpression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getRecordTermParserRuleCall_0()); }
		ruleRecordTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getRecordTermParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getReferenceTermParserRuleCall_1()); }
		ruleReferenceTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getReferenceTermParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getComponentClassifierTermParserRuleCall_2()); }
		ruleComponentClassifierTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getComponentClassifierTermParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getComputedTermParserRuleCall_3()); }
		ruleComputedTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getComputedTermParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getStringTermParserRuleCall_4()); }
		ruleStringTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getStringTermParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getNumericRangeTermParserRuleCall_5()); }
		ruleNumericRangeTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getNumericRangeTermParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getRealTermParserRuleCall_6()); }
		ruleRealTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getRealTermParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getIntegerTermParserRuleCall_7()); }
		ruleIntegerTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getIntegerTermParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getListTermParserRuleCall_8()); }
		ruleListTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getListTermParserRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getBooleanLiteralParserRuleCall_9()); }
		ruleBooleanLiteral
		{ after(grammarAccess.getPropertyExpressionAccess().getBooleanLiteralParserRuleCall_9()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getLiteralorReferenceTermParserRuleCall_10()); }
		ruleLiteralorReferenceTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getLiteralorReferenceTermParserRuleCall_10()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1_0()); }
		(rule__BooleanLiteral__ValueAssignment_1_0)
		{ after(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1()); }
		False
		{ after(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusMinus__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0()); }
		PlusSign
		{ after(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1()); }
		HyphenMinus
		{ after(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedInt__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0()); }
		PlusSign
		{ after(grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0_1()); }
		HyphenMinus
		{ after(grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedReal__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0()); }
		PlusSign
		{ after(grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSignedRealAccess().getHyphenMinusKeyword_0_1()); }
		HyphenMinus
		{ after(grammarAccess.getSignedRealAccess().getHyphenMinusKeyword_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumAlt__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumAltAccess().getRealTermParserRuleCall_0()); }
		ruleRealTerm
		{ after(grammarAccess.getNumAltAccess().getRealTermParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getNumAltAccess().getIntegerTermParserRuleCall_1()); }
		ruleIntegerTerm
		{ after(grammarAccess.getNumAltAccess().getIntegerTermParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getNumAltAccess().getSignedConstantParserRuleCall_2()); }
		ruleSignedConstant
		{ after(grammarAccess.getNumAltAccess().getSignedConstantParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getNumAltAccess().getConstantValueParserRuleCall_3()); }
		ruleConstantValue
		{ after(grammarAccess.getNumAltAccess().getConstantValueParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecMFRoot__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecMFRoot__Group__0__Impl
	rule__SecMFRoot__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SecMFRoot__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecMFRootAccess().getSecMFRootAction_0()); }
	()
	{ after(grammarAccess.getSecMFRootAccess().getSecMFRootAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecMFRoot__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecMFRoot__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SecMFRoot__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecMFRootAccess().getAlternatives_1()); }
	(rule__SecMFRoot__Alternatives_1)
	{ after(grammarAccess.getSecMFRootAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SecModelLibrary__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecModelLibrary__Group__0__Impl
	rule__SecModelLibrary__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelLibrary__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecModelLibraryAccess().getSecModelLibraryAction_0()); }
	()
	{ after(grammarAccess.getSecModelLibraryAccess().getSecModelLibraryAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelLibrary__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecModelLibrary__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelLibrary__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecModelLibraryAccess().getGroup_1()); }
	(rule__SecModelLibrary__Group_1__0)?
	{ after(grammarAccess.getSecModelLibraryAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SecModelLibrary__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecModelLibrary__Group_1__0__Impl
	rule__SecModelLibrary__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelLibrary__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecModelLibraryAccess().getDomainTypesKeywordsParserRuleCall_1_0()); }
	ruleDomainTypesKeywords
	{ after(grammarAccess.getSecModelLibraryAccess().getDomainTypesKeywordsParserRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelLibrary__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecModelLibrary__Group_1__1__Impl
	rule__SecModelLibrary__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelLibrary__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecModelLibraryAccess().getTypesAssignment_1_1()); }
	(rule__SecModelLibrary__TypesAssignment_1_1)*
	{ after(grammarAccess.getSecModelLibraryAccess().getTypesAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelLibrary__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecModelLibrary__Group_1__2__Impl
	rule__SecModelLibrary__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelLibrary__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecModelLibraryAccess().getEndTypesKeywordsParserRuleCall_1_2()); }
	ruleEndTypesKeywords
	{ after(grammarAccess.getSecModelLibraryAccess().getEndTypesKeywordsParserRuleCall_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelLibrary__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecModelLibrary__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelLibrary__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecModelLibraryAccess().getSemicolonKeyword_1_3()); }
	Semicolon
	{ after(grammarAccess.getSecModelLibraryAccess().getSemicolonKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SMFLibrary__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_0__0__Impl
	rule__SMFLibrary__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getSecModelLibraryAction_0_0()); }
	()
	{ after(grammarAccess.getSMFLibraryAccess().getSecModelLibraryAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getGroup_0_1()); }
	(rule__SMFLibrary__Group_0_1__0)
	{ after(grammarAccess.getSMFLibraryAccess().getGroup_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SMFLibrary__Group_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_0_1__0__Impl
	rule__SMFLibrary__Group_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getLibraryKeyword_0_1_0()); }
	Library
	{ after(grammarAccess.getSMFLibraryAccess().getLibraryKeyword_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_0_1__1__Impl
	rule__SMFLibrary__Group_0_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getNameAssignment_0_1_1()); }
	(rule__SMFLibrary__NameAssignment_0_1_1)
	{ after(grammarAccess.getSMFLibraryAccess().getNameAssignment_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_0_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_0_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_0_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getGroup_0_1_2()); }
	(rule__SMFLibrary__Group_0_1_2__0)?
	{ after(grammarAccess.getSMFLibraryAccess().getGroup_0_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SMFLibrary__Group_0_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_0_1_2__0__Impl
	rule__SMFLibrary__Group_0_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_0_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getDomainTypesKeywordsParserRuleCall_0_1_2_0()); }
	ruleDomainTypesKeywords
	{ after(grammarAccess.getSMFLibraryAccess().getDomainTypesKeywordsParserRuleCall_0_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_0_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_0_1_2__1__Impl
	rule__SMFLibrary__Group_0_1_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_0_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getTypesAssignment_0_1_2_1()); }
	(rule__SMFLibrary__TypesAssignment_0_1_2_1)*
	{ after(grammarAccess.getSMFLibraryAccess().getTypesAssignment_0_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_0_1_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_0_1_2__2__Impl
	rule__SMFLibrary__Group_0_1_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_0_1_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getEndTypesKeywordsParserRuleCall_0_1_2_2()); }
	ruleEndTypesKeywords
	{ after(grammarAccess.getSMFLibraryAccess().getEndTypesKeywordsParserRuleCall_0_1_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_0_1_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_0_1_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_0_1_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_0_1_2_3()); }
	Semicolon
	{ after(grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_0_1_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SMFLibrary__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_1__0__Impl
	rule__SMFLibrary__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getPackageKeyword_1_0()); }
	Package
	{ after(grammarAccess.getSMFLibraryAccess().getPackageKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_1__1__Impl
	rule__SMFLibrary__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getNameAssignment_1_1()); }
	(rule__SMFLibrary__NameAssignment_1_1)
	{ after(grammarAccess.getSMFLibraryAccess().getNameAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_1__2__Impl
	rule__SMFLibrary__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getPublicKeyword_1_2()); }
	Public
	{ after(grammarAccess.getSMFLibraryAccess().getPublicKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_1__3__Impl
	rule__SMFLibrary__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getAnnexKeyword_1_3()); }
	Annex
	{ after(grammarAccess.getSMFLibraryAccess().getAnnexKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_1__4__Impl
	rule__SMFLibrary__Group_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getIDTerminalRuleCall_1_4()); }
	RULE_ID
	{ after(grammarAccess.getSMFLibraryAccess().getIDTerminalRuleCall_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_1__5__Impl
	rule__SMFLibrary__Group_1__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getLeftCurlyBracketAsteriskAsteriskKeyword_1_5()); }
	LeftCurlyBracketAsteriskAsterisk
	{ after(grammarAccess.getSMFLibraryAccess().getLeftCurlyBracketAsteriskAsteriskKeyword_1_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_1__6__Impl
	rule__SMFLibrary__Group_1__7
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getGroup_1_6()); }
	(rule__SMFLibrary__Group_1_6__0)?
	{ after(grammarAccess.getSMFLibraryAccess().getGroup_1_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_1__7__Impl
	rule__SMFLibrary__Group_1__8
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getAsteriskAsteriskRightCurlyBracketKeyword_1_7()); }
	AsteriskAsteriskRightCurlyBracket
	{ after(grammarAccess.getSMFLibraryAccess().getAsteriskAsteriskRightCurlyBracketKeyword_1_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_1__8__Impl
	rule__SMFLibrary__Group_1__9
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_1_8()); }
	Semicolon
	{ after(grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_1_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_1__9__Impl
	rule__SMFLibrary__Group_1__10
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getEndKeyword_1_9()); }
	End
	{ after(grammarAccess.getSMFLibraryAccess().getEndKeyword_1_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_1__10__Impl
	rule__SMFLibrary__Group_1__11
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getQEMREFParserRuleCall_1_10()); }
	ruleQEMREF
	{ after(grammarAccess.getSMFLibraryAccess().getQEMREFParserRuleCall_1_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_1__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_1_11()); }
	Semicolon
	{ after(grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_1_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SMFLibrary__Group_1_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_1_6__0__Impl
	rule__SMFLibrary__Group_1_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getDomainTypesKeywordsParserRuleCall_1_6_0()); }
	ruleDomainTypesKeywords
	{ after(grammarAccess.getSMFLibraryAccess().getDomainTypesKeywordsParserRuleCall_1_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_1_6__1__Impl
	rule__SMFLibrary__Group_1_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getTypeAssignment_1_6_1()); }
	(rule__SMFLibrary__TypeAssignment_1_6_1)*
	{ after(grammarAccess.getSMFLibraryAccess().getTypeAssignment_1_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_1_6__2__Impl
	rule__SMFLibrary__Group_1_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getEndTypesKeywordsParserRuleCall_1_6_2()); }
	ruleEndTypesKeywords
	{ after(grammarAccess.getSMFLibraryAccess().getEndTypesKeywordsParserRuleCall_1_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFLibrary__Group_1_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__Group_1_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_1_6_3()); }
	Semicolon
	{ after(grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_1_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SMFSubclause__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFSubclause__Group__0__Impl
	rule__SMFSubclause__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFSubclauseAccess().getSecModelSubclauseAction_0()); }
	()
	{ after(grammarAccess.getSMFSubclauseAccess().getSecModelSubclauseAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFSubclause__Group__1__Impl
	rule__SMFSubclause__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFSubclauseAccess().getSubclauseKeyword_1()); }
	Subclause
	{ after(grammarAccess.getSMFSubclauseAccess().getSubclauseKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFSubclause__Group__2__Impl
	rule__SMFSubclause__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFSubclauseAccess().getNameAssignment_2()); }
	(rule__SMFSubclause__NameAssignment_2)
	{ after(grammarAccess.getSMFSubclauseAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFSubclause__Group__3__Impl
	rule__SMFSubclause__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFSubclauseAccess().getGroup_3()); }
	(rule__SMFSubclause__Group_3__0)?
	{ after(grammarAccess.getSMFSubclauseAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFSubclause__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFSubclauseAccess().getGroup_4()); }
	(rule__SMFSubclause__Group_4__0)?
	{ after(grammarAccess.getSMFSubclauseAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SMFSubclause__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFSubclause__Group_3__0__Impl
	rule__SMFSubclause__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFSubclauseAccess().getClassificationKeywordsParserRuleCall_3_0()); }
	ruleClassificationKeywords
	{ after(grammarAccess.getSMFSubclauseAccess().getClassificationKeywordsParserRuleCall_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFSubclause__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSMFSubclauseAccess().getClassificationAssignment_3_1()); }
		(rule__SMFSubclause__ClassificationAssignment_3_1)
		{ after(grammarAccess.getSMFSubclauseAccess().getClassificationAssignment_3_1()); }
	)
	(
		{ before(grammarAccess.getSMFSubclauseAccess().getClassificationAssignment_3_1()); }
		(rule__SMFSubclause__ClassificationAssignment_3_1)*
		{ after(grammarAccess.getSMFSubclauseAccess().getClassificationAssignment_3_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SMFSubclause__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFSubclause__Group_4__0__Impl
	rule__SMFSubclause__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFSubclauseAccess().getDeclassificationKeywordsParserRuleCall_4_0()); }
	ruleDeclassificationKeywords
	{ after(grammarAccess.getSMFSubclauseAccess().getDeclassificationKeywordsParserRuleCall_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFSubclause__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSMFSubclauseAccess().getDeclassificationAssignment_4_1()); }
		(rule__SMFSubclause__DeclassificationAssignment_4_1)
		{ after(grammarAccess.getSMFSubclauseAccess().getDeclassificationAssignment_4_1()); }
	)
	(
		{ before(grammarAccess.getSMFSubclauseAccess().getDeclassificationAssignment_4_1()); }
		(rule__SMFSubclause__DeclassificationAssignment_4_1)*
		{ after(grammarAccess.getSMFSubclauseAccess().getDeclassificationAssignment_4_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SecModelSubclause__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecModelSubclause__Group__0__Impl
	rule__SecModelSubclause__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelSubclause__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecModelSubclauseAccess().getSecModelSubclauseAction_0()); }
	()
	{ after(grammarAccess.getSecModelSubclauseAccess().getSecModelSubclauseAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelSubclause__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecModelSubclause__Group__1__Impl
	rule__SecModelSubclause__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelSubclause__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecModelSubclauseAccess().getGroup_1()); }
	(rule__SecModelSubclause__Group_1__0)?
	{ after(grammarAccess.getSecModelSubclauseAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelSubclause__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecModelSubclause__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelSubclause__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecModelSubclauseAccess().getGroup_2()); }
	(rule__SecModelSubclause__Group_2__0)?
	{ after(grammarAccess.getSecModelSubclauseAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SecModelSubclause__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecModelSubclause__Group_1__0__Impl
	rule__SecModelSubclause__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelSubclause__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecModelSubclauseAccess().getClassificationKeywordsParserRuleCall_1_0()); }
	ruleClassificationKeywords
	{ after(grammarAccess.getSecModelSubclauseAccess().getClassificationKeywordsParserRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelSubclause__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecModelSubclause__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelSubclause__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSecModelSubclauseAccess().getClassificationAssignment_1_1()); }
		(rule__SecModelSubclause__ClassificationAssignment_1_1)
		{ after(grammarAccess.getSecModelSubclauseAccess().getClassificationAssignment_1_1()); }
	)
	(
		{ before(grammarAccess.getSecModelSubclauseAccess().getClassificationAssignment_1_1()); }
		(rule__SecModelSubclause__ClassificationAssignment_1_1)*
		{ after(grammarAccess.getSecModelSubclauseAccess().getClassificationAssignment_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SecModelSubclause__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecModelSubclause__Group_2__0__Impl
	rule__SecModelSubclause__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelSubclause__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecModelSubclauseAccess().getDeclassificationKeywordsParserRuleCall_2_0()); }
	ruleDeclassificationKeywords
	{ after(grammarAccess.getSecModelSubclauseAccess().getDeclassificationKeywordsParserRuleCall_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelSubclause__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecModelSubclause__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelSubclause__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSecModelSubclauseAccess().getDeclassificationAssignment_2_1()); }
		(rule__SecModelSubclause__DeclassificationAssignment_2_1)
		{ after(grammarAccess.getSecModelSubclauseAccess().getDeclassificationAssignment_2_1()); }
	)
	(
		{ before(grammarAccess.getSecModelSubclauseAccess().getDeclassificationAssignment_2_1()); }
		(rule__SecModelSubclause__DeclassificationAssignment_2_1)*
		{ after(grammarAccess.getSecModelSubclauseAccess().getDeclassificationAssignment_2_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SMFClassification__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFClassification__Group__0__Impl
	rule__SMFClassification__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFClassification__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFClassificationAccess().getSMFClassificationAction_0()); }
	()
	{ after(grammarAccess.getSMFClassificationAccess().getSMFClassificationAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFClassification__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFClassification__Group__1__Impl
	rule__SMFClassification__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFClassification__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFClassificationAccess().getFeatureAssignment_1()); }
	(rule__SMFClassification__FeatureAssignment_1)
	{ after(grammarAccess.getSMFClassificationAccess().getFeatureAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFClassification__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFClassification__Group__2__Impl
	rule__SMFClassification__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFClassification__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFClassificationAccess().getColonKeyword_2()); }
	Colon
	{ after(grammarAccess.getSMFClassificationAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFClassification__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFClassification__Group__3__Impl
	rule__SMFClassification__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFClassification__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFClassificationAccess().getTypeRefAssignment_3()); }
	(rule__SMFClassification__TypeRefAssignment_3)
	{ after(grammarAccess.getSMFClassificationAccess().getTypeRefAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFClassification__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFClassification__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFClassification__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFClassificationAccess().getSemicolonKeyword_4()); }
	Semicolon
	{ after(grammarAccess.getSMFClassificationAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SMFDeclassification__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFDeclassification__Group__0__Impl
	rule__SMFDeclassification__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFDeclassificationAccess().getSMFDeclassificationAction_0()); }
	()
	{ after(grammarAccess.getSMFDeclassificationAccess().getSMFDeclassificationAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFDeclassification__Group__1__Impl
	rule__SMFDeclassification__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFDeclassificationAccess().getFlowAssignment_1()); }
	(rule__SMFDeclassification__FlowAssignment_1)
	{ after(grammarAccess.getSMFDeclassificationAccess().getFlowAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFDeclassification__Group__2__Impl
	rule__SMFDeclassification__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFDeclassificationAccess().getColonKeyword_2()); }
	Colon
	{ after(grammarAccess.getSMFDeclassificationAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFDeclassification__Group__3__Impl
	rule__SMFDeclassification__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFDeclassificationAccess().getAlternatives_3()); }
	(rule__SMFDeclassification__Alternatives_3)
	{ after(grammarAccess.getSMFDeclassificationAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFDeclassification__Group__4__Impl
	rule__SMFDeclassification__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFDeclassificationAccess().getHyphenMinusGreaterThanSignKeyword_4()); }
	HyphenMinusGreaterThanSign
	{ after(grammarAccess.getSMFDeclassificationAccess().getHyphenMinusGreaterThanSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFDeclassification__Group__5__Impl
	rule__SMFDeclassification__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFDeclassificationAccess().getSnkNameAssignment_5()); }
	(rule__SMFDeclassification__SnkNameAssignment_5)
	{ after(grammarAccess.getSMFDeclassificationAccess().getSnkNameAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFDeclassification__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFDeclassificationAccess().getSemicolonKeyword_6()); }
	Semicolon
	{ after(grammarAccess.getSMFDeclassificationAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SMFTypeDef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFTypeDef__Group__0__Impl
	rule__SMFTypeDef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFTypeDefAccess().getNameAssignment_0()); }
	(rule__SMFTypeDef__NameAssignment_0)
	{ after(grammarAccess.getSMFTypeDefAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFTypeDef__Group__1__Impl
	rule__SMFTypeDef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFTypeDefAccess().getAlternatives_1()); }
	(rule__SMFTypeDef__Alternatives_1)
	{ after(grammarAccess.getSMFTypeDefAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFTypeDef__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFTypeDefAccess().getSemicolonKeyword_2()); }
	Semicolon
	{ after(grammarAccess.getSMFTypeDefAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SMFTypeDef__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFTypeDef__Group_1_0__0__Impl
	rule__SMFTypeDef__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFTypeDefAccess().getColonKeyword_1_0_0()); }
	Colon
	{ after(grammarAccess.getSMFTypeDefAccess().getColonKeyword_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFTypeDef__Group_1_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFTypeDefAccess().getTypeKeyword_1_0_1()); }
	Type
	{ after(grammarAccess.getSMFTypeDefAccess().getTypeKeyword_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SMFTypeDef__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFTypeDef__Group_1_1__0__Impl
	rule__SMFTypeDef__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFTypeDefAccess().getColonKeyword_1_1_0()); }
	Colon
	{ after(grammarAccess.getSMFTypeDefAccess().getColonKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFTypeDef__Group_1_1__1__Impl
	rule__SMFTypeDef__Group_1_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFTypeDefAccess().getTypeKeyword_1_1_1()); }
	Type
	{ after(grammarAccess.getSMFTypeDefAccess().getTypeKeyword_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__Group_1_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFTypeDef__Group_1_1__2__Impl
	rule__SMFTypeDef__Group_1_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__Group_1_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFTypeDefAccess().getExtendsKeyword_1_1_2()); }
	Extends
	{ after(grammarAccess.getSMFTypeDefAccess().getExtendsKeyword_1_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__Group_1_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SMFTypeDef__Group_1_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__Group_1_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSMFTypeDefAccess().getTypeAssignment_1_1_3()); }
	(rule__SMFTypeDef__TypeAssignment_1_1_3)*
	{ after(grammarAccess.getSMFTypeDefAccess().getTypeAssignment_1_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DomainTypesKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DomainTypesKeywords__Group__0__Impl
	rule__DomainTypesKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainTypesKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDomainTypesKeywordsAccess().getDomainKeyword_0()); }
	Domain
	{ after(grammarAccess.getDomainTypesKeywordsAccess().getDomainKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainTypesKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DomainTypesKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainTypesKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDomainTypesKeywordsAccess().getTypesKeyword_1()); }
	Types
	{ after(grammarAccess.getDomainTypesKeywordsAccess().getTypesKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EndTypesKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndTypesKeywords__Group__0__Impl
	rule__EndTypesKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EndTypesKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndTypesKeywordsAccess().getEndKeyword_0()); }
	End
	{ after(grammarAccess.getEndTypesKeywordsAccess().getEndKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EndTypesKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndTypesKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EndTypesKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndTypesKeywordsAccess().getTypesKeyword_1()); }
	Types
	{ after(grammarAccess.getEndTypesKeywordsAccess().getTypesKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QEMREF__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QEMREF__Group__0__Impl
	rule__QEMREF__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QEMREF__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQEMREFAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQEMREFAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QEMREF__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QEMREF__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QEMREF__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQEMREFAccess().getGroup_1()); }
	(rule__QEMREF__Group_1__0)*
	{ after(grammarAccess.getQEMREFAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QEMREF__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QEMREF__Group_1__0__Impl
	rule__QEMREF__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QEMREF__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQEMREFAccess().getColonColonKeyword_1_0()); }
	ColonColon
	{ after(grammarAccess.getQEMREFAccess().getColonColonKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QEMREF__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QEMREF__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QEMREF__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQEMREFAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQEMREFAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainedPropertyAssociation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group__0__Impl
	rule__ContainedPropertyAssociation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getPropertyAssignment_0()); }
	(rule__ContainedPropertyAssociation__PropertyAssignment_0)
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getPropertyAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group__1__Impl
	rule__ContainedPropertyAssociation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getAlternatives_1()); }
	(rule__ContainedPropertyAssociation__Alternatives_1)
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group__2__Impl
	rule__ContainedPropertyAssociation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getConstantAssignment_2()); }
	(rule__ContainedPropertyAssociation__ConstantAssignment_2)?
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getConstantAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group__3__Impl
	rule__ContainedPropertyAssociation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3()); }
	(rule__ContainedPropertyAssociation__Group_3__0)
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group__4__Impl
	rule__ContainedPropertyAssociation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4()); }
	(rule__ContainedPropertyAssociation__Group_4__0)?
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group__5__Impl
	rule__ContainedPropertyAssociation__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getGroup_5()); }
	(rule__ContainedPropertyAssociation__Group_5__0)?
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getSemicolonKeyword_6()); }
	Semicolon
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainedPropertyAssociation__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_3__0__Impl
	rule__ContainedPropertyAssociation__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_0()); }
	(rule__ContainedPropertyAssociation__OwnedValueAssignment_3_0)
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3_1()); }
	(rule__ContainedPropertyAssociation__Group_3_1__0)*
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainedPropertyAssociation__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_3_1__0__Impl
	rule__ContainedPropertyAssociation__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0()); }
	Comma
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_1_1()); }
	(rule__ContainedPropertyAssociation__OwnedValueAssignment_3_1_1)
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainedPropertyAssociation__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_4__0__Impl
	rule__ContainedPropertyAssociation__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToKeywordsParserRuleCall_4_0()); }
	ruleAppliesToKeywords
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToKeywordsParserRuleCall_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_4__1__Impl
	rule__ContainedPropertyAssociation__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_1()); }
	(rule__ContainedPropertyAssociation__AppliesToAssignment_4_1)
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4_2()); }
	(rule__ContainedPropertyAssociation__Group_4_2__0)*
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainedPropertyAssociation__Group_4_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_4_2__0__Impl
	rule__ContainedPropertyAssociation__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_4_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0()); }
	Comma
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_4_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_4_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_2_1()); }
	(rule__ContainedPropertyAssociation__AppliesToAssignment_4_2_1)
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainedPropertyAssociation__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_5__0__Impl
	rule__ContainedPropertyAssociation__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0()); }
	ruleInBindingKeywords
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_5__1__Impl
	rule__ContainedPropertyAssociation__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getLeftParenthesisKeyword_5_1()); }
	LeftParenthesis
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getLeftParenthesisKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_5__2__Impl
	rule__ContainedPropertyAssociation__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getInBindingAssignment_5_2()); }
	(rule__ContainedPropertyAssociation__InBindingAssignment_5_2)
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getInBindingAssignment_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getRightParenthesisKeyword_5_3()); }
	RightParenthesis
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getRightParenthesisKeyword_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OptionalModalPropertyValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group__0__Impl
	rule__OptionalModalPropertyValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValueAssignment_0()); }
	(rule__OptionalModalPropertyValue__OwnedValueAssignment_0)
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValueAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1()); }
	(rule__OptionalModalPropertyValue__Group_1__0)?
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OptionalModalPropertyValue__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group_1__0__Impl
	rule__OptionalModalPropertyValue__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0()); }
	ruleInModesKeywords
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group_1__1__Impl
	rule__OptionalModalPropertyValue__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getLeftParenthesisKeyword_1_1()); }
	LeftParenthesis
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getLeftParenthesisKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group_1__2__Impl
	rule__OptionalModalPropertyValue__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_2()); }
	(rule__OptionalModalPropertyValue__InModeAssignment_1_2)
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group_1__3__Impl
	rule__OptionalModalPropertyValue__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1_3()); }
	(rule__OptionalModalPropertyValue__Group_1_3__0)*
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getRightParenthesisKeyword_1_4()); }
	RightParenthesis
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getRightParenthesisKeyword_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OptionalModalPropertyValue__Group_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group_1_3__0__Impl
	rule__OptionalModalPropertyValue__Group_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0()); }
	Comma
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_3_1()); }
	(rule__OptionalModalPropertyValue__InModeAssignment_1_3_1)
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BooleanLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanLiteral__Group__0__Impl
	rule__BooleanLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); }
	()
	{ after(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanLiteral__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); }
	(rule__BooleanLiteral__Alternatives_1)
	{ after(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReferenceTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReferenceTerm__Group__0__Impl
	rule__ReferenceTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferenceTermAccess().getReferenceKeyword_0()); }
	Reference
	{ after(grammarAccess.getReferenceTermAccess().getReferenceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReferenceTerm__Group__1__Impl
	rule__ReferenceTerm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1()); }
	LeftParenthesis
	{ after(grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceTerm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReferenceTerm__Group__2__Impl
	rule__ReferenceTerm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceTerm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferenceTermAccess().getPathAssignment_2()); }
	(rule__ReferenceTerm__PathAssignment_2)
	{ after(grammarAccess.getReferenceTermAccess().getPathAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceTerm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReferenceTerm__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceTerm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferenceTermAccess().getRightParenthesisKeyword_3()); }
	RightParenthesis
	{ after(grammarAccess.getReferenceTermAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RecordTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordTerm__Group__0__Impl
	rule__RecordTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0()); }
	LeftSquareBracket
	{ after(grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordTerm__Group__1__Impl
	rule__RecordTerm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getRecordTermAccess().getOwnedFieldValueAssignment_1()); }
		(rule__RecordTerm__OwnedFieldValueAssignment_1)
		{ after(grammarAccess.getRecordTermAccess().getOwnedFieldValueAssignment_1()); }
	)
	(
		{ before(grammarAccess.getRecordTermAccess().getOwnedFieldValueAssignment_1()); }
		(rule__RecordTerm__OwnedFieldValueAssignment_1)*
		{ after(grammarAccess.getRecordTermAccess().getOwnedFieldValueAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordTerm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordTerm__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordTerm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordTermAccess().getRightSquareBracketKeyword_2()); }
	RightSquareBracket
	{ after(grammarAccess.getRecordTermAccess().getRightSquareBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComputedTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputedTerm__Group__0__Impl
	rule__ComputedTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputedTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputedTermAccess().getComputeKeyword_0()); }
	Compute
	{ after(grammarAccess.getComputedTermAccess().getComputeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputedTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputedTerm__Group__1__Impl
	rule__ComputedTerm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputedTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1()); }
	LeftParenthesis
	{ after(grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputedTerm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputedTerm__Group__2__Impl
	rule__ComputedTerm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputedTerm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputedTermAccess().getFunctionAssignment_2()); }
	(rule__ComputedTerm__FunctionAssignment_2)
	{ after(grammarAccess.getComputedTermAccess().getFunctionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputedTerm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputedTerm__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputedTerm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputedTermAccess().getRightParenthesisKeyword_3()); }
	RightParenthesis
	{ after(grammarAccess.getComputedTermAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentClassifierTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentClassifierTerm__Group__0__Impl
	rule__ComponentClassifierTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentClassifierTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0()); }
	Classifier
	{ after(grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentClassifierTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentClassifierTerm__Group__1__Impl
	rule__ComponentClassifierTerm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentClassifierTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1()); }
	LeftParenthesis
	{ after(grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentClassifierTerm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentClassifierTerm__Group__2__Impl
	rule__ComponentClassifierTerm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentClassifierTerm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentClassifierTermAccess().getClassifierAssignment_2()); }
	(rule__ComponentClassifierTerm__ClassifierAssignment_2)
	{ after(grammarAccess.getComponentClassifierTermAccess().getClassifierAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentClassifierTerm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentClassifierTerm__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentClassifierTerm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentClassifierTermAccess().getRightParenthesisKeyword_3()); }
	RightParenthesis
	{ after(grammarAccess.getComponentClassifierTermAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ListTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListTerm__Group__0__Impl
	rule__ListTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTermAccess().getListValueAction_0()); }
	()
	{ after(grammarAccess.getListTermAccess().getListValueAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListTerm__Group__1__Impl
	rule__ListTerm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1()); }
	LeftParenthesis
	{ after(grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListTerm__Group__2__Impl
	rule__ListTerm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTermAccess().getGroup_2()); }
	(rule__ListTerm__Group_2__0)?
	{ after(grammarAccess.getListTermAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListTerm__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTermAccess().getRightParenthesisKeyword_3()); }
	RightParenthesis
	{ after(grammarAccess.getListTermAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ListTerm__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListTerm__Group_2__0__Impl
	rule__ListTerm__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_0()); }
	(rule__ListTerm__OwnedListElementAssignment_2_0)
	{ after(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListTerm__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTermAccess().getGroup_2_1()); }
	(rule__ListTerm__Group_2_1__0)*
	{ after(grammarAccess.getListTermAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ListTerm__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListTerm__Group_2_1__0__Impl
	rule__ListTerm__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTermAccess().getCommaKeyword_2_1_0()); }
	Comma
	{ after(grammarAccess.getListTermAccess().getCommaKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListTerm__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_1_1()); }
	(rule__ListTerm__OwnedListElementAssignment_2_1_1)
	{ after(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FieldPropertyAssociation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldPropertyAssociation__Group__0__Impl
	rule__FieldPropertyAssociation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldPropertyAssociationAccess().getPropertyAssignment_0()); }
	(rule__FieldPropertyAssociation__PropertyAssignment_0)
	{ after(grammarAccess.getFieldPropertyAssociationAccess().getPropertyAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldPropertyAssociation__Group__1__Impl
	rule__FieldPropertyAssociation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1()); }
	EqualsSignGreaterThanSign
	{ after(grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldPropertyAssociation__Group__2__Impl
	rule__FieldPropertyAssociation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValueAssignment_2()); }
	(rule__FieldPropertyAssociation__OwnedValueAssignment_2)
	{ after(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldPropertyAssociation__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldPropertyAssociationAccess().getSemicolonKeyword_3()); }
	Semicolon
	{ after(grammarAccess.getFieldPropertyAssociationAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainmentPathElement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainmentPathElement__Group__0__Impl
	rule__ContainmentPathElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainmentPathElementAccess().getGroup_0()); }
	(rule__ContainmentPathElement__Group_0__0)
	{ after(grammarAccess.getContainmentPathElementAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainmentPathElement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainmentPathElementAccess().getGroup_1()); }
	(rule__ContainmentPathElement__Group_1__0)?
	{ after(grammarAccess.getContainmentPathElementAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainmentPathElement__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainmentPathElement__Group_0__0__Impl
	rule__ContainmentPathElement__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainmentPathElementAccess().getNamedElementAssignment_0_0()); }
	(rule__ContainmentPathElement__NamedElementAssignment_0_0)
	{ after(grammarAccess.getContainmentPathElementAccess().getNamedElementAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainmentPathElement__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainmentPathElementAccess().getArrayRangeAssignment_0_1()); }
	(rule__ContainmentPathElement__ArrayRangeAssignment_0_1)*
	{ after(grammarAccess.getContainmentPathElementAccess().getArrayRangeAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainmentPathElement__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainmentPathElement__Group_1__0__Impl
	rule__ContainmentPathElement__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0()); }
	FullStop
	{ after(grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainmentPathElement__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainmentPathElementAccess().getPathAssignment_1_1()); }
	(rule__ContainmentPathElement__PathAssignment_1_1)
	{ after(grammarAccess.getContainmentPathElementAccess().getPathAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayRange__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayRange__Group__0__Impl
	rule__ArrayRange__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayRangeAccess().getArrayRangeAction_0()); }
	()
	{ after(grammarAccess.getArrayRangeAccess().getArrayRangeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayRange__Group__1__Impl
	rule__ArrayRange__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1()); }
	LeftSquareBracket
	{ after(grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayRange__Group__2__Impl
	rule__ArrayRange__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayRangeAccess().getLowerBoundAssignment_2()); }
	(rule__ArrayRange__LowerBoundAssignment_2)
	{ after(grammarAccess.getArrayRangeAccess().getLowerBoundAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayRange__Group__3__Impl
	rule__ArrayRange__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayRangeAccess().getGroup_3()); }
	(rule__ArrayRange__Group_3__0)?
	{ after(grammarAccess.getArrayRangeAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayRange__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayRangeAccess().getRightSquareBracketKeyword_4()); }
	RightSquareBracket
	{ after(grammarAccess.getArrayRangeAccess().getRightSquareBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayRange__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayRange__Group_3__0__Impl
	rule__ArrayRange__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0()); }
	FullStopFullStop
	{ after(grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayRange__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayRangeAccess().getUpperBoundAssignment_3_1()); }
	(rule__ArrayRange__UpperBoundAssignment_3_1)
	{ after(grammarAccess.getArrayRangeAccess().getUpperBoundAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SignedConstant__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SignedConstant__Group__0__Impl
	rule__SignedConstant__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedConstant__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSignedConstantAccess().getOpAssignment_0()); }
	(rule__SignedConstant__OpAssignment_0)
	{ after(grammarAccess.getSignedConstantAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedConstant__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SignedConstant__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedConstant__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionAssignment_1()); }
	(rule__SignedConstant__OwnedPropertyExpressionAssignment_1)
	{ after(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerTerm__Group__0__Impl
	rule__IntegerTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerTermAccess().getValueAssignment_0()); }
	(rule__IntegerTerm__ValueAssignment_0)
	{ after(grammarAccess.getIntegerTermAccess().getValueAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerTerm__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerTermAccess().getUnitAssignment_1()); }
	(rule__IntegerTerm__UnitAssignment_1)?
	{ after(grammarAccess.getIntegerTermAccess().getUnitAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SignedInt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SignedInt__Group__0__Impl
	rule__SignedInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedInt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSignedIntAccess().getAlternatives_0()); }
	(rule__SignedInt__Alternatives_0)?
	{ after(grammarAccess.getSignedIntAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedInt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SignedInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedInt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSignedIntAccess().getINTEGER_LITTerminalRuleCall_1()); }
	RULE_INTEGER_LIT
	{ after(grammarAccess.getSignedIntAccess().getINTEGER_LITTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RealTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RealTerm__Group__0__Impl
	rule__RealTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RealTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRealTermAccess().getValueAssignment_0()); }
	(rule__RealTerm__ValueAssignment_0)
	{ after(grammarAccess.getRealTermAccess().getValueAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RealTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RealTerm__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RealTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRealTermAccess().getUnitAssignment_1()); }
	(rule__RealTerm__UnitAssignment_1)?
	{ after(grammarAccess.getRealTermAccess().getUnitAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SignedReal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SignedReal__Group__0__Impl
	rule__SignedReal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedReal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSignedRealAccess().getAlternatives_0()); }
	(rule__SignedReal__Alternatives_0)?
	{ after(grammarAccess.getSignedRealAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedReal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SignedReal__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedReal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSignedRealAccess().getREAL_LITTerminalRuleCall_1()); }
	RULE_REAL_LIT
	{ after(grammarAccess.getSignedRealAccess().getREAL_LITTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NumericRangeTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericRangeTerm__Group__0__Impl
	rule__NumericRangeTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericRangeTermAccess().getMinimumAssignment_0()); }
	(rule__NumericRangeTerm__MinimumAssignment_0)
	{ after(grammarAccess.getNumericRangeTermAccess().getMinimumAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericRangeTerm__Group__1__Impl
	rule__NumericRangeTerm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1()); }
	FullStopFullStop
	{ after(grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericRangeTerm__Group__2__Impl
	rule__NumericRangeTerm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericRangeTermAccess().getMaximumAssignment_2()); }
	(rule__NumericRangeTerm__MaximumAssignment_2)
	{ after(grammarAccess.getNumericRangeTermAccess().getMaximumAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericRangeTerm__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericRangeTermAccess().getGroup_3()); }
	(rule__NumericRangeTerm__Group_3__0)?
	{ after(grammarAccess.getNumericRangeTermAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NumericRangeTerm__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericRangeTerm__Group_3__0__Impl
	rule__NumericRangeTerm__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0()); }
	Delta
	{ after(grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericRangeTerm__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericRangeTermAccess().getDeltaAssignment_3_1()); }
	(rule__NumericRangeTerm__DeltaAssignment_3_1)
	{ after(grammarAccess.getNumericRangeTermAccess().getDeltaAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AppliesToKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppliesToKeywords__Group__0__Impl
	rule__AppliesToKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AppliesToKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppliesToKeywordsAccess().getAppliesKeyword_0()); }
	Applies
	{ after(grammarAccess.getAppliesToKeywordsAccess().getAppliesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppliesToKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppliesToKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AppliesToKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppliesToKeywordsAccess().getToKeyword_1()); }
	To
	{ after(grammarAccess.getAppliesToKeywordsAccess().getToKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InBindingKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InBindingKeywords__Group__0__Impl
	rule__InBindingKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InBindingKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInBindingKeywordsAccess().getInKeyword_0()); }
	In
	{ after(grammarAccess.getInBindingKeywordsAccess().getInKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InBindingKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InBindingKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InBindingKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInBindingKeywordsAccess().getBindingKeyword_1()); }
	Binding
	{ after(grammarAccess.getInBindingKeywordsAccess().getBindingKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InModesKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InModesKeywords__Group__0__Impl
	rule__InModesKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InModesKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInModesKeywordsAccess().getInKeyword_0()); }
	In
	{ after(grammarAccess.getInModesKeywordsAccess().getInKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InModesKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InModesKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InModesKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInModesKeywordsAccess().getModesKeyword_1()); }
	Modes
	{ after(grammarAccess.getInModesKeywordsAccess().getModesKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QPREF__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QPREF__Group__0__Impl
	rule__QPREF__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QPREF__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQPREFAccess().getGroup_1()); }
	(rule__QPREF__Group_1__0)?
	{ after(grammarAccess.getQPREFAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QPREF__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QPREF__Group_1__0__Impl
	rule__QPREF__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQPREFAccess().getColonColonKeyword_1_0()); }
	ColonColon
	{ after(grammarAccess.getQPREFAccess().getColonColonKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QPREF__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QCREF__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group__0__Impl
	rule__QCREF__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getGroup_0()); }
	(rule__QCREF__Group_0__0)*
	{ after(grammarAccess.getQCREFAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group__1__Impl
	rule__QCREF__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
	{ after(grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getGroup_2()); }
	(rule__QCREF__Group_2__0)?
	{ after(grammarAccess.getQCREFAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QCREF__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group_0__0__Impl
	rule__QCREF__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0()); }
	RULE_ID
	{ after(grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getColonColonKeyword_0_1()); }
	ColonColon
	{ after(grammarAccess.getQCREFAccess().getColonColonKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QCREF__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group_2__0__Impl
	rule__QCREF__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getFullStopKeyword_2_0()); }
	FullStop
	{ after(grammarAccess.getQCREFAccess().getFullStopKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getIDTerminalRuleCall_2_1()); }
	RULE_ID
	{ after(grammarAccess.getQCREFAccess().getIDTerminalRuleCall_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SecMFRoot__LibraryAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSecMFRootAccess().getLibrarySMFLibraryParserRuleCall_1_0_0()); }
		ruleSMFLibrary
		{ after(grammarAccess.getSecMFRootAccess().getLibrarySMFLibraryParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecMFRoot__SubclausesAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSecMFRootAccess().getSubclausesSMFSubclauseParserRuleCall_1_1_0()); }
		ruleSMFSubclause
		{ after(grammarAccess.getSecMFRootAccess().getSubclausesSMFSubclauseParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelLibrary__TypesAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSecModelLibraryAccess().getTypesSMFTypeDefParserRuleCall_1_1_0()); }
		ruleSMFTypeDef
		{ after(grammarAccess.getSecModelLibraryAccess().getTypesSMFTypeDefParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__NameAssignment_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFLibraryAccess().getNameQEMREFParserRuleCall_0_1_1_0()); }
		ruleQEMREF
		{ after(grammarAccess.getSMFLibraryAccess().getNameQEMREFParserRuleCall_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__TypesAssignment_0_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFLibraryAccess().getTypesSMFTypeDefParserRuleCall_0_1_2_1_0()); }
		ruleSMFTypeDef
		{ after(grammarAccess.getSMFLibraryAccess().getTypesSMFTypeDefParserRuleCall_0_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__NameAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFLibraryAccess().getNameQEMREFParserRuleCall_1_1_0()); }
		ruleQEMREF
		{ after(grammarAccess.getSMFLibraryAccess().getNameQEMREFParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFLibrary__TypeAssignment_1_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFLibraryAccess().getTypeSMFTypeDefParserRuleCall_1_6_1_0()); }
		ruleSMFTypeDef
		{ after(grammarAccess.getSMFLibraryAccess().getTypeSMFTypeDefParserRuleCall_1_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFSubclauseAccess().getNameQCREFParserRuleCall_2_0()); }
		ruleQCREF
		{ after(grammarAccess.getSMFSubclauseAccess().getNameQCREFParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__ClassificationAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFSubclauseAccess().getClassificationSMFClassificationParserRuleCall_3_1_0()); }
		ruleSMFClassification
		{ after(grammarAccess.getSMFSubclauseAccess().getClassificationSMFClassificationParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFSubclause__DeclassificationAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFSubclauseAccess().getDeclassificationSMFDeclassificationParserRuleCall_4_1_0()); }
		ruleSMFDeclassification
		{ after(grammarAccess.getSMFSubclauseAccess().getDeclassificationSMFDeclassificationParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelSubclause__ClassificationAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSecModelSubclauseAccess().getClassificationSMFClassificationParserRuleCall_1_1_0()); }
		ruleSMFClassification
		{ after(grammarAccess.getSecModelSubclauseAccess().getClassificationSMFClassificationParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecModelSubclause__DeclassificationAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSecModelSubclauseAccess().getDeclassificationSMFDeclassificationParserRuleCall_2_1_0()); }
		ruleSMFDeclassification
		{ after(grammarAccess.getSecModelSubclauseAccess().getDeclassificationSMFDeclassificationParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFClassification__FeatureAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFClassificationAccess().getFeatureNamedElementCrossReference_1_0()); }
		(
			{ before(grammarAccess.getSMFClassificationAccess().getFeatureNamedElementIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSMFClassificationAccess().getFeatureNamedElementIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getSMFClassificationAccess().getFeatureNamedElementCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFClassification__TypeRefAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFClassificationAccess().getTypeRefSMFTypeRefCrossReference_3_0()); }
		(
			{ before(grammarAccess.getSMFClassificationAccess().getTypeRefSMFTypeRefIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSMFClassificationAccess().getTypeRefSMFTypeRefIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getSMFClassificationAccess().getTypeRefSMFTypeRefCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__FlowAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFDeclassificationAccess().getFlowNamedElementCrossReference_1_0()); }
		(
			{ before(grammarAccess.getSMFDeclassificationAccess().getFlowNamedElementIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSMFDeclassificationAccess().getFlowNamedElementIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getSMFDeclassificationAccess().getFlowNamedElementCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__SrcNameAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFDeclassificationAccess().getSrcNameSMFTypeRefCrossReference_3_0_0()); }
		(
			{ before(grammarAccess.getSMFDeclassificationAccess().getSrcNameSMFTypeRefIDTerminalRuleCall_3_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSMFDeclassificationAccess().getSrcNameSMFTypeRefIDTerminalRuleCall_3_0_0_1()); }
		)
		{ after(grammarAccess.getSMFDeclassificationAccess().getSrcNameSMFTypeRefCrossReference_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__AnyAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFDeclassificationAccess().getAnyAnyKeyword_3_1_0()); }
		(
			{ before(grammarAccess.getSMFDeclassificationAccess().getAnyAnyKeyword_3_1_0()); }
			Any
			{ after(grammarAccess.getSMFDeclassificationAccess().getAnyAnyKeyword_3_1_0()); }
		)
		{ after(grammarAccess.getSMFDeclassificationAccess().getAnyAnyKeyword_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFDeclassification__SnkNameAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFDeclassificationAccess().getSnkNameSMFTypeRefCrossReference_5_0()); }
		(
			{ before(grammarAccess.getSMFDeclassificationAccess().getSnkNameSMFTypeRefIDTerminalRuleCall_5_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSMFDeclassificationAccess().getSnkNameSMFTypeRefIDTerminalRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getSMFDeclassificationAccess().getSnkNameSMFTypeRefCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFTypeDefAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getSMFTypeDefAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SMFTypeDef__TypeAssignment_1_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSMFTypeDefAccess().getTypeSMFTypeRefCrossReference_1_1_3_0()); }
		(
			{ before(grammarAccess.getSMFTypeDefAccess().getTypeSMFTypeRefIDTerminalRuleCall_1_1_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSMFTypeDefAccess().getTypeSMFTypeRefIDTerminalRuleCall_1_1_3_0_1()); }
		)
		{ after(grammarAccess.getSMFTypeDefAccess().getTypeSMFTypeRefCrossReference_1_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__PropertyAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0()); }
		(
			{ before(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyQPREFParserRuleCall_0_0_1()); }
			ruleQPREF
			{ after(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyQPREFParserRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__AppendAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0()); }
		(
			{ before(grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0()); }
			PlusSignEqualsSignGreaterThanSign
			{ after(grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0()); }
		)
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__ConstantAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0()); }
		(
			{ before(grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0()); }
			Constant
			{ after(grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0()); }
		)
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__OwnedValueAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0()); }
		ruleOptionalModalPropertyValue
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__OwnedValueAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0()); }
		ruleOptionalModalPropertyValue
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__AppliesToAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_1_0()); }
		ruleContainmentPath
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__AppliesToAssignment_4_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_1_0()); }
		ruleContainmentPath
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__InBindingAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierCrossReference_5_2_0()); }
		(
			{ before(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierQCREFParserRuleCall_5_2_0_1()); }
			ruleQCREF
			{ after(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierQCREFParserRuleCall_5_2_0_1()); }
		)
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierCrossReference_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPath__PathAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainmentPathAccess().getPathContainmentPathElementParserRuleCall_0()); }
		ruleContainmentPathElement
		{ after(grammarAccess.getContainmentPathAccess().getPathContainmentPathElementParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__OwnedValueAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0()); }
		rulePropertyExpression
		{ after(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__InModeAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0()); }
		(
			{ before(grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeIDTerminalRuleCall_1_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeIDTerminalRuleCall_1_2_0_1()); }
		)
		{ after(grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__InModeAssignment_1_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_1_0()); }
		(
			{ before(grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeIDTerminalRuleCall_1_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeIDTerminalRuleCall_1_3_1_0_1()); }
		)
		{ after(grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyValue__OwnedValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0()); }
		rulePropertyExpression
		{ after(grammarAccess.getPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LiteralorReferenceTerm__NamedValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueCrossReference_0()); }
		(
			{ before(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueQPREFParserRuleCall_0_1()); }
			ruleQPREF
			{ after(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueQPREFParserRuleCall_0_1()); }
		)
		{ after(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__ValueAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0()); }
		(
			{ before(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0()); }
			True
			{ after(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0()); }
		)
		{ after(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstantValue__NamedValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstantValueAccess().getNamedValuePropertyConstantCrossReference_0()); }
		(
			{ before(grammarAccess.getConstantValueAccess().getNamedValuePropertyConstantQPREFParserRuleCall_0_1()); }
			ruleQPREF
			{ after(grammarAccess.getConstantValueAccess().getNamedValuePropertyConstantQPREFParserRuleCall_0_1()); }
		)
		{ after(grammarAccess.getConstantValueAccess().getNamedValuePropertyConstantCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceTerm__PathAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReferenceTermAccess().getPathContainmentPathElementParserRuleCall_2_0()); }
		ruleContainmentPathElement
		{ after(grammarAccess.getReferenceTermAccess().getPathContainmentPathElementParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordTerm__OwnedFieldValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0()); }
		ruleFieldPropertyAssociation
		{ after(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputedTerm__FunctionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputedTermAccess().getFunctionIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getComputedTermAccess().getFunctionIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentClassifierTerm__ClassifierAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierCrossReference_2_0()); }
		(
			{ before(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierQCREFParserRuleCall_2_0_1()); }
			ruleQCREF
			{ after(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierQCREFParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__OwnedListElementAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0()); }
		rulePropertyExpression
		{ after(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__OwnedListElementAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0()); }
		rulePropertyExpression
		{ after(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__PropertyAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0()); }
		(
			{ before(grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__OwnedValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValuePropertyExpressionParserRuleCall_2_0()); }
		rulePropertyExpression
		{ after(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValuePropertyExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__NamedElementAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0()); }
		(
			{ before(grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementIDTerminalRuleCall_0_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementIDTerminalRuleCall_0_0_0_1()); }
		)
		{ after(grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__ArrayRangeAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0()); }
		ruleArrayRange
		{ after(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__PathAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainmentPathElementAccess().getPathContainmentPathElementParserRuleCall_1_1_0()); }
		ruleContainmentPathElement
		{ after(grammarAccess.getContainmentPathElementAccess().getPathContainmentPathElementParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringTerm__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringTermAccess().getValueNoQuoteStringParserRuleCall_0()); }
		ruleNoQuoteString
		{ after(grammarAccess.getStringTermAccess().getValueNoQuoteStringParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__LowerBoundAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0()); }
		ruleINTVALUE
		{ after(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__UpperBoundAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0()); }
		ruleINTVALUE
		{ after(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedConstant__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0()); }
		rulePlusMinus
		{ after(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedConstant__OwnedPropertyExpressionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionConstantValueParserRuleCall_1_0()); }
		ruleConstantValue
		{ after(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionConstantValueParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerTerm__ValueAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerTermAccess().getValueSignedIntParserRuleCall_0_0()); }
		ruleSignedInt
		{ after(grammarAccess.getIntegerTermAccess().getValueSignedIntParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerTerm__UnitAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerTermAccess().getUnitUnitLiteralCrossReference_1_0()); }
		(
			{ before(grammarAccess.getIntegerTermAccess().getUnitUnitLiteralIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getIntegerTermAccess().getUnitUnitLiteralIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getIntegerTermAccess().getUnitUnitLiteralCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RealTerm__ValueAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRealTermAccess().getValueSignedRealParserRuleCall_0_0()); }
		ruleSignedReal
		{ after(grammarAccess.getRealTermAccess().getValueSignedRealParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RealTerm__UnitAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRealTermAccess().getUnitUnitLiteralCrossReference_1_0()); }
		(
			{ before(grammarAccess.getRealTermAccess().getUnitUnitLiteralIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRealTermAccess().getUnitUnitLiteralIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getRealTermAccess().getUnitUnitLiteralCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__MinimumAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0()); }
		ruleNumAlt
		{ after(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__MaximumAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0()); }
		ruleNumAlt
		{ after(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__DeltaAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumericRangeTermAccess().getDeltaNumAltParserRuleCall_3_1_0()); }
		ruleNumAlt
		{ after(grammarAccess.getNumericRangeTermAccess().getDeltaNumAltParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}
