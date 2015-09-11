/**
 */
package protolipse.protobuf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import protolipse.protobuf.ExtensionRange;
import protolipse.protobuf.ProtobufPackage;
import protolipse.protobuf.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.impl.ExtensionRangeImpl#getRanges <em>Ranges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionRangeImpl extends MessageElementImpl implements ExtensionRange
{
  /**
   * The cached value of the '{@link #getRanges() <em>Ranges</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRanges()
   * @generated
   * @ordered
   */
  protected EList<Range> ranges;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtensionRangeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProtobufPackage.Literals.EXTENSION_RANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Range> getRanges()
  {
    if (ranges == null)
    {
      ranges = new EObjectContainmentEList<Range>(Range.class, this, ProtobufPackage.EXTENSION_RANGE__RANGES);
    }
    return ranges;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ProtobufPackage.EXTENSION_RANGE__RANGES:
        return ((InternalEList<?>)getRanges()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ProtobufPackage.EXTENSION_RANGE__RANGES:
        return getRanges();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProtobufPackage.EXTENSION_RANGE__RANGES:
        getRanges().clear();
        getRanges().addAll((Collection<? extends Range>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ProtobufPackage.EXTENSION_RANGE__RANGES:
        getRanges().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ProtobufPackage.EXTENSION_RANGE__RANGES:
        return ranges != null && !ranges.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExtensionRangeImpl
