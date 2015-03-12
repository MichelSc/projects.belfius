/**
 */
package projects.belfius.solver.BelfiusInspecSolver;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visit Time Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow#getFromTime <em>From Time</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow#getToTime <em>To Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getVisitTimeWindow()
 * @model
 * @generated
 */
public interface VisitTimeWindow extends EObject {
	/**
	 * Returns the value of the '<em><b>From Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Time</em>' attribute.
	 * @see #setFromTime(Date)
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getVisitTimeWindow_FromTime()
	 * @model
	 * @generated
	 */
	Date getFromTime();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow#getFromTime <em>From Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Time</em>' attribute.
	 * @see #getFromTime()
	 * @generated
	 */
	void setFromTime(Date value);

	/**
	 * Returns the value of the '<em><b>To Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Time</em>' attribute.
	 * @see #setToTime(Date)
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getVisitTimeWindow_ToTime()
	 * @model
	 * @generated
	 */
	Date getToTime();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow#getToTime <em>To Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Time</em>' attribute.
	 * @see #getToTime()
	 * @generated
	 */
	void setToTime(Date value);

} // VisitTimeWindow
