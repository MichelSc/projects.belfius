/**
 */
package projects.belfius.solver.BelfiusInspecSolver.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverFactory;
import projects.belfius.solver.BelfiusInspecSolver.Inspector;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Inspector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InspectorTest extends TestCase {

	/**
	 * The fixture for this Inspector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Inspector fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InspectorTest.class);
	}

	/**
	 * Constructs a new Inspector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InspectorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Inspector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Inspector fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Inspector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Inspector getFixture() {
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
		setFixture(BelfiusInspecSolverFactory.eINSTANCE.createInspector());
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

} //InspectorTest
