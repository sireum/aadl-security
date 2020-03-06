package org.sireum.aadl.osate.securitymodel.naming

import org.eclipse.xtext.naming.IQualifiedNameConverter

class SMFQualifiedNameConverter extends IQualifiedNameConverter.DefaultImpl {
	override getDelimiter() {
		"::"
	}
}