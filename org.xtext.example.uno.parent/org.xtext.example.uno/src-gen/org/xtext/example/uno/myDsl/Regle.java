/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.uno.myDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Regle</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.uno.myDsl.MyDslPackage#getRegle()
 * @model
 * @generated
 */
public enum Regle implements Enumerator
{
  /**
   * The '<em><b>Basique</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BASIQUE_VALUE
   * @generated
   * @ordered
   */
  BASIQUE(0, "Basique", "Jouer une carte m\u00eame couleur ou m\u00eame nombre"),

  /**
   * The '<em><b>Carte Identique</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CARTE_IDENTIQUE_VALUE
   * @generated
   * @ordered
   */
  CARTE_IDENTIQUE(1, "CarteIdentique", "Possibilit\u00e9 de jouer 2 cartes identiques simultan\u00e9ment"),

  /**
   * The '<em><b>Suite</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUITE_VALUE
   * @generated
   * @ordered
   */
  SUITE(2, "Suite", "Possibilit\u00e9 de jouer imm\u00e9diatement une carte de m\u00eame couleur"),

  /**
   * The '<em><b>Cumul</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CUMUL_VALUE
   * @generated
   * @ordered
   */
  CUMUL(3, "Cumul", "Possibilit\u00e9 de cumuler la carte +2");

  /**
   * The '<em><b>Basique</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BASIQUE
   * @model name="Basique" literal="Jouer une carte m\352me couleur ou m\352me nombre"
   * @generated
   * @ordered
   */
  public static final int BASIQUE_VALUE = 0;

  /**
   * The '<em><b>Carte Identique</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CARTE_IDENTIQUE
   * @model name="CarteIdentique" literal="Possibilit\351 de jouer 2 cartes identiques simultan\351ment"
   * @generated
   * @ordered
   */
  public static final int CARTE_IDENTIQUE_VALUE = 1;

  /**
   * The '<em><b>Suite</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUITE
   * @model name="Suite" literal="Possibilit\351 de jouer imm\351diatement une carte de m\352me couleur"
   * @generated
   * @ordered
   */
  public static final int SUITE_VALUE = 2;

  /**
   * The '<em><b>Cumul</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CUMUL
   * @model name="Cumul" literal="Possibilit\351 de cumuler la carte +2"
   * @generated
   * @ordered
   */
  public static final int CUMUL_VALUE = 3;

  /**
   * An array of all the '<em><b>Regle</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Regle[] VALUES_ARRAY =
    new Regle[]
    {
      BASIQUE,
      CARTE_IDENTIQUE,
      SUITE,
      CUMUL,
    };

  /**
   * A public read-only list of all the '<em><b>Regle</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Regle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Regle</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Regle get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Regle result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Regle</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Regle getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Regle result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Regle</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Regle get(int value)
  {
    switch (value)
    {
      case BASIQUE_VALUE: return BASIQUE;
      case CARTE_IDENTIQUE_VALUE: return CARTE_IDENTIQUE;
      case SUITE_VALUE: return SUITE;
      case CUMUL_VALUE: return CUMUL;
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
  private Regle(int value, String name, String literal)
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
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
  
} //Regle
