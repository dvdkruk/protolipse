/*
 * generated by Xtext
 */
package protolipse.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import protolipse.protobuf.BooleanLink;
import protolipse.protobuf.ComplexTypeLink;
import protolipse.protobuf.CustomIdLink;
import protolipse.protobuf.CustomOption;
import protolipse.protobuf.DefaultValueFieldOption;
import protolipse.protobuf.DoubleLink;
import protolipse.protobuf.EnumField;
import protolipse.protobuf.Extend;
import protolipse.protobuf.ExtensionRange;
import protolipse.protobuf.FieldOptions;
import protolipse.protobuf.Group;
import protolipse.protobuf.IntLink;
import protolipse.protobuf.Message;
import protolipse.protobuf.MessageField;
import protolipse.protobuf.MessageLink;
import protolipse.protobuf.NativeFieldOption;
import protolipse.protobuf.NativeOption;
import protolipse.protobuf.Oneof;
import protolipse.protobuf.OneofField;
import protolipse.protobuf.OptionSource;
import protolipse.protobuf.PackedValueFieldOption;
import protolipse.protobuf.Proto;
import protolipse.protobuf.ProtobufPackage;
import protolipse.protobuf.PublicImport;
import protolipse.protobuf.Range;
import protolipse.protobuf.Rpc;
import protolipse.protobuf.ScalarTypeLink;
import protolipse.protobuf.Service;
import protolipse.protobuf.StringLink;
import protolipse.protobuf.WeakImport;
import protolipse.services.ProtobufGrammarAccess;

