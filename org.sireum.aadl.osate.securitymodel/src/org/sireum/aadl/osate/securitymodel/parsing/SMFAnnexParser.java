package org.sireum.aadl.osate.securitymodel.parsing;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.modelsupport.errorreporting.ParseErrorReporter;
import org.osate.annexsupport.AnnexParseUtil;
import org.osate.annexsupport.AnnexParser;
import org.sireum.aadl.osate.securitymodel.parser.antlr.SecMFParser;
import org.sireum.aadl.osate.securitymodel.services.SecMFGrammarAccess;

import com.google.inject.Inject;
import com.google.inject.Injector;

import antlr.RecognitionException;

public class SMFAnnexParser implements AnnexParser {

	@Inject
	private SecMFParser smfParser;

	public SMFAnnexParser() {
		Injector injector = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createFileURI("dummy.smf")).get(Injector.class);
		injector.injectMembers(this);
	}

	protected SecMFGrammarAccess getGrammarAccess() {
		return smfParser.getGrammarAccess();
	}

	@Override
	public AnnexLibrary parseAnnexLibrary(String annexName, String source, String filename, int line, int column,
			ParseErrorReporter errReporter) throws RecognitionException {
		// TODO Auto-generated method stub
		AnnexLibrary sal = (AnnexLibrary) AnnexParseUtil.parse(smfParser,
				source, getGrammarAccess().getSecModelLibraryRule(), filename, line, column, errReporter);
		return sal;
	}

	@Override
	public AnnexSubclause parseAnnexSubclause(String annexName, String source, String filename, int line, int column,
			ParseErrorReporter errReporter) throws RecognitionException {
		// TODO Auto-generated method stub
		AnnexSubclause sas = (AnnexSubclause) AnnexParseUtil.parse(smfParser, source,
				getGrammarAccess().getSecModelSubclauseRule(), filename, line, column, errReporter);
		return sas;
	}

}
