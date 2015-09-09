/**
 */
package protolipse.protobuf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.FieldOptions#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getFieldOptions()
 * @model
 * @generated
 */
public interface FieldOptions extends EObject
{
  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link protolipse.protobuf.FieldOption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see protolipse.protobuf.ProtobufPackage#getFieldOptions_Options()
   * @model containment="true"
   * @generated
   */
  EList<FieldOption> getOptions();

} // FieldOptions
