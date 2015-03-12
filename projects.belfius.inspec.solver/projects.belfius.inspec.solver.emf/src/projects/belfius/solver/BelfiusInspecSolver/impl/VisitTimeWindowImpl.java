/**
 */
package projects.belfius.solver.BelfiusInspecSolver.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage;
import projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visit Time Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.VisitTimeWindowImpl#getFromTime <em>From Time</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.VisitTimeWindowImpl#getToTime <em>To Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisitTimeWindowImpl extends MinimalEObjectImpl.Container implements VisitTimeWindow {
	/**
	 * The default value of the '{@link #getFromTime() <em>From Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromTime() <em>From Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTime()
	 * @generated
	 * @ordered
	 */
	protected Date fromTime = FROM_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getToTime() <em>To Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TO_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToTime() <em>To Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTime()
	 * @generated
	 * @ordered
	 */
	protected Date toTime = TO_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisitTimeWindowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BelfiusInspecSolverPackage.Literals.VISIT_TIME_WINDOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFromTime() {
		return fromTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromTime(Date newFromTime) {
		Date oldFromTime = fromTime;
		fromTime = newFromTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.VISIT_TIME_WINDOW__FROM_TIME, oldFromTime, fromTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getToTime() {
		return toTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToTime(Date newToTime) {
		Date oldToTime = toTime;
		toTime = newToTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.VISIT_TIME_WINDOW__TO_TIME, oldToTime, toTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BelfiusInspecSolverPackage.VISIT_TIME_WINDOW__FROM_TIME:
				return getFromTime();
			case BelfiusInspecSolverPackage.VISIT_TIME_WINDOW__TO_TIME:
				return getToTime();
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
			case BelfiusInspecSolverPackage.VISIT_TIME_WINDOW__FROM_TIME:
				setFromTime((Date)newValue);
				return;
			case BelfiusInspecSolverPackage.VISIT_TIME_WINDOW__TO_TIME:
				setToTime((Date)newValue);
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
			case BelfiusInspecSolverPackage.VISIT_TIME_WINDOW__FROM_TIME:
				setFromTime(FROM_TIME_EDEFAULT);
				return;
			case BelfiusInspecSolverPackage.VISIT_TIME_WINDOW__TO_TIME:
				setToTime(TO_TIME_EDEFAULT);
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
			case BelfiusInspecSolverPackage.VISIT_TIME_WINDOW__FROM_TIME:
				return FROM_TIME_EDEFAULT == null ? fromTime != null : !FROM_TIME_EDEFAULT.equals(fromTime);
			case BelfiusInspecSolverPackage.VISIT_TIME_WINDOW__TO_TIME:
				return TO_TIME_EDEFAULT == null ? toTime != null : !TO_TIME_EDEFAULT.equals(toTime);
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
		result.append(" (FromTime: ");
		result.append(fromTime);
		result.append(", ToTime: ");
		result.append(toTime);
		result.append(')');
		return result.toString();
	}

} //VisitTimeWindowImpl
