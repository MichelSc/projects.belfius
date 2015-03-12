/**
 */
package projects.belfius.solver.BelfiusInspecSolver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.Location#getName <em>Name</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.Location#getCoordinateX <em>Coordinate X</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.Location#getCoordinateY <em>Coordinate Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
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
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getLocation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.Location#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Coordinate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate X</em>' attribute.
	 * @see #setCoordinateX(float)
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getLocation_CoordinateX()
	 * @model
	 * @generated
	 */
	float getCoordinateX();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.Location#getCoordinateX <em>Coordinate X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate X</em>' attribute.
	 * @see #getCoordinateX()
	 * @generated
	 */
	void setCoordinateX(float value);

	/**
	 * Returns the value of the '<em><b>Coordinate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate Y</em>' attribute.
	 * @see #setCoordinateY(float)
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#getLocation_CoordinateY()
	 * @model
	 * @generated
	 */
	float getCoordinateY();

	/**
	 * Sets the value of the '{@link projects.belfius.solver.BelfiusInspecSolver.Location#getCoordinateY <em>Coordinate Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate Y</em>' attribute.
	 * @see #getCoordinateY()
	 * @generated
	 */
	void setCoordinateY(float value);

} // Location
