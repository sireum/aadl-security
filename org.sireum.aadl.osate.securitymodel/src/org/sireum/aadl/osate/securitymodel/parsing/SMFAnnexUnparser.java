package org.sireum.aadl.osate.securitymodel.parsing;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.annexsupport.AnnexUnparser;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class SMFAnnexUnparser implements AnnexUnparser {

	@Inject
	ISerializer serializer;

	public SMFAnnexUnparser() {
		Injector injector = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createFileURI("dummy.smf")).get(Injector.class);
		injector.injectMembers(this);
	}

	@Override
	public String unparseAnnexLibrary(AnnexLibrary library, String indent) {
		// TODO Auto-generated method stub
		return serializer.serialize(library);
	}

	@Override
	public String unparseAnnexSubclause(AnnexSubclause subclause, String indent) {
		// TODO Auto-generated method stub
		subclause.setName("unnamed_subclause");
		return serializer.serialize(subclause);
	}

}
