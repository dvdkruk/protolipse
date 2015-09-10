/**
 */
package protolipse.protobuf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.EnumLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getEnumLink()
 * @model
 * @generated
 */
public interface EnumLink extends SimpleValueLink
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(EnumField)
   * @see protolipse.protobuf.ProtobufPackage#getEnumLink_Target()
   * @model
   * @generated
   */
  EnumField getTarget();

  /**
   * Sets the value of the '{@link protolipse.protobuf.EnumLink#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(EnumField value);

} // EnumLink
