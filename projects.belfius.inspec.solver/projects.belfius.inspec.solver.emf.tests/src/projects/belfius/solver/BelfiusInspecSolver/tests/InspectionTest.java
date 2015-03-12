/**
 */
package projects.belfius.solver.BelfiusInspecSolver.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverFactory;
import projects.belfius.solver.BelfiusInspecSolver.Inspection;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Inspection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InspectionTest extends TestCase {

	/**
	 * The fixture for this Inspection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Inspection fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InspectionTest.class);
	}

	/**
	 * Constructs a new Inspection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InspectionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Inspection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Inspection fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Inspection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Inspection getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BelfiusInspecSolverFactory.eINSTANCE.createInspection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //InspectionTest
