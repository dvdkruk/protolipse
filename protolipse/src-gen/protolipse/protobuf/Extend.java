/**
 */
package protolipse.protobuf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.Extend#getType <em>Type</em>}</li>
 *   <li>{@link protolipse.protobuf.Extend#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getExtend()
 * @model
 * @generated
 */
public interface Extend extends Statement, MessageElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Message)
   * @see protolipse.protobuf.ProtobufPackage#getExtend_Type()
   * @model
   * @generated
   */
  Message getType();

  /**
   * Sets the value of the '{@link protolipse.protobuf.Extend#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Message value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link protolipse.protobuf.MessageElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see protolipse.protobuf.ProtobufPackage#getExtend_Elements()
   * @model containment="true"
   * @generated
   */
  EList<MessageElement> getElements();

} // Extend
