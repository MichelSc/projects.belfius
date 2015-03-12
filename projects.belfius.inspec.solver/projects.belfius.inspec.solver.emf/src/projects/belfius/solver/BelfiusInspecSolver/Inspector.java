/**
 */
package projects.belfius.solver.BelfiusInspecSolver;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inspector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.Inspector#getInspectionTimeWindows <em>Inspection Time Windows</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.Inspector#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getInspector()
 * @model
 * @generated
 */
public interface Inspector extends EObject {
	/**
	 * Returns the value of the '<em><b>Inspection Time Windows</b></em>' containment reference list.
	 * The list contents are of type {@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inspection Time Windows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inspection Time Windows</em>' containment reference list.
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getInspector_InspectionTimeWindows()
	 * @model containment="true"
	 * @generated
	 */
	EList<InspectionTimeWindow> getInspectionTimeWindows();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getInspector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.Inspector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Inspector
