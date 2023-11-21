/**
 * generated by Xtext 2.32.0
 */
package persons.tasks.taskDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link persons.tasks.taskDSL.Planning#getName <em>Name</em>}</li>
 *   <li>{@link persons.tasks.taskDSL.Planning#isAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link persons.tasks.taskDSL.Planning#getPersons <em>Persons</em>}</li>
 *   <li>{@link persons.tasks.taskDSL.Planning#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see persons.tasks.taskDSL.TaskDSLPackage#getPlanning()
 * @model
 * @generated
 */
public interface Planning extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see persons.tasks.taskDSL.TaskDSLPackage#getPlanning_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link persons.tasks.taskDSL.Planning#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Anonymous</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anonymous</em>' attribute.
   * @see #setAnonymous(boolean)
   * @see persons.tasks.taskDSL.TaskDSLPackage#getPlanning_Anonymous()
   * @model
   * @generated
   */
  boolean isAnonymous();

  /**
   * Sets the value of the '{@link persons.tasks.taskDSL.Planning#isAnonymous <em>Anonymous</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anonymous</em>' attribute.
   * @see #isAnonymous()
   * @generated
   */
  void setAnonymous(boolean value);

  /**
   * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
   * The list contents are of type {@link persons.tasks.taskDSL.Person}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persons</em>' containment reference list.
   * @see persons.tasks.taskDSL.TaskDSLPackage#getPlanning_Persons()
   * @model containment="true"
   * @generated
   */
  EList<Person> getPersons();

  /**
   * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
   * The list contents are of type {@link persons.tasks.taskDSL.Task}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks</em>' containment reference list.
   * @see persons.tasks.taskDSL.TaskDSLPackage#getPlanning_Tasks()
   * @model containment="true"
   * @generated
   */
  EList<Task> getTasks();

} // Planning