@SuppressWarnings("all")
public class ProtobufSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ProtobufGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ProtobufPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ProtobufPackage.BOOLEAN_LINK:
				sequence_BooleanLink(context, (BooleanLink) semanticObject); 
				return; 
			case ProtobufPackage.COMPLEX_TYPE_LINK:
				sequence_ComplexTypeLink(context, (ComplexTypeLink) semanticObject); 
				return; 
			case ProtobufPackage.CUSTOM_ID_LINK:
				sequence_CustomIdLink(context, (CustomIdLink) semanticObject); 
				return; 
			case ProtobufPackage.CUSTOM_OPTION:
				sequence_CustomOption(context, (CustomOption) semanticObject); 
				return; 
			case ProtobufPackage.DEFAULT_VALUE_FIELD_OPTION:
				sequence_DefaultValueFieldOption(context, (DefaultValueFieldOption) semanticObject); 
				return; 
			case ProtobufPackage.DOUBLE_LINK:
				sequence_DoubleLink(context, (DoubleLink) semanticObject); 
				return; 
			case ProtobufPackage.ENUM:
				sequence_Enum(context, (protolipse.protobuf.Enum) semanticObject); 
				return; 
			case ProtobufPackage.ENUM_FIELD:
				sequence_EnumField(context, (EnumField) semanticObject); 
				return; 
			case ProtobufPackage.EXTEND:
				sequence_Extend(context, (Extend) semanticObject); 
				return; 
			case ProtobufPackage.EXTENSION_RANGE:
				sequence_ExtensionRange(context, (ExtensionRange) semanticObject); 
				return; 
			case ProtobufPackage.FIELD_OPTIONS:
				sequence_FieldOptions(context, (FieldOptions) semanticObject); 
				return; 
			case ProtobufPackage.GROUP:
				sequence_Group(context, (Group) semanticObject); 
				return; 
			case ProtobufPackage.INT_LINK:
				sequence_IntLink(context, (IntLink) semanticObject); 
				return; 
			case ProtobufPackage.MESSAGE:
				sequence_Message(context, (Message) semanticObject); 
				return; 
			case ProtobufPackage.MESSAGE_FIELD:
				sequence_MessageField(context, (MessageField) semanticObject); 
				return; 
			case ProtobufPackage.MESSAGE_LINK:
				sequence_MessageLink(context, (MessageLink) semanticObject); 
				return; 
			case ProtobufPackage.NATIVE_FIELD_OPTION:
				sequence_NativeFieldOption(context, (NativeFieldOption) semanticObject); 
				return; 
			case ProtobufPackage.NATIVE_OPTION:
				sequence_NativeOption(context, (NativeOption) semanticObject); 
				return; 
			case ProtobufPackage.ONEOF:
				sequence_Oneof(context, (Oneof) semanticObject); 
				return; 
			case ProtobufPackage.ONEOF_FIELD:
				sequence_OneofField(context, (OneofField) semanticObject); 
				return; 
			case ProtobufPackage.OPTION_SOURCE:
				sequence_OptionSource(context, (OptionSource) semanticObject); 
				return; 
			case ProtobufPackage.PACKED_VALUE_FIELD_OPTION:
				sequence_PackedValueFieldOption(context, (PackedValueFieldOption) semanticObject); 
				return; 
			case ProtobufPackage.PROTO:
				sequence_Proto(context, (Proto) semanticObject); 
				return; 
			case ProtobufPackage.PUBLIC_IMPORT:
				sequence_PublicImport(context, (PublicImport) semanticObject); 
				return; 
			case ProtobufPackage.RANGE:
				sequence_Range(context, (Range) semanticObject); 
				return; 
			case ProtobufPackage.RPC:
				sequence_Rpc(context, (Rpc) semanticObject); 
				return; 
			case ProtobufPackage.SCALAR_TYPE_LINK:
				sequence_ScalarTypeLink(context, (ScalarTypeLink) semanticObject); 
				return; 
			case ProtobufPackage.SERVICE:
				sequence_Service(context, (Service) semanticObject); 
				return; 
			case ProtobufPackage.STRING_LINK:
				sequence_StringLink(context, (StringLink) semanticObject); 
				return; 
			case ProtobufPackage.WEAK_IMPORT:
				sequence_WeakImport(context, (WeakImport) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     target=BOOL
	 */
	protected void sequence_BooleanLink(EObject context, BooleanLink semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.BOOLEAN_LINK__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.BOOLEAN_LINK__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanLinkAccess().getTargetBOOLEnumRuleCall_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     target=[ComplexType|Var_full]
	 */
	protected void sequence_ComplexTypeLink(EObject context, ComplexTypeLink semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.COMPLEX_TYPE_LINK__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.COMPLEX_TYPE_LINK__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComplexTypeLinkAccess().getTargetComplexTypeVar_fullParserRuleCall_0_1(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     target=ID
	 */
	protected void sequence_CustomIdLink(EObject context, CustomIdLink semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.CUSTOM_ID_LINK__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.CUSTOM_ID_LINK__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCustomIdLinkAccess().getTargetIDTerminalRuleCall_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (source=ID value=Value)
	 */
	protected void sequence_CustomOption(EObject context, CustomOption semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.OPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.OPTION__VALUE));
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.CUSTOM_OPTION__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.CUSTOM_OPTION__SOURCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCustomOptionAccess().getSourceIDTerminalRuleCall_1_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getCustomOptionAccess().getValueValueParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Value
	 */
	protected void sequence_DefaultValueFieldOption(EObject context, DefaultValueFieldOption semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.FIELD_OPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.FIELD_OPTION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefaultValueFieldOptionAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     target=NUMDOUBLE
	 */
	protected void sequence_DoubleLink(EObject context, DoubleLink semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.DOUBLE_LINK__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.DOUBLE_LINK__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoubleLinkAccess().getTargetNUMDOUBLETerminalRuleCall_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID index=NUMINT (options+=FieldOption options+=FieldOption*)?)
	 */
	protected void sequence_EnumField(EObject context, EnumField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID elements+=EnumElement*)
	 */
	protected void sequence_Enum(EObject context, protolipse.protobuf.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Message|Var_full] elements+=MessageElement*)
	 */
	protected void sequence_Extend(EObject context, Extend semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ranges+=Range ranges+=Range*)
	 */
	protected void sequence_ExtensionRange(EObject context, ExtensionRange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (options+=FieldOption options+=FieldOption*)
	 */
	protected void sequence_FieldOptions(EObject context, FieldOptions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifier=Modifier name=Var index=NUMINT elements+=MessageField*)
	 */
	protected void sequence_Group(EObject context, Group semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     target=NUMINT
	 */
	protected void sequence_IntLink(EObject context, IntLink semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.INT_LINK__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.INT_LINK__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntLinkAccess().getTargetNUMINTTerminalRuleCall_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (modifier=Modifier type=TypeLink name=Var index=NUMINT options=FieldOptions?)
	 */
	protected void sequence_MessageField(EObject context, MessageField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     target=[Message|Var_full]
	 */
	protected void sequence_MessageLink(EObject context, MessageLink semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.MESSAGE_LINK__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.MESSAGE_LINK__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMessageLinkAccess().getTargetMessageVar_fullParserRuleCall_0_1(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID elements+=MessageElement*)
	 */
	protected void sequence_Message(EObject context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (source=OptionSource value=Value)
	 */
	protected void sequence_NativeFieldOption(EObject context, NativeFieldOption semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.FIELD_OPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.FIELD_OPTION__VALUE));
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.NATIVE_FIELD_OPTION__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.NATIVE_FIELD_OPTION__SOURCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNativeFieldOptionAccess().getSourceOptionSourceParserRuleCall_0_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getNativeFieldOptionAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (source=[MessageField|Var_full] value=Value)
	 */
	protected void sequence_NativeOption(EObject context, NativeOption semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.OPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.OPTION__VALUE));
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.NATIVE_OPTION__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.NATIVE_OPTION__SOURCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNativeOptionAccess().getSourceMessageFieldVar_fullParserRuleCall_1_0_1(), semanticObject.getSource());
		feeder.accept(grammarAccess.getNativeOptionAccess().getValueValueParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeLink name=Var index=NUMINT options=FieldOptions?)
	 */
	protected void sequence_OneofField(EObject context, OneofField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID fields+=OneofField*)
	 */
	protected void sequence_Oneof(EObject context, Oneof semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     target=[IndexedElement|Var_full]
	 */
	protected void sequence_OptionSource(EObject context, OptionSource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.OPTION_SOURCE__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.OPTION_SOURCE__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOptionSourceAccess().getTargetIndexedElementVar_fullParserRuleCall_0_1(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Value
	 */
	protected void sequence_PackedValueFieldOption(EObject context, PackedValueFieldOption semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.FIELD_OPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.FIELD_OPTION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPackedValueFieldOptionAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (syntax=STRING? imports+=Import* name=Var_full? statements+=Statement*)
	 */
	protected void sequence_Proto(EObject context, Proto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_PublicImport(EObject context, PublicImport semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPublicImportAccess().getImportURISTRINGTerminalRuleCall_2_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (from=NUMINT (to=NUMINT | max?='max')?)
	 */
	protected void sequence_Range(EObject context, Range semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID argType=MessageLink returnType=MessageLink options+=Option*)
	 */
	protected void sequence_Rpc(EObject context, Rpc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     target=ScalarType
	 */
	protected void sequence_ScalarTypeLink(EObject context, ScalarTypeLink semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.SCALAR_TYPE_LINK__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.SCALAR_TYPE_LINK__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScalarTypeLinkAccess().getTargetScalarTypeEnumRuleCall_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID elements+=ServiceElement*)
	 */
	protected void sequence_Service(EObject context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     target=STRING
	 */
	protected void sequence_StringLink(EObject context, StringLink semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.STRING_LINK__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.STRING_LINK__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLinkAccess().getTargetSTRINGTerminalRuleCall_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_WeakImport(EObject context, WeakImport semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtobufPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtobufPackage.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWeakImportAccess().getImportURISTRINGTerminalRuleCall_2_0(), semanticObject.getImportURI());
		feeder.finish();
	}
}
