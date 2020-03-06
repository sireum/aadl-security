
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
parser grammar InternalSecMFParser;

options {
	tokenVocab=InternalSecMFLexer;
	superClass=AbstractInternalAntlrParser;
	
}

@header {
package org.sireum.aadl.osate.securitymodel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.sireum.aadl.osate.securitymodel.services.SecMFGrammarAccess;

}

@members {


	private SecMFGrammarAccess grammarAccess;
	 	
	public InternalSecMFParser(TokenStream input, SecMFGrammarAccess grammarAccess) {
		this(input);
		this.grammarAccess = grammarAccess;
		registerRules(grammarAccess.getGrammar());
	}
	
	@Override
	protected String getFirstRuleName() {
		return "SecMFRoot";	
	} 
	   	   	
	@Override
	protected SecMFGrammarAccess getGrammarAccess() {
		return grammarAccess;
	}
}

@rulecatch { 
	catch (RecognitionException re) { 
	    recover(input,re); 
	    appendSkippedTokens();
	}
}




// Entry rule entryRuleSecMFRoot
entryRuleSecMFRoot returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getSecMFRootRule()); }
	 iv_ruleSecMFRoot=ruleSecMFRoot 
	 { $current=$iv_ruleSecMFRoot.current; } 
	 EOF 
;

// Rule SecMFRoot
ruleSecMFRoot returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSecMFRootAccess().getSecMFRootAction_0(),
            $current);
    }
)((
(
		{ 
	        newCompositeNode(grammarAccess.getSecMFRootAccess().getLibrarySMFLibraryParserRuleCall_1_0_0()); 
	    }
		lv_library_1_0=ruleSMFLibrary		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSecMFRootRule());
	        }
       		set(
       			$current, 
       			"library",
        		lv_library_1_0, 
        		"org.sireum.aadl.osate.securitymodel.SecMF.SMFLibrary");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getSecMFRootAccess().getSubclausesSMFSubclauseParserRuleCall_1_1_0()); 
	    }
		lv_subclauses_2_0=ruleSMFSubclause		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSecMFRootRule());
	        }
       		add(
       			$current, 
       			"subclauses",
        		lv_subclauses_2_0, 
        		"org.sireum.aadl.osate.securitymodel.SecMF.SMFSubclause");
	        afterParserOrEnumRuleCall();
	    }

)
)*))
;











// Entry rule entryRuleSecModelLibrary
entryRuleSecModelLibrary returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getSecModelLibraryRule()); }
	 iv_ruleSecModelLibrary=ruleSecModelLibrary 
	 { $current=$iv_ruleSecModelLibrary.current; } 
	 EOF 
;

// Rule SecModelLibrary
ruleSecModelLibrary returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSecModelLibraryAccess().getSecModelLibraryAction_0(),
            $current);
    }
)(
    { 
        newCompositeNode(grammarAccess.getSecModelLibraryAccess().getDomainTypesKeywordsParserRuleCall_1_0()); 
    }
ruleDomainTypesKeywords
    {
        afterParserOrEnumRuleCall();
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSecModelLibraryAccess().getTypesSMFTypeDefParserRuleCall_1_1_0()); 
	    }
		lv_types_2_0=ruleSMFTypeDef		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSecModelLibraryRule());
	        }
       		add(
       			$current, 
       			"types",
        		lv_types_2_0, 
        		"org.sireum.aadl.osate.securitymodel.SecMF.SMFTypeDef");
	        afterParserOrEnumRuleCall();
	    }

)
)*
    { 
        newCompositeNode(grammarAccess.getSecModelLibraryAccess().getEndTypesKeywordsParserRuleCall_1_2()); 
    }
ruleEndTypesKeywords
    {
        afterParserOrEnumRuleCall();
    }

	otherlv_4=Semicolon
    {
    	newLeafNode(otherlv_4, grammarAccess.getSecModelLibraryAccess().getSemicolonKeyword_1_3());
    }
)?)
;





// Entry rule entryRuleSMFLibrary
entryRuleSMFLibrary returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getSMFLibraryRule()); }
	 iv_ruleSMFLibrary=ruleSMFLibrary 
	 { $current=$iv_ruleSMFLibrary.current; } 
	 EOF 
;

// Rule SMFLibrary
ruleSMFLibrary returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSMFLibraryAccess().getSecModelLibraryAction_0_0(),
            $current);
    }
)(
	otherlv_1=Library
    {
    	newLeafNode(otherlv_1, grammarAccess.getSMFLibraryAccess().getLibraryKeyword_0_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSMFLibraryAccess().getNameQEMREFParserRuleCall_0_1_1_0()); 
	    }
		lv_name_2_0=ruleQEMREF		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSMFLibraryRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.sireum.aadl.osate.securitymodel.SecMF.QEMREF");
	        afterParserOrEnumRuleCall();
	    }

)
)(
    { 
        newCompositeNode(grammarAccess.getSMFLibraryAccess().getDomainTypesKeywordsParserRuleCall_0_1_2_0()); 
    }
ruleDomainTypesKeywords
    {
        afterParserOrEnumRuleCall();
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSMFLibraryAccess().getTypesSMFTypeDefParserRuleCall_0_1_2_1_0()); 
	    }
		lv_types_4_0=ruleSMFTypeDef		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSMFLibraryRule());
	        }
       		add(
       			$current, 
       			"types",
        		lv_types_4_0, 
        		"org.sireum.aadl.osate.securitymodel.SecMF.SMFTypeDef");
	        afterParserOrEnumRuleCall();
	    }

)
)*
    { 
        newCompositeNode(grammarAccess.getSMFLibraryAccess().getEndTypesKeywordsParserRuleCall_0_1_2_2()); 
    }
ruleEndTypesKeywords
    {
        afterParserOrEnumRuleCall();
    }

	otherlv_6=Semicolon
    {
    	newLeafNode(otherlv_6, grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_0_1_2_3());
    }
)?))
    |(
	otherlv_7=Package
    {
    	newLeafNode(otherlv_7, grammarAccess.getSMFLibraryAccess().getPackageKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSMFLibraryAccess().getNameQEMREFParserRuleCall_1_1_0()); 
	    }
		lv_name_8_0=ruleQEMREF		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSMFLibraryRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_8_0, 
        		"org.sireum.aadl.osate.securitymodel.SecMF.QEMREF");
	        afterParserOrEnumRuleCall();
	    }

)
)
	otherlv_9=Public
    {
    	newLeafNode(otherlv_9, grammarAccess.getSMFLibraryAccess().getPublicKeyword_1_2());
    }

	otherlv_10=Annex
    {
    	newLeafNode(otherlv_10, grammarAccess.getSMFLibraryAccess().getAnnexKeyword_1_3());
    }
