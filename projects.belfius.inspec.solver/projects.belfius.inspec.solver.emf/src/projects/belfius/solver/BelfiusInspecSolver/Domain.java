/**
 */
package projects.belfius.solver.BelfiusInspecSolver;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.Domain#getInspectors <em>Inspectors</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.Domain#getInspections <em>Inspections</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.Domain#getLocations <em>Locations</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.Domain#getSubDomains <em>Sub Domains</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.Domain#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Inspectors</b></em>' containment reference list.
	 * The list contents are of type {@link projects.belfius.solver.BelfiusInspecSolver.Inspector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inspectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inspectors</em>' containment reference list.
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getDomain_Inspectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inspector> getInspectors();

	/**
	 * Returns the value of the '<em><b>Inspections</b></em>' containment reference list.
	 * The list contents are of type {@link projects.belfius.solver.BelfiusInspecSolver.Inspection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inspections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inspections</em>' containment reference list.
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getDomain_Inspections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inspection> getInspections();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link projects.belfius.solver.BelfiusInspecSolver.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getDomain_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Sub Domains</b></em>' containment reference list.
	 * The list contents are of type {@link projects.belfius.solver.BelfiusInspecSolver.Domain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Domains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Domains</em>' containment reference list.
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getDomain_SubDomains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Domain> getSubDomains();

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
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getDomain_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.Domain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Domain
