/**
 */
package projects.belfius.solver.BelfiusInspecSolver;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage
 * @generated
 */
public interface BelfiusInspecSolverFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BelfiusInspecSolverFactory eINSTANCE = projects.belfius.solver.BelfiusInspecSolver.impl.BelfiusInspecSolverFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>Inspector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inspector</em>'.
	 * @generated
	 */
	Inspector createInspector();

	/**
	 * Returns a new object of class '<em>Inspection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inspection</em>'.
	 * @generated
	 */
	Inspection createInspection();

	/**
	 * Returns a new object of class '<em>Visit Time Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visit Time Window</em>'.
	 * @generated
	 */
	VisitTimeWindow createVisitTimeWindow();

	/**
	 * Returns a new object of class '<em>Inspection Time Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inspection Time Window</em>'.
	 * @generated
	 */
	InspectionTimeWindow createInspectionTimeWindow();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Possible Inspector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Possible Inspector</em>'.
	 * @generated
	 */
	PossibleInspector createPossibleInspector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BelfiusInspecSolverPackage getBelfiusInspecSolverPackage();

} //BelfiusInspecSolverFactory
