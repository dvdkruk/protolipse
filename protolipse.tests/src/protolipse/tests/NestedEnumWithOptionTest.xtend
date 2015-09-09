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

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ProtobufInjectorProvider))
class NestedEnumWithOptionTest {

	@Inject extension ResourceSet
	// @Inject extension ParseHelper<Proto>
	@Inject extension ValidationTestHelper
	
	@Test 
	def NoErrors() {
		res.assertNoErrors
	}

	def getProto() {
		getRes.getproto
	}
	
	def getRes() {
		getResource(URI.createURI("res/NestedEnumWithOption.proto"), true)
	}
	
	static def getproto(Resource res) {
		res.contents.get(0) as Proto
	}
	
}