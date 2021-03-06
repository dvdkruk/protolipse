/**
 */
package protolipse.protobuf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see protolipse.protobuf.ProtobufFactory
 * @model kind="package"
 * @generated
 */
public interface ProtobufPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "protobuf";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://protolipse/Protobuf";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "protobuf";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProtobufPackage eINSTANCE = protolipse.protobuf.impl.ProtobufPackageImpl.init();

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.ProtoImpl <em>Proto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.ProtoImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getProto()
   * @generated
   */
  int PROTO = 0;

  /**
   * The feature id for the '<em><b>Syntax</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTO__SYNTAX = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTO__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTO__NAME = 2;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTO__STATEMENTS = 3;

  /**
   * The number of structural features of the '<em>Proto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTO_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.StatementImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.ImportImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.PublicImportImpl <em>Public Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.PublicImportImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getPublicImport()
   * @generated
   */
  int PUBLIC_IMPORT = 3;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLIC_IMPORT__IMPORT_URI = IMPORT__IMPORT_URI;

  /**
   * The number of structural features of the '<em>Public Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLIC_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.WeakImportImpl <em>Weak Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.WeakImportImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getWeakImport()
   * @generated
   */
  int WEAK_IMPORT = 4;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_IMPORT__IMPORT_URI = IMPORT__IMPORT_URI;

  /**
   * The number of structural features of the '<em>Weak Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.MessageElementImpl <em>Message Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.MessageElementImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getMessageElement()
   * @generated
   */
  int MESSAGE_ELEMENT = 19;

  /**
   * The number of structural features of the '<em>Message Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.OptionImpl <em>Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.OptionImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getOption()
   * @generated
   */
  int OPTION = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__VALUE = MESSAGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_COUNT = MESSAGE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.NativeOptionImpl <em>Native Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.NativeOptionImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getNativeOption()
   * @generated
   */
  int NATIVE_OPTION = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_OPTION__VALUE = OPTION__VALUE;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_OPTION__SOURCE = OPTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Native Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_OPTION_FEATURE_COUNT = OPTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.CustomOptionImpl <em>Custom Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.CustomOptionImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getCustomOption()
   * @generated
   */
  int CUSTOM_OPTION = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_OPTION__VALUE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_OPTION__SOURCE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Custom Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_OPTION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.ValueImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getValue()
   * @generated
   */
  int VALUE = 8;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.SimpleValueLinkImpl <em>Simple Value Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.SimpleValueLinkImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getSimpleValueLink()
   * @generated
   */
  int SIMPLE_VALUE_LINK = 9;

  /**
   * The number of structural features of the '<em>Simple Value Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VALUE_LINK_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.CustomIdLinkImpl <em>Custom Id Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.CustomIdLinkImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getCustomIdLink()
   * @generated
   */
  int CUSTOM_ID_LINK = 10;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_ID_LINK__TARGET = SIMPLE_VALUE_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Custom Id Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_ID_LINK_FEATURE_COUNT = SIMPLE_VALUE_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.StringLinkImpl <em>String Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.StringLinkImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getStringLink()
   * @generated
   */
  int STRING_LINK = 11;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LINK__TARGET = SIMPLE_VALUE_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LINK_FEATURE_COUNT = SIMPLE_VALUE_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.BooleanLinkImpl <em>Boolean Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.BooleanLinkImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getBooleanLink()
   * @generated
   */
  int BOOLEAN_LINK = 12;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LINK__TARGET = SIMPLE_VALUE_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LINK_FEATURE_COUNT = SIMPLE_VALUE_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.NumberLinkImpl <em>Number Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.NumberLinkImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getNumberLink()
   * @generated
   */
  int NUMBER_LINK = 13;

  /**
   * The number of structural features of the '<em>Number Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LINK_FEATURE_COUNT = SIMPLE_VALUE_LINK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.IntLinkImpl <em>Int Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.IntLinkImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getIntLink()
   * @generated
   */
  int INT_LINK = 14;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LINK__TARGET = NUMBER_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LINK_FEATURE_COUNT = NUMBER_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.DoubleLinkImpl <em>Double Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.DoubleLinkImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getDoubleLink()
   * @generated
   */
  int DOUBLE_LINK = 15;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LINK__TARGET = NUMBER_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LINK_FEATURE_COUNT = NUMBER_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.ComplexTypeImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getComplexType()
   * @generated
   */
  int COMPLEX_TYPE = 16;

  /**
   * The number of structural features of the '<em>Complex Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.ExtensibleTypeImpl <em>Extensible Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.ExtensibleTypeImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getExtensibleType()
   * @generated
   */
  int EXTENSIBLE_TYPE = 17;

  /**
   * The number of structural features of the '<em>Extensible Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSIBLE_TYPE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.MessageImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__NAME = EXTENSIBLE_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__ELEMENTS = EXTENSIBLE_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = EXTENSIBLE_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.OneofImpl <em>Oneof</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.OneofImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getOneof()
   * @generated
   */
  int ONEOF = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONEOF__NAME = MESSAGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONEOF__FIELDS = MESSAGE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Oneof</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONEOF_FEATURE_COUNT = MESSAGE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.OneofFieldImpl <em>Oneof Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.OneofFieldImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getOneofField()
   * @generated
   */
  int ONEOF_FIELD = 21;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONEOF_FIELD__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONEOF_FIELD__NAME = 1;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONEOF_FIELD__INDEX = 2;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONEOF_FIELD__OPTIONS = 3;

  /**
   * The number of structural features of the '<em>Oneof Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONEOF_FIELD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.IndexedElementImpl <em>Indexed Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.IndexedElementImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getIndexedElement()
   * @generated
   */
  int INDEXED_ELEMENT = 22;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_ELEMENT__MODIFIER = MESSAGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_ELEMENT__NAME = MESSAGE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_ELEMENT__INDEX = MESSAGE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Indexed Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_ELEMENT_FEATURE_COUNT = MESSAGE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.ExtensionRangeImpl <em>Extension Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.ExtensionRangeImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getExtensionRange()
   * @generated
   */
  int EXTENSION_RANGE = 23;

  /**
   * The feature id for the '<em><b>Ranges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_RANGE__RANGES = MESSAGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Extension Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_RANGE_FEATURE_COUNT = MESSAGE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.RangeImpl <em>Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.RangeImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getRange()
   * @generated
   */
  int RANGE = 24;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__FROM = 0;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__TO = 1;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__MAX = 2;

  /**
   * The number of structural features of the '<em>Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.MessageFieldImpl <em>Message Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.MessageFieldImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getMessageField()
   * @generated
   */
  int MESSAGE_FIELD = 25;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FIELD__MODIFIER = INDEXED_ELEMENT__MODIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FIELD__NAME = INDEXED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FIELD__INDEX = INDEXED_ELEMENT__INDEX;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FIELD__TYPE = INDEXED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FIELD__OPTIONS = INDEXED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Message Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FIELD_FEATURE_COUNT = INDEXED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.GroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.GroupImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getGroup()
   * @generated
   */
  int GROUP = 26;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__MODIFIER = EXTENSIBLE_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NAME = EXTENSIBLE_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__INDEX = EXTENSIBLE_TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__ELEMENTS = EXTENSIBLE_TYPE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = EXTENSIBLE_TYPE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.TypeLinkImpl <em>Type Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.TypeLinkImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getTypeLink()
   * @generated
   */
  int TYPE_LINK = 27;

  /**
   * The number of structural features of the '<em>Type Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LINK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.ComplexTypeLinkImpl <em>Complex Type Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.ComplexTypeLinkImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getComplexTypeLink()
   * @generated
   */
  int COMPLEX_TYPE_LINK = 28;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_LINK__TARGET = TYPE_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Complex Type Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_LINK_FEATURE_COUNT = TYPE_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.ScalarTypeLinkImpl <em>Scalar Type Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.ScalarTypeLinkImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getScalarTypeLink()
   * @generated
   */
  int SCALAR_TYPE_LINK = 29;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_TYPE_LINK__TARGET = TYPE_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scalar Type Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_TYPE_LINK_FEATURE_COUNT = TYPE_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.FieldOptionsImpl <em>Field Options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.FieldOptionsImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getFieldOptions()
   * @generated
   */
  int FIELD_OPTIONS = 30;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_OPTIONS__OPTIONS = 0;

  /**
   * The number of structural features of the '<em>Field Options</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_OPTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.FieldOptionImpl <em>Field Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.FieldOptionImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getFieldOption()
   * @generated
   */
  int FIELD_OPTION = 31;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_OPTION__VALUE = 0;

  /**
   * The number of structural features of the '<em>Field Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_OPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.PackedValueFieldOptionImpl <em>Packed Value Field Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.PackedValueFieldOptionImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getPackedValueFieldOption()
   * @generated
   */
  int PACKED_VALUE_FIELD_OPTION = 32;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKED_VALUE_FIELD_OPTION__VALUE = FIELD_OPTION__VALUE;

  /**
   * The number of structural features of the '<em>Packed Value Field Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKED_VALUE_FIELD_OPTION_FEATURE_COUNT = FIELD_OPTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.DefaultValueFieldOptionImpl <em>Default Value Field Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.DefaultValueFieldOptionImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getDefaultValueFieldOption()
   * @generated
   */
  int DEFAULT_VALUE_FIELD_OPTION = 33;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_VALUE_FIELD_OPTION__VALUE = FIELD_OPTION__VALUE;

  /**
   * The number of structural features of the '<em>Default Value Field Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_VALUE_FIELD_OPTION_FEATURE_COUNT = FIELD_OPTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.NativeFieldOptionImpl <em>Native Field Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.NativeFieldOptionImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getNativeFieldOption()
   * @generated
   */
  int NATIVE_FIELD_OPTION = 34;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_FIELD_OPTION__VALUE = FIELD_OPTION__VALUE;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_FIELD_OPTION__SOURCE = FIELD_OPTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Native Field Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_FIELD_OPTION_FEATURE_COUNT = FIELD_OPTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.OptionSourceImpl <em>Option Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.OptionSourceImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getOptionSource()
   * @generated
   */
  int OPTION_SOURCE = 35;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_SOURCE__TARGET = 0;

  /**
   * The number of structural features of the '<em>Option Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_SOURCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.EnumImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getEnum()
   * @generated
   */
  int ENUM = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__NAME = COMPLEX_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__ELEMENTS = COMPLEX_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.EnumElementImpl <em>Enum Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.EnumElementImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getEnumElement()
   * @generated
   */
  int ENUM_ELEMENT = 37;

  /**
   * The number of structural features of the '<em>Enum Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.EnumFieldImpl <em>Enum Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.EnumFieldImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getEnumField()
   * @generated
   */
  int ENUM_FIELD = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FIELD__NAME = ENUM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FIELD__INDEX = ENUM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FIELD__OPTIONS = ENUM_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Enum Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FIELD_FEATURE_COUNT = ENUM_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.ServiceImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getService()
   * @generated
   */
  int SERVICE = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__ELEMENTS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.ServiceElementImpl <em>Service Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.ServiceElementImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getServiceElement()
   * @generated
   */
  int SERVICE_ELEMENT = 40;

  /**
   * The number of structural features of the '<em>Service Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.RpcImpl <em>Rpc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.RpcImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getRpc()
   * @generated
   */
  int RPC = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC__NAME = SERVICE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC__ARG_TYPE = SERVICE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC__RETURN_TYPE = SERVICE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC__OPTIONS = SERVICE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Rpc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC_FEATURE_COUNT = SERVICE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.MessageLinkImpl <em>Message Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.MessageLinkImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getMessageLink()
   * @generated
   */
  int MESSAGE_LINK = 42;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_LINK__TARGET = 0;

  /**
   * The number of structural features of the '<em>Message Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_LINK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link protolipse.protobuf.impl.ExtendImpl <em>Extend</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.impl.ExtendImpl
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getExtend()
   * @generated
   */
  int EXTEND = 43;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND__TYPE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND__ELEMENTS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Extend</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link protolipse.protobuf.BOOL <em>BOOL</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.BOOL
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getBOOL()
   * @generated
   */
  int BOOL = 44;

  /**
   * The meta object id for the '{@link protolipse.protobuf.Modifier <em>Modifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.Modifier
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getModifier()
   * @generated
   */
  int MODIFIER = 45;

  /**
   * The meta object id for the '{@link protolipse.protobuf.ScalarType <em>Scalar Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see protolipse.protobuf.ScalarType
   * @see protolipse.protobuf.impl.ProtobufPackageImpl#getScalarType()
   * @generated
   */
  int SCALAR_TYPE = 46;


  /**
   * Returns the meta object for class '{@link protolipse.protobuf.Proto <em>Proto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proto</em>'.
   * @see protolipse.protobuf.Proto
   * @generated
   */
  EClass getProto();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.Proto#getSyntax <em>Syntax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Syntax</em>'.
   * @see protolipse.protobuf.Proto#getSyntax()
   * @see #getProto()
   * @generated
   */
  EAttribute getProto_Syntax();

  /**
   * Returns the meta object for the containment reference list '{@link protolipse.protobuf.Proto#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see protolipse.protobuf.Proto#getImports()
   * @see #getProto()
   * @generated
   */
  EReference getProto_Imports();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.Proto#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see protolipse.protobuf.Proto#getName()
   * @see #getProto()
   * @generated
   */
  EAttribute getProto_Name();

  /**
   * Returns the meta object for the containment reference list '{@link protolipse.protobuf.Proto#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see protolipse.protobuf.Proto#getStatements()
   * @see #getProto()
   * @generated
   */
  EReference getProto_Statements();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see protolipse.protobuf.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see protolipse.protobuf.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see protolipse.protobuf.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.PublicImport <em>Public Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Public Import</em>'.
   * @see protolipse.protobuf.PublicImport
   * @generated
   */
  EClass getPublicImport();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.WeakImport <em>Weak Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weak Import</em>'.
   * @see protolipse.protobuf.WeakImport
   * @generated
   */
  EClass getWeakImport();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option</em>'.
   * @see protolipse.protobuf.Option
   * @generated
   */
  EClass getOption();

  /**
   * Returns the meta object for the containment reference '{@link protolipse.protobuf.Option#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see protolipse.protobuf.Option#getValue()
   * @see #getOption()
   * @generated
   */
  EReference getOption_Value();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.NativeOption <em>Native Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Native Option</em>'.
   * @see protolipse.protobuf.NativeOption
   * @generated
   */
  EClass getNativeOption();

  /**
   * Returns the meta object for the reference '{@link protolipse.protobuf.NativeOption#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see protolipse.protobuf.NativeOption#getSource()
   * @see #getNativeOption()
   * @generated
   */
  EReference getNativeOption_Source();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.CustomOption <em>Custom Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Option</em>'.
   * @see protolipse.protobuf.CustomOption
   * @generated
   */
  EClass getCustomOption();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.CustomOption#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see protolipse.protobuf.CustomOption#getSource()
   * @see #getCustomOption()
   * @generated
   */
  EAttribute getCustomOption_Source();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see protolipse.protobuf.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.SimpleValueLink <em>Simple Value Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Value Link</em>'.
   * @see protolipse.protobuf.SimpleValueLink
   * @generated
   */
  EClass getSimpleValueLink();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.CustomIdLink <em>Custom Id Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Id Link</em>'.
   * @see protolipse.protobuf.CustomIdLink
   * @generated
   */
  EClass getCustomIdLink();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.CustomIdLink#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see protolipse.protobuf.CustomIdLink#getTarget()
   * @see #getCustomIdLink()
   * @generated
   */
  EAttribute getCustomIdLink_Target();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.StringLink <em>String Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Link</em>'.
   * @see protolipse.protobuf.StringLink
   * @generated
   */
  EClass getStringLink();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.StringLink#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see protolipse.protobuf.StringLink#getTarget()
   * @see #getStringLink()
   * @generated
   */
  EAttribute getStringLink_Target();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.BooleanLink <em>Boolean Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Link</em>'.
   * @see protolipse.protobuf.BooleanLink
   * @generated
   */
  EClass getBooleanLink();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.BooleanLink#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see protolipse.protobuf.BooleanLink#getTarget()
   * @see #getBooleanLink()
   * @generated
   */
  EAttribute getBooleanLink_Target();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.NumberLink <em>Number Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Link</em>'.
   * @see protolipse.protobuf.NumberLink
   * @generated
   */
  EClass getNumberLink();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.IntLink <em>Int Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Link</em>'.
   * @see protolipse.protobuf.IntLink
   * @generated
   */
  EClass getIntLink();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.IntLink#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see protolipse.protobuf.IntLink#getTarget()
   * @see #getIntLink()
   * @generated
   */
  EAttribute getIntLink_Target();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.DoubleLink <em>Double Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Link</em>'.
   * @see protolipse.protobuf.DoubleLink
   * @generated
   */
  EClass getDoubleLink();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.DoubleLink#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see protolipse.protobuf.DoubleLink#getTarget()
   * @see #getDoubleLink()
   * @generated
   */
  EAttribute getDoubleLink_Target();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.ComplexType <em>Complex Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Type</em>'.
   * @see protolipse.protobuf.ComplexType
   * @generated
   */
  EClass getComplexType();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.ExtensibleType <em>Extensible Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extensible Type</em>'.
   * @see protolipse.protobuf.ExtensibleType
   * @generated
   */
  EClass getExtensibleType();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see protolipse.protobuf.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.Message#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see protolipse.protobuf.Message#getName()
   * @see #getMessage()
   * @generated
   */
  EAttribute getMessage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link protolipse.protobuf.Message#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see protolipse.protobuf.Message#getElements()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Elements();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.MessageElement <em>Message Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Element</em>'.
   * @see protolipse.protobuf.MessageElement
   * @generated
   */
  EClass getMessageElement();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.Oneof <em>Oneof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Oneof</em>'.
   * @see protolipse.protobuf.Oneof
   * @generated
   */
  EClass getOneof();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.Oneof#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see protolipse.protobuf.Oneof#getName()
   * @see #getOneof()
   * @generated
   */
  EAttribute getOneof_Name();

  /**
   * Returns the meta object for the containment reference list '{@link protolipse.protobuf.Oneof#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see protolipse.protobuf.Oneof#getFields()
   * @see #getOneof()
   * @generated
   */
  EReference getOneof_Fields();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.OneofField <em>Oneof Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Oneof Field</em>'.
   * @see protolipse.protobuf.OneofField
   * @generated
   */
  EClass getOneofField();

  /**
   * Returns the meta object for the containment reference '{@link protolipse.protobuf.OneofField#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see protolipse.protobuf.OneofField#getType()
   * @see #getOneofField()
   * @generated
   */
  EReference getOneofField_Type();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.OneofField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see protolipse.protobuf.OneofField#getName()
   * @see #getOneofField()
   * @generated
   */
  EAttribute getOneofField_Name();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.OneofField#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see protolipse.protobuf.OneofField#getIndex()
   * @see #getOneofField()
   * @generated
   */
  EAttribute getOneofField_Index();

  /**
   * Returns the meta object for the containment reference '{@link protolipse.protobuf.OneofField#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Options</em>'.
   * @see protolipse.protobuf.OneofField#getOptions()
   * @see #getOneofField()
   * @generated
   */
  EReference getOneofField_Options();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.IndexedElement <em>Indexed Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indexed Element</em>'.
   * @see protolipse.protobuf.IndexedElement
   * @generated
   */
  EClass getIndexedElement();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.IndexedElement#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see protolipse.protobuf.IndexedElement#getModifier()
   * @see #getIndexedElement()
   * @generated
   */
  EAttribute getIndexedElement_Modifier();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.IndexedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see protolipse.protobuf.IndexedElement#getName()
   * @see #getIndexedElement()
   * @generated
   */
  EAttribute getIndexedElement_Name();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.IndexedElement#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see protolipse.protobuf.IndexedElement#getIndex()
   * @see #getIndexedElement()
   * @generated
   */
  EAttribute getIndexedElement_Index();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.ExtensionRange <em>Extension Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extension Range</em>'.
   * @see protolipse.protobuf.ExtensionRange
   * @generated
   */
  EClass getExtensionRange();

  /**
   * Returns the meta object for the containment reference list '{@link protolipse.protobuf.ExtensionRange#getRanges <em>Ranges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ranges</em>'.
   * @see protolipse.protobuf.ExtensionRange#getRanges()
   * @see #getExtensionRange()
   * @generated
   */
  EReference getExtensionRange_Ranges();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range</em>'.
   * @see protolipse.protobuf.Range
   * @generated
   */
  EClass getRange();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.Range#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see protolipse.protobuf.Range#getFrom()
   * @see #getRange()
   * @generated
   */
  EAttribute getRange_From();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.Range#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To</em>'.
   * @see protolipse.protobuf.Range#getTo()
   * @see #getRange()
   * @generated
   */
  EAttribute getRange_To();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.Range#isMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see protolipse.protobuf.Range#isMax()
   * @see #getRange()
   * @generated
   */
  EAttribute getRange_Max();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.MessageField <em>Message Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Field</em>'.
   * @see protolipse.protobuf.MessageField
   * @generated
   */
  EClass getMessageField();

  /**
   * Returns the meta object for the containment reference '{@link protolipse.protobuf.MessageField#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see protolipse.protobuf.MessageField#getType()
   * @see #getMessageField()
   * @generated
   */
  EReference getMessageField_Type();

  /**
   * Returns the meta object for the containment reference '{@link protolipse.protobuf.MessageField#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Options</em>'.
   * @see protolipse.protobuf.MessageField#getOptions()
   * @see #getMessageField()
   * @generated
   */
  EReference getMessageField_Options();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see protolipse.protobuf.Group
   * @generated
   */
  EClass getGroup();

  /**
   * Returns the meta object for the containment reference list '{@link protolipse.protobuf.Group#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see protolipse.protobuf.Group#getElements()
   * @see #getGroup()
   * @generated
   */
  EReference getGroup_Elements();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.TypeLink <em>Type Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Link</em>'.
   * @see protolipse.protobuf.TypeLink
   * @generated
   */
  EClass getTypeLink();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.ComplexTypeLink <em>Complex Type Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Type Link</em>'.
   * @see protolipse.protobuf.ComplexTypeLink
   * @generated
   */
  EClass getComplexTypeLink();

  /**
   * Returns the meta object for the reference '{@link protolipse.protobuf.ComplexTypeLink#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see protolipse.protobuf.ComplexTypeLink#getTarget()
   * @see #getComplexTypeLink()
   * @generated
   */
  EReference getComplexTypeLink_Target();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.ScalarTypeLink <em>Scalar Type Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scalar Type Link</em>'.
   * @see protolipse.protobuf.ScalarTypeLink
   * @generated
   */
  EClass getScalarTypeLink();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.ScalarTypeLink#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see protolipse.protobuf.ScalarTypeLink#getTarget()
   * @see #getScalarTypeLink()
   * @generated
   */
  EAttribute getScalarTypeLink_Target();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.FieldOptions <em>Field Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Options</em>'.
   * @see protolipse.protobuf.FieldOptions
   * @generated
   */
  EClass getFieldOptions();

  /**
   * Returns the meta object for the containment reference list '{@link protolipse.protobuf.FieldOptions#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see protolipse.protobuf.FieldOptions#getOptions()
   * @see #getFieldOptions()
   * @generated
   */
  EReference getFieldOptions_Options();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.FieldOption <em>Field Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Option</em>'.
   * @see protolipse.protobuf.FieldOption
   * @generated
   */
  EClass getFieldOption();

  /**
   * Returns the meta object for the containment reference '{@link protolipse.protobuf.FieldOption#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see protolipse.protobuf.FieldOption#getValue()
   * @see #getFieldOption()
   * @generated
   */
  EReference getFieldOption_Value();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.PackedValueFieldOption <em>Packed Value Field Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Packed Value Field Option</em>'.
   * @see protolipse.protobuf.PackedValueFieldOption
   * @generated
   */
  EClass getPackedValueFieldOption();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.DefaultValueFieldOption <em>Default Value Field Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Value Field Option</em>'.
   * @see protolipse.protobuf.DefaultValueFieldOption
   * @generated
   */
  EClass getDefaultValueFieldOption();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.NativeFieldOption <em>Native Field Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Native Field Option</em>'.
   * @see protolipse.protobuf.NativeFieldOption
   * @generated
   */
  EClass getNativeFieldOption();

  /**
   * Returns the meta object for the containment reference '{@link protolipse.protobuf.NativeFieldOption#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see protolipse.protobuf.NativeFieldOption#getSource()
   * @see #getNativeFieldOption()
   * @generated
   */
  EReference getNativeFieldOption_Source();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.OptionSource <em>Option Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option Source</em>'.
   * @see protolipse.protobuf.OptionSource
   * @generated
   */
  EClass getOptionSource();

  /**
   * Returns the meta object for the reference '{@link protolipse.protobuf.OptionSource#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see protolipse.protobuf.OptionSource#getTarget()
   * @see #getOptionSource()
   * @generated
   */
  EReference getOptionSource_Target();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see protolipse.protobuf.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.Enum#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see protolipse.protobuf.Enum#getName()
   * @see #getEnum()
   * @generated
   */
  EAttribute getEnum_Name();

  /**
   * Returns the meta object for the containment reference list '{@link protolipse.protobuf.Enum#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see protolipse.protobuf.Enum#getElements()
   * @see #getEnum()
   * @generated
   */
  EReference getEnum_Elements();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.EnumElement <em>Enum Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Element</em>'.
   * @see protolipse.protobuf.EnumElement
   * @generated
   */
  EClass getEnumElement();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.EnumField <em>Enum Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Field</em>'.
   * @see protolipse.protobuf.EnumField
   * @generated
   */
  EClass getEnumField();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.EnumField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see protolipse.protobuf.EnumField#getName()
   * @see #getEnumField()
   * @generated
   */
  EAttribute getEnumField_Name();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.EnumField#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see protolipse.protobuf.EnumField#getIndex()
   * @see #getEnumField()
   * @generated
   */
  EAttribute getEnumField_Index();

  /**
   * Returns the meta object for the containment reference list '{@link protolipse.protobuf.EnumField#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see protolipse.protobuf.EnumField#getOptions()
   * @see #getEnumField()
   * @generated
   */
  EReference getEnumField_Options();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see protolipse.protobuf.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see protolipse.protobuf.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for the containment reference list '{@link protolipse.protobuf.Service#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see protolipse.protobuf.Service#getElements()
   * @see #getService()
   * @generated
   */
  EReference getService_Elements();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.ServiceElement <em>Service Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Element</em>'.
   * @see protolipse.protobuf.ServiceElement
   * @generated
   */
  EClass getServiceElement();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.Rpc <em>Rpc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rpc</em>'.
   * @see protolipse.protobuf.Rpc
   * @generated
   */
  EClass getRpc();

  /**
   * Returns the meta object for the attribute '{@link protolipse.protobuf.Rpc#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see protolipse.protobuf.Rpc#getName()
   * @see #getRpc()
   * @generated
   */
  EAttribute getRpc_Name();

  /**
   * Returns the meta object for the containment reference '{@link protolipse.protobuf.Rpc#getArgType <em>Arg Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg Type</em>'.
   * @see protolipse.protobuf.Rpc#getArgType()
   * @see #getRpc()
   * @generated
   */
  EReference getRpc_ArgType();

  /**
   * Returns the meta object for the containment reference '{@link protolipse.protobuf.Rpc#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see protolipse.protobuf.Rpc#getReturnType()
   * @see #getRpc()
   * @generated
   */
  EReference getRpc_ReturnType();

  /**
   * Returns the meta object for the containment reference list '{@link protolipse.protobuf.Rpc#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see protolipse.protobuf.Rpc#getOptions()
   * @see #getRpc()
   * @generated
   */
  EReference getRpc_Options();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.MessageLink <em>Message Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Link</em>'.
   * @see protolipse.protobuf.MessageLink
   * @generated
   */
  EClass getMessageLink();

  /**
   * Returns the meta object for the reference '{@link protolipse.protobuf.MessageLink#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see protolipse.protobuf.MessageLink#getTarget()
   * @see #getMessageLink()
   * @generated
   */
  EReference getMessageLink_Target();

  /**
   * Returns the meta object for class '{@link protolipse.protobuf.Extend <em>Extend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extend</em>'.
   * @see protolipse.protobuf.Extend
   * @generated
   */
  EClass getExtend();

  /**
   * Returns the meta object for the reference '{@link protolipse.protobuf.Extend#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see protolipse.protobuf.Extend#getType()
   * @see #getExtend()
   * @generated
   */
  EReference getExtend_Type();

  /**
   * Returns the meta object for the containment reference list '{@link protolipse.protobuf.Extend#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see protolipse.protobuf.Extend#getElements()
   * @see #getExtend()
   * @generated
   */
  EReference getExtend_Elements();

  /**
   * Returns the meta object for enum '{@link protolipse.protobuf.BOOL <em>BOOL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>BOOL</em>'.
   * @see protolipse.protobuf.BOOL
   * @generated
   */
  EEnum getBOOL();

  /**
   * Returns the meta object for enum '{@link protolipse.protobuf.Modifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Modifier</em>'.
   * @see protolipse.protobuf.Modifier
   * @generated
   */
  EEnum getModifier();

  /**
   * Returns the meta object for enum '{@link protolipse.protobuf.ScalarType <em>Scalar Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Scalar Type</em>'.
   * @see protolipse.protobuf.ScalarType
   * @generated
   */
  EEnum getScalarType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ProtobufFactory getProtobufFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.ProtoImpl <em>Proto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.ProtoImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getProto()
     * @generated
     */
    EClass PROTO = eINSTANCE.getProto();

    /**
     * The meta object literal for the '<em><b>Syntax</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROTO__SYNTAX = eINSTANCE.getProto_Syntax();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTO__IMPORTS = eINSTANCE.getProto_Imports();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROTO__NAME = eINSTANCE.getProto_Name();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTO__STATEMENTS = eINSTANCE.getProto_Statements();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.StatementImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.ImportImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.PublicImportImpl <em>Public Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.PublicImportImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getPublicImport()
     * @generated
     */
    EClass PUBLIC_IMPORT = eINSTANCE.getPublicImport();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.WeakImportImpl <em>Weak Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.WeakImportImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getWeakImport()
     * @generated
     */
    EClass WEAK_IMPORT = eINSTANCE.getWeakImport();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.OptionImpl <em>Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.OptionImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getOption()
     * @generated
     */
    EClass OPTION = eINSTANCE.getOption();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTION__VALUE = eINSTANCE.getOption_Value();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.NativeOptionImpl <em>Native Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.NativeOptionImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getNativeOption()
     * @generated
     */
    EClass NATIVE_OPTION = eINSTANCE.getNativeOption();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NATIVE_OPTION__SOURCE = eINSTANCE.getNativeOption_Source();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.CustomOptionImpl <em>Custom Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.CustomOptionImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getCustomOption()
     * @generated
     */
    EClass CUSTOM_OPTION = eINSTANCE.getCustomOption();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_OPTION__SOURCE = eINSTANCE.getCustomOption_Source();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.ValueImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.SimpleValueLinkImpl <em>Simple Value Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.SimpleValueLinkImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getSimpleValueLink()
     * @generated
     */
    EClass SIMPLE_VALUE_LINK = eINSTANCE.getSimpleValueLink();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.CustomIdLinkImpl <em>Custom Id Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.CustomIdLinkImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getCustomIdLink()
     * @generated
     */
    EClass CUSTOM_ID_LINK = eINSTANCE.getCustomIdLink();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_ID_LINK__TARGET = eINSTANCE.getCustomIdLink_Target();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.StringLinkImpl <em>String Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.StringLinkImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getStringLink()
     * @generated
     */
    EClass STRING_LINK = eINSTANCE.getStringLink();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LINK__TARGET = eINSTANCE.getStringLink_Target();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.BooleanLinkImpl <em>Boolean Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.BooleanLinkImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getBooleanLink()
     * @generated
     */
    EClass BOOLEAN_LINK = eINSTANCE.getBooleanLink();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LINK__TARGET = eINSTANCE.getBooleanLink_Target();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.NumberLinkImpl <em>Number Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.NumberLinkImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getNumberLink()
     * @generated
     */
    EClass NUMBER_LINK = eINSTANCE.getNumberLink();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.IntLinkImpl <em>Int Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.IntLinkImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getIntLink()
     * @generated
     */
    EClass INT_LINK = eINSTANCE.getIntLink();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_LINK__TARGET = eINSTANCE.getIntLink_Target();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.DoubleLinkImpl <em>Double Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.DoubleLinkImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getDoubleLink()
     * @generated
     */
    EClass DOUBLE_LINK = eINSTANCE.getDoubleLink();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_LINK__TARGET = eINSTANCE.getDoubleLink_Target();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.ComplexTypeImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getComplexType()
     * @generated
     */
    EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.ExtensibleTypeImpl <em>Extensible Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.ExtensibleTypeImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getExtensibleType()
     * @generated
     */
    EClass EXTENSIBLE_TYPE = eINSTANCE.getExtensibleType();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.MessageImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getMessage()
     * @generated
     */
    EClass MESSAGE = eINSTANCE.getMessage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE__ELEMENTS = eINSTANCE.getMessage_Elements();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.MessageElementImpl <em>Message Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.MessageElementImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getMessageElement()
     * @generated
     */
    EClass MESSAGE_ELEMENT = eINSTANCE.getMessageElement();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.OneofImpl <em>Oneof</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.OneofImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getOneof()
     * @generated
     */
    EClass ONEOF = eINSTANCE.getOneof();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONEOF__NAME = eINSTANCE.getOneof_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONEOF__FIELDS = eINSTANCE.getOneof_Fields();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.OneofFieldImpl <em>Oneof Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.OneofFieldImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getOneofField()
     * @generated
     */
    EClass ONEOF_FIELD = eINSTANCE.getOneofField();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONEOF_FIELD__TYPE = eINSTANCE.getOneofField_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONEOF_FIELD__NAME = eINSTANCE.getOneofField_Name();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONEOF_FIELD__INDEX = eINSTANCE.getOneofField_Index();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONEOF_FIELD__OPTIONS = eINSTANCE.getOneofField_Options();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.IndexedElementImpl <em>Indexed Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.IndexedElementImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getIndexedElement()
     * @generated
     */
    EClass INDEXED_ELEMENT = eINSTANCE.getIndexedElement();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDEXED_ELEMENT__MODIFIER = eINSTANCE.getIndexedElement_Modifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDEXED_ELEMENT__NAME = eINSTANCE.getIndexedElement_Name();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDEXED_ELEMENT__INDEX = eINSTANCE.getIndexedElement_Index();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.ExtensionRangeImpl <em>Extension Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.ExtensionRangeImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getExtensionRange()
     * @generated
     */
    EClass EXTENSION_RANGE = eINSTANCE.getExtensionRange();

    /**
     * The meta object literal for the '<em><b>Ranges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTENSION_RANGE__RANGES = eINSTANCE.getExtensionRange_Ranges();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.RangeImpl <em>Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.RangeImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getRange()
     * @generated
     */
    EClass RANGE = eINSTANCE.getRange();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE__FROM = eINSTANCE.getRange_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE__TO = eINSTANCE.getRange_To();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE__MAX = eINSTANCE.getRange_Max();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.MessageFieldImpl <em>Message Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.MessageFieldImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getMessageField()
     * @generated
     */
    EClass MESSAGE_FIELD = eINSTANCE.getMessageField();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_FIELD__TYPE = eINSTANCE.getMessageField_Type();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_FIELD__OPTIONS = eINSTANCE.getMessageField_Options();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.GroupImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getGroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__ELEMENTS = eINSTANCE.getGroup_Elements();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.TypeLinkImpl <em>Type Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.TypeLinkImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getTypeLink()
     * @generated
     */
    EClass TYPE_LINK = eINSTANCE.getTypeLink();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.ComplexTypeLinkImpl <em>Complex Type Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.ComplexTypeLinkImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getComplexTypeLink()
     * @generated
     */
    EClass COMPLEX_TYPE_LINK = eINSTANCE.getComplexTypeLink();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_TYPE_LINK__TARGET = eINSTANCE.getComplexTypeLink_Target();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.ScalarTypeLinkImpl <em>Scalar Type Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.ScalarTypeLinkImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getScalarTypeLink()
     * @generated
     */
    EClass SCALAR_TYPE_LINK = eINSTANCE.getScalarTypeLink();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCALAR_TYPE_LINK__TARGET = eINSTANCE.getScalarTypeLink_Target();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.FieldOptionsImpl <em>Field Options</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.FieldOptionsImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getFieldOptions()
     * @generated
     */
    EClass FIELD_OPTIONS = eINSTANCE.getFieldOptions();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_OPTIONS__OPTIONS = eINSTANCE.getFieldOptions_Options();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.FieldOptionImpl <em>Field Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.FieldOptionImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getFieldOption()
     * @generated
     */
    EClass FIELD_OPTION = eINSTANCE.getFieldOption();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_OPTION__VALUE = eINSTANCE.getFieldOption_Value();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.PackedValueFieldOptionImpl <em>Packed Value Field Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.PackedValueFieldOptionImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getPackedValueFieldOption()
     * @generated
     */
    EClass PACKED_VALUE_FIELD_OPTION = eINSTANCE.getPackedValueFieldOption();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.DefaultValueFieldOptionImpl <em>Default Value Field Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.DefaultValueFieldOptionImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getDefaultValueFieldOption()
     * @generated
     */
    EClass DEFAULT_VALUE_FIELD_OPTION = eINSTANCE.getDefaultValueFieldOption();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.NativeFieldOptionImpl <em>Native Field Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.NativeFieldOptionImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getNativeFieldOption()
     * @generated
     */
    EClass NATIVE_FIELD_OPTION = eINSTANCE.getNativeFieldOption();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NATIVE_FIELD_OPTION__SOURCE = eINSTANCE.getNativeFieldOption_Source();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.OptionSourceImpl <em>Option Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.OptionSourceImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getOptionSource()
     * @generated
     */
    EClass OPTION_SOURCE = eINSTANCE.getOptionSource();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTION_SOURCE__TARGET = eINSTANCE.getOptionSource_Target();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.EnumImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__NAME = eINSTANCE.getEnum_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM__ELEMENTS = eINSTANCE.getEnum_Elements();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.EnumElementImpl <em>Enum Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.EnumElementImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getEnumElement()
     * @generated
     */
    EClass ENUM_ELEMENT = eINSTANCE.getEnumElement();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.EnumFieldImpl <em>Enum Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.EnumFieldImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getEnumField()
     * @generated
     */
    EClass ENUM_FIELD = eINSTANCE.getEnumField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_FIELD__NAME = eINSTANCE.getEnumField_Name();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_FIELD__INDEX = eINSTANCE.getEnumField_Index();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_FIELD__OPTIONS = eINSTANCE.getEnumField_Options();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.ServiceImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__ELEMENTS = eINSTANCE.getService_Elements();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.ServiceElementImpl <em>Service Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.ServiceElementImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getServiceElement()
     * @generated
     */
    EClass SERVICE_ELEMENT = eINSTANCE.getServiceElement();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.RpcImpl <em>Rpc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.RpcImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getRpc()
     * @generated
     */
    EClass RPC = eINSTANCE.getRpc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RPC__NAME = eINSTANCE.getRpc_Name();

    /**
     * The meta object literal for the '<em><b>Arg Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RPC__ARG_TYPE = eINSTANCE.getRpc_ArgType();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RPC__RETURN_TYPE = eINSTANCE.getRpc_ReturnType();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RPC__OPTIONS = eINSTANCE.getRpc_Options();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.MessageLinkImpl <em>Message Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.MessageLinkImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getMessageLink()
     * @generated
     */
    EClass MESSAGE_LINK = eINSTANCE.getMessageLink();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_LINK__TARGET = eINSTANCE.getMessageLink_Target();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.impl.ExtendImpl <em>Extend</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.impl.ExtendImpl
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getExtend()
     * @generated
     */
    EClass EXTEND = eINSTANCE.getExtend();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTEND__TYPE = eINSTANCE.getExtend_Type();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTEND__ELEMENTS = eINSTANCE.getExtend_Elements();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.BOOL <em>BOOL</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.BOOL
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getBOOL()
     * @generated
     */
    EEnum BOOL = eINSTANCE.getBOOL();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.Modifier <em>Modifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.Modifier
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getModifier()
     * @generated
     */
    EEnum MODIFIER = eINSTANCE.getModifier();

    /**
     * The meta object literal for the '{@link protolipse.protobuf.ScalarType <em>Scalar Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see protolipse.protobuf.ScalarType
     * @see protolipse.protobuf.impl.ProtobufPackageImpl#getScalarType()
     * @generated
     */
    EEnum SCALAR_TYPE = eINSTANCE.getScalarType();

  }

} //ProtobufPackage
