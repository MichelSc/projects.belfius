/**
 */
package projects.belfius.solver.BelfiusInspecSolver.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage;
import projects.belfius.solver.BelfiusInspecSolver.Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.LocationImpl#getName <em>Name</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.LocationImpl#getCoordinateX <em>Coordinate X</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.LocationImpl#getCoordinateY <em>Coordinate Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordinateX() <em>Coordinate X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateX()
	 * @generated
	 * @ordered
	 */
	protected static final float COORDINATE_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoordinateX() <em>Coordinate X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateX()
	 * @generated
	 * @ordered
	 */
	protected float coordinateX = COORDINATE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordinateY() <em>Coordinate Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateY()
	 * @generated
	 * @ordered
	 */
	protected static final float COORDINATE_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoordinateY() <em>Coordinate Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateY()
	 * @generated
	 * @ordered
	 */
	protected float coordinateY = COORDINATE_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BelfiusInspecSolverPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.LOCATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoordinateX() {
		return coordinateX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateX(float newCoordinateX) {
		float oldCoordinateX = coordinateX;
		coordinateX = newCoordinateX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.LOCATION__COORDINATE_X, oldCoordinateX, coordinateX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoordinateY() {
		return coordinateY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateY(float newCoordinateY) {
		float oldCoordinateY = coordinateY;
		coordinateY = newCoordinateY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.LOCATION__COORDINATE_Y, oldCoordinateY, coordinateY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BelfiusInspecSolverPackage.LOCATION__NAME:
				return getName();
			case BelfiusInspecSolverPackage.LOCATION__COORDINATE_X:
				return getCoordinateX();
			case BelfiusInspecSolverPackage.LOCATION__COORDINATE_Y:
				return getCoordinateY();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BelfiusInspecSolverPackage.LOCATION__NAME:
				setName((String)newValue);
				return;
			case BelfiusInspecSolverPackage.LOCATION__COORDINATE_X:
				setCoordinateX((Float)newValue);
				return;
			case BelfiusInspecSolverPackage.LOCATION__COORDINATE_Y:
				setCoordinateY((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BelfiusInspecSolverPackage.LOCATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BelfiusInspecSolverPackage.LOCATION__COORDINATE_X:
				setCoordinateX(COORDINATE_X_EDEFAULT);
				return;
			case BelfiusInspecSolverPackage.LOCATION__COORDINATE_Y:
				setCoordinateY(COORDINATE_Y_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BelfiusInspecSolverPackage.LOCATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BelfiusInspecSolverPackage.LOCATION__COORDINATE_X:
				return coordinateX != COORDINATE_X_EDEFAULT;
			case BelfiusInspecSolverPackage.LOCATION__COORDINATE_Y:
				return coordinateY != COORDINATE_Y_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", CoordinateX: ");
		result.append(coordinateX);
		result.append(", CoordinateY: ");
		result.append(coordinateY);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
