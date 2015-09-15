/**
 */
package protolipse.protobuf.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import protolipse.protobuf.TypeLink;
import protolipse.protobuf.Value;
import protolipse.protobuf.WeakImport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtobufPackageImpl extends EPackageImpl implements ProtobufPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass publicImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weakImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nativeOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleValueLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customIdLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extensibleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oneofEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oneofFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indexedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extensionRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexTypeLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scalarTypeLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldOptionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packedValueFieldOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultValueFieldOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nativeFieldOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rpcEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum boolEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum modifierEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum scalarTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see protolipse.protobuf.ProtobufPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ProtobufPackageImpl()
  {
    super(eNS_URI, ProtobufFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ProtobufPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ProtobufPackage init()
  {
    if (isInited) return (ProtobufPackage)EPackage.Registry.INSTANCE.getEPackage(ProtobufPackage.eNS_URI);

    // Obtain or create and register package
    ProtobufPackageImpl theProtobufPackage = (ProtobufPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProtobufPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProtobufPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theProtobufPackage.createPackageContents();

    // Initialize created meta-data
    theProtobufPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theProtobufPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ProtobufPackage.eNS_URI, theProtobufPackage);
    return theProtobufPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProto()
  {
    return protoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProto_Syntax()
  {
    return (EAttribute)protoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProto_Imports()
  {
    return (EReference)protoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProto_Name()
  {
    return (EAttribute)protoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProto_Statements()
  {
    return (EReference)protoEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportURI()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPublicImport()
  {
    return publicImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeakImport()
  {
    return weakImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOption()
  {
    return optionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOption_Value()
  {
    return (EReference)optionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNativeOption()
  {
    return nativeOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNativeOption_Source()
  {
    return (EReference)nativeOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomOption()
  {
    return customOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomOption_Source()
  {
    return (EAttribute)customOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleValueLink()
  {
    return simpleValueLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomIdLink()
  {
    return customIdLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomIdLink_Target()
  {
    return (EAttribute)customIdLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLink()
  {
    return stringLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLink_Target()
  {
    return (EAttribute)stringLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanLink()
  {
    return booleanLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanLink_Target()
  {
    return (EAttribute)booleanLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberLink()
  {
    return numberLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntLink()
  {
    return intLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntLink_Target()
  {
    return (EAttribute)intLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleLink()
  {
    return doubleLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoubleLink_Target()
  {
    return (EAttribute)doubleLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexType()
  {
    return complexTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtensibleType()
  {
    return extensibleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessage()
  {
    return messageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessage_Name()
  {
    return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessage_Elements()
  {
    return (EReference)messageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageElement()
  {
    return messageElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOneof()
  {
    return oneofEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOneof_Name()
  {
    return (EAttribute)oneofEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneof_Fields()
  {
    return (EReference)oneofEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOneofField()
  {
    return oneofFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneofField_Type()
  {
    return (EReference)oneofFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOneofField_Name()
  {
    return (EAttribute)oneofFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOneofField_Index()
  {
    return (EAttribute)oneofFieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneofField_Options()
  {
    return (EReference)oneofFieldEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndexedElement()
  {
    return indexedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndexedElement_Modifier()
  {
    return (EAttribute)indexedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndexedElement_Name()
  {
    return (EAttribute)indexedElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndexedElement_Index()
  {
    return (EAttribute)indexedElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtensionRange()
  {
    return extensionRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtensionRange_Ranges()
  {
    return (EReference)extensionRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRange()
  {
    return rangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRange_From()
  {
    return (EAttribute)rangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRange_To()
  {
    return (EAttribute)rangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRange_Max()
  {
    return (EAttribute)rangeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageField()
  {
    return messageFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageField_Type()
  {
    return (EReference)messageFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageField_Options()
  {
    return (EReference)messageFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroup()
  {
    return groupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroup_Elements()
  {
    return (EReference)groupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeLink()
  {
    return typeLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexTypeLink()
  {
    return complexTypeLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexTypeLink_Target()
  {
    return (EReference)complexTypeLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScalarTypeLink()
  {
    return scalarTypeLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScalarTypeLink_Target()
  {
    return (EAttribute)scalarTypeLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldOptions()
  {
    return fieldOptionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldOptions_Options()
  {
    return (EReference)fieldOptionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldOption()
  {
    return fieldOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldOption_Value()
  {
    return (EReference)fieldOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackedValueFieldOption()
  {
    return packedValueFieldOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultValueFieldOption()
  {
    return defaultValueFieldOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNativeFieldOption()
  {
    return nativeFieldOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNativeFieldOption_Source()
  {
    return (EReference)nativeFieldOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptionSource()
  {
    return optionSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptionSource_Target()
  {
    return (EReference)optionSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnum()
  {
    return enumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnum_Name()
  {
    return (EAttribute)enumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnum_Elements()
  {
    return (EReference)enumEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumElement()
  {
    return enumElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumField()
  {
    return enumFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumField_Name()
  {
    return (EAttribute)enumFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumField_Index()
  {
    return (EAttribute)enumFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumField_Options()
  {
    return (EReference)enumFieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getService()
  {
    return serviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Name()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getService_Elements()
  {
    return (EReference)serviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceElement()
  {
    return serviceElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRpc()
  {
    return rpcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRpc_Name()
  {
    return (EAttribute)rpcEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRpc_ArgType()
  {
    return (EReference)rpcEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRpc_ReturnType()
  {
    return (EReference)rpcEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRpc_Options()
  {
    return (EReference)rpcEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageLink()
  {
    return messageLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageLink_Target()
  {
    return (EReference)messageLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtend()
  {
    return extendEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtend_Type()
  {
    return (EReference)extendEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtend_Elements()
  {
    return (EReference)extendEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBOOL()
  {
    return boolEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getModifier()
  {
    return modifierEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getScalarType()
  {
    return scalarTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtobufFactory getProtobufFactory()
  {
    return (ProtobufFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    protoEClass = createEClass(PROTO);
    createEAttribute(protoEClass, PROTO__SYNTAX);
    createEReference(protoEClass, PROTO__IMPORTS);
    createEAttribute(protoEClass, PROTO__NAME);
    createEReference(protoEClass, PROTO__STATEMENTS);

    statementEClass = createEClass(STATEMENT);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORT_URI);

    publicImportEClass = createEClass(PUBLIC_IMPORT);

    weakImportEClass = createEClass(WEAK_IMPORT);

    optionEClass = createEClass(OPTION);
    createEReference(optionEClass, OPTION__VALUE);

    nativeOptionEClass = createEClass(NATIVE_OPTION);
    createEReference(nativeOptionEClass, NATIVE_OPTION__SOURCE);

    customOptionEClass = createEClass(CUSTOM_OPTION);
    createEAttribute(customOptionEClass, CUSTOM_OPTION__SOURCE);

    valueEClass = createEClass(VALUE);

    simpleValueLinkEClass = createEClass(SIMPLE_VALUE_LINK);

    customIdLinkEClass = createEClass(CUSTOM_ID_LINK);
    createEAttribute(customIdLinkEClass, CUSTOM_ID_LINK__TARGET);

    stringLinkEClass = createEClass(STRING_LINK);
    createEAttribute(stringLinkEClass, STRING_LINK__TARGET);

    booleanLinkEClass = createEClass(BOOLEAN_LINK);
    createEAttribute(booleanLinkEClass, BOOLEAN_LINK__TARGET);

    numberLinkEClass = createEClass(NUMBER_LINK);

    intLinkEClass = createEClass(INT_LINK);
    createEAttribute(intLinkEClass, INT_LINK__TARGET);

    doubleLinkEClass = createEClass(DOUBLE_LINK);
    createEAttribute(doubleLinkEClass, DOUBLE_LINK__TARGET);

    complexTypeEClass = createEClass(COMPLEX_TYPE);

    extensibleTypeEClass = createEClass(EXTENSIBLE_TYPE);

    messageEClass = createEClass(MESSAGE);
    createEAttribute(messageEClass, MESSAGE__NAME);
    createEReference(messageEClass, MESSAGE__ELEMENTS);

    messageElementEClass = createEClass(MESSAGE_ELEMENT);

    oneofEClass = createEClass(ONEOF);
    createEAttribute(oneofEClass, ONEOF__NAME);
    createEReference(oneofEClass, ONEOF__FIELDS);

    oneofFieldEClass = createEClass(ONEOF_FIELD);
    createEReference(oneofFieldEClass, ONEOF_FIELD__TYPE);
    createEAttribute(oneofFieldEClass, ONEOF_FIELD__NAME);
    createEAttribute(oneofFieldEClass, ONEOF_FIELD__INDEX);
    createEReference(oneofFieldEClass, ONEOF_FIELD__OPTIONS);

    indexedElementEClass = createEClass(INDEXED_ELEMENT);
    createEAttribute(indexedElementEClass, INDEXED_ELEMENT__MODIFIER);
    createEAttribute(indexedElementEClass, INDEXED_ELEMENT__NAME);
    createEAttribute(indexedElementEClass, INDEXED_ELEMENT__INDEX);

    extensionRangeEClass = createEClass(EXTENSION_RANGE);
    createEReference(extensionRangeEClass, EXTENSION_RANGE__RANGES);

    rangeEClass = createEClass(RANGE);
    createEAttribute(rangeEClass, RANGE__FROM);
    createEAttribute(rangeEClass, RANGE__TO);
    createEAttribute(rangeEClass, RANGE__MAX);

    messageFieldEClass = createEClass(MESSAGE_FIELD);
    createEReference(messageFieldEClass, MESSAGE_FIELD__TYPE);
    createEReference(messageFieldEClass, MESSAGE_FIELD__OPTIONS);

    groupEClass = createEClass(GROUP);
    createEReference(groupEClass, GROUP__ELEMENTS);

    typeLinkEClass = createEClass(TYPE_LINK);

    complexTypeLinkEClass = createEClass(COMPLEX_TYPE_LINK);
    createEReference(complexTypeLinkEClass, COMPLEX_TYPE_LINK__TARGET);

    scalarTypeLinkEClass = createEClass(SCALAR_TYPE_LINK);
    createEAttribute(scalarTypeLinkEClass, SCALAR_TYPE_LINK__TARGET);

    fieldOptionsEClass = createEClass(FIELD_OPTIONS);
    createEReference(fieldOptionsEClass, FIELD_OPTIONS__OPTIONS);

    fieldOptionEClass = createEClass(FIELD_OPTION);
    createEReference(fieldOptionEClass, FIELD_OPTION__VALUE);

    packedValueFieldOptionEClass = createEClass(PACKED_VALUE_FIELD_OPTION);

    defaultValueFieldOptionEClass = createEClass(DEFAULT_VALUE_FIELD_OPTION);

    nativeFieldOptionEClass = createEClass(NATIVE_FIELD_OPTION);
    createEReference(nativeFieldOptionEClass, NATIVE_FIELD_OPTION__SOURCE);

    optionSourceEClass = createEClass(OPTION_SOURCE);
    createEReference(optionSourceEClass, OPTION_SOURCE__TARGET);

    enumEClass = createEClass(ENUM);
    createEAttribute(enumEClass, ENUM__NAME);
    createEReference(enumEClass, ENUM__ELEMENTS);

    enumElementEClass = createEClass(ENUM_ELEMENT);

    enumFieldEClass = createEClass(ENUM_FIELD);
    createEAttribute(enumFieldEClass, ENUM_FIELD__NAME);
    createEAttribute(enumFieldEClass, ENUM_FIELD__INDEX);
    createEReference(enumFieldEClass, ENUM_FIELD__OPTIONS);

    serviceEClass = createEClass(SERVICE);
    createEAttribute(serviceEClass, SERVICE__NAME);
    createEReference(serviceEClass, SERVICE__ELEMENTS);

    serviceElementEClass = createEClass(SERVICE_ELEMENT);

    rpcEClass = createEClass(RPC);
    createEAttribute(rpcEClass, RPC__NAME);
    createEReference(rpcEClass, RPC__ARG_TYPE);
    createEReference(rpcEClass, RPC__RETURN_TYPE);
    createEReference(rpcEClass, RPC__OPTIONS);

    messageLinkEClass = createEClass(MESSAGE_LINK);
    createEReference(messageLinkEClass, MESSAGE_LINK__TARGET);

    extendEClass = createEClass(EXTEND);
    createEReference(extendEClass, EXTEND__TYPE);
    createEReference(extendEClass, EXTEND__ELEMENTS);

    // Create enums
    boolEEnum = createEEnum(BOOL);
    modifierEEnum = createEEnum(MODIFIER);
    scalarTypeEEnum = createEEnum(SCALAR_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    publicImportEClass.getESuperTypes().add(this.getImport());
    weakImportEClass.getESuperTypes().add(this.getImport());
    optionEClass.getESuperTypes().add(this.getMessageElement());
    optionEClass.getESuperTypes().add(this.getServiceElement());
    nativeOptionEClass.getESuperTypes().add(this.getOption());
    customOptionEClass.getESuperTypes().add(this.getStatement());
    customOptionEClass.getESuperTypes().add(this.getOption());
    customOptionEClass.getESuperTypes().add(this.getEnumElement());
    simpleValueLinkEClass.getESuperTypes().add(this.getValue());
    customIdLinkEClass.getESuperTypes().add(this.getSimpleValueLink());
    stringLinkEClass.getESuperTypes().add(this.getSimpleValueLink());
    booleanLinkEClass.getESuperTypes().add(this.getSimpleValueLink());
    numberLinkEClass.getESuperTypes().add(this.getSimpleValueLink());
    intLinkEClass.getESuperTypes().add(this.getNumberLink());
    doubleLinkEClass.getESuperTypes().add(this.getNumberLink());
    complexTypeEClass.getESuperTypes().add(this.getStatement());
    extensibleTypeEClass.getESuperTypes().add(this.getComplexType());
    messageEClass.getESuperTypes().add(this.getExtensibleType());
    messageEClass.getESuperTypes().add(this.getMessageElement());
    oneofEClass.getESuperTypes().add(this.getMessageElement());
    indexedElementEClass.getESuperTypes().add(this.getMessageElement());
    extensionRangeEClass.getESuperTypes().add(this.getMessageElement());
    messageFieldEClass.getESuperTypes().add(this.getIndexedElement());
    groupEClass.getESuperTypes().add(this.getExtensibleType());
    groupEClass.getESuperTypes().add(this.getIndexedElement());
    complexTypeLinkEClass.getESuperTypes().add(this.getTypeLink());
    scalarTypeLinkEClass.getESuperTypes().add(this.getTypeLink());
    packedValueFieldOptionEClass.getESuperTypes().add(this.getFieldOption());
    defaultValueFieldOptionEClass.getESuperTypes().add(this.getFieldOption());
    nativeFieldOptionEClass.getESuperTypes().add(this.getFieldOption());
    enumEClass.getESuperTypes().add(this.getComplexType());
    enumEClass.getESuperTypes().add(this.getMessageElement());
    enumFieldEClass.getESuperTypes().add(this.getEnumElement());
    serviceEClass.getESuperTypes().add(this.getStatement());
    serviceEClass.getESuperTypes().add(this.getMessageElement());
    rpcEClass.getESuperTypes().add(this.getServiceElement());
    extendEClass.getESuperTypes().add(this.getStatement());
    extendEClass.getESuperTypes().add(this.getMessageElement());

    // Initialize classes and features; add operations and parameters
    initEClass(protoEClass, Proto.class, "Proto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProto_Syntax(), ecorePackage.getEString(), "syntax", null, 0, 1, Proto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProto_Imports(), this.getImport(), null, "imports", null, 0, -1, Proto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProto_Name(), ecorePackage.getEString(), "name", null, 0, 1, Proto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProto_Statements(), this.getStatement(), null, "statements", null, 0, -1, Proto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(publicImportEClass, PublicImport.class, "PublicImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(weakImportEClass, WeakImport.class, "WeakImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOption_Value(), this.getValue(), null, "value", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nativeOptionEClass, NativeOption.class, "NativeOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNativeOption_Source(), this.getMessageField(), null, "source", null, 0, 1, NativeOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customOptionEClass, CustomOption.class, "CustomOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomOption_Source(), ecorePackage.getEString(), "source", null, 0, 1, CustomOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleValueLinkEClass, SimpleValueLink.class, "SimpleValueLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(customIdLinkEClass, CustomIdLink.class, "CustomIdLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomIdLink_Target(), ecorePackage.getEString(), "target", null, 0, 1, CustomIdLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringLinkEClass, StringLink.class, "StringLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLink_Target(), ecorePackage.getEString(), "target", null, 0, 1, StringLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanLinkEClass, BooleanLink.class, "BooleanLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanLink_Target(), this.getBOOL(), "target", null, 0, 1, BooleanLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberLinkEClass, NumberLink.class, "NumberLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intLinkEClass, IntLink.class, "IntLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntLink_Target(), ecorePackage.getEInt(), "target", null, 0, 1, IntLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doubleLinkEClass, DoubleLink.class, "DoubleLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDoubleLink_Target(), ecorePackage.getEDouble(), "target", null, 0, 1, DoubleLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexTypeEClass, ComplexType.class, "ComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(extensibleTypeEClass, ExtensibleType.class, "ExtensibleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessage_Elements(), this.getMessageElement(), null, "elements", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageElementEClass, MessageElement.class, "MessageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(oneofEClass, Oneof.class, "Oneof", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOneof_Name(), ecorePackage.getEString(), "name", null, 0, 1, Oneof.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOneof_Fields(), this.getOneofField(), null, "fields", null, 0, -1, Oneof.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oneofFieldEClass, OneofField.class, "OneofField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOneofField_Type(), this.getTypeLink(), null, "type", null, 0, 1, OneofField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOneofField_Name(), ecorePackage.getEString(), "name", null, 0, 1, OneofField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOneofField_Index(), ecorePackage.getEInt(), "index", null, 0, 1, OneofField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOneofField_Options(), this.getFieldOptions(), null, "options", null, 0, 1, OneofField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indexedElementEClass, IndexedElement.class, "IndexedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIndexedElement_Modifier(), this.getModifier(), "modifier", null, 0, 1, IndexedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIndexedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, IndexedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIndexedElement_Index(), ecorePackage.getEInt(), "index", null, 0, 1, IndexedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extensionRangeEClass, ExtensionRange.class, "ExtensionRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtensionRange_Ranges(), this.getRange(), null, "ranges", null, 0, -1, ExtensionRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRange_From(), ecorePackage.getEInt(), "from", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRange_To(), ecorePackage.getEInt(), "to", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRange_Max(), ecorePackage.getEBoolean(), "max", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageFieldEClass, MessageField.class, "MessageField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMessageField_Type(), this.getTypeLink(), null, "type", null, 0, 1, MessageField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageField_Options(), this.getFieldOptions(), null, "options", null, 0, 1, MessageField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGroup_Elements(), this.getMessageField(), null, "elements", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeLinkEClass, TypeLink.class, "TypeLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(complexTypeLinkEClass, ComplexTypeLink.class, "ComplexTypeLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComplexTypeLink_Target(), this.getComplexType(), null, "target", null, 0, 1, ComplexTypeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scalarTypeLinkEClass, ScalarTypeLink.class, "ScalarTypeLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScalarTypeLink_Target(), this.getScalarType(), "target", null, 0, 1, ScalarTypeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldOptionsEClass, FieldOptions.class, "FieldOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFieldOptions_Options(), this.getFieldOption(), null, "options", null, 0, -1, FieldOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldOptionEClass, FieldOption.class, "FieldOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFieldOption_Value(), this.getValue(), null, "value", null, 0, 1, FieldOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packedValueFieldOptionEClass, PackedValueFieldOption.class, "PackedValueFieldOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(defaultValueFieldOptionEClass, DefaultValueFieldOption.class, "DefaultValueFieldOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nativeFieldOptionEClass, NativeFieldOption.class, "NativeFieldOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNativeFieldOption_Source(), this.getOptionSource(), null, "source", null, 0, 1, NativeFieldOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionSourceEClass, OptionSource.class, "OptionSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOptionSource_Target(), this.getIndexedElement(), null, "target", null, 0, 1, OptionSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumEClass, protolipse.protobuf.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnum_Name(), ecorePackage.getEString(), "name", null, 0, 1, protolipse.protobuf.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnum_Elements(), this.getEnumElement(), null, "elements", null, 0, -1, protolipse.protobuf.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumElementEClass, EnumElement.class, "EnumElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enumFieldEClass, EnumField.class, "EnumField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumField_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumField_Index(), ecorePackage.getEInt(), "index", null, 0, 1, EnumField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumField_Options(), this.getFieldOption(), null, "options", null, 0, -1, EnumField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getService_Elements(), this.getServiceElement(), null, "elements", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceElementEClass, ServiceElement.class, "ServiceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rpcEClass, Rpc.class, "Rpc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRpc_Name(), ecorePackage.getEString(), "name", null, 0, 1, Rpc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRpc_ArgType(), this.getMessageLink(), null, "argType", null, 0, 1, Rpc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRpc_ReturnType(), this.getMessageLink(), null, "returnType", null, 0, 1, Rpc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRpc_Options(), this.getOption(), null, "options", null, 0, -1, Rpc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageLinkEClass, MessageLink.class, "MessageLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMessageLink_Target(), this.getMessage(), null, "target", null, 0, 1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extendEClass, Extend.class, "Extend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtend_Type(), this.getMessage(), null, "type", null, 0, 1, Extend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtend_Elements(), this.getMessageElement(), null, "elements", null, 0, -1, Extend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(boolEEnum, protolipse.protobuf.BOOL.class, "BOOL");
    addEEnumLiteral(boolEEnum, protolipse.protobuf.BOOL.TRUE);
    addEEnumLiteral(boolEEnum, protolipse.protobuf.BOOL.FALSE);

    initEEnum(modifierEEnum, Modifier.class, "Modifier");
    addEEnumLiteral(modifierEEnum, Modifier.OPTIONAL);
    addEEnumLiteral(modifierEEnum, Modifier.REQUIRED);
    addEEnumLiteral(modifierEEnum, Modifier.REPEATED);

    initEEnum(scalarTypeEEnum, ScalarType.class, "ScalarType");
    addEEnumLiteral(scalarTypeEEnum, ScalarType.INT32);
    addEEnumLiteral(scalarTypeEEnum, ScalarType.INT64);
    addEEnumLiteral(scalarTypeEEnum, ScalarType.UINT32);
    addEEnumLiteral(scalarTypeEEnum, ScalarType.UINT64);
    addEEnumLiteral(scalarTypeEEnum, ScalarType.SINT32);
    addEEnumLiteral(scalarTypeEEnum, ScalarType.SINT64);
    addEEnumLiteral(scalarTypeEEnum, ScalarType.FIXED32);
    addEEnumLiteral(scalarTypeEEnum, ScalarType.FIXED64);
    addEEnumLiteral(scalarTypeEEnum, ScalarType.SFIXED32);
    addEEnumLiteral(scalarTypeEEnum, ScalarType.SFIXED64);
    addEEnumLiteral(scalarTypeEEnum, ScalarType.FLOAT);
    addEEnumLiteral(scalarTypeEEnum, ScalarType.DOUBLE);
    addEEnumLiteral(scalarTypeEEnum, ScalarType.BOOL);
    addEEnumLiteral(scalarTypeEEnum, ScalarType.STRING);
    addEEnumLiteral(scalarTypeEEnum, ScalarType.BYTES);

    // Create resource
    createResource(eNS_URI);
  }

} //ProtobufPackageImpl
