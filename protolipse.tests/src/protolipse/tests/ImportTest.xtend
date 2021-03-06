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
import protolipse.protobuf.Proto
import protolipse.protobuf.PublicImport
import protolipse.protobuf.WeakImport

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ProtobufInjectorProvider))
class ImportTest {

	@Inject extension ResourceSet
	// @Inject extension ParseHelper<Proto>
	@Inject extension ValidationTestHelper

	@Test
	def noErrors() {
		res.assertNoErrors
	}

	@Test
	def publicImportTest() {
		val publicImport = proto.imports.findFirst[it.importURI.equals("NestedEnumWithOption.proto")]
		assertNotNull("No import found with uri \"NestedEnumWithOption.proto\"", publicImport);
		assertTrue("First import is not instanceof PublicImport", publicImport instanceof PublicImport)
	}

	@Test
	def weakImportTest() {
		val weakImport = proto.imports.findFirst[it.importURI.equals("SimpleMessage.proto")]
		assertNotNull("No import found with uri \"SimpleMessage.proto\"", weakImport);
		assertTrue("Second import is not instanceof WeakImport", weakImport instanceof WeakImport)
	}

	// TODO: optional weak import test
	// TODO: implement uri resolver with weak and public imports
	def getProto() {
		getRes.getproto
	}

	def getRes() {
		val res1 = getResource(URI.createURI("res/NestedEnumWithOption.proto"), true);
		res1.URI = URI.createURI("NestedEnumWithOption.proto");
		val res2 = getResource(URI.createURI("res/SimpleMessage.proto"), true);
		res2.URI = URI.createURI("SimpleMessage.proto");
		
		getResource(URI.createURI("res/Import.proto"), true)
	}

	static def getproto(Resource res) {
		res.contents.get(0) as Proto
	}

}