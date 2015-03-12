/**
 */
package projects.belfius.solver.BelfiusInspecSolver.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projects.belfius.solver.BelfiusInspecSolver.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BelfiusInspecSolverFactoryImpl extends EFactoryImpl implements BelfiusInspecSolverFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BelfiusInspecSolverFactory init() {
		try {
			BelfiusInspecSolverFactory theBelfiusInspecSolverFactory = (BelfiusInspecSolverFactory)EPackage.Registry.INSTANCE.getEFactory(BelfiusInspecSolverPackage.eNS_URI);
			if (theBelfiusInspecSolverFactory != null) {
				return theBelfiusInspecSolverFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BelfiusInspecSolverFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BelfiusInspecSolverFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BelfiusInspecSolverPackage.DOMAIN: return createDomain();
			case BelfiusInspecSolverPackage.INSPECTOR: return createInspector();
			case BelfiusInspecSolverPackage.INSPECTION: return createInspection();
			case BelfiusInspecSolverPackage.VISIT_TIME_WINDOW: return createVisitTimeWindow();
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW: return createInspectionTimeWindow();
			case BelfiusInspecSolverPackage.LOCATION: return createLocation();
			case BelfiusInspecSolverPackage.POSSIBLE_INSPECTOR: return createPossibleInspector();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inspector createInspector() {
		InspectorImpl inspector = new InspectorImpl();
		return inspector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inspection createInspection() {
		InspectionImpl inspection = new InspectionImpl();
		return inspection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisitTimeWindow createVisitTimeWindow() {
		VisitTimeWindowImpl visitTimeWindow = new VisitTimeWindowImpl();
		return visitTimeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InspectionTimeWindow createInspectionTimeWindow() {
		InspectionTimeWindowImpl inspectionTimeWindow = new InspectionTimeWindowImpl();
		return inspectionTimeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibleInspector createPossibleInspector() {
		PossibleInspectorImpl possibleInspector = new PossibleInspectorImpl();
		return possibleInspector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BelfiusInspecSolverPackage getBelfiusInspecSolverPackage() {
		return (BelfiusInspecSolverPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BelfiusInspecSolverPackage getPackage() {
		return BelfiusInspecSolverPackage.eINSTANCE;
	}

} //BelfiusInspecSolverFactoryImpl