this_ID_11=RULE_ID
    { 
    newLeafNode(this_ID_11, grammarAccess.getSMFLibraryAccess().getIDTerminalRuleCall_1_4()); 
    }

	otherlv_12=LeftCurlyBracketAsteriskAsterisk
    {
    	newLeafNode(otherlv_12, grammarAccess.getSMFLibraryAccess().getLeftCurlyBracketAsteriskAsteriskKeyword_1_5());
    }
(
    { 
        newCompositeNode(grammarAccess.getSMFLibraryAccess().getDomainTypesKeywordsParserRuleCall_1_6_0()); 
    }
ruleDomainTypesKeywords
    {
        afterParserOrEnumRuleCall();
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSMFLibraryAccess().getTypeSMFTypeDefParserRuleCall_1_6_1_0()); 
	    }
		lv_type_14_0=ruleSMFTypeDef		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSMFLibraryRule());
	        }
       		add(
       			$current, 
       			"type",
        		lv_type_14_0, 
        		"org.sireum.aadl.osate.securitymodel.SecMF.SMFTypeDef");
	        afterParserOrEnumRuleCall();
	    }

)
)*
    { 
        newCompositeNode(grammarAccess.getSMFLibraryAccess().getEndTypesKeywordsParserRuleCall_1_6_2()); 
    }
ruleEndTypesKeywords
    {
        afterParserOrEnumRuleCall();
    }

	otherlv_16=Semicolon
    {
    	newLeafNode(otherlv_16, grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_1_6_3());
    }
)?
	otherlv_17=AsteriskAsteriskRightCurlyBracket
    {
    	newLeafNode(otherlv_17, grammarAccess.getSMFLibraryAccess().getAsteriskAsteriskRightCurlyBracketKeyword_1_7());
    }

	otherlv_18=Semicolon
    {
    	newLeafNode(otherlv_18, grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_1_8());
    }

	otherlv_19=End
    {
    	newLeafNode(otherlv_19, grammarAccess.getSMFLibraryAccess().getEndKeyword_1_9());
    }

    { 
        newCompositeNode(grammarAccess.getSMFLibraryAccess().getQEMREFParserRuleCall_1_10()); 
    }
ruleQEMREF
    {
        afterParserOrEnumRuleCall();
    }

	otherlv_21=Semicolon
    {
    	newLeafNode(otherlv_21, grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_1_11());
    }
))
;









// Entry rule entryRuleSMFSubclause
entryRuleSMFSubclause returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getSMFSubclauseRule()); }
	 iv_ruleSMFSubclause=ruleSMFSubclause 
	 { $current=$iv_ruleSMFSubclause.current; } 
	 EOF 
;

// Rule SMFSubclause
ruleSMFSubclause returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSMFSubclauseAccess().getSecModelSubclauseAction_0(),
            $current);
    }
)
	otherlv_1=Subclause
    {
    	newLeafNode(otherlv_1, grammarAccess.getSMFSubclauseAccess().getSubclauseKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSMFSubclauseAccess().getNameQCREFParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleQCREF		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSMFSubclauseRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.osate.xtext.aadl2.properties.Properties.QCREF");
	        afterParserOrEnumRuleCall();
	    }

)
)(
    { 
        newCompositeNode(grammarAccess.getSMFSubclauseAccess().getClassificationKeywordsParserRuleCall_3_0()); 
    }
ruleClassificationKeywords
    {
        afterParserOrEnumRuleCall();
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSMFSubclauseAccess().getClassificationSMFClassificationParserRuleCall_3_1_0()); 
	    }
		lv_classification_4_0=ruleSMFClassification		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSMFSubclauseRule());
	        }
       		add(
       			$current, 
       			"classification",
        		lv_classification_4_0, 
        		"org.sireum.aadl.osate.securitymodel.SecMF.SMFClassification");
	        afterParserOrEnumRuleCall();
	    }

)
)+)?(
    { 
        newCompositeNode(grammarAccess.getSMFSubclauseAccess().getDeclassificationKeywordsParserRuleCall_4_0()); 
    }
ruleDeclassificationKeywords
    {
        afterParserOrEnumRuleCall();
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSMFSubclauseAccess().getDeclassificationSMFDeclassificationParserRuleCall_4_1_0()); 
	    }
		lv_declassification_6_0=ruleSMFDeclassification		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSMFSubclauseRule());
	        }
       		add(
       			$current, 
       			"declassification",
        		lv_declassification_6_0, 
        		"org.sireum.aadl.osate.securitymodel.SecMF.SMFDeclassification");
	        afterParserOrEnumRuleCall();
	    }

)
)+)?)
;





// Entry rule entryRuleSecModelSubclause
entryRuleSecModelSubclause returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getSecModelSubclauseRule()); }
	 iv_ruleSecModelSubclause=ruleSecModelSubclause 
	 { $current=$iv_ruleSecModelSubclause.current; } 
	 EOF 
;

// Rule SecModelSubclause
ruleSecModelSubclause returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSecModelSubclauseAccess().getSecModelSubclauseAction_0(),
            $current);
    }
)(
    { 
        newCompositeNode(grammarAccess.getSecModelSubclauseAccess().getClassificationKeywordsParserRuleCall_1_0()); 
    }
ruleClassificationKeywords
    {
        afterParserOrEnumRuleCall();
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSecModelSubclauseAccess().getClassificationSMFClassificationParserRuleCall_1_1_0()); 
	    }
		lv_classification_2_0=ruleSMFClassification		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSecModelSubclauseRule());
	        }
       		add(
       			$current, 
       			"classification",
        		lv_classification_2_0, 
        		"org.sireum.aadl.osate.securitymodel.SecMF.SMFClassification");
	        afterParserOrEnumRuleCall();
	    }

)
)+)?(
    { 
        newCompositeNode(grammarAccess.getSecModelSubclauseAccess().getDeclassificationKeywordsParserRuleCall_2_0()); 
    }
ruleDeclassificationKeywords
    {
        afterParserOrEnumRuleCall();
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSecModelSubclauseAccess().getDeclassificationSMFDeclassificationParserRuleCall_2_1_0()); 
	    }
		lv_declassification_4_0=ruleSMFDeclassification		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSecModelSubclauseRule());
	        }
       		add(
       			$current, 
       			"declassification",
        		lv_declassification_4_0, 
        		"org.sireum.aadl.osate.securitymodel.SecMF.SMFDeclassification");
	        afterParserOrEnumRuleCall();
	    }

)
)+)?)
;





