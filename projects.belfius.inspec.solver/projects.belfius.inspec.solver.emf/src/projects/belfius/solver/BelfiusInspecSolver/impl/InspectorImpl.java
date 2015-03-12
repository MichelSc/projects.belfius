/**
 */
package projects.belfius.solver.BelfiusInspecSolver.impl;

import java.util.Collection;

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
import projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow;
import projects.belfius.solver.BelfiusInspecSolver.Inspector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inspector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectorImpl#getInspectionTimeWindows <em>Inspection Time Windows</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.InspectorImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InspectorImpl extends MinimalEObjectImpl.Container implements Inspector {
	/**
	 * The cached value of the '{@link #getInspectionTimeWindows() <em>Inspection Time Windows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInspectionTimeWindows()
	 * @generated
	 * @ordered
	 */
	protected EList<InspectionTimeWindow> inspectionTimeWindows;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InspectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BelfiusInspecSolverPackage.Literals.INSPECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InspectionTimeWindow> getInspectionTimeWindows() {
		if (inspectionTimeWindows == null) {
			inspectionTimeWindows = new EObjectContainmentEList<InspectionTimeWindow>(InspectionTimeWindow.class, this, BelfiusInspecSolverPackage.INSPECTOR__INSPECTION_TIME_WINDOWS);
		}
		return inspectionTimeWindows;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.INSPECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BelfiusInspecSolverPackage.INSPECTOR__INSPECTION_TIME_WINDOWS:
				return ((InternalEList<?>)getInspectionTimeWindows()).basicRemove(otherEnd, msgs);
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
			case BelfiusInspecSolverPackage.INSPECTOR__INSPECTION_TIME_WINDOWS:
				return getInspectionTimeWindows();
			case BelfiusInspecSolverPackage.INSPECTOR__NAME:
				return getName();
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
			case BelfiusInspecSolverPackage.INSPECTOR__INSPECTION_TIME_WINDOWS:
				getInspectionTimeWindows().clear();
				getInspectionTimeWindows().addAll((Collection<? extends InspectionTimeWindow>)newValue);
				return;
			case BelfiusInspecSolverPackage.INSPECTOR__NAME:
				setName((String)newValue);
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
			case BelfiusInspecSolverPackage.INSPECTOR__INSPECTION_TIME_WINDOWS:
				getInspectionTimeWindows().clear();
				return;
			case BelfiusInspecSolverPackage.INSPECTOR__NAME:
				setName(NAME_EDEFAULT);
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
			case BelfiusInspecSolverPackage.INSPECTOR__INSPECTION_TIME_WINDOWS:
				return inspectionTimeWindows != null && !inspectionTimeWindows.isEmpty();
			case BelfiusInspecSolverPackage.INSPECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //InspectorImpl
