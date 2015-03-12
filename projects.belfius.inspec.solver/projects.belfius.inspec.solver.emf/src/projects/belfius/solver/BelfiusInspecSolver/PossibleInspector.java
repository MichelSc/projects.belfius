/**
 */
package projects.belfius.solver.BelfiusInspecSolver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Possible Inspector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.PossibleInspector#getInspector <em>Inspector</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.PossibleInspector#getRank <em>Rank</em>}</li>
 * </ul>
 * </p>
 *
 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getPossibleInspector()
 * @model
 * @generated
 */
public interface PossibleInspector extends EObject {
	/**
	 * Returns the value of the '<em><b>Inspector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inspector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inspector</em>' reference.
	 * @see #setInspector(Inspector)
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getPossibleInspector_Inspector()
	 * @model
	 * @generated
	 */
	Inspector getInspector();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.PossibleInspector#getInspector <em>Inspector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inspector</em>' reference.
	 * @see #getInspector()
	 * @generated
	 */
	void setInspector(Inspector value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(int)
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getPossibleInspector_Rank()
	 * @model
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.PossibleInspector#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

} // PossibleInspector
