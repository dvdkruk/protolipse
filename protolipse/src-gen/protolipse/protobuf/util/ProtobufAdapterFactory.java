/**
 */
package protolipse.protobuf.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import protolipse.protobuf.BooleanLink;
import protolipse.protobuf.ComplexType;
import protolipse.protobuf.ComplexTypeLink;
import protolipse.protobuf.CustomIdLink;
import protolipse.protobuf.CustomOption;
import protolipse.protobuf.DefaultValueFieldOption;
import protolipse.protobuf.DoubleLink;
import protolipse.protobuf.EnumElement;
import protolipse.protobuf.EnumField;
import protolipse.protobuf.Extend;
import protolipse.protobuf.ExtensibleType;
import protolipse.protobuf.ExtensionRange;
import protolipse.protobuf.FieldOption;
import protolipse.protobuf.FieldOptions;
import protolipse.protobuf.Group;
import protolipse.protobuf.Import;
import protolipse.protobuf.IndexedElement;
import protolipse.protobuf.IntLink;
import protolipse.protobuf.Message;
import protolipse.protobuf.MessageElement;
import protolipse.protobuf.MessageField;
import protolipse.protobuf.MessageLink;
import protolipse.protobuf.NativeFieldOption;
import protolipse.protobuf.NativeOption;
import protolipse.protobuf.NumberLink;
import protolipse.protobuf.Oneof;
import protolipse.protobuf.OneofField;
import protolipse.protobuf.Option;
import protolipse.protobuf.OptionSource;
import protolipse.protobuf.PackedValueFieldOption;
import protolipse.protobuf.Proto;
import protolipse.protobuf.ProtobufPackage;
import protolipse.protobuf.PublicImport;
import protolipse.protobuf.Range;
import protolipse.protobuf.Rpc;
import protolipse.protobuf.ScalarTypeLink;
import protolipse.protobuf.Service;
import protolipse.protobuf.ServiceElement;
import protolipse.protobuf.SimpleValueLink;
import protolipse.protobuf.Statement;
import protolipse.protobuf.StringLink;
import protolipse.protobuf.Syntax;
import protolipse.protobuf.TypeLink;
import protolipse.protobuf.Value;
import protolipse.protobuf.WeakImport;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see protolipse.protobuf.ProtobufPackage
 * @generated
 */
