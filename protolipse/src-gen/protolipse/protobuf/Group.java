/**
 */
package protolipse.protobuf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.Group#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends ExtensibleType, IndexedElement
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link protolipse.protobuf.MessageField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see protolipse.protobuf.ProtobufPackage#getGroup_Elements()
   * @model containment="true"
   * @generated
   */
  EList<MessageField> getElements();

} // Group
