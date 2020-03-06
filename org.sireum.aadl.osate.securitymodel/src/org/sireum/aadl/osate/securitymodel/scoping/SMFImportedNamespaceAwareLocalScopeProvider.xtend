package org.sireum.aadl.osate.securitymodel.scoping

import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider
import org.osate.aadl2.modelsupport.util.AadlUtil
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.naming.QualifiedName

class SMFImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
	override protected getImplicitImports(boolean ignoreCase) {
		AadlUtil.predeclaredPropertySetNames.map[new ImportNormalizer(QualifiedName.create(it), true, ignoreCase)].toList
	}
}