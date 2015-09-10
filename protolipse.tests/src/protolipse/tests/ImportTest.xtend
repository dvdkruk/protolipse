package protolipse.tests

import com.google.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import protolipse.ProtobufInjectorProvider
import protolipse.protobuf.Import
import protolipse.protobuf.Proto
import protolipse.protobuf.PublicImport

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ProtobufInjectorProvider))
class ImportTest {

	@Inject extension ResourceSet
	// @Inject extension ParseHelper<Proto>
	@Inject extension ValidationTestHelper

	@Test
	def NoErrors() {
		res.assertNoErrors
	}

	@Test
	def PublicImportTest() {
		val publicImport = proto.statements.filter(Import).findFirst[it.importURI.equals("NestedEnumWithOption.proto")]
		assertTrue("First import is instanceof PublicImport", publicImport instanceof PublicImport)
	}

	def getProto() {
		getRes.getproto
	}

	def getRes() {
		getResource(URI.createURI("res/Import.proto"), true)
	}

	static def getproto(Resource res) {
		res.contents.get(0) as Proto
	}

}