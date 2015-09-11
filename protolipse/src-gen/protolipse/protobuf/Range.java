/**
 */
package protolipse.protobuf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.Range#getFrom <em>From</em>}</li>
 *   <li>{@link protolipse.protobuf.Range#getTo <em>To</em>}</li>
 *   <li>{@link protolipse.protobuf.Range#isMax <em>Max</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends EObject
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
   * @see protolipse.protobuf.ProtobufPackage#getRange_From()
   * @model
   * @generated
   */
  int getFrom();

  /**
   * Sets the value of the '{@link protolipse.protobuf.Range#getFrom <em>From</em>}' attribute.
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
   * @see protolipse.protobuf.ProtobufPackage#getRange_To()
   * @model
   * @generated
   */
  int getTo();

  /**
   * Sets the value of the '{@link protolipse.protobuf.Range#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see #getTo()
   * @generated
   */
  void setTo(int value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(boolean)
   * @see protolipse.protobuf.ProtobufPackage#getRange_Max()
   * @model
   * @generated
   */
  boolean isMax();

  /**
   * Sets the value of the '{@link protolipse.protobuf.Range#isMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #isMax()
   * @generated
   */
  void setMax(boolean value);

} // Range
