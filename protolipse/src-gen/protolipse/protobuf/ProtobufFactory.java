/**
 */
package protolipse.protobuf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see protolipse.protobuf.ProtobufPackage
 * @generated
 */
public interface ProtobufFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProtobufFactory eINSTANCE = protolipse.protobuf.impl.ProtobufFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Proto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Proto</em>'.
   * @generated
   */
  Proto createProto();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Syntax</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Syntax</em>'.
   * @generated
   */
  Syntax createSyntax();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  Package createPackage();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option</em>'.
   * @generated
   */
  Option createOption();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>Simple Value Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Value Link</em>'.
   * @generated
   */
  SimpleValueLink createSimpleValueLink();

  /**
   * Returns a new object of class '<em>Enum Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Link</em>'.
   * @generated
   */
  EnumLink createEnumLink();

  /**
   * Returns a new object of class '<em>String Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Link</em>'.
   * @generated
   */
  StringLink createStringLink();

  /**
   * Returns a new object of class '<em>Boolean Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Link</em>'.
   * @generated
   */
  BooleanLink createBooleanLink();

  /**
   * Returns a new object of class '<em>Number Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Link</em>'.
   * @generated
   */
  NumberLink createNumberLink();

  /**
   * Returns a new object of class '<em>Int Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Link</em>'.
   * @generated
   */
  IntLink createIntLink();

  /**
   * Returns a new object of class '<em>Double Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Double Link</em>'.
   * @generated
   */
  DoubleLink createDoubleLink();

  /**
   * Returns a new object of class '<em>Complex Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Type</em>'.
   * @generated
   */
  ComplexType createComplexType();

  /**
   * Returns a new object of class '<em>Extensible Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extensible Type</em>'.
   * @generated
   */
  ExtensibleType createExtensibleType();

  /**
   * Returns a new object of class '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message</em>'.
   * @generated
   */
  Message createMessage();

  /**
   * Returns a new object of class '<em>Message Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Element</em>'.
   * @generated
   */
  MessageElement createMessageElement();

  /**
   * Returns a new object of class '<em>Indexed Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indexed Element</em>'.
   * @generated
   */
  IndexedElement createIndexedElement();

  /**
   * Returns a new object of class '<em>Extension Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extension Range</em>'.
   * @generated
   */
  ExtensionRange createExtensionRange();

  /**
   * Returns a new object of class '<em>Message Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Field</em>'.
   * @generated
   */
  MessageField createMessageField();

  /**
   * Returns a new object of class '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group</em>'.
   * @generated
   */
  Group createGroup();

  /**
   * Returns a new object of class '<em>Type Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Link</em>'.
   * @generated
   */
  TypeLink createTypeLink();

  /**
   * Returns a new object of class '<em>Complex Type Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Type Link</em>'.
   * @generated
   */
  ComplexTypeLink createComplexTypeLink();

  /**
   * Returns a new object of class '<em>Scalar Type Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scalar Type Link</em>'.
   * @generated
   */
  ScalarTypeLink createScalarTypeLink();

  /**
   * Returns a new object of class '<em>Field Options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Options</em>'.
   * @generated
   */
  FieldOptions createFieldOptions();

  /**
   * Returns a new object of class '<em>Field Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Option</em>'.
   * @generated
   */
  FieldOption createFieldOption();

  /**
   * Returns a new object of class '<em>Default Value Field Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Value Field Option</em>'.
   * @generated
   */
  DefaultValueFieldOption createDefaultValueFieldOption();

  /**
   * Returns a new object of class '<em>Native Field Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Native Field Option</em>'.
   * @generated
   */
  NativeFieldOption createNativeFieldOption();

  /**
   * Returns a new object of class '<em>Option Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option Source</em>'.
   * @generated
   */
  OptionSource createOptionSource();

  /**
   * Returns a new object of class '<em>Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum</em>'.
   * @generated
   */
  Enum createEnum();

  /**
   * Returns a new object of class '<em>Enum Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Element</em>'.
   * @generated
   */
  EnumElement createEnumElement();

  /**
   * Returns a new object of class '<em>Enum Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Field</em>'.
   * @generated
   */
  EnumField createEnumField();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>Service Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Element</em>'.
   * @generated
   */
  ServiceElement createServiceElement();

  /**
   * Returns a new object of class '<em>Rpc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rpc</em>'.
   * @generated
   */
  Rpc createRpc();

  /**
   * Returns a new object of class '<em>Message Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Link</em>'.
   * @generated
   */
  MessageLink createMessageLink();

  /**
   * Returns a new object of class '<em>Extend</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extend</em>'.
   * @generated
   */
  Extend createExtend();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ProtobufPackage getProtobufPackage();

} //ProtobufFactory
