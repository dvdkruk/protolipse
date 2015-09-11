/**
 */
package protolipse.protobuf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.ExtensionRange#getRanges <em>Ranges</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getExtensionRange()
 * @model
 * @generated
 */
public interface ExtensionRange extends MessageElement
{
  /**
   * Returns the value of the '<em><b>Ranges</b></em>' containment reference list.
   * The list contents are of type {@link protolipse.protobuf.Range}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ranges</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ranges</em>' containment reference list.
   * @see protolipse.protobuf.ProtobufPackage#getExtensionRange_Ranges()
   * @model containment="true"
   * @generated
   */
  EList<Range> getRanges();

} // ExtensionRange
