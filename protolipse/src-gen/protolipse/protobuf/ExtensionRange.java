/**
 */
package protolipse.protobuf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.ExtensionRange#getFrom <em>From</em>}</li>
 *   <li>{@link protolipse.protobuf.ExtensionRange#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getExtensionRange()
 * @model
 * @generated
 */
public interface ExtensionRange extends MessageElement
{
  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(int)
   * @see protolipse.protobuf.ProtobufPackage#getExtensionRange_From()
   * @model
   * @generated
   */
  int getFrom();

  /**
   * Sets the value of the '{@link protolipse.protobuf.ExtensionRange#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(int value);

  /**
   * Returns the value of the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' attribute.
   * @see #setTo(int)
   * @see protolipse.protobuf.ProtobufPackage#getExtensionRange_To()
   * @model
   * @generated
   */
  int getTo();

  /**
   * Sets the value of the '{@link protolipse.protobuf.ExtensionRange#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see #getTo()
   * @generated
   */
  void setTo(int value);

} // ExtensionRange
