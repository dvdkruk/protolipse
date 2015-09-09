/**
 */
package protolipse.protobuf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.OptionSource#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getOptionSource()
 * @model
 * @generated
 */
public interface OptionSource extends EObject
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
   * @see #setTarget(IndexedElement)
   * @see protolipse.protobuf.ProtobufPackage#getOptionSource_Target()
   * @model
   * @generated
   */
  IndexedElement getTarget();

  /**
   * Sets the value of the '{@link protolipse.protobuf.OptionSource#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(IndexedElement value);

} // OptionSource
