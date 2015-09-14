package protolipse.scoping

import org.eclipse.xtext.generator.scoping.AbstractScopingFragment
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

class ProtobufImportURIScopingFragment extends AbstractScopingFragment {

	override protected getLocalScopeProvider() {
		ImportedNamespaceAwareLocalScopeProvider
	}

	override protected getGlobalScopeProvider() {
		ImportUriGlobalScopeProvider
	}
}