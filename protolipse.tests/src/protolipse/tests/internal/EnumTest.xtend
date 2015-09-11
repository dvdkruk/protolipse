package protolipse.tests.internal

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import protolipse.ProtobufInjectorProvider
import protolipse.protobuf.Proto
import protolipse.protobuf.ProtobufPackage
import protolipse.validation.ProtobufValidator

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ProtobufInjectorProvider))
class EnumTest {

	@Inject extension ParseHelper<Proto>
	@Inject extension ValidationTestHelper

	@Test
	def duplicateEnumFiedIndex() {
		val proto = '''
			syntax = "proto2";
			
			enum EnumNotAllowingAlias {
			  	UNKNOWN = 0;
			  	STARTED = 1;
			 	RUNNING = 1; //error!
			}
		'''.parse

		proto.assertError(ProtobufPackage.eINSTANCE.enumField, ProtobufValidator.DUPLICATE_ENUM_FIELD_INDEX)
	}

	@Test
	def allowAlias() {
		val proto = '''
			syntax = "proto2";
			
			enum EnumAllowingAlias {
			  	option allow_alias = true;
			  	UNKNOWN = 0;
			  	STARTED = 1;
			  	RUNNING = 1;
			}
		'''.parse

		proto.assertNoErrors
	}

}