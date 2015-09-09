/**
 */
package protolipse.protobuf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.IntLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getIntLink()
 * @model
 * @generated
 */
public interface IntLink extends NumberLink
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(int)
   * @see protolipse.protobuf.ProtobufPackage#getIntLink_Target()
   * @model
   * @generated
   */
  int getTarget();

  /**
   * Sets the value of the '{@link protolipse.protobuf.IntLink#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(int value);

} // IntLink