// Entry rule entryRuleSMFClassification
entryRuleSMFClassification returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getSMFClassificationRule()); }
	 iv_ruleSMFClassification=ruleSMFClassification 
	 { $current=$iv_ruleSMFClassification.current; } 
	 EOF 
;

// Rule SMFClassification
ruleSMFClassification returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSMFClassificationAccess().getSMFClassificationAction_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSMFClassificationRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getSMFClassificationAccess().getFeatureNamedElementCrossReference_1_0()); 
	}

)
)
	otherlv_2=Colon
    {
    	newLeafNode(otherlv_2, grammarAccess.getSMFClassificationAccess().getColonKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSMFClassificationRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getSMFClassificationAccess().getTypeRefSMFTypeRefCrossReference_3_0()); 
	}

)
)
	otherlv_4=Semicolon
    {
    	newLeafNode(otherlv_4, grammarAccess.getSMFClassificationAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleSMFTypeRef
entryRuleSMFTypeRef returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getSMFTypeRefRule()); }
	 iv_ruleSMFTypeRef=ruleSMFTypeRef 
	 { $current=$iv_ruleSMFTypeRef.current; } 
	 EOF 
;

// Rule SMFTypeRef
ruleSMFTypeRef returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getSMFTypeRefAccess().getSMFTypeDefParserRuleCall()); 
    }
    this_SMFTypeDef_0=ruleSMFTypeDef
    {
        $current = $this_SMFTypeDef_0.current;
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleSMFDeclassification
entryRuleSMFDeclassification returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getSMFDeclassificationRule()); }
	 iv_ruleSMFDeclassification=ruleSMFDeclassification 
	 { $current=$iv_ruleSMFDeclassification.current; } 
	 EOF 
;

// Rule SMFDeclassification
ruleSMFDeclassification returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSMFDeclassificationAccess().getSMFDeclassificationAction_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSMFDeclassificationRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getSMFDeclassificationAccess().getFlowNamedElementCrossReference_1_0()); 
	}

)
)
	otherlv_2=Colon
    {
    	newLeafNode(otherlv_2, grammarAccess.getSMFDeclassificationAccess().getColonKeyword_2());
    }
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSMFDeclassificationRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getSMFDeclassificationAccess().getSrcNameSMFTypeRefCrossReference_3_0_0()); 
	}

)
)
    |(
(
		lv_any_4_0=
	Any
    {
        newLeafNode(lv_any_4_0, grammarAccess.getSMFDeclassificationAccess().getAnyAnyKeyword_3_1_0());
    }

	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSMFDeclassificationRule());
	        }
       		setWithLastConsumed($current, "any", true, "any");
	    }

)
))
	otherlv_5=HyphenMinusGreaterThanSign
    {
    	newLeafNode(otherlv_5, grammarAccess.getSMFDeclassificationAccess().getHyphenMinusGreaterThanSignKeyword_4());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSMFDeclassificationRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getSMFDeclassificationAccess().getSnkNameSMFTypeRefCrossReference_5_0()); 
	}

)
)
	otherlv_7=Semicolon
    {
    	newLeafNode(otherlv_7, grammarAccess.getSMFDeclassificationAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleSMFTypeDef
entryRuleSMFTypeDef returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getSMFTypeDefRule()); }
	 iv_ruleSMFTypeDef=ruleSMFTypeDef 
	 { $current=$iv_ruleSMFTypeDef.current; } 
	 EOF 
;

// Rule SMFTypeDef
ruleSMFTypeDef returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getSMFTypeDefAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSMFTypeDefRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"org.osate.xtext.aadl2.properties.Properties.ID");
	    }

)
)((
	otherlv_1=Colon
    {
    	newLeafNode(otherlv_1, grammarAccess.getSMFTypeDefAccess().getColonKeyword_1_0_0());
    }

	otherlv_2=Type
    {
    	newLeafNode(otherlv_2, grammarAccess.getSMFTypeDefAccess().getTypeKeyword_1_0_1());
    }
)
    |(
	otherlv_3=Colon
    {
    	newLeafNode(otherlv_3, grammarAccess.getSMFTypeDefAccess().getColonKeyword_1_1_0());
    }

	otherlv_4=Type
    {
    	newLeafNode(otherlv_4, grammarAccess.getSMFTypeDefAccess().getTypeKeyword_1_1_1());
    }

	otherlv_5=Extends
    {
    	newLeafNode(otherlv_5, grammarAccess.getSMFTypeDefAccess().getExtendsKeyword_1_1_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSMFTypeDefRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getSMFTypeDefAccess().getTypeSMFTypeRefCrossReference_1_1_3_0()); 
	}

)
)))
	otherlv_7=Semicolon
    {
    	newLeafNode(otherlv_7, grammarAccess.getSMFTypeDefAccess().getSemicolonKeyword_2());
    }
)
;





// Entry rule entryRuleClassificationKeywords
entryRuleClassificationKeywords returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getClassificationKeywordsRule()); } 
	 iv_ruleClassificationKeywords=ruleClassificationKeywords 
	 { $current=$iv_ruleClassificationKeywords.current.getText(); }  
	 EOF 
;

// Rule ClassificationKeywords
ruleClassificationKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:

	kw=Classification 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getClassificationKeywordsAccess().getClassificationKeyword()); 
    }

    ;





