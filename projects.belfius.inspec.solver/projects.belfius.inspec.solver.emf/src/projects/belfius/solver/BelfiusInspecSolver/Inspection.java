/**
 */
package projects.belfius.solver.BelfiusInspecSolver;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inspection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getVisitTimeWindows <em>Visit Time Windows</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getPossibleInspectors <em>Possible Inspectors</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getVisitLocation <em>Visit Location</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getPlannedInspector <em>Planned Inspector</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getName <em>Name</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getPlannedVisitTime <em>Planned Visit Time</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getVisitDuration <em>Visit Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getInspection()
 * @model
 * @generated
 */
public interface Inspection extends EObject {
	/**
	 * Returns the value of the '<em><b>Visit Time Windows</b></em>' containment reference list.
	 * The list contents are of type {@link projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visit Time Windows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit Time Windows</em>' containment reference list.
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getInspection_VisitTimeWindows()
	 * @model containment="true"
	 * @generated
	 */
	EList<VisitTimeWindow> getVisitTimeWindows();

	/**
	 * Returns the value of the '<em><b>Possible Inspectors</b></em>' containment reference list.
	 * The list contents are of type {@link projects.belfius.solver.BelfiusInspecSolver.PossibleInspector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible Inspectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Inspectors</em>' containment reference list.
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getInspection_PossibleInspectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<PossibleInspector> getPossibleInspectors();

	/**
	 * Returns the value of the '<em><b>Visit Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visit Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit Location</em>' reference.
	 * @see #setVisitLocation(Location)
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getInspection_VisitLocation()
	 * @model
	 * @generated
	 */
	Location getVisitLocation();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getVisitLocation <em>Visit Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit Location</em>' reference.
	 * @see #getVisitLocation()
	 * @generated
	 */
	void setVisitLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Planned Inspector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getPlannedInspections <em>Planned Inspections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planned Inspector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Inspector</em>' reference.
	 * @see #setPlannedInspector(InspectionTimeWindow)
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getInspection_PlannedInspector()
	 * @see projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getPlannedInspections
	 * @model opposite="PlannedInspections" required="true"
	 * @generated
	 */
	InspectionTimeWindow getPlannedInspector();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getPlannedInspector <em>Planned Inspector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Inspector</em>' reference.
	 * @see #getPlannedInspector()
	 * @generated
	 */
	void setPlannedInspector(InspectionTimeWindow value);

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
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getInspection_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Planned Visit Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planned Visit Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Visit Time</em>' attribute.
	 * @see #setPlannedVisitTime(Date)
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getInspection_PlannedVisitTime()
	 * @model
	 * @generated
	 */
	Date getPlannedVisitTime();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getPlannedVisitTime <em>Planned Visit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Visit Time</em>' attribute.
	 * @see #getPlannedVisitTime()
	 * @generated
	 */
	void setPlannedVisitTime(Date value);

	/**
	 * Returns the value of the '<em><b>Visit Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visit Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit Duration</em>' attribute.
	 * @see #setVisitDuration(float)
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getInspection_VisitDuration()
	 * @model
	 * @generated
	 */
	float getVisitDuration();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getVisitDuration <em>Visit Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit Duration</em>' attribute.
	 * @see #getVisitDuration()
	 * @generated
	 */
	void setVisitDuration(float value);

} // Inspection
