/**
 */
package projects.belfius.solver.BelfiusInspecSolver.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage;
import projects.belfius.solver.BelfiusInspecSolver.Inspection;
import projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow;
import projects.belfius.solver.BelfiusInspecSolver.Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inspection Time Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectionTimeWindowImpl#getFromLocation <em>From Location</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectionTimeWindowImpl#getToLocation <em>To Location</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectionTimeWindowImpl#getPlannedInspections <em>Planned Inspections</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectionTimeWindowImpl#getFromTime <em>From Time</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectionTimeWindowImpl#getToTime <em>To Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InspectionTimeWindowImpl extends MinimalEObjectImpl.Container implements InspectionTimeWindow {
	/**
	 * The cached value of the '{@link #getFromLocation() <em>From Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromLocation()
	 * @generated
	 * @ordered
	 */
	protected Location fromLocation;

	/**
	 * The cached value of the '{@link #getToLocation() <em>To Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToLocation()
	 * @generated
	 * @ordered
	 */
	protected Location toLocation;

	/**
	 * The cached value of the '{@link #getPlannedInspections() <em>Planned Inspections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedInspections()
	 * @generated
	 * @ordered
	 */
	protected EList<Inspection> plannedInspections;

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
	protected InspectionTimeWindowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BelfiusInspecSolverPackage.Literals.INSPECTION_TIME_WINDOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getFromLocation() {
		if (fromLocation != null && fromLocation.eIsProxy()) {
			InternalEObject oldFromLocation = (InternalEObject)fromLocation;
			fromLocation = (Location)eResolveProxy(oldFromLocation);
			if (fromLocation != oldFromLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__FROM_LOCATION, oldFromLocation, fromLocation));
			}
		}
		return fromLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetFromLocation() {
		return fromLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromLocation(Location newFromLocation) {
		Location oldFromLocation = fromLocation;
		fromLocation = newFromLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__FROM_LOCATION, oldFromLocation, fromLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getToLocation() {
		if (toLocation != null && toLocation.eIsProxy()) {
			InternalEObject oldToLocation = (InternalEObject)toLocation;
			toLocation = (Location)eResolveProxy(oldToLocation);
			if (toLocation != oldToLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__TO_LOCATION, oldToLocation, toLocation));
			}
		}
		return toLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetToLocation() {
		return toLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToLocation(Location newToLocation) {
		Location oldToLocation = toLocation;
		toLocation = newToLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__TO_LOCATION, oldToLocation, toLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inspection> getPlannedInspections() {
		if (plannedInspections == null) {
			plannedInspections = new EObjectWithInverseResolvingEList<Inspection>(Inspection.class, this, BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__PLANNED_INSPECTIONS, BelfiusInspecSolverPackage.INSPECTION__PLANNED_INSPECTOR);
		}
		return plannedInspections;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__FROM_TIME, oldFromTime, fromTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__TO_TIME, oldToTime, toTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__PLANNED_INSPECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlannedInspections()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__PLANNED_INSPECTIONS:
				return ((InternalEList<?>)getPlannedInspections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__FROM_LOCATION:
				if (resolve) return getFromLocation();
				return basicGetFromLocation();
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__TO_LOCATION:
				if (resolve) return getToLocation();
				return basicGetToLocation();
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__PLANNED_INSPECTIONS:
				return getPlannedInspections();
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__FROM_TIME:
				return getFromTime();
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__TO_TIME:
				return getToTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__FROM_LOCATION:
				setFromLocation((Location)newValue);
				return;
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__TO_LOCATION:
				setToLocation((Location)newValue);
				return;
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__PLANNED_INSPECTIONS:
				getPlannedInspections().clear();
				getPlannedInspections().addAll((Collection<? extends Inspection>)newValue);
				return;
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__FROM_TIME:
				setFromTime((Date)newValue);
				return;
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__TO_TIME:
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
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__FROM_LOCATION:
				setFromLocation((Location)null);
				return;
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__TO_LOCATION:
				setToLocation((Location)null);
				return;
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__PLANNED_INSPECTIONS:
				getPlannedInspections().clear();
				return;
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__FROM_TIME:
				setFromTime(FROM_TIME_EDEFAULT);
				return;
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__TO_TIME:
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
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__FROM_LOCATION:
				return fromLocation != null;
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__TO_LOCATION:
				return toLocation != null;
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__PLANNED_INSPECTIONS:
				return plannedInspections != null && !plannedInspections.isEmpty();
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__FROM_TIME:
				return FROM_TIME_EDEFAULT == null ? fromTime != null : !FROM_TIME_EDEFAULT.equals(fromTime);
			case BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__TO_TIME:
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

} //InspectionTimeWindowImpl
