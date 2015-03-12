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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage;
import projects.belfius.solver.BelfiusInspecSolver.Inspection;
import projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow;
import projects.belfius.solver.BelfiusInspecSolver.Location;
import projects.belfius.solver.BelfiusInspecSolver.PossibleInspector;
import projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inspection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectionImpl#getVisitTimeWindows <em>Visit Time Windows</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectionImpl#getPossibleInspectors <em>Possible Inspectors</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectionImpl#getVisitLocation <em>Visit Location</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectionImpl#getPlannedInspector <em>Planned Inspector</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectionImpl#getPlannedVisitTime <em>Planned Visit Time</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectionImpl#getVisitDuration <em>Visit Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InspectionImpl extends MinimalEObjectImpl.Container implements Inspection {
	/**
	 * The cached value of the '{@link #getVisitTimeWindows() <em>Visit Time Windows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitTimeWindows()
	 * @generated
	 * @ordered
	 */
	protected EList<VisitTimeWindow> visitTimeWindows;

	/**
	 * The cached value of the '{@link #getPossibleInspectors() <em>Possible Inspectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleInspectors()
	 * @generated
	 * @ordered
	 */
	protected EList<PossibleInspector> possibleInspectors;

	/**
	 * The cached value of the '{@link #getVisitLocation() <em>Visit Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitLocation()
	 * @generated
	 * @ordered
	 */
	protected Location visitLocation;

	/**
	 * The cached value of the '{@link #getPlannedInspector() <em>Planned Inspector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedInspector()
	 * @generated
	 * @ordered
	 */
	protected InspectionTimeWindow plannedInspector;

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
	 * The default value of the '{@link #getPlannedVisitTime() <em>Planned Visit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedVisitTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date PLANNED_VISIT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlannedVisitTime() <em>Planned Visit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedVisitTime()
	 * @generated
	 * @ordered
	 */
	protected Date plannedVisitTime = PLANNED_VISIT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisitDuration() <em>Visit Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float VISIT_DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVisitDuration() <em>Visit Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitDuration()
	 * @generated
	 * @ordered
	 */
	protected float visitDuration = VISIT_DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InspectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BelfiusInspecSolverPackage.Literals.INSPECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VisitTimeWindow> getVisitTimeWindows() {
		if (visitTimeWindows == null) {
			visitTimeWindows = new EObjectContainmentEList<VisitTimeWindow>(VisitTimeWindow.class, this, BelfiusInspecSolverPackage.INSPECTION__VISIT_TIME_WINDOWS);
		}
		return visitTimeWindows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PossibleInspector> getPossibleInspectors() {
		if (possibleInspectors == null) {
			possibleInspectors = new EObjectContainmentEList<PossibleInspector>(PossibleInspector.class, this, BelfiusInspecSolverPackage.INSPECTION__POSSIBLE_INSPECTORS);
		}
		return possibleInspectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getVisitLocation() {
		if (visitLocation != null && visitLocation.eIsProxy()) {
			InternalEObject oldVisitLocation = (InternalEObject)visitLocation;
			visitLocation = (Location)eResolveProxy(oldVisitLocation);
			if (visitLocation != oldVisitLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BelfiusInspecSolverPackage.INSPECTION__VISIT_LOCATION, oldVisitLocation, visitLocation));
			}
		}
		return visitLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetVisitLocation() {
		return visitLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisitLocation(Location newVisitLocation) {
		Location oldVisitLocation = visitLocation;
		visitLocation = newVisitLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.INSPECTION__VISIT_LOCATION, oldVisitLocation, visitLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InspectionTimeWindow getPlannedInspector() {
		if (plannedInspector != null && plannedInspector.eIsProxy()) {
			InternalEObject oldPlannedInspector = (InternalEObject)plannedInspector;
			plannedInspector = (InspectionTimeWindow)eResolveProxy(oldPlannedInspector);
			if (plannedInspector != oldPlannedInspector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BelfiusInspecSolverPackage.INSPECTION__PLANNED_INSPECTOR, oldPlannedInspector, plannedInspector));
			}
		}
		return plannedInspector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InspectionTimeWindow basicGetPlannedInspector() {
		return plannedInspector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlannedInspector(InspectionTimeWindow newPlannedInspector, NotificationChain msgs) {
		InspectionTimeWindow oldPlannedInspector = plannedInspector;
		plannedInspector = newPlannedInspector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.INSPECTION__PLANNED_INSPECTOR, oldPlannedInspector, newPlannedInspector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlannedInspector(InspectionTimeWindow newPlannedInspector) {
		if (newPlannedInspector != plannedInspector) {
			NotificationChain msgs = null;
			if (plannedInspector != null)
				msgs = ((InternalEObject)plannedInspector).eInverseRemove(this, BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__PLANNED_INSPECTIONS, InspectionTimeWindow.class, msgs);
			if (newPlannedInspector != null)
				msgs = ((InternalEObject)newPlannedInspector).eInverseAdd(this, BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__PLANNED_INSPECTIONS, InspectionTimeWindow.class, msgs);
			msgs = basicSetPlannedInspector(newPlannedInspector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.INSPECTION__PLANNED_INSPECTOR, newPlannedInspector, newPlannedInspector));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.INSPECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPlannedVisitTime() {
		return plannedVisitTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlannedVisitTime(Date newPlannedVisitTime) {
		Date oldPlannedVisitTime = plannedVisitTime;
		plannedVisitTime = newPlannedVisitTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.INSPECTION__PLANNED_VISIT_TIME, oldPlannedVisitTime, plannedVisitTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVisitDuration() {
		return visitDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisitDuration(float newVisitDuration) {
		float oldVisitDuration = visitDuration;
		visitDuration = newVisitDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.INSPECTION__VISIT_DURATION, oldVisitDuration, visitDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BelfiusInspecSolverPackage.INSPECTION__PLANNED_INSPECTOR:
				if (plannedInspector != null)
					msgs = ((InternalEObject)plannedInspector).eInverseRemove(this, BelfiusInspecSolverPackage.INSPECTION_TIME_WINDOW__PLANNED_INSPECTIONS, InspectionTimeWindow.class, msgs);
				return basicSetPlannedInspector((InspectionTimeWindow)otherEnd, msgs);
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
			case BelfiusInspecSolverPackage.INSPECTION__VISIT_TIME_WINDOWS:
				return ((InternalEList<?>)getVisitTimeWindows()).basicRemove(otherEnd, msgs);
			case BelfiusInspecSolverPackage.INSPECTION__POSSIBLE_INSPECTORS:
				return ((InternalEList<?>)getPossibleInspectors()).basicRemove(otherEnd, msgs);
			case BelfiusInspecSolverPackage.INSPECTION__PLANNED_INSPECTOR:
				return basicSetPlannedInspector(null, msgs);
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
			case BelfiusInspecSolverPackage.INSPECTION__VISIT_TIME_WINDOWS:
				return getVisitTimeWindows();
			case BelfiusInspecSolverPackage.INSPECTION__POSSIBLE_INSPECTORS:
				return getPossibleInspectors();
			case BelfiusInspecSolverPackage.INSPECTION__VISIT_LOCATION:
				if (resolve) return getVisitLocation();
				return basicGetVisitLocation();
			case BelfiusInspecSolverPackage.INSPECTION__PLANNED_INSPECTOR:
				if (resolve) return getPlannedInspector();
				return basicGetPlannedInspector();
			case BelfiusInspecSolverPackage.INSPECTION__NAME:
				return getName();
			case BelfiusInspecSolverPackage.INSPECTION__PLANNED_VISIT_TIME:
				return getPlannedVisitTime();
			case BelfiusInspecSolverPackage.INSPECTION__VISIT_DURATION:
				return getVisitDuration();
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
			case BelfiusInspecSolverPackage.INSPECTION__VISIT_TIME_WINDOWS:
				getVisitTimeWindows().clear();
				getVisitTimeWindows().addAll((Collection<? extends VisitTimeWindow>)newValue);
				return;
			case BelfiusInspecSolverPackage.INSPECTION__POSSIBLE_INSPECTORS:
				getPossibleInspectors().clear();
				getPossibleInspectors().addAll((Collection<? extends PossibleInspector>)newValue);
				return;
			case BelfiusInspecSolverPackage.INSPECTION__VISIT_LOCATION:
				setVisitLocation((Location)newValue);
				return;
			case BelfiusInspecSolverPackage.INSPECTION__PLANNED_INSPECTOR:
				setPlannedInspector((InspectionTimeWindow)newValue);
				return;
			case BelfiusInspecSolverPackage.INSPECTION__NAME:
				setName((String)newValue);
				return;
			case BelfiusInspecSolverPackage.INSPECTION__PLANNED_VISIT_TIME:
				setPlannedVisitTime((Date)newValue);
				return;
			case BelfiusInspecSolverPackage.INSPECTION__VISIT_DURATION:
				setVisitDuration((Float)newValue);
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
			case BelfiusInspecSolverPackage.INSPECTION__VISIT_TIME_WINDOWS:
				getVisitTimeWindows().clear();
				return;
			case BelfiusInspecSolverPackage.INSPECTION__POSSIBLE_INSPECTORS:
				getPossibleInspectors().clear();
				return;
			case BelfiusInspecSolverPackage.INSPECTION__VISIT_LOCATION:
				setVisitLocation((Location)null);
				return;
			case BelfiusInspecSolverPackage.INSPECTION__PLANNED_INSPECTOR:
				setPlannedInspector((InspectionTimeWindow)null);
				return;
			case BelfiusInspecSolverPackage.INSPECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BelfiusInspecSolverPackage.INSPECTION__PLANNED_VISIT_TIME:
				setPlannedVisitTime(PLANNED_VISIT_TIME_EDEFAULT);
				return;
			case BelfiusInspecSolverPackage.INSPECTION__VISIT_DURATION:
				setVisitDuration(VISIT_DURATION_EDEFAULT);
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
			case BelfiusInspecSolverPackage.INSPECTION__VISIT_TIME_WINDOWS:
				return visitTimeWindows != null && !visitTimeWindows.isEmpty();
			case BelfiusInspecSolverPackage.INSPECTION__POSSIBLE_INSPECTORS:
				return possibleInspectors != null && !possibleInspectors.isEmpty();
			case BelfiusInspecSolverPackage.INSPECTION__VISIT_LOCATION:
				return visitLocation != null;
			case BelfiusInspecSolverPackage.INSPECTION__PLANNED_INSPECTOR:
				return plannedInspector != null;
			case BelfiusInspecSolverPackage.INSPECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BelfiusInspecSolverPackage.INSPECTION__PLANNED_VISIT_TIME:
				return PLANNED_VISIT_TIME_EDEFAULT == null ? plannedVisitTime != null : !PLANNED_VISIT_TIME_EDEFAULT.equals(plannedVisitTime);
			case BelfiusInspecSolverPackage.INSPECTION__VISIT_DURATION:
				return visitDuration != VISIT_DURATION_EDEFAULT;
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
		result.append(", PlannedVisitTime: ");
		result.append(plannedVisitTime);
		result.append(", VisitDuration: ");
		result.append(visitDuration);
		result.append(')');
		return result.toString();
	}

} //InspectionImpl