// Entry rule entryRuleDeclassificationKeywords
entryRuleDeclassificationKeywords returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getDeclassificationKeywordsRule()); } 
	 iv_ruleDeclassificationKeywords=ruleDeclassificationKeywords 
	 { $current=$iv_ruleDeclassificationKeywords.current.getText(); }  
	 EOF 
;

// Rule DeclassificationKeywords
ruleDeclassificationKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:

	kw=DeClassification 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDeclassificationKeywordsAccess().getDeClassificationKeyword()); 
    }

    ;





// Entry rule entryRuleDomainTypesKeywords
entryRuleDomainTypesKeywords returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getDomainTypesKeywordsRule()); } 
	 iv_ruleDomainTypesKeywords=ruleDomainTypesKeywords 
	 { $current=$iv_ruleDomainTypesKeywords.current.getText(); }  
	 EOF 
;

// Rule DomainTypesKeywords
ruleDomainTypesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(
	kw=Domain 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDomainTypesKeywordsAccess().getDomainKeyword_0()); 
    }

	kw=Types 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDomainTypesKeywordsAccess().getTypesKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleEndTypesKeywords
entryRuleEndTypesKeywords returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getEndTypesKeywordsRule()); } 
	 iv_ruleEndTypesKeywords=ruleEndTypesKeywords 
	 { $current=$iv_ruleEndTypesKeywords.current.getText(); }  
	 EOF 
;

// Rule EndTypesKeywords
ruleEndTypesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(
	kw=End 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEndTypesKeywordsAccess().getEndKeyword_0()); 
    }

	kw=Types 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEndTypesKeywordsAccess().getTypesKeyword_1()); 
    }
)
    ;







// Entry rule entryRuleQEMREF
entryRuleQEMREF returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getQEMREFRule()); } 
	 iv_ruleQEMREF=ruleQEMREF 
	 { $current=$iv_ruleQEMREF.current.getText(); }  
	 EOF 
;

// Rule QEMREF
ruleQEMREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQEMREFAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw=ColonColon 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQEMREFAccess().getColonColonKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQEMREFAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;







// Entry rule entryRuleContainedPropertyAssociation
entryRuleContainedPropertyAssociation returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getContainedPropertyAssociationRule()); }
	 iv_ruleContainedPropertyAssociation=ruleContainedPropertyAssociation 
	 { $current=$iv_ruleContainedPropertyAssociation.current; } 
	 EOF 
;

// Rule ContainedPropertyAssociation
ruleContainedPropertyAssociation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0()); 
	    }
		ruleQPREF
		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
	otherlv_1=EqualsSignGreaterThanSign
    {
    	newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
    }

    |(
(
		lv_append_2_0=
	PlusSignEqualsSignGreaterThanSign
    {
        newLeafNode(lv_append_2_0, grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0());
    }

	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
	        }
       		setWithLastConsumed($current, "append", true, "+=>");
	    }

)
))(
(
		lv_constant_3_0=
	Constant
    {
        newLeafNode(lv_constant_3_0, grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0());
    }

	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
	        }
       		setWithLastConsumed($current, "constant", true, "constant");
	    }

)
)?((
(
		{ 
	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0()); 
	    }
		lv_ownedValue_4_0=ruleOptionalModalPropertyValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
	        }
       		add(
       			$current, 
       			"ownedValue",
        		lv_ownedValue_4_0, 
        		"org.osate.xtext.aadl2.properties.Properties.OptionalModalPropertyValue");
	        afterParserOrEnumRuleCall();
	    }

)
)(
	otherlv_5=Comma
    {
    	newLeafNode(otherlv_5, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0()); 
	    }
		lv_ownedValue_6_0=ruleOptionalModalPropertyValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
	        }
       		add(
       			$current, 
       			"ownedValue",
        		lv_ownedValue_6_0, 
        		"org.osate.xtext.aadl2.properties.Properties.OptionalModalPropertyValue");
	        afterParserOrEnumRuleCall();
	    }

)
))*)(
    { 
        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToKeywordsParserRuleCall_4_0()); 
    }
ruleAppliesToKeywords
    {
        afterParserOrEnumRuleCall();
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_1_0()); 
	    }
		lv_appliesTo_8_0=ruleContainmentPath		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
	        }
       		add(
       			$current, 
       			"appliesTo",
        		lv_appliesTo_8_0, 
        		"org.osate.xtext.aadl2.properties.Properties.ContainmentPath");
	        afterParserOrEnumRuleCall();
	    }

)
)(
	otherlv_9=Comma
    {
    	newLeafNode(otherlv_9, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_1_0()); 
	    }
		lv_appliesTo_10_0=ruleContainmentPath		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
	        }
       		add(
       			$current, 
       			"appliesTo",
        		lv_appliesTo_10_0, 
        		"org.osate.xtext.aadl2.properties.Properties.ContainmentPath");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(
    { 
        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0()); 
    }
ruleInBindingKeywords
    {
        afterParserOrEnumRuleCall();
    }

	otherlv_12=LeftParenthesis
    {
    	newLeafNode(otherlv_12, grammarAccess.getContainedPropertyAssociationAccess().getLeftParenthesisKeyword_5_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierCrossReference_5_2_0()); 
	    }
		ruleQCREF
		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)
	otherlv_14=RightParenthesis
    {
    	newLeafNode(otherlv_14, grammarAccess.getContainedPropertyAssociationAccess().getRightParenthesisKeyword_5_3());
    }
)?
	otherlv_15=Semicolon
    {
    	newLeafNode(otherlv_15, grammarAccess.getContainedPropertyAssociationAccess().getSemicolonKeyword_6());
    }
)
;









// Entry rule entryRuleContainmentPath
entryRuleContainmentPath returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getContainmentPathRule()); }
	 iv_ruleContainmentPath=ruleContainmentPath 
	 { $current=$iv_ruleContainmentPath.current; } 
	 EOF 
;

// Rule ContainmentPath
ruleContainmentPath returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getContainmentPathAccess().getPathContainmentPathElementParserRuleCall_0()); 
	    }
		lv_path_0_0=ruleContainmentPathElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContainmentPathRule());
	        }
       		set(
       			$current, 
       			"path",
        		lv_path_0_0, 
        		"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
	        afterParserOrEnumRuleCall();
	    }

)
)
;







