/**
 */
package protolipse.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Scalar Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see protolipse.protobuf.ProtobufPackage#getScalarType()
 * @model
 * @generated
 */
public enum ScalarType implements Enumerator
{
  /**
   * The '<em><b>Int32</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT32_VALUE
   * @generated
   * @ordered
   */
  INT32(0, "int32", "int32"),

  /**
   * The '<em><b>Int64</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT64_VALUE
   * @generated
   * @ordered
   */
  INT64(1, "int64", "int64"),

  /**
   * The '<em><b>Uint32</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UINT32_VALUE
   * @generated
   * @ordered
   */
  UINT32(2, "uint32", "uint32"),

  /**
   * The '<em><b>Uint64</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UINT64_VALUE
   * @generated
   * @ordered
   */
  UINT64(3, "uint64", "uint64"),

  /**
   * The '<em><b>Sint32</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SINT32_VALUE
   * @generated
   * @ordered
   */
  SINT32(4, "sint32", "sint32"),

  /**
   * The '<em><b>Sint64</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SINT64_VALUE
   * @generated
   * @ordered
   */
  SINT64(5, "sint64", "sint64"),

  /**
   * The '<em><b>Fixed32</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIXED32_VALUE
   * @generated
   * @ordered
   */
  FIXED32(6, "fixed32", "fixed32"),

  /**
   * The '<em><b>Fixed64</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIXED64_VALUE
   * @generated
   * @ordered
   */
  FIXED64(7, "fixed64", "fixed64"),

  /**
   * The '<em><b>Sfixed32</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SFIXED32_VALUE
   * @generated
   * @ordered
   */
  SFIXED32(8, "sfixed32", "sfixed32"),

  /**
   * The '<em><b>Sfixed64</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SFIXED64_VALUE
   * @generated
   * @ordered
   */
  SFIXED64(9, "sfixed64", "sfixed64"),

  /**
   * The '<em><b>Float</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FLOAT_VALUE
   * @generated
   * @ordered
   */
  FLOAT(10, "float", "float"),

  /**
   * The '<em><b>Double</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOUBLE_VALUE
   * @generated
   * @ordered
   */
  DOUBLE(11, "double", "double"),

  /**
   * The '<em><b>Bool</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOL_VALUE
   * @generated
   * @ordered
   */
  BOOL(12, "bool", "bool"),

  /**
   * The '<em><b>String</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(13, "string", "string"),

  /**
   * The '<em><b>Bytes</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BYTES_VALUE
   * @generated
   * @ordered
   */
  BYTES(14, "bytes", "bytes");

  /**
   * The '<em><b>Int32</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Int32</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INT32
   * @model name="int32"
   * @generated
   * @ordered
   */
  public static final int INT32_VALUE = 0;

  /**
   * The '<em><b>Int64</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Int64</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INT64
   * @model name="int64"
   * @generated
   * @ordered
   */
  public static final int INT64_VALUE = 1;

  /**
   * The '<em><b>Uint32</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Uint32</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UINT32
   * @model name="uint32"
   * @generated
   * @ordered
   */
  public static final int UINT32_VALUE = 2;

  /**
   * The '<em><b>Uint64</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Uint64</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UINT64
   * @model name="uint64"
   * @generated
   * @ordered
   */
  public static final int UINT64_VALUE = 3;

  /**
   * The '<em><b>Sint32</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sint32</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SINT32
   * @model name="sint32"
   * @generated
   * @ordered
   */
  public static final int SINT32_VALUE = 4;

  /**
   * The '<em><b>Sint64</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sint64</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SINT64
   * @model name="sint64"
   * @generated
   * @ordered
   */
  public static final int SINT64_VALUE = 5;

  /**
   * The '<em><b>Fixed32</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fixed32</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FIXED32
   * @model name="fixed32"
   * @generated
   * @ordered
   */
  public static final int FIXED32_VALUE = 6;

  /**
   * The '<em><b>Fixed64</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fixed64</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FIXED64
   * @model name="fixed64"
   * @generated
   * @ordered
   */
  public static final int FIXED64_VALUE = 7;

  /**
   * The '<em><b>Sfixed32</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sfixed32</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SFIXED32
   * @model name="sfixed32"
   * @generated
   * @ordered
   */
  public static final int SFIXED32_VALUE = 8;

  /**
   * The '<em><b>Sfixed64</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sfixed64</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SFIXED64
   * @model name="sfixed64"
   * @generated
   * @ordered
   */
  public static final int SFIXED64_VALUE = 9;

  /**
   * The '<em><b>Float</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FLOAT
   * @model name="float"
   * @generated
   * @ordered
   */
  public static final int FLOAT_VALUE = 10;

  /**
   * The '<em><b>Double</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DOUBLE
   * @model name="double"
   * @generated
   * @ordered
   */
  public static final int DOUBLE_VALUE = 11;

  /**
   * The '<em><b>Bool</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Bool</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOOL
   * @model name="bool"
   * @generated
   * @ordered
   */
  public static final int BOOL_VALUE = 12;

  /**
   * The '<em><b>String</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model name="string"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 13;

  /**
   * The '<em><b>Bytes</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Bytes</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BYTES
   * @model name="bytes"
   * @generated
   * @ordered
   */
  public static final int BYTES_VALUE = 14;

  /**
   * An array of all the '<em><b>Scalar Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ScalarType[] VALUES_ARRAY =
    new ScalarType[]
    {
      INT32,
      INT64,
      UINT32,
      UINT64,
      SINT32,
      SINT64,
      FIXED32,
      FIXED64,
      SFIXED32,
      SFIXED64,
      FLOAT,
      DOUBLE,
      BOOL,
      STRING,
      BYTES,
    };

  /**
   * A public read-only list of all the '<em><b>Scalar Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ScalarType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Scalar Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ScalarType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ScalarType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Scalar Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ScalarType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ScalarType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Scalar Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ScalarType get(int value)
  {
    switch (value)
    {
      case INT32_VALUE: return INT32;
      case INT64_VALUE: return INT64;
      case UINT32_VALUE: return UINT32;
      case UINT64_VALUE: return UINT64;
      case SINT32_VALUE: return SINT32;
      case SINT64_VALUE: return SINT64;
      case FIXED32_VALUE: return FIXED32;
      case FIXED64_VALUE: return FIXED64;
      case SFIXED32_VALUE: return SFIXED32;
      case SFIXED64_VALUE: return SFIXED64;
      case FLOAT_VALUE: return FLOAT;
      case DOUBLE_VALUE: return DOUBLE;
      case BOOL_VALUE: return BOOL;
      case STRING_VALUE: return STRING;
      case BYTES_VALUE: return BYTES;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ScalarType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ScalarType
