/**
 */
package protolipse.protobuf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import protolipse.protobuf.BOOL;
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
import protolipse.protobuf.Modifier;
import protolipse.protobuf.NativeFieldOption;
import protolipse.protobuf.NativeOption;
import protolipse.protobuf.NumberLink;
import protolipse.protobuf.Oneof;
import protolipse.protobuf.OneofField;
import protolipse.protobuf.Option;
import protolipse.protobuf.OptionSource;
import protolipse.protobuf.PackedValueFieldOption;
import protolipse.protobuf.Proto;
import protolipse.protobuf.ProtobufFactory;
import protolipse.protobuf.ProtobufPackage;
import protolipse.protobuf.PublicImport;
import protolipse.protobuf.Range;
import protolipse.protobuf.Rpc;
import protolipse.protobuf.ScalarType;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtobufFactoryImpl extends EFactoryImpl implements ProtobufFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProtobufFactory init()
  {
    try
    {
      ProtobufFactory theProtobufFactory = (ProtobufFactory)EPackage.Registry.INSTANCE.getEFactory(ProtobufPackage.eNS_URI);
      if (theProtobufFactory != null)
      {
        return theProtobufFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ProtobufFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtobufFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ProtobufPackage.PROTO: return createProto();
      case ProtobufPackage.STATEMENT: return createStatement();
      case ProtobufPackage.SYNTAX: return createSyntax();
      case ProtobufPackage.IMPORT: return createImport();
      case ProtobufPackage.PUBLIC_IMPORT: return createPublicImport();
      case ProtobufPackage.WEAK_IMPORT: return createWeakImport();
      case ProtobufPackage.OPTION: return createOption();
      case ProtobufPackage.NATIVE_OPTION: return createNativeOption();
      case ProtobufPackage.CUSTOM_OPTION: return createCustomOption();
      case ProtobufPackage.VALUE: return createValue();
      case ProtobufPackage.SIMPLE_VALUE_LINK: return createSimpleValueLink();
      case ProtobufPackage.CUSTOM_ID_LINK: return createCustomIdLink();
      case ProtobufPackage.STRING_LINK: return createStringLink();
      case ProtobufPackage.BOOLEAN_LINK: return createBooleanLink();
      case ProtobufPackage.NUMBER_LINK: return createNumberLink();
      case ProtobufPackage.INT_LINK: return createIntLink();
      case ProtobufPackage.DOUBLE_LINK: return createDoubleLink();
      case ProtobufPackage.COMPLEX_TYPE: return createComplexType();
      case ProtobufPackage.EXTENSIBLE_TYPE: return createExtensibleType();
      case ProtobufPackage.MESSAGE: return createMessage();
      case ProtobufPackage.MESSAGE_ELEMENT: return createMessageElement();
      case ProtobufPackage.ONEOF: return createOneof();
      case ProtobufPackage.ONEOF_FIELD: return createOneofField();
      case ProtobufPackage.INDEXED_ELEMENT: return createIndexedElement();
      case ProtobufPackage.EXTENSION_RANGE: return createExtensionRange();
      case ProtobufPackage.RANGE: return createRange();
      case ProtobufPackage.MESSAGE_FIELD: return createMessageField();
      case ProtobufPackage.GROUP: return createGroup();
      case ProtobufPackage.TYPE_LINK: return createTypeLink();
      case ProtobufPackage.COMPLEX_TYPE_LINK: return createComplexTypeLink();
      case ProtobufPackage.SCALAR_TYPE_LINK: return createScalarTypeLink();
      case ProtobufPackage.FIELD_OPTIONS: return createFieldOptions();
      case ProtobufPackage.FIELD_OPTION: return createFieldOption();
      case ProtobufPackage.PACKED_VALUE_FIELD_OPTION: return createPackedValueFieldOption();
      case ProtobufPackage.DEFAULT_VALUE_FIELD_OPTION: return createDefaultValueFieldOption();
      case ProtobufPackage.NATIVE_FIELD_OPTION: return createNativeFieldOption();
      case ProtobufPackage.OPTION_SOURCE: return createOptionSource();
      case ProtobufPackage.ENUM: return createEnum();
      case ProtobufPackage.ENUM_ELEMENT: return createEnumElement();
      case ProtobufPackage.ENUM_FIELD: return createEnumField();
      case ProtobufPackage.SERVICE: return createService();
      case ProtobufPackage.SERVICE_ELEMENT: return createServiceElement();
      case ProtobufPackage.RPC: return createRpc();
      case ProtobufPackage.MESSAGE_LINK: return createMessageLink();
      case ProtobufPackage.EXTEND: return createExtend();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ProtobufPackage.BOOL:
        return createBOOLFromString(eDataType, initialValue);
      case ProtobufPackage.MODIFIER:
        return createModifierFromString(eDataType, initialValue);
      case ProtobufPackage.SCALAR_TYPE:
        return createScalarTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ProtobufPackage.BOOL:
        return convertBOOLToString(eDataType, instanceValue);
      case ProtobufPackage.MODIFIER:
        return convertModifierToString(eDataType, instanceValue);
      case ProtobufPackage.SCALAR_TYPE:
        return convertScalarTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Proto createProto()
  {
    ProtoImpl proto = new ProtoImpl();
    return proto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Syntax createSyntax()
  {
    SyntaxImpl syntax = new SyntaxImpl();
    return syntax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PublicImport createPublicImport()
  {
    PublicImportImpl publicImport = new PublicImportImpl();
    return publicImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeakImport createWeakImport()
  {
    WeakImportImpl weakImport = new WeakImportImpl();
    return weakImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Option createOption()
  {
    OptionImpl option = new OptionImpl();
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NativeOption createNativeOption()
  {
    NativeOptionImpl nativeOption = new NativeOptionImpl();
    return nativeOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomOption createCustomOption()
  {
    CustomOptionImpl customOption = new CustomOptionImpl();
    return customOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleValueLink createSimpleValueLink()
  {
    SimpleValueLinkImpl simpleValueLink = new SimpleValueLinkImpl();
    return simpleValueLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomIdLink createCustomIdLink()
  {
    CustomIdLinkImpl customIdLink = new CustomIdLinkImpl();
    return customIdLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLink createStringLink()
  {
    StringLinkImpl stringLink = new StringLinkImpl();
    return stringLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLink createBooleanLink()
  {
    BooleanLinkImpl booleanLink = new BooleanLinkImpl();
    return booleanLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLink createNumberLink()
  {
    NumberLinkImpl numberLink = new NumberLinkImpl();
    return numberLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLink createIntLink()
  {
    IntLinkImpl intLink = new IntLinkImpl();
    return intLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLink createDoubleLink()
  {
    DoubleLinkImpl doubleLink = new DoubleLinkImpl();
    return doubleLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexType createComplexType()
  {
    ComplexTypeImpl complexType = new ComplexTypeImpl();
    return complexType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensibleType createExtensibleType()
  {
    ExtensibleTypeImpl extensibleType = new ExtensibleTypeImpl();
    return extensibleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageElement createMessageElement()
  {
    MessageElementImpl messageElement = new MessageElementImpl();
    return messageElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Oneof createOneof()
  {
    OneofImpl oneof = new OneofImpl();
    return oneof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneofField createOneofField()
  {
    OneofFieldImpl oneofField = new OneofFieldImpl();
    return oneofField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexedElement createIndexedElement()
  {
    IndexedElementImpl indexedElement = new IndexedElementImpl();
    return indexedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionRange createExtensionRange()
  {
    ExtensionRangeImpl extensionRange = new ExtensionRangeImpl();
    return extensionRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageField createMessageField()
  {
    MessageFieldImpl messageField = new MessageFieldImpl();
    return messageField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group createGroup()
  {
    GroupImpl group = new GroupImpl();
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeLink createTypeLink()
  {
    TypeLinkImpl typeLink = new TypeLinkImpl();
    return typeLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexTypeLink createComplexTypeLink()
  {
    ComplexTypeLinkImpl complexTypeLink = new ComplexTypeLinkImpl();
    return complexTypeLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarTypeLink createScalarTypeLink()
  {
    ScalarTypeLinkImpl scalarTypeLink = new ScalarTypeLinkImpl();
    return scalarTypeLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldOptions createFieldOptions()
  {
    FieldOptionsImpl fieldOptions = new FieldOptionsImpl();
    return fieldOptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldOption createFieldOption()
  {
    FieldOptionImpl fieldOption = new FieldOptionImpl();
    return fieldOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackedValueFieldOption createPackedValueFieldOption()
  {
    PackedValueFieldOptionImpl packedValueFieldOption = new PackedValueFieldOptionImpl();
    return packedValueFieldOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultValueFieldOption createDefaultValueFieldOption()
  {
    DefaultValueFieldOptionImpl defaultValueFieldOption = new DefaultValueFieldOptionImpl();
    return defaultValueFieldOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NativeFieldOption createNativeFieldOption()
  {
    NativeFieldOptionImpl nativeFieldOption = new NativeFieldOptionImpl();
    return nativeFieldOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionSource createOptionSource()
  {
    OptionSourceImpl optionSource = new OptionSourceImpl();
    return optionSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public protolipse.protobuf.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumElement createEnumElement()
  {
    EnumElementImpl enumElement = new EnumElementImpl();
    return enumElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumField createEnumField()
  {
    EnumFieldImpl enumField = new EnumFieldImpl();
    return enumField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceElement createServiceElement()
  {
    ServiceElementImpl serviceElement = new ServiceElementImpl();
    return serviceElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rpc createRpc()
  {
    RpcImpl rpc = new RpcImpl();
    return rpc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageLink createMessageLink()
  {
    MessageLinkImpl messageLink = new MessageLinkImpl();
    return messageLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Extend createExtend()
  {
    ExtendImpl extend = new ExtendImpl();
    return extend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BOOL createBOOLFromString(EDataType eDataType, String initialValue)
  {
    BOOL result = BOOL.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBOOLToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modifier createModifierFromString(EDataType eDataType, String initialValue)
  {
    Modifier result = Modifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertModifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarType createScalarTypeFromString(EDataType eDataType, String initialValue)
  {
    ScalarType result = ScalarType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertScalarTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtobufPackage getProtobufPackage()
  {
    return (ProtobufPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ProtobufPackage getPackage()
  {
    return ProtobufPackage.eINSTANCE;
  }

} //ProtobufFactoryImpl
