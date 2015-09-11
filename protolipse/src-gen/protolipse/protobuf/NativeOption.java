/**
 */
package protolipse.protobuf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Native Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.NativeOption#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getNativeOption()
 * @model
 * @generated
 */
public interface NativeOption extends Option
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(MessageField)
   * @see protolipse.protobuf.ProtobufPackage#getNativeOption_Source()
   * @model
   * @generated
   */
  MessageField getSource();

  /**
   * Sets the value of the '{@link protolipse.protobuf.NativeOption#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(MessageField value);

} // NativeOption
