/**
 */
package protolipse.protobuf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oneof Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.OneofField#getType <em>Type</em>}</li>
 *   <li>{@link protolipse.protobuf.OneofField#getName <em>Name</em>}</li>
 *   <li>{@link protolipse.protobuf.OneofField#getIndex <em>Index</em>}</li>
 *   <li>{@link protolipse.protobuf.OneofField#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getOneofField()
 * @model
 * @generated
 */
public interface OneofField extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeLink)
   * @see protolipse.protobuf.ProtobufPackage#getOneofField_Type()
   * @model containment="true"
   * @generated
   */
  TypeLink getType();

  /**
   * Sets the value of the '{@link protolipse.protobuf.OneofField#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeLink value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see protolipse.protobuf.ProtobufPackage#getOneofField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link protolipse.protobuf.OneofField#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(int)
   * @see protolipse.protobuf.ProtobufPackage#getOneofField_Index()
   * @model
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link protolipse.protobuf.OneofField#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference.
   * @see #setOptions(FieldOptions)
   * @see protolipse.protobuf.ProtobufPackage#getOneofField_Options()
   * @model containment="true"
   * @generated
   */
  FieldOptions getOptions();

  /**
   * Sets the value of the '{@link protolipse.protobuf.OneofField#getOptions <em>Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Options</em>' containment reference.
   * @see #getOptions()
   * @generated
   */
  void setOptions(FieldOptions value);

} // OneofField
