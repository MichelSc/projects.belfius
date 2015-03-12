/**
 */
package projects.belfius.solver.BelfiusInspecSolver;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inspection Time Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getFromLocation <em>From Location</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getToLocation <em>To Location</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getPlannedInspections <em>Planned Inspections</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getFromTime <em>From Time</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getToTime <em>To Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getInspectionTimeWindow()
 * @model
 * @generated
 */
public interface InspectionTimeWindow extends EObject {
	/**
	 * Returns the value of the '<em><b>From Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Location</em>' reference.
	 * @see #setFromLocation(Location)
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getInspectionTimeWindow_FromLocation()
	 * @model
	 * @generated
	 */
	Location getFromLocation();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getFromLocation <em>From Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Location</em>' reference.
	 * @see #getFromLocation()
	 * @generated
	 */
	void setFromLocation(Location value);

	/**
	 * Returns the value of the '<em><b>To Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Location</em>' reference.
	 * @see #setToLocation(Location)
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getInspectionTimeWindow_ToLocation()
	 * @model
	 * @generated
	 */
	Location getToLocation();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getToLocation <em>To Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Location</em>' reference.
	 * @see #getToLocation()
	 * @generated
	 */
	void setToLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Planned Inspections</b></em>' reference list.
	 * The list contents are of type {@link projects.belfius.solver.BelfiusInspecSolver.Inspection}.
	 * It is bidirectional and its opposite is '{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getPlannedInspector <em>Planned Inspector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planned Inspections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Inspections</em>' reference list.
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getInspectionTimeWindow_PlannedInspections()
	 * @see projects.belfius.solver.BelfiusInspecSolver.Inspection#getPlannedInspector
	 * @model opposite="PlannedInspector"
	 * @generated
	 */
	EList<Inspection> getPlannedInspections();

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
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getInspectionTimeWindow_FromTime()
	 * @model
	 * @generated
	 */
	Date getFromTime();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getFromTime <em>From Time</em>}' attribute.
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
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getInspectionTimeWindow_ToTime()
	 * @model
	 * @generated
	 */
	Date getToTime();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getToTime <em>To Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Time</em>' attribute.
	 * @see #getToTime()
	 * @generated
	 */
	void setToTime(Date value);

} // InspectionTimeWindow
