/**
 */
package projects.belfius.solver.BelfiusInspecSolver;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverFactory
 * @model kind="package"
 * @generated
 */
public interface BelfiusInspecSolverPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BelfiusInspecSolver";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:/www.misc.com/projects.belfius.solver";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BelfiusInspecSolver";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BelfiusInspecSolverPackage eINSTANCE = projects.belfius.solver.BelfiusInspecSolver.impl.BelfiusInspecSolverPackageImpl.init();

	/**
	 * The meta object id for the '{@link projects.belfius.solver.BelfiusInspecSolver.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projects.belfius.solver.BelfiusInspecSolver.impl.DomainImpl
	 * @see projects.belfius.solver.BelfiusInspecSolver.impl.BelfiusInspecSolverPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Inspectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__INSPECTORS = 0;

	/**
	 * The feature id for the '<em><b>Inspections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__INSPECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LOCATIONS = 2;

	/**
	 * The feature id for the '<em><b>Sub Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SUB_DOMAINS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = 4;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectorImpl <em>Inspector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projects.belfius.solver.BelfiusInspecSolver.impl.InspectorImpl
	 * @see projects.belfius.solver.BelfiusInspecSolver.impl.BelfiusInspecSolverPackageImpl#getInspector()
	 * @generated
	 */
	int INSPECTOR = 1;

	/**
	 * The feature id for the '<em><b>Inspection Time Windows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTOR__INSPECTION_TIME_WINDOWS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTOR__NAME = 1;

	/**
	 * The number of structural features of the '<em>Inspector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Inspector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectionImpl <em>Inspection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projects.belfius.solver.BelfiusInspecSolver.impl.InspectionImpl
	 * @see projects.belfius.solver.BelfiusInspecSolver.impl.BelfiusInspecSolverPackageImpl#getInspection()
	 * @generated
	 */
	int INSPECTION = 2;

	/**
	 * The feature id for the '<em><b>Visit Time Windows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION__VISIT_TIME_WINDOWS = 0;

	/**
	 * The feature id for the '<em><b>Possible Inspectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION__POSSIBLE_INSPECTORS = 1;

	/**
	 * The feature id for the '<em><b>Visit Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION__VISIT_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Planned Inspector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION__PLANNED_INSPECTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION__NAME = 4;

	/**
	 * The feature id for the '<em><b>Planned Visit Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION__PLANNED_VISIT_TIME = 5;

	/**
	 * The feature id for the '<em><b>Visit Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION__VISIT_DURATION = 6;

	/**
	 * The number of structural features of the '<em>Inspection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Inspection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projects.belfius.solver.BelfiusInspecSolver.impl.VisitTimeWindowImpl <em>Visit Time Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projects.belfius.solver.BelfiusInspecSolver.impl.VisitTimeWindowImpl
	 * @see projects.belfius.solver.BelfiusInspecSolver.impl.BelfiusInspecSolverPackageImpl#getVisitTimeWindow()
	 * @generated
	 */
	int VISIT_TIME_WINDOW = 3;

	/**
	 * The feature id for the '<em><b>From Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT_TIME_WINDOW__FROM_TIME = 0;

	/**
	 * The feature id for the '<em><b>To Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT_TIME_WINDOW__TO_TIME = 1;

	/**
	 * The number of structural features of the '<em>Visit Time Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT_TIME_WINDOW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Visit Time Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT_TIME_WINDOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectionTimeWindowImpl <em>Inspection Time Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projects.belfius.solver.BelfiusInspecSolver.impl.InspectionTimeWindowImpl
	 * @see projects.belfius.solver.BelfiusInspecSolver.impl.BelfiusInspecSolverPackageImpl#getInspectionTimeWindow()
	 * @generated
	 */
	int INSPECTION_TIME_WINDOW = 4;

	/**
	 * The feature id for the '<em><b>From Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_TIME_WINDOW__FROM_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>To Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_TIME_WINDOW__TO_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Planned Inspections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_TIME_WINDOW__PLANNED_INSPECTIONS = 2;

	/**
	 * The feature id for the '<em><b>From Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_TIME_WINDOW__FROM_TIME = 3;

	/**
	 * The feature id for the '<em><b>To Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_TIME_WINDOW__TO_TIME = 4;

	/**
	 * The number of structural features of the '<em>Inspection Time Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_TIME_WINDOW_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Inspection Time Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_TIME_WINDOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projects.belfius.solver.BelfiusInspecSolver.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projects.belfius.solver.BelfiusInspecSolver.impl.LocationImpl
	 * @see projects.belfius.solver.BelfiusInspecSolver.impl.BelfiusInspecSolverPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Coordinate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COORDINATE_X = 1;

	/**
	 * The feature id for the '<em><b>Coordinate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COORDINATE_Y = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projects.belfius.solver.BelfiusInspecSolver.impl.PossibleInspectorImpl <em>Possible Inspector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projects.belfius.solver.BelfiusInspecSolver.impl.PossibleInspectorImpl
	 * @see projects.belfius.solver.BelfiusInspecSolver.impl.BelfiusInspecSolverPackageImpl#getPossibleInspector()
	 * @generated
	 */
	int POSSIBLE_INSPECTOR = 6;

	/**
	 * The feature id for the '<em><b>Inspector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_INSPECTOR__INSPECTOR = 0;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_INSPECTOR__RANK = 1;

	/**
	 * The number of structural features of the '<em>Possible Inspector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_INSPECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Possible Inspector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_INSPECTOR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link projects.belfius.solver.BelfiusInspecSolver.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link projects.belfius.solver.BelfiusInspecSolver.Domain#getInspectors <em>Inspectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inspectors</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Domain#getInspectors()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Inspectors();

	/**
	 * Returns the meta object for the containment reference list '{@link projects.belfius.solver.BelfiusInspecSolver.Domain#getInspections <em>Inspections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inspections</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Domain#getInspections()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Inspections();

	/**
	 * Returns the meta object for the containment reference list '{@link projects.belfius.solver.BelfiusInspecSolver.Domain#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Domain#getLocations()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link projects.belfius.solver.BelfiusInspecSolver.Domain#getSubDomains <em>Sub Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Domains</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Domain#getSubDomains()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_SubDomains();

	/**
	 * Returns the meta object for the attribute '{@link projects.belfius.solver.BelfiusInspecSolver.Domain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Domain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for class '{@link projects.belfius.solver.BelfiusInspecSolver.Inspector <em>Inspector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inspector</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Inspector
	 * @generated
	 */
	EClass getInspector();

	/**
	 * Returns the meta object for the containment reference list '{@link projects.belfius.solver.BelfiusInspecSolver.Inspector#getInspectionTimeWindows <em>Inspection Time Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inspection Time Windows</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Inspector#getInspectionTimeWindows()
	 * @see #getInspector()
	 * @generated
	 */
	EReference getInspector_InspectionTimeWindows();

	/**
	 * Returns the meta object for the attribute '{@link projects.belfius.solver.BelfiusInspecSolver.Inspector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Inspector#getName()
	 * @see #getInspector()
	 * @generated
	 */
	EAttribute getInspector_Name();

	/**
	 * Returns the meta object for class '{@link projects.belfius.solver.BelfiusInspecSolver.Inspection <em>Inspection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inspection</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Inspection
	 * @generated
	 */
	EClass getInspection();

	/**
	 * Returns the meta object for the containment reference list '{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getVisitTimeWindows <em>Visit Time Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visit Time Windows</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Inspection#getVisitTimeWindows()
	 * @see #getInspection()
	 * @generated
	 */
	EReference getInspection_VisitTimeWindows();

	/**
	 * Returns the meta object for the containment reference list '{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getPossibleInspectors <em>Possible Inspectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Possible Inspectors</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Inspection#getPossibleInspectors()
	 * @see #getInspection()
	 * @generated
	 */
	EReference getInspection_PossibleInspectors();

	/**
	 * Returns the meta object for the reference '{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getVisitLocation <em>Visit Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visit Location</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Inspection#getVisitLocation()
	 * @see #getInspection()
	 * @generated
	 */
	EReference getInspection_VisitLocation();

	/**
	 * Returns the meta object for the reference '{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getPlannedInspector <em>Planned Inspector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Planned Inspector</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Inspection#getPlannedInspector()
	 * @see #getInspection()
	 * @generated
	 */
	EReference getInspection_PlannedInspector();

	/**
	 * Returns the meta object for the attribute '{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Inspection#getName()
	 * @see #getInspection()
	 * @generated
	 */
	EAttribute getInspection_Name();

	/**
	 * Returns the meta object for the attribute '{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getPlannedVisitTime <em>Planned Visit Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Planned Visit Time</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Inspection#getPlannedVisitTime()
	 * @see #getInspection()
	 * @generated
	 */
	EAttribute getInspection_PlannedVisitTime();

	/**
	 * Returns the meta object for the attribute '{@link projects.belfius.solver.BelfiusInspecSolver.Inspection#getVisitDuration <em>Visit Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visit Duration</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Inspection#getVisitDuration()
	 * @see #getInspection()
	 * @generated
	 */
	EAttribute getInspection_VisitDuration();

	/**
	 * Returns the meta object for class '{@link projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow <em>Visit Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visit Time Window</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow
	 * @generated
	 */
	EClass getVisitTimeWindow();

	/**
	 * Returns the meta object for the attribute '{@link projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow#getFromTime <em>From Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Time</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow#getFromTime()
	 * @see #getVisitTimeWindow()
	 * @generated
	 */
	EAttribute getVisitTimeWindow_FromTime();

	/**
	 * Returns the meta object for the attribute '{@link projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow#getToTime <em>To Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Time</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow#getToTime()
	 * @see #getVisitTimeWindow()
	 * @generated
	 */
	EAttribute getVisitTimeWindow_ToTime();

	/**
	 * Returns the meta object for class '{@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow <em>Inspection Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inspection Time Window</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow
	 * @generated
	 */
	EClass getInspectionTimeWindow();

	/**
	 * Returns the meta object for the reference '{@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getFromLocation <em>From Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Location</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getFromLocation()
	 * @see #getInspectionTimeWindow()
	 * @generated
	 */
	EReference getInspectionTimeWindow_FromLocation();

	/**
	 * Returns the meta object for the reference '{@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getToLocation <em>To Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Location</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getToLocation()
	 * @see #getInspectionTimeWindow()
	 * @generated
	 */
	EReference getInspectionTimeWindow_ToLocation();

	/**
	 * Returns the meta object for the reference list '{@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getPlannedInspections <em>Planned Inspections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Planned Inspections</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getPlannedInspections()
	 * @see #getInspectionTimeWindow()
	 * @generated
	 */
	EReference getInspectionTimeWindow_PlannedInspections();

	/**
	 * Returns the meta object for the attribute '{@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getFromTime <em>From Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Time</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getFromTime()
	 * @see #getInspectionTimeWindow()
	 * @generated
	 */
	EAttribute getInspectionTimeWindow_FromTime();

	/**
	 * Returns the meta object for the attribute '{@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getToTime <em>To Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Time</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow#getToTime()
	 * @see #getInspectionTimeWindow()
	 * @generated
	 */
	EAttribute getInspectionTimeWindow_ToTime();

	/**
	 * Returns the meta object for class '{@link projects.belfius.solver.BelfiusInspecSolver.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link projects.belfius.solver.BelfiusInspecSolver.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for the attribute '{@link projects.belfius.solver.BelfiusInspecSolver.Location#getCoordinateX <em>Coordinate X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinate X</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Location#getCoordinateX()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_CoordinateX();

	/**
	 * Returns the meta object for the attribute '{@link projects.belfius.solver.BelfiusInspecSolver.Location#getCoordinateY <em>Coordinate Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinate Y</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.Location#getCoordinateY()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_CoordinateY();

	/**
	 * Returns the meta object for class '{@link projects.belfius.solver.BelfiusInspecSolver.PossibleInspector <em>Possible Inspector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possible Inspector</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.PossibleInspector
	 * @generated
	 */
	EClass getPossibleInspector();

	/**
	 * Returns the meta object for the reference '{@link projects.belfius.solver.BelfiusInspecSolver.PossibleInspector#getInspector <em>Inspector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inspector</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.PossibleInspector#getInspector()
	 * @see #getPossibleInspector()
	 * @generated
	 */
	EReference getPossibleInspector_Inspector();

	/**
	 * Returns the meta object for the attribute '{@link projects.belfius.solver.BelfiusInspecSolver.PossibleInspector#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see projects.belfius.solver.BelfiusInspecSolver.PossibleInspector#getRank()
	 * @see #getPossibleInspector()
	 * @generated
	 */
	EAttribute getPossibleInspector_Rank();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BelfiusInspecSolverFactory getBelfiusInspecSolverFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link projects.belfius.solver.BelfiusInspecSolver.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projects.belfius.solver.BelfiusInspecSolver.impl.DomainImpl
		 * @see projects.belfius.solver.BelfiusInspecSolver.impl.BelfiusInspecSolverPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Inspectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__INSPECTORS = eINSTANCE.getDomain_Inspectors();

		/**
		 * The meta object literal for the '<em><b>Inspections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__INSPECTIONS = eINSTANCE.getDomain_Inspections();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LOCATIONS = eINSTANCE.getDomain_Locations();

		/**
		 * The meta object literal for the '<em><b>Sub Domains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__SUB_DOMAINS = eINSTANCE.getDomain_SubDomains();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectorImpl <em>Inspector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projects.belfius.solver.BelfiusInspecSolver.impl.InspectorImpl
		 * @see projects.belfius.solver.BelfiusInspecSolver.impl.BelfiusInspecSolverPackageImpl#getInspector()
		 * @generated
		 */
		EClass INSPECTOR = eINSTANCE.getInspector();

		/**
		 * The meta object literal for the '<em><b>Inspection Time Windows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSPECTOR__INSPECTION_TIME_WINDOWS = eINSTANCE.getInspector_InspectionTimeWindows();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTOR__NAME = eINSTANCE.getInspector_Name();

		/**
		 * The meta object literal for the '{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectionImpl <em>Inspection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projects.belfius.solver.BelfiusInspecSolver.impl.InspectionImpl
		 * @see projects.belfius.solver.BelfiusInspecSolver.impl.BelfiusInspecSolverPackageImpl#getInspection()
		 * @generated
		 */
		EClass INSPECTION = eINSTANCE.getInspection();

		/**
		 * The meta object literal for the '<em><b>Visit Time Windows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSPECTION__VISIT_TIME_WINDOWS = eINSTANCE.getInspection_VisitTimeWindows();

		/**
		 * The meta object literal for the '<em><b>Possible Inspectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSPECTION__POSSIBLE_INSPECTORS = eINSTANCE.getInspection_PossibleInspectors();

		/**
		 * The meta object literal for the '<em><b>Visit Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSPECTION__VISIT_LOCATION = eINSTANCE.getInspection_VisitLocation();

		/**
		 * The meta object literal for the '<em><b>Planned Inspector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSPECTION__PLANNED_INSPECTOR = eINSTANCE.getInspection_PlannedInspector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTION__NAME = eINSTANCE.getInspection_Name();

		/**
		 * The meta object literal for the '<em><b>Planned Visit Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTION__PLANNED_VISIT_TIME = eINSTANCE.getInspection_PlannedVisitTime();

		/**
		 * The meta object literal for the '<em><b>Visit Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTION__VISIT_DURATION = eINSTANCE.getInspection_VisitDuration();

		/**
		 * The meta object literal for the '{@link projects.belfius.solver.BelfiusInspecSolver.impl.VisitTimeWindowImpl <em>Visit Time Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projects.belfius.solver.BelfiusInspecSolver.impl.VisitTimeWindowImpl
		 * @see projects.belfius.solver.BelfiusInspecSolver.impl.BelfiusInspecSolverPackageImpl#getVisitTimeWindow()
		 * @generated
		 */
		EClass VISIT_TIME_WINDOW = eINSTANCE.getVisitTimeWindow();

		/**
		 * The meta object literal for the '<em><b>From Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT_TIME_WINDOW__FROM_TIME = eINSTANCE.getVisitTimeWindow_FromTime();

		/**
		 * The meta object literal for the '<em><b>To Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT_TIME_WINDOW__TO_TIME = eINSTANCE.getVisitTimeWindow_ToTime();

		/**
		 * The meta object literal for the '{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectionTimeWindowImpl <em>Inspection Time Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projects.belfius.solver.BelfiusInspecSolver.impl.InspectionTimeWindowImpl
		 * @see projects.belfius.solver.BelfiusInspecSolver.impl.BelfiusInspecSolverPackageImpl#getInspectionTimeWindow()
		 * @generated
		 */
		EClass INSPECTION_TIME_WINDOW = eINSTANCE.getInspectionTimeWindow();

		/**
		 * The meta object literal for the '<em><b>From Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSPECTION_TIME_WINDOW__FROM_LOCATION = eINSTANCE.getInspectionTimeWindow_FromLocation();

		/**
		 * The meta object literal for the '<em><b>To Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSPECTION_TIME_WINDOW__TO_LOCATION = eINSTANCE.getInspectionTimeWindow_ToLocation();

		/**
		 * The meta object literal for the '<em><b>Planned Inspections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSPECTION_TIME_WINDOW__PLANNED_INSPECTIONS = eINSTANCE.getInspectionTimeWindow_PlannedInspections();

		/**
		 * The meta object literal for the '<em><b>From Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTION_TIME_WINDOW__FROM_TIME = eINSTANCE.getInspectionTimeWindow_FromTime();

		/**
		 * The meta object literal for the '<em><b>To Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTION_TIME_WINDOW__TO_TIME = eINSTANCE.getInspectionTimeWindow_ToTime();

		/**
		 * The meta object literal for the '{@link projects.belfius.solver.BelfiusInspecSolver.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projects.belfius.solver.BelfiusInspecSolver.impl.LocationImpl
		 * @see projects.belfius.solver.BelfiusInspecSolver.impl.BelfiusInspecSolverPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

		/**
		 * The meta object literal for the '<em><b>Coordinate X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__COORDINATE_X = eINSTANCE.getLocation_CoordinateX();

		/**
		 * The meta object literal for the '<em><b>Coordinate Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__COORDINATE_Y = eINSTANCE.getLocation_CoordinateY();

		/**
		 * The meta object literal for the '{@link projects.belfius.solver.BelfiusInspecSolver.impl.PossibleInspectorImpl <em>Possible Inspector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projects.belfius.solver.BelfiusInspecSolver.impl.PossibleInspectorImpl
		 * @see projects.belfius.solver.BelfiusInspecSolver.impl.BelfiusInspecSolverPackageImpl#getPossibleInspector()
		 * @generated
		 */
		EClass POSSIBLE_INSPECTOR = eINSTANCE.getPossibleInspector();

		/**
		 * The meta object literal for the '<em><b>Inspector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLE_INSPECTOR__INSPECTOR = eINSTANCE.getPossibleInspector_Inspector();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSIBLE_INSPECTOR__RANK = eINSTANCE.getPossibleInspector_Rank();

	}

} //BelfiusInspecSolverPackage