// Entry rule entryRuleOptionalModalPropertyValue
entryRuleOptionalModalPropertyValue returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getOptionalModalPropertyValueRule()); }
	 iv_ruleOptionalModalPropertyValue=ruleOptionalModalPropertyValue 
	 { $current=$iv_ruleOptionalModalPropertyValue.current; } 
	 EOF 
;

// Rule OptionalModalPropertyValue
ruleOptionalModalPropertyValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0()); 
	    }
		lv_ownedValue_0_0=rulePropertyExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptionalModalPropertyValueRule());
	        }
       		set(
       			$current, 
       			"ownedValue",
        		lv_ownedValue_0_0, 
        		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)(
    { 
        newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0()); 
    }
ruleInModesKeywords
    {
        afterParserOrEnumRuleCall();
    }

	otherlv_2=LeftParenthesis
    {
    	newLeafNode(otherlv_2, grammarAccess.getOptionalModalPropertyValueAccess().getLeftParenthesisKeyword_1_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0()); 
	}

)
)(
	otherlv_4=Comma
    {
    	newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_1_0()); 
	}

)
))*
	otherlv_6=RightParenthesis
    {
    	newLeafNode(otherlv_6, grammarAccess.getOptionalModalPropertyValueAccess().getRightParenthesisKeyword_1_4());
    }
)?)
;





// Entry rule entryRulePropertyValue
entryRulePropertyValue returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getPropertyValueRule()); }
	 iv_rulePropertyValue=rulePropertyValue 
	 { $current=$iv_rulePropertyValue.current; } 
	 EOF 
;

// Rule PropertyValue
rulePropertyValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0()); 
	    }
		lv_ownedValue_0_0=rulePropertyExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPropertyValueRule());
	        }
       		set(
       			$current, 
       			"ownedValue",
        		lv_ownedValue_0_0, 
        		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRulePropertyExpression
entryRulePropertyExpression returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getPropertyExpressionRule()); }
	 iv_rulePropertyExpression=rulePropertyExpression 
	 { $current=$iv_rulePropertyExpression.current; } 
	 EOF 
;

// Rule PropertyExpression
rulePropertyExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRecordTermParserRuleCall_0()); 
    }
    this_RecordTerm_0=ruleRecordTerm
    {
        $current = $this_RecordTerm_0.current;
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPropertyExpressionAccess().getReferenceTermParserRuleCall_1()); 
    }
    this_ReferenceTerm_1=ruleReferenceTerm
    {
        $current = $this_ReferenceTerm_1.current;
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComponentClassifierTermParserRuleCall_2()); 
    }
    this_ComponentClassifierTerm_2=ruleComponentClassifierTerm
    {
        $current = $this_ComponentClassifierTerm_2.current;
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComputedTermParserRuleCall_3()); 
    }
    this_ComputedTerm_3=ruleComputedTerm
    {
        $current = $this_ComputedTerm_3.current;
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPropertyExpressionAccess().getStringTermParserRuleCall_4()); 
    }
    this_StringTerm_4=ruleStringTerm
    {
        $current = $this_StringTerm_4.current;
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPropertyExpressionAccess().getNumericRangeTermParserRuleCall_5()); 
    }
    this_NumericRangeTerm_5=ruleNumericRangeTerm
    {
        $current = $this_NumericRangeTerm_5.current;
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRealTermParserRuleCall_6()); 
    }
    this_RealTerm_6=ruleRealTerm
    {
        $current = $this_RealTerm_6.current;
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPropertyExpressionAccess().getIntegerTermParserRuleCall_7()); 
    }
    this_IntegerTerm_7=ruleIntegerTerm
    {
        $current = $this_IntegerTerm_7.current;
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPropertyExpressionAccess().getListTermParserRuleCall_8()); 
    }
    this_ListTerm_8=ruleListTerm
    {
        $current = $this_ListTerm_8.current;
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPropertyExpressionAccess().getBooleanLiteralParserRuleCall_9()); 
    }
    this_BooleanLiteral_9=ruleBooleanLiteral
    {
        $current = $this_BooleanLiteral_9.current;
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPropertyExpressionAccess().getLiteralorReferenceTermParserRuleCall_10()); 
    }
    this_LiteralorReferenceTerm_10=ruleLiteralorReferenceTerm
    {
        $current = $this_LiteralorReferenceTerm_10.current;
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleLiteralorReferenceTerm
entryRuleLiteralorReferenceTerm returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getLiteralorReferenceTermRule()); }
	 iv_ruleLiteralorReferenceTerm=ruleLiteralorReferenceTerm 
	 { $current=$iv_ruleLiteralorReferenceTerm.current; } 
	 EOF 
;

// Rule LiteralorReferenceTerm
ruleLiteralorReferenceTerm returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLiteralorReferenceTermRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueCrossReference_0()); 
	    }
		ruleQPREF
		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleBooleanLiteral
entryRuleBooleanLiteral returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getBooleanLiteralRule()); }
	 iv_ruleBooleanLiteral=ruleBooleanLiteral 
	 { $current=$iv_ruleBooleanLiteral.current; } 
	 EOF 
;

// Rule BooleanLiteral
ruleBooleanLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
            $current);
    }
)((
(
		lv_value_1_0=
	True
    {
        newLeafNode(lv_value_1_0, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0());
    }

	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBooleanLiteralRule());
	        }
       		setWithLastConsumed($current, "value", true, "true");
	    }

)
)
    |
	otherlv_2=False
    {
    	newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
    }
))
;





// Entry rule entryRuleConstantValue
entryRuleConstantValue returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getConstantValueRule()); }
	 iv_ruleConstantValue=ruleConstantValue 
	 { $current=$iv_ruleConstantValue.current; } 
	 EOF 
;

// Rule ConstantValue
ruleConstantValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getConstantValueRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getConstantValueAccess().getNamedValuePropertyConstantCrossReference_0()); 
	    }
		ruleQPREF
		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleReferenceTerm
entryRuleReferenceTerm returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getReferenceTermRule()); }
	 iv_ruleReferenceTerm=ruleReferenceTerm 
	 { $current=$iv_ruleReferenceTerm.current; } 
	 EOF 
;

