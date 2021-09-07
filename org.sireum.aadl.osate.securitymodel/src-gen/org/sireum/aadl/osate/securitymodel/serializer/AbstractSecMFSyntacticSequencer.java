
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
package org.sireum.aadl.osate.securitymodel.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.sireum.aadl.osate.securitymodel.services.SecMFGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractSecMFSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SecMFGrammarAccess grammarAccess;
	protected AbstractElementAlias match_SMFLibrary___DomainTypesKeywordsParserRuleCall_0_1_2_0_EndTypesKeywordsParserRuleCall_0_1_2_2_SemicolonKeyword_0_1_2_3__q;
	protected AbstractElementAlias match_SMFLibrary___DomainTypesKeywordsParserRuleCall_1_6_0_EndTypesKeywordsParserRuleCall_1_6_2_SemicolonKeyword_1_6_3__q;
	protected AbstractElementAlias match_SMFTypeDef___ColonKeyword_1_0_0_TypeKeyword_1_0_1___or___ColonKeyword_1_1_0_TypeKeyword_1_1_1_ExtendsKeyword_1_1_2__;
	protected AbstractElementAlias match_SecModelLibrary___DomainTypesKeywordsParserRuleCall_1_0_EndTypesKeywordsParserRuleCall_1_2_SemicolonKeyword_1_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SecMFGrammarAccess) access;
		match_SMFLibrary___DomainTypesKeywordsParserRuleCall_0_1_2_0_EndTypesKeywordsParserRuleCall_0_1_2_2_SemicolonKeyword_0_1_2_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSMFLibraryAccess().getDomainTypesKeywordsParserRuleCall_0_1_2_0()), new TokenAlias(false, false, grammarAccess.getSMFLibraryAccess().getEndTypesKeywordsParserRuleCall_0_1_2_2()), new TokenAlias(false, false, grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_0_1_2_3()));
		match_SMFLibrary___DomainTypesKeywordsParserRuleCall_1_6_0_EndTypesKeywordsParserRuleCall_1_6_2_SemicolonKeyword_1_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSMFLibraryAccess().getDomainTypesKeywordsParserRuleCall_1_6_0()), new TokenAlias(false, false, grammarAccess.getSMFLibraryAccess().getEndTypesKeywordsParserRuleCall_1_6_2()), new TokenAlias(false, false, grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_1_6_3()));
		match_SMFTypeDef___ColonKeyword_1_0_0_TypeKeyword_1_0_1___or___ColonKeyword_1_1_0_TypeKeyword_1_1_1_ExtendsKeyword_1_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getSMFTypeDefAccess().getColonKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getSMFTypeDefAccess().getTypeKeyword_1_0_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getSMFTypeDefAccess().getColonKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getSMFTypeDefAccess().getTypeKeyword_1_1_1()), new TokenAlias(false, false, grammarAccess.getSMFTypeDefAccess().getExtendsKeyword_1_1_2())));
		match_SecModelLibrary___DomainTypesKeywordsParserRuleCall_1_0_EndTypesKeywordsParserRuleCall_1_2_SemicolonKeyword_1_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSecModelLibraryAccess().getDomainTypesKeywordsParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getSecModelLibraryAccess().getEndTypesKeywordsParserRuleCall_1_2()), new TokenAlias(false, false, grammarAccess.getSecModelLibraryAccess().getSemicolonKeyword_1_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getAppliesToKeywordsRule())
			return getAppliesToKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getClassificationKeywordsRule())
			return getClassificationKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDeclassificationKeywordsRule())
			return getDeclassificationKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDomainTypesKeywordsRule())
			return getDomainTypesKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEndTypesKeywordsRule())
			return getEndTypesKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getInBindingKeywordsRule())
			return getInBindingKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getInModesKeywordsRule())
			return getInModesKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getQEMREFRule())
			return getQEMREFToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * AppliesToKeywords:
	 * 	'applies' 'to'
	 * ;
	 */
	protected String getAppliesToKeywordsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "applies to";
	}
	
	/**
	 * ClassificationKeywords:
	 * 	'classification'
	 * ;
	 */
	protected String getClassificationKeywordsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "classification";
	}
	
	/**
	 * DeclassificationKeywords:
	 * 	'de-classification'
	 * ;
	 */
	protected String getDeclassificationKeywordsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "de-classification";
	}
	
	/**
	 * DomainTypesKeywords:
	 * 	'domain' 'types'
	 * ;
	 */
	protected String getDomainTypesKeywordsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "domain types";
	}
	
	/**
	 * EndTypesKeywords:
	 * 	'end' 'types'
	 * ;
	 */
	protected String getEndTypesKeywordsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "end types";
	}
	
	/**
	 * terminal ID:	('a'..'z'
	 *         |'A'..'Z'
	 *         ) ( ('_')? ('a'..'z'
	 *         |'A'..'Z'
	 *         |'0'..'9'))*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * InBindingKeywords:
	 * 	'in' 'binding'
	 * ;
	 */
	protected String getInBindingKeywordsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "in binding";
	}
	
	/**
	 * InModesKeywords:
	 * 	'in' 'modes'
	 * ;
	 */
	protected String getInModesKeywordsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "in modes";
	}
	
	/**
	 * QEMREF:
	 * 	 ID ('::' ID)* ;
	 */
	protected String getQEMREFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_SMFLibrary___DomainTypesKeywordsParserRuleCall_0_1_2_0_EndTypesKeywordsParserRuleCall_0_1_2_2_SemicolonKeyword_0_1_2_3__q.equals(syntax))
				emit_SMFLibrary___DomainTypesKeywordsParserRuleCall_0_1_2_0_EndTypesKeywordsParserRuleCall_0_1_2_2_SemicolonKeyword_0_1_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SMFLibrary___DomainTypesKeywordsParserRuleCall_1_6_0_EndTypesKeywordsParserRuleCall_1_6_2_SemicolonKeyword_1_6_3__q.equals(syntax))
				emit_SMFLibrary___DomainTypesKeywordsParserRuleCall_1_6_0_EndTypesKeywordsParserRuleCall_1_6_2_SemicolonKeyword_1_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SMFTypeDef___ColonKeyword_1_0_0_TypeKeyword_1_0_1___or___ColonKeyword_1_1_0_TypeKeyword_1_1_1_ExtendsKeyword_1_1_2__.equals(syntax))
				emit_SMFTypeDef___ColonKeyword_1_0_0_TypeKeyword_1_0_1___or___ColonKeyword_1_1_0_TypeKeyword_1_1_1_ExtendsKeyword_1_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SecModelLibrary___DomainTypesKeywordsParserRuleCall_1_0_EndTypesKeywordsParserRuleCall_1_2_SemicolonKeyword_1_3__q.equals(syntax))
				emit_SecModelLibrary___DomainTypesKeywordsParserRuleCall_1_0_EndTypesKeywordsParserRuleCall_1_2_SemicolonKeyword_1_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     (DomainTypesKeywords EndTypesKeywords ';')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=QEMREF (ambiguity) (rule end)
	 */
	protected void emit_SMFLibrary___DomainTypesKeywordsParserRuleCall_0_1_2_0_EndTypesKeywordsParserRuleCall_0_1_2_2_SemicolonKeyword_0_1_2_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (DomainTypesKeywords EndTypesKeywords ';')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=QEMREF 'public' 'annex' ID '{**' (ambiguity) '**}' ';' 'end' QEMREF ';' (rule end)
	 */
	protected void emit_SMFLibrary___DomainTypesKeywordsParserRuleCall_1_6_0_EndTypesKeywordsParserRuleCall_1_6_2_SemicolonKeyword_1_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (':' 'type') | (':' 'type' 'extends')
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) ';' (rule end)
	 */
	protected void emit_SMFTypeDef___ColonKeyword_1_0_0_TypeKeyword_1_0_1___or___ColonKeyword_1_1_0_TypeKeyword_1_1_1_ExtendsKeyword_1_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (DomainTypesKeywords EndTypesKeywords ';')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_SecModelLibrary___DomainTypesKeywordsParserRuleCall_1_0_EndTypesKeywordsParserRuleCall_1_2_SemicolonKeyword_1_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
