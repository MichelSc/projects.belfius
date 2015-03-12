/**
 */
package projects.belfius.solver.BelfiusInspecSolver.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverFactory;
import projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage;
import projects.belfius.solver.BelfiusInspecSolver.Domain;
import projects.belfius.solver.BelfiusInspecSolver.Inspection;
import projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow;
import projects.belfius.solver.BelfiusInspecSolver.Inspector;
import projects.belfius.solver.BelfiusInspecSolver.Location;
import projects.belfius.solver.BelfiusInspecSolver.PossibleInspector;
import projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BelfiusInspecSolverPackageImpl extends EPackageImpl implements BelfiusInspecSolverPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inspectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inspectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visitTimeWindowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inspectionTimeWindowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass possibleInspectorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BelfiusInspecSolverPackageImpl() {
		super(eNS_URI, BelfiusInspecSolverFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BelfiusInspecSolverPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BelfiusInspecSolverPackage init() {
		if (isInited) return (BelfiusInspecSolverPackage)EPackage.Registry.INSTANCE.getEPackage(BelfiusInspecSolverPackage.eNS_URI);

		// Obtain or create and register package
		BelfiusInspecSolverPackageImpl theBelfiusInspecSolverPackage = (BelfiusInspecSolverPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BelfiusInspecSolverPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BelfiusInspecSolverPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBelfiusInspecSolverPackage.createPackageContents();

		// Initialize created meta-data
		theBelfiusInspecSolverPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBelfiusInspecSolverPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BelfiusInspecSolverPackage.eNS_URI, theBelfiusInspecSolverPackage);
		return theBelfiusInspecSolverPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Inspectors() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Inspections() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Locations() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_SubDomains() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Name() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInspector() {
		return inspectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInspector_InspectionTimeWindows() {
		return (EReference)inspectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInspector_Name() {
		return (EAttribute)inspectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInspection() {
		return inspectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInspection_VisitTimeWindows() {
		return (EReference)inspectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInspection_PossibleInspectors() {
		return (EReference)inspectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInspection_VisitLocation() {
		return (EReference)inspectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInspection_PlannedInspector() {
		return (EReference)inspectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInspection_Name() {
		return (EAttribute)inspectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInspection_PlannedVisitTime() {
		return (EAttribute)inspectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInspection_VisitDuration() {
		return (EAttribute)inspectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisitTimeWindow() {
		return visitTimeWindowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisitTimeWindow_FromTime() {
		return (EAttribute)visitTimeWindowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisitTimeWindow_ToTime() {
		return (EAttribute)visitTimeWindowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInspectionTimeWindow() {
		return inspectionTimeWindowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInspectionTimeWindow_FromLocation() {
		return (EReference)inspectionTimeWindowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInspectionTimeWindow_ToLocation() {
		return (EReference)inspectionTimeWindowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInspectionTimeWindow_PlannedInspections() {
		return (EReference)inspectionTimeWindowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInspectionTimeWindow_FromTime() {
		return (EAttribute)inspectionTimeWindowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInspectionTimeWindow_ToTime() {
		return (EAttribute)inspectionTimeWindowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Name() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_CoordinateX() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_CoordinateY() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPossibleInspector() {
		return possibleInspectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPossibleInspector_Inspector() {
		return (EReference)possibleInspectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPossibleInspector_Rank() {
		return (EAttribute)possibleInspectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BelfiusInspecSolverFactory getBelfiusInspecSolverFactory() {
		return (BelfiusInspecSolverFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__INSPECTORS);
		createEReference(domainEClass, DOMAIN__INSPECTIONS);
		createEReference(domainEClass, DOMAIN__LOCATIONS);
		createEReference(domainEClass, DOMAIN__SUB_DOMAINS);
		createEAttribute(domainEClass, DOMAIN__NAME);

		inspectorEClass = createEClass(INSPECTOR);
		createEReference(inspectorEClass, INSPECTOR__INSPECTION_TIME_WINDOWS);
		createEAttribute(inspectorEClass, INSPECTOR__NAME);

		inspectionEClass = createEClass(INSPECTION);
		createEReference(inspectionEClass, INSPECTION__VISIT_TIME_WINDOWS);
		createEReference(inspectionEClass, INSPECTION__POSSIBLE_INSPECTORS);
		createEReference(inspectionEClass, INSPECTION__VISIT_LOCATION);
		createEReference(inspectionEClass, INSPECTION__PLANNED_INSPECTOR);
		createEAttribute(inspectionEClass, INSPECTION__NAME);
		createEAttribute(inspectionEClass, INSPECTION__PLANNED_VISIT_TIME);
		createEAttribute(inspectionEClass, INSPECTION__VISIT_DURATION);

		visitTimeWindowEClass = createEClass(VISIT_TIME_WINDOW);
		createEAttribute(visitTimeWindowEClass, VISIT_TIME_WINDOW__FROM_TIME);
		createEAttribute(visitTimeWindowEClass, VISIT_TIME_WINDOW__TO_TIME);

		inspectionTimeWindowEClass = createEClass(INSPECTION_TIME_WINDOW);
		createEReference(inspectionTimeWindowEClass, INSPECTION_TIME_WINDOW__FROM_LOCATION);
		createEReference(inspectionTimeWindowEClass, INSPECTION_TIME_WINDOW__TO_LOCATION);
		createEReference(inspectionTimeWindowEClass, INSPECTION_TIME_WINDOW__PLANNED_INSPECTIONS);
		createEAttribute(inspectionTimeWindowEClass, INSPECTION_TIME_WINDOW__FROM_TIME);
		createEAttribute(inspectionTimeWindowEClass, INSPECTION_TIME_WINDOW__TO_TIME);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__NAME);
		createEAttribute(locationEClass, LOCATION__COORDINATE_X);
		createEAttribute(locationEClass, LOCATION__COORDINATE_Y);

		possibleInspectorEClass = createEClass(POSSIBLE_INSPECTOR);
		createEReference(possibleInspectorEClass, POSSIBLE_INSPECTOR__INSPECTOR);
		createEAttribute(possibleInspectorEClass, POSSIBLE_INSPECTOR__RANK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_Inspectors(), this.getInspector(), null, "Inspectors", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Inspections(), this.getInspection(), null, "Inspections", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Locations(), this.getLocation(), null, "Locations", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_SubDomains(), this.getDomain(), null, "SubDomains", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inspectorEClass, Inspector.class, "Inspector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInspector_InspectionTimeWindows(), this.getInspectionTimeWindow(), null, "InspectionTimeWindows", null, 0, -1, Inspector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInspector_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Inspector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inspectionEClass, Inspection.class, "Inspection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInspection_VisitTimeWindows(), this.getVisitTimeWindow(), null, "VisitTimeWindows", null, 0, -1, Inspection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInspection_PossibleInspectors(), this.getPossibleInspector(), null, "PossibleInspectors", null, 0, -1, Inspection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInspection_VisitLocation(), this.getLocation(), null, "VisitLocation", null, 0, 1, Inspection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInspection_PlannedInspector(), this.getInspectionTimeWindow(), this.getInspectionTimeWindow_PlannedInspections(), "PlannedInspector", null, 1, 1, Inspection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInspection_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Inspection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInspection_PlannedVisitTime(), ecorePackage.getEDate(), "PlannedVisitTime", null, 0, 1, Inspection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInspection_VisitDuration(), ecorePackage.getEFloat(), "VisitDuration", null, 0, 1, Inspection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visitTimeWindowEClass, VisitTimeWindow.class, "VisitTimeWindow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisitTimeWindow_FromTime(), ecorePackage.getEDate(), "FromTime", null, 0, 1, VisitTimeWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisitTimeWindow_ToTime(), ecorePackage.getEDate(), "ToTime", null, 0, 1, VisitTimeWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inspectionTimeWindowEClass, InspectionTimeWindow.class, "InspectionTimeWindow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInspectionTimeWindow_FromLocation(), this.getLocation(), null, "FromLocation", null, 0, 1, InspectionTimeWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInspectionTimeWindow_ToLocation(), this.getLocation(), null, "ToLocation", null, 0, 1, InspectionTimeWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInspectionTimeWindow_PlannedInspections(), this.getInspection(), this.getInspection_PlannedInspector(), "PlannedInspections", null, 0, -1, InspectionTimeWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInspectionTimeWindow_FromTime(), ecorePackage.getEDate(), "FromTime", null, 0, 1, InspectionTimeWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInspectionTimeWindow_ToTime(), ecorePackage.getEDate(), "ToTime", null, 0, 1, InspectionTimeWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_CoordinateX(), ecorePackage.getEFloat(), "CoordinateX", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_CoordinateY(), ecorePackage.getEFloat(), "CoordinateY", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(possibleInspectorEClass, PossibleInspector.class, "PossibleInspector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPossibleInspector_Inspector(), this.getInspector(), null, "Inspector", null, 0, 1, PossibleInspector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPossibleInspector_Rank(), ecorePackage.getEInt(), "Rank", null, 0, 1, PossibleInspector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BelfiusInspecSolverPackageImpl
