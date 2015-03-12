/**
 */
package projects.belfius.solver.BelfiusInspecSolver.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import projects.belfius.solver.BelfiusInspecSolver.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage
 * @generated
 */
public class BelfiusInspecSolverAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BelfiusInspecSolverPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BelfiusInspecSolverAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BelfiusInspecSolverPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BelfiusInspecSolverSwitch<Adapter> modelSwitch =
		new BelfiusInspecSolverSwitch<Adapter>() {
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseInspector(Inspector object) {
				return createInspectorAdapter();
			}
			@Override
			public Adapter caseInspection(Inspection object) {
				return createInspectionAdapter();
			}
			@Override
			public Adapter caseVisitTimeWindow(VisitTimeWindow object) {
				return createVisitTimeWindowAdapter();
			}
			@Override
			public Adapter caseInspectionTimeWindow(InspectionTimeWindow object) {
				return createInspectionTimeWindowAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter casePossibleInspector(PossibleInspector object) {
				return createPossibleInspectorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link projects.belfius.solver.BelfiusInspecSolver.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projects.belfius.solver.BelfiusInspecSolver.Inspector <em>Inspector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Inspector
	 * @generated
	 */
	public Adapter createInspectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projects.belfius.solver.BelfiusInspecSolver.Inspection <em>Inspection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Inspection
	 * @generated
	 */
	public Adapter createInspectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow <em>Visit Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow
	 * @generated
	 */
	public Adapter createVisitTimeWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow <em>Inspection Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow
	 * @generated
	 */
	public Adapter createInspectionTimeWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projects.belfius.solver.BelfiusInspecSolver.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projects.belfius.solver.BelfiusInspecSolver.PossibleInspector <em>Possible Inspector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projects.belfius.solver.BelfiusInspecSolver.PossibleInspector
	 * @generated
	 */
	public Adapter createPossibleInspectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BelfiusInspecSolverAdapterFactory