// Rule ReferenceTerm
ruleReferenceTerm returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	otherlv_0=Reference
    {
    	newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());
    }

	otherlv_1=LeftParenthesis
    {
    	newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getReferenceTermAccess().getPathContainmentPathElementParserRuleCall_2_0()); 
	    }
		lv_path_2_0=ruleContainmentPathElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getReferenceTermRule());
	        }
       		set(
       			$current, 
       			"path",
        		lv_path_2_0, 
        		"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
	        afterParserOrEnumRuleCall();
	    }

)
)
	otherlv_3=RightParenthesis
    {
    	newLeafNode(otherlv_3, grammarAccess.getReferenceTermAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleRecordTerm
entryRuleRecordTerm returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getRecordTermRule()); }
	 iv_ruleRecordTerm=ruleRecordTerm 
	 { $current=$iv_ruleRecordTerm.current; } 
	 EOF 
;

// Rule RecordTerm
ruleRecordTerm returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	otherlv_0=LeftSquareBracket
    {
    	newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0()); 
	    }
		lv_ownedFieldValue_1_0=ruleFieldPropertyAssociation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRecordTermRule());
	        }
       		add(
       			$current, 
       			"ownedFieldValue",
        		lv_ownedFieldValue_1_0, 
        		"org.osate.xtext.aadl2.properties.Properties.FieldPropertyAssociation");
	        afterParserOrEnumRuleCall();
	    }

)
)+
	otherlv_2=RightSquareBracket
    {
    	newLeafNode(otherlv_2, grammarAccess.getRecordTermAccess().getRightSquareBracketKeyword_2());
    }
)
;







// Entry rule entryRuleComputedTerm
entryRuleComputedTerm returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getComputedTermRule()); }
	 iv_ruleComputedTerm=ruleComputedTerm 
	 { $current=$iv_ruleComputedTerm.current; } 
	 EOF 
;

// Rule ComputedTerm
ruleComputedTerm returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	otherlv_0=Compute
    {
    	newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());
    }

	otherlv_1=LeftParenthesis
    {
    	newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());
    }
(
(
		lv_function_2_0=RULE_ID
		{
			newLeafNode(lv_function_2_0, grammarAccess.getComputedTermAccess().getFunctionIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComputedTermRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"function",
        		lv_function_2_0, 
        		"org.osate.xtext.aadl2.properties.Properties.ID");
	    }

)
)
	otherlv_3=RightParenthesis
    {
    	newLeafNode(otherlv_3, grammarAccess.getComputedTermAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleComponentClassifierTerm
entryRuleComponentClassifierTerm returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getComponentClassifierTermRule()); }
	 iv_ruleComponentClassifierTerm=ruleComponentClassifierTerm 
	 { $current=$iv_ruleComponentClassifierTerm.current; } 
	 EOF 
;

// Rule ComponentClassifierTerm
ruleComponentClassifierTerm returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	otherlv_0=Classifier
    {
    	newLeafNode(otherlv_0, grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());
    }

	otherlv_1=LeftParenthesis
    {
    	newLeafNode(otherlv_1, grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentClassifierTermRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierCrossReference_2_0()); 
	    }
		ruleQCREF
		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)
	otherlv_3=RightParenthesis
    {
    	newLeafNode(otherlv_3, grammarAccess.getComponentClassifierTermAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleListTerm
entryRuleListTerm returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getListTermRule()); }
	 iv_ruleListTerm=ruleListTerm 
	 { $current=$iv_ruleListTerm.current; } 
	 EOF 
;

// Rule ListTerm
ruleListTerm returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getListTermAccess().getListValueAction_0(),
            $current);
    }
)
	otherlv_1=LeftParenthesis
    {
    	newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0()); 
	    }
		lv_ownedListElement_2_0=rulePropertyExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getListTermRule());
	        }
       		add(
       			$current, 
       			"ownedListElement",
        		lv_ownedListElement_2_0, 
        		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)(
	otherlv_3=Comma
    {
    	newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_2_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0()); 
	    }
		lv_ownedListElement_4_0=rulePropertyExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getListTermRule());
	        }
       		add(
       			$current, 
       			"ownedListElement",
        		lv_ownedListElement_4_0, 
        		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?
	otherlv_5=RightParenthesis
    {
    	newLeafNode(otherlv_5, grammarAccess.getListTermAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleFieldPropertyAssociation
entryRuleFieldPropertyAssociation returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getFieldPropertyAssociationRule()); }
	 iv_ruleFieldPropertyAssociation=ruleFieldPropertyAssociation 
	 { $current=$iv_ruleFieldPropertyAssociation.current; } 
	 EOF 
;

// Rule FieldPropertyAssociation
ruleFieldPropertyAssociation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldPropertyAssociationRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0()); 
	}

)
)
	otherlv_1=EqualsSignGreaterThanSign
    {
    	newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValuePropertyExpressionParserRuleCall_2_0()); 
	    }
		lv_ownedValue_2_0=rulePropertyExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFieldPropertyAssociationRule());
	        }
       		set(
       			$current, 
       			"ownedValue",
        		lv_ownedValue_2_0, 
        		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)
	otherlv_3=Semicolon
    {
    	newLeafNode(otherlv_3, grammarAccess.getFieldPropertyAssociationAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleContainmentPathElement
entryRuleContainmentPathElement returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getContainmentPathElementRule()); }
	 iv_ruleContainmentPathElement=ruleContainmentPathElement 
	 { $current=$iv_ruleContainmentPathElement.current; } 
	 EOF 
;

// Rule ContainmentPathElement
ruleContainmentPathElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getContainmentPathElementRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0()); 
	}

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0()); 
	    }
		lv_arrayRange_1_0=ruleArrayRange		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContainmentPathElementRule());
	        }
       		add(
       			$current, 
       			"arrayRange",
        		lv_arrayRange_1_0, 
        		"org.osate.xtext.aadl2.properties.Properties.ArrayRange");
	        afterParserOrEnumRuleCall();
	    }

)
)*)(
	otherlv_2=FullStop
    {
    	newLeafNode(otherlv_2, grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getContainmentPathElementAccess().getPathContainmentPathElementParserRuleCall_1_1_0()); 
	    }
		lv_path_3_0=ruleContainmentPathElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContainmentPathElementRule());
	        }
       		set(
       			$current, 
       			"path",
        		lv_path_3_0, 
        		"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;







// Entry rule entryRulePlusMinus
entryRulePlusMinus returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getPlusMinusRule()); } 
	 iv_rulePlusMinus=rulePlusMinus 
	 { $current=$iv_rulePlusMinus.current.getText(); }  
	 EOF 
