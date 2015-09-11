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
import protolipse.protobuf.WeakImport

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ProtobufInjectorProvider))
class GroupTest {

	@Inject extension ResourceSet
	// @Inject extension ParseHelper<Proto>
	@Inject extension ValidationTestHelper

	@Test
	def noErrors() {
		res.assertNoErrors
	}


	def getProto() {
		getRes.getproto
	}

	def getRes() {
		getResource(URI.createURI("res/Group.proto"), true)
	}

	static def getproto(Resource res) {
		res.contents.get(0) as Proto
	}

}