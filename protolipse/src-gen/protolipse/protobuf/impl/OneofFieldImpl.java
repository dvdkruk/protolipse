/**
 */
package protolipse.protobuf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import protolipse.protobuf.FieldOptions;
import protolipse.protobuf.OneofField;
import protolipse.protobuf.ProtobufPackage;
import protolipse.protobuf.TypeLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oneof Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.impl.OneofFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link protolipse.protobuf.impl.OneofFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link protolipse.protobuf.impl.OneofFieldImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link protolipse.protobuf.impl.OneofFieldImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OneofFieldImpl extends MinimalEObjectImpl.Container implements OneofField
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeLink type;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected static final int INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected int index = INDEX_EDEFAULT;

  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected FieldOptions options;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OneofFieldImpl()
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
    return ProtobufPackage.Literals.ONEOF_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeLink getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TypeLink newType, NotificationChain msgs)
  {
    TypeLink oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtobufPackage.ONEOF_FIELD__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeLink newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtobufPackage.ONEOF_FIELD__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtobufPackage.ONEOF_FIELD__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtobufPackage.ONEOF_FIELD__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtobufPackage.ONEOF_FIELD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(int newIndex)
  {
    int oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtobufPackage.ONEOF_FIELD__INDEX, oldIndex, index));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldOptions getOptions()
  {
    return options;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOptions(FieldOptions newOptions, NotificationChain msgs)
  {
    FieldOptions oldOptions = options;
    options = newOptions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtobufPackage.ONEOF_FIELD__OPTIONS, oldOptions, newOptions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptions(FieldOptions newOptions)
  {
    if (newOptions != options)
    {
      NotificationChain msgs = null;
      if (options != null)
        msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtobufPackage.ONEOF_FIELD__OPTIONS, null, msgs);
      if (newOptions != null)
        msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtobufPackage.ONEOF_FIELD__OPTIONS, null, msgs);
      msgs = basicSetOptions(newOptions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtobufPackage.ONEOF_FIELD__OPTIONS, newOptions, newOptions));
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
      case ProtobufPackage.ONEOF_FIELD__TYPE:
        return basicSetType(null, msgs);
      case ProtobufPackage.ONEOF_FIELD__OPTIONS:
        return basicSetOptions(null, msgs);
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
      case ProtobufPackage.ONEOF_FIELD__TYPE:
        return getType();
      case ProtobufPackage.ONEOF_FIELD__NAME:
        return getName();
      case ProtobufPackage.ONEOF_FIELD__INDEX:
        return getIndex();
      case ProtobufPackage.ONEOF_FIELD__OPTIONS:
        return getOptions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProtobufPackage.ONEOF_FIELD__TYPE:
        setType((TypeLink)newValue);
        return;
      case ProtobufPackage.ONEOF_FIELD__NAME:
        setName((String)newValue);
        return;
      case ProtobufPackage.ONEOF_FIELD__INDEX:
        setIndex((Integer)newValue);
        return;
      case ProtobufPackage.ONEOF_FIELD__OPTIONS:
        setOptions((FieldOptions)newValue);
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
      case ProtobufPackage.ONEOF_FIELD__TYPE:
        setType((TypeLink)null);
        return;
      case ProtobufPackage.ONEOF_FIELD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProtobufPackage.ONEOF_FIELD__INDEX:
        setIndex(INDEX_EDEFAULT);
        return;
      case ProtobufPackage.ONEOF_FIELD__OPTIONS:
        setOptions((FieldOptions)null);
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
      case ProtobufPackage.ONEOF_FIELD__TYPE:
        return type != null;
      case ProtobufPackage.ONEOF_FIELD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProtobufPackage.ONEOF_FIELD__INDEX:
        return index != INDEX_EDEFAULT;
      case ProtobufPackage.ONEOF_FIELD__OPTIONS:
        return options != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", index: ");
    result.append(index);
    result.append(')');
    return result.toString();
  }

} //OneofFieldImpl
