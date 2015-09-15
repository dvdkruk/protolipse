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

import static extension org.junit.Assert.*
import protolipse.protobuf.Message
import protolipse.protobuf.Proto

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ProtobufInjectorProvider))
class SimpleMessageTest {

	@Inject extension ResourceSet
	// @Inject extension ParseHelper<Proto>
	@Inject extension ValidationTestHelper

	@Test
	def NoErrors() {
		res.assertNoErrors
	}

	@Test
	def SyntaxIsProto2() {
		proto.syntax.assertEquals("proto2")
	}

	@Test
	def MessageIsNamedSearchRequest() {
		val msg = proto.statements.filter(Message).get(0)
		msg.name.assertEquals("SearchRequest")
	}

	def getProto() {
		getRes.getproto
	}

	def getRes() {
		getResource(URI.createURI("res/SimpleMessage.proto"), true)
	}

	static def getproto(Resource res) {
		res.contents.get(0) as Proto
	}

}