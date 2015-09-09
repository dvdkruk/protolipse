/**
 */
package protolipse.protobuf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.MessageField#getType <em>Type</em>}</li>
 *   <li>{@link protolipse.protobuf.MessageField#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getMessageField()
 * @model
 * @generated
 */
public interface MessageField extends IndexedElement
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
   * @see protolipse.protobuf.ProtobufPackage#getMessageField_Type()
   * @model containment="true"
   * @generated
   */
  TypeLink getType();

  /**
   * Sets the value of the '{@link protolipse.protobuf.MessageField#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeLink value);

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
   * @see protolipse.protobuf.ProtobufPackage#getMessageField_Options()
   * @model containment="true"
   * @generated
   */
  FieldOptions getOptions();

  /**
   * Sets the value of the '{@link protolipse.protobuf.MessageField#getOptions <em>Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Options</em>' containment reference.
   * @see #getOptions()
   * @generated
   */
  void setOptions(FieldOptions value);

} // MessageField
