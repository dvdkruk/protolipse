/**
 */
package protolipse.protobuf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Native Field Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.NativeFieldOption#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getNativeFieldOption()
 * @model
 * @generated
 */
public interface NativeFieldOption extends FieldOption
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(OptionSource)
   * @see protolipse.protobuf.ProtobufPackage#getNativeFieldOption_Source()
   * @model containment="true"
   * @generated
   */
  OptionSource getSource();

  /**
   * Sets the value of the '{@link protolipse.protobuf.NativeFieldOption#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(OptionSource value);

} // NativeFieldOption