;

// Rule PlusMinus
rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(
	kw=PlusSign 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0()); 
    }

    |
	kw=HyphenMinus 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleStringTerm
entryRuleStringTerm returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getStringTermRule()); }
	 iv_ruleStringTerm=ruleStringTerm 
	 { $current=$iv_ruleStringTerm.current; } 
	 EOF 
;

// Rule StringTerm
ruleStringTerm returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getStringTermAccess().getValueNoQuoteStringParserRuleCall_0()); 
	    }
		lv_value_0_0=ruleNoQuoteString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStringTermRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"org.osate.xtext.aadl2.properties.Properties.NoQuoteString");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleNoQuoteString
entryRuleNoQuoteString returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getNoQuoteStringRule()); } 
	 iv_ruleNoQuoteString=ruleNoQuoteString 
	 { $current=$iv_ruleNoQuoteString.current.getText(); }  
	 EOF 
;

// Rule NoQuoteString
ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall()); 
    }

    ;





// Entry rule entryRuleArrayRange
entryRuleArrayRange returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getArrayRangeRule()); }
	 iv_ruleArrayRange=ruleArrayRange 
	 { $current=$iv_ruleArrayRange.current; } 
	 EOF 
;

// Rule ArrayRange
ruleArrayRange returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getArrayRangeAccess().getArrayRangeAction_0(),
            $current);
    }
)
	otherlv_1=LeftSquareBracket
    {
    	newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0()); 
	    }
		lv_lowerBound_2_0=ruleINTVALUE		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getArrayRangeRule());
	        }
       		set(
       			$current, 
       			"lowerBound",
        		lv_lowerBound_2_0, 
        		"org.osate.xtext.aadl2.properties.Properties.INTVALUE");
	        afterParserOrEnumRuleCall();
	    }

)
)(
	otherlv_3=FullStopFullStop
    {
    	newLeafNode(otherlv_3, grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0()); 
	    }
		lv_upperBound_4_0=ruleINTVALUE		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getArrayRangeRule());
	        }
       		set(
       			$current, 
       			"upperBound",
        		lv_upperBound_4_0, 
        		"org.osate.xtext.aadl2.properties.Properties.INTVALUE");
	        afterParserOrEnumRuleCall();
	    }

)
))?
	otherlv_5=RightSquareBracket
    {
    	newLeafNode(otherlv_5, grammarAccess.getArrayRangeAccess().getRightSquareBracketKeyword_4());
    }
)
;





// Entry rule entryRuleSignedConstant
entryRuleSignedConstant returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getSignedConstantRule()); }
	 iv_ruleSignedConstant=ruleSignedConstant 
	 { $current=$iv_ruleSignedConstant.current; } 
	 EOF 
;

// Rule SignedConstant
ruleSignedConstant returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0()); 
	    }
		lv_op_0_0=rulePlusMinus		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSignedConstantRule());
	        }
       		set(
       			$current, 
       			"op",
        		lv_op_0_0, 
        		"org.osate.xtext.aadl2.properties.Properties.PlusMinus");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionConstantValueParserRuleCall_1_0()); 
	    }
		lv_ownedPropertyExpression_1_0=ruleConstantValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSignedConstantRule());
	        }
       		add(
       			$current, 
       			"ownedPropertyExpression",
        		lv_ownedPropertyExpression_1_0, 
        		"org.osate.xtext.aadl2.properties.Properties.ConstantValue");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleIntegerTerm
entryRuleIntegerTerm returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getIntegerTermRule()); }
	 iv_ruleIntegerTerm=ruleIntegerTerm 
	 { $current=$iv_ruleIntegerTerm.current; } 
	 EOF 
;

// Rule IntegerTerm
ruleIntegerTerm returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getIntegerTermAccess().getValueSignedIntParserRuleCall_0_0()); 
	    }
		lv_value_0_0=ruleSignedInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIntegerTermRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"org.osate.xtext.aadl2.properties.Properties.SignedInt");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntegerTermRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getIntegerTermAccess().getUnitUnitLiteralCrossReference_1_0()); 
	}

)
)?)
;





// Entry rule entryRuleSignedInt
entryRuleSignedInt returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getSignedIntRule()); } 
	 iv_ruleSignedInt=ruleSignedInt 
	 { $current=$iv_ruleSignedInt.current.getText(); }  
	 EOF 
;

// Rule SignedInt
ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
((
	kw=PlusSign 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0()); 
    }

    |
	kw=HyphenMinus 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0_1()); 
    }
)?    this_INTEGER_LIT_2=RULE_INTEGER_LIT    {
		$current.merge(this_INTEGER_LIT_2);
    }

    { 
    newLeafNode(this_INTEGER_LIT_2, grammarAccess.getSignedIntAccess().getINTEGER_LITTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleRealTerm
entryRuleRealTerm returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getRealTermRule()); }
	 iv_ruleRealTerm=ruleRealTerm 
	 { $current=$iv_ruleRealTerm.current; } 
	 EOF 
;

// Rule RealTerm
ruleRealTerm returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getRealTermAccess().getValueSignedRealParserRuleCall_0_0()); 
	    }
		lv_value_0_0=ruleSignedReal		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRealTermRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"org.osate.xtext.aadl2.properties.Properties.SignedReal");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRealTermRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getRealTermAccess().getUnitUnitLiteralCrossReference_1_0()); 
	}

)
)?)
;





// Entry rule entryRuleSignedReal
entryRuleSignedReal returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getSignedRealRule()); } 
	 iv_ruleSignedReal=ruleSignedReal 
	 { $current=$iv_ruleSignedReal.current.getText(); }  
	 EOF 
;

// Rule SignedReal
ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
((
	kw=PlusSign 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0()); 
    }

    |
	kw=HyphenMinus 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSignedRealAccess().getHyphenMinusKeyword_0_1()); 
    }
)?    this_REAL_LIT_2=RULE_REAL_LIT    {
		$current.merge(this_REAL_LIT_2);
    }

    { 
    newLeafNode(this_REAL_LIT_2, grammarAccess.getSignedRealAccess().getREAL_LITTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleNumericRangeTerm
entryRuleNumericRangeTerm returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getNumericRangeTermRule()); }
	 iv_ruleNumericRangeTerm=ruleNumericRangeTerm 
	 { $current=$iv_ruleNumericRangeTerm.current; } 
	 EOF 
;

// Rule NumericRangeTerm
ruleNumericRangeTerm returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0()); 
	    }
		lv_minimum_0_0=ruleNumAlt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
	        }
       		set(
       			$current, 
       			"minimum",
        		lv_minimum_0_0, 
        		"org.osate.xtext.aadl2.properties.Properties.NumAlt");
	        afterParserOrEnumRuleCall();
	    }

)
)
	otherlv_1=FullStopFullStop
    {
    	newLeafNode(otherlv_1, grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0()); 
	    }
		lv_maximum_2_0=ruleNumAlt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
	        }
       		set(
       			$current, 
       			"maximum",
        		lv_maximum_2_0, 
        		"org.osate.xtext.aadl2.properties.Properties.NumAlt");
	        afterParserOrEnumRuleCall();
	    }

)
)(
	otherlv_3=Delta
    {
    	newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getDeltaNumAltParserRuleCall_3_1_0()); 
	    }
		lv_delta_4_0=ruleNumAlt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
	        }
       		set(
       			$current, 
       			"delta",
        		lv_delta_4_0, 
        		"org.osate.xtext.aadl2.properties.Properties.NumAlt");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleNumAlt
entryRuleNumAlt returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getNumAltRule()); }
	 iv_ruleNumAlt=ruleNumAlt 
	 { $current=$iv_ruleNumAlt.current; } 
	 EOF 
;

// Rule NumAlt
ruleNumAlt returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getNumAltAccess().getRealTermParserRuleCall_0()); 
    }
    this_RealTerm_0=ruleRealTerm
    {
        $current = $this_RealTerm_0.current;
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getNumAltAccess().getIntegerTermParserRuleCall_1()); 
    }
    this_IntegerTerm_1=ruleIntegerTerm
    {
        $current = $this_IntegerTerm_1.current;
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getNumAltAccess().getSignedConstantParserRuleCall_2()); 
    }
    this_SignedConstant_2=ruleSignedConstant
    {
        $current = $this_SignedConstant_2.current;
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getNumAltAccess().getConstantValueParserRuleCall_3()); 
    }
    this_ConstantValue_3=ruleConstantValue
    {
        $current = $this_ConstantValue_3.current;
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleAppliesToKeywords
entryRuleAppliesToKeywords returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getAppliesToKeywordsRule()); } 
	 iv_ruleAppliesToKeywords=ruleAppliesToKeywords 
	 { $current=$iv_ruleAppliesToKeywords.current.getText(); }  
	 EOF 
;

// Rule AppliesToKeywords
ruleAppliesToKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(
	kw=Applies 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getAppliesToKeywordsAccess().getAppliesKeyword_0()); 
    }

	kw=To 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getAppliesToKeywordsAccess().getToKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleInBindingKeywords
entryRuleInBindingKeywords returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getInBindingKeywordsRule()); } 
	 iv_ruleInBindingKeywords=ruleInBindingKeywords 
	 { $current=$iv_ruleInBindingKeywords.current.getText(); }  
	 EOF 
;

// Rule InBindingKeywords
ruleInBindingKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(
	kw=In 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getInBindingKeywordsAccess().getInKeyword_0()); 
    }

	kw=Binding 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getInBindingKeywordsAccess().getBindingKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleInModesKeywords
entryRuleInModesKeywords returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getInModesKeywordsRule()); } 
	 iv_ruleInModesKeywords=ruleInModesKeywords 
	 { $current=$iv_ruleInModesKeywords.current.getText(); }  
	 EOF 
;

// Rule InModesKeywords
ruleInModesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(
	kw=In 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getInModesKeywordsAccess().getInKeyword_0()); 
    }

	kw=Modes 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getInModesKeywordsAccess().getModesKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleINTVALUE
entryRuleINTVALUE returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getINTVALUERule()); } 
	 iv_ruleINTVALUE=ruleINTVALUE 
	 { $current=$iv_ruleINTVALUE.current.getText(); }  
	 EOF 
;

// Rule INTVALUE
ruleINTVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
    this_INTEGER_LIT_0=RULE_INTEGER_LIT    {
		$current.merge(this_INTEGER_LIT_0);
    }

    { 
    newLeafNode(this_INTEGER_LIT_0, grammarAccess.getINTVALUEAccess().getINTEGER_LITTerminalRuleCall()); 
    }

    ;







// Entry rule entryRuleQPREF
entryRuleQPREF returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getQPREFRule()); } 
	 iv_ruleQPREF=ruleQPREF 
	 { $current=$iv_ruleQPREF.current.getText(); }  
	 EOF 
;

// Rule QPREF
ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw=ColonColon 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQPREFAccess().getColonColonKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1()); 
    }
)?)
    ;





// Entry rule entryRuleQCREF
entryRuleQCREF returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getQCREFRule()); } 
	 iv_ruleQCREF=ruleQCREF 
	 { $current=$iv_ruleQCREF.current.getText(); }  
	 EOF 
;

// Rule QCREF
ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
((    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0()); 
    }

	kw=ColonColon 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQCREFAccess().getColonColonKeyword_0_1()); 
    }
)*    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1()); 
    }
(
	kw=FullStop 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQCREFAccess().getFullStopKeyword_2_0()); 
    }
    this_ID_4=RULE_ID    {
		$current.merge(this_ID_4);
    }

    { 
    newLeafNode(this_ID_4, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_2_1()); 
    }
)?)
    ;





// Entry rule entryRuleSTAR
entryRuleSTAR returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getSTARRule()); } 
	 iv_ruleSTAR=ruleSTAR 
	 { $current=$iv_ruleSTAR.current.getText(); }  
	 EOF 
;

// Rule STAR
ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:

	kw=Asterisk 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSTARAccess().getAsteriskKeyword()); 
    }

    ;