public class ProtobufAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ProtobufPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtobufAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ProtobufPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProtobufSwitch<Adapter> modelSwitch =
    new ProtobufSwitch<Adapter>()
    {
      @Override
      public Adapter caseProto(Proto object)
      {
        return createProtoAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseSyntax(Syntax object)
      {
        return createSyntaxAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter casePublicImport(PublicImport object)
      {
        return createPublicImportAdapter();
      }
      @Override
      public Adapter caseWeakImport(WeakImport object)
      {
        return createWeakImportAdapter();
      }
      @Override
      public Adapter caseOption(Option object)
      {
        return createOptionAdapter();
      }
      @Override
      public Adapter caseNativeOption(NativeOption object)
      {
        return createNativeOptionAdapter();
      }
      @Override
      public Adapter caseCustomOption(CustomOption object)
      {
        return createCustomOptionAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseSimpleValueLink(SimpleValueLink object)
      {
        return createSimpleValueLinkAdapter();
      }
      @Override
      public Adapter caseCustomIdLink(CustomIdLink object)
      {
        return createCustomIdLinkAdapter();
      }
      @Override
      public Adapter caseStringLink(StringLink object)
      {
        return createStringLinkAdapter();
      }
      @Override
      public Adapter caseBooleanLink(BooleanLink object)
      {
        return createBooleanLinkAdapter();
      }
      @Override
      public Adapter caseNumberLink(NumberLink object)
      {
        return createNumberLinkAdapter();
      }
      @Override
      public Adapter caseIntLink(IntLink object)
      {
        return createIntLinkAdapter();
      }
      @Override
      public Adapter caseDoubleLink(DoubleLink object)
      {
        return createDoubleLinkAdapter();
      }
      @Override
      public Adapter caseComplexType(ComplexType object)
      {
        return createComplexTypeAdapter();
      }
      @Override
      public Adapter caseExtensibleType(ExtensibleType object)
      {
        return createExtensibleTypeAdapter();
      }
      @Override
      public Adapter caseMessage(Message object)
      {
        return createMessageAdapter();
      }
      @Override
      public Adapter caseMessageElement(MessageElement object)
      {
        return createMessageElementAdapter();
      }
      @Override
      public Adapter caseOneof(Oneof object)
      {
        return createOneofAdapter();
      }
      @Override
      public Adapter caseOneofField(OneofField object)
      {
        return createOneofFieldAdapter();
      }
      @Override
      public Adapter caseIndexedElement(IndexedElement object)
      {
        return createIndexedElementAdapter();
      }
      @Override
      public Adapter caseExtensionRange(ExtensionRange object)
      {
        return createExtensionRangeAdapter();
      }
      @Override
      public Adapter caseRange(Range object)
      {
        return createRangeAdapter();
      }
      @Override
      public Adapter caseMessageField(MessageField object)
      {
        return createMessageFieldAdapter();
      }
      @Override
      public Adapter caseGroup(Group object)
      {
        return createGroupAdapter();
      }
      @Override
      public Adapter caseTypeLink(TypeLink object)
      {
        return createTypeLinkAdapter();
      }
      @Override
      public Adapter caseComplexTypeLink(ComplexTypeLink object)
      {
        return createComplexTypeLinkAdapter();
      }
      @Override
      public Adapter caseScalarTypeLink(ScalarTypeLink object)
      {
        return createScalarTypeLinkAdapter();
      }
      @Override
      public Adapter caseFieldOptions(FieldOptions object)
      {
        return createFieldOptionsAdapter();
      }
      @Override
      public Adapter caseFieldOption(FieldOption object)
      {
        return createFieldOptionAdapter();
      }
      @Override
      public Adapter casePackedValueFieldOption(PackedValueFieldOption object)
      {
        return createPackedValueFieldOptionAdapter();
      }
      @Override
      public Adapter caseDefaultValueFieldOption(DefaultValueFieldOption object)
      {
        return createDefaultValueFieldOptionAdapter();
      }
      @Override
      public Adapter caseNativeFieldOption(NativeFieldOption object)
      {
        return createNativeFieldOptionAdapter();
      }
      @Override
      public Adapter caseOptionSource(OptionSource object)
      {
        return createOptionSourceAdapter();
      }
      @Override
      public Adapter caseEnum(protolipse.protobuf.Enum object)
      {
        return createEnumAdapter();
      }
      @Override
      public Adapter caseEnumElement(EnumElement object)
      {
        return createEnumElementAdapter();
      }
      @Override
      public Adapter caseEnumField(EnumField object)
      {
        return createEnumFieldAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
      }
      @Override
      public Adapter caseServiceElement(ServiceElement object)
      {
        return createServiceElementAdapter();
      }
      @Override
      public Adapter caseRpc(Rpc object)
      {
        return createRpcAdapter();
      }
      @Override
      public Adapter caseMessageLink(MessageLink object)
      {
        return createMessageLinkAdapter();
      }
      @Override
      public Adapter caseExtend(Extend object)
      {
        return createExtendAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.Proto <em>Proto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.Proto
   * @generated
   */
  public Adapter createProtoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.Syntax <em>Syntax</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.Syntax
   * @generated
   */
  public Adapter createSyntaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.PublicImport <em>Public Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.PublicImport
   * @generated
   */
  public Adapter createPublicImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.WeakImport <em>Weak Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.WeakImport
   * @generated
   */
  public Adapter createWeakImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.Option
   * @generated
   */
  public Adapter createOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.NativeOption <em>Native Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.NativeOption
   * @generated
   */
  public Adapter createNativeOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.CustomOption <em>Custom Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.CustomOption
   * @generated
   */
  public Adapter createCustomOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.SimpleValueLink <em>Simple Value Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.SimpleValueLink
   * @generated
   */
  public Adapter createSimpleValueLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.CustomIdLink <em>Custom Id Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.CustomIdLink
   * @generated
   */
  public Adapter createCustomIdLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.StringLink <em>String Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.StringLink
   * @generated
   */
  public Adapter createStringLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.BooleanLink <em>Boolean Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.BooleanLink
   * @generated
   */
  public Adapter createBooleanLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.NumberLink <em>Number Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.NumberLink
   * @generated
   */
  public Adapter createNumberLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.IntLink <em>Int Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.IntLink
   * @generated
   */
  public Adapter createIntLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.DoubleLink <em>Double Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.DoubleLink
   * @generated
   */
  public Adapter createDoubleLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.ComplexType <em>Complex Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.ComplexType
   * @generated
   */
  public Adapter createComplexTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.ExtensibleType <em>Extensible Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.ExtensibleType
   * @generated
   */
  public Adapter createExtensibleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.Message
   * @generated
   */
  public Adapter createMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.MessageElement <em>Message Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.MessageElement
   * @generated
   */
  public Adapter createMessageElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.Oneof <em>Oneof</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.Oneof
   * @generated
   */
  public Adapter createOneofAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.OneofField <em>Oneof Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.OneofField
   * @generated
   */
  public Adapter createOneofFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.IndexedElement <em>Indexed Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.IndexedElement
   * @generated
   */
  public Adapter createIndexedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.ExtensionRange <em>Extension Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.ExtensionRange
   * @generated
   */
  public Adapter createExtensionRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.Range
   * @generated
   */
  public Adapter createRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.MessageField <em>Message Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.MessageField
   * @generated
   */
  public Adapter createMessageFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.Group
   * @generated
   */
  public Adapter createGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.TypeLink <em>Type Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.TypeLink
   * @generated
   */
  public Adapter createTypeLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.ComplexTypeLink <em>Complex Type Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.ComplexTypeLink
   * @generated
   */
  public Adapter createComplexTypeLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.ScalarTypeLink <em>Scalar Type Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.ScalarTypeLink
   * @generated
   */
  public Adapter createScalarTypeLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.FieldOptions <em>Field Options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.FieldOptions
   * @generated
   */
  public Adapter createFieldOptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.FieldOption <em>Field Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.FieldOption
   * @generated
   */
  public Adapter createFieldOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.PackedValueFieldOption <em>Packed Value Field Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.PackedValueFieldOption
   * @generated
   */
  public Adapter createPackedValueFieldOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.DefaultValueFieldOption <em>Default Value Field Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.DefaultValueFieldOption
   * @generated
   */
  public Adapter createDefaultValueFieldOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.NativeFieldOption <em>Native Field Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.NativeFieldOption
   * @generated
   */
  public Adapter createNativeFieldOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.OptionSource <em>Option Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.OptionSource
   * @generated
   */
  public Adapter createOptionSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.Enum
   * @generated
   */
  public Adapter createEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.EnumElement <em>Enum Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.EnumElement
   * @generated
   */
  public Adapter createEnumElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.EnumField <em>Enum Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.EnumField
   * @generated
   */
  public Adapter createEnumFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.ServiceElement <em>Service Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.ServiceElement
   * @generated
   */
  public Adapter createServiceElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.Rpc <em>Rpc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.Rpc
   * @generated
   */
  public Adapter createRpcAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.MessageLink <em>Message Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.MessageLink
   * @generated
   */
  public Adapter createMessageLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link protolipse.protobuf.Extend <em>Extend</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see protolipse.protobuf.Extend
   * @generated
   */
  public Adapter createExtendAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ProtobufAdapterFactory
