/**
 */
package projects.belfius.solver.BelfiusInspecSolver.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projects.belfius.solver.BelfiusInspecSolver.BelfiusInspecSolverPackage;
import projects.belfius.solver.BelfiusInspecSolver.Inspector;
import projects.belfius.solver.BelfiusInspecSolver.PossibleInspector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Possible Inspector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.PossibleInspectorImpl#getInspector <em>Inspector</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.PossibleInspectorImpl#getRank <em>Rank</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PossibleInspectorImpl extends MinimalEObjectImpl.Container implements PossibleInspector {
	/**
	 * The cached value of the '{@link #getInspector() <em>Inspector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInspector()
	 * @generated
	 * @ordered
	 */
	protected Inspector inspector;

	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final int RANK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected int rank = RANK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PossibleInspectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BelfiusInspecSolverPackage.Literals.POSSIBLE_INSPECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inspector getInspector() {
		if (inspector != null && inspector.eIsProxy()) {
			InternalEObject oldInspector = (InternalEObject)inspector;
			inspector = (Inspector)eResolveProxy(oldInspector);
			if (inspector != oldInspector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BelfiusInspecSolverPackage.POSSIBLE_INSPECTOR__INSPECTOR, oldInspector, inspector));
			}
		}
		return inspector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inspector basicGetInspector() {
		return inspector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInspector(Inspector newInspector) {
		Inspector oldInspector = inspector;
		inspector = newInspector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.POSSIBLE_INSPECTOR__INSPECTOR, oldInspector, inspector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(int newRank) {
		int oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.POSSIBLE_INSPECTOR__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BelfiusInspecSolverPackage.POSSIBLE_INSPECTOR__INSPECTOR:
				if (resolve) return getInspector();
				return basicGetInspector();
			case BelfiusInspecSolverPackage.POSSIBLE_INSPECTOR__RANK:
				return getRank();
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
			case BelfiusInspecSolverPackage.POSSIBLE_INSPECTOR__INSPECTOR:
				setInspector((Inspector)newValue);
				return;
			case BelfiusInspecSolverPackage.POSSIBLE_INSPECTOR__RANK:
				setRank((Integer)newValue);
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
			case BelfiusInspecSolverPackage.POSSIBLE_INSPECTOR__INSPECTOR:
				setInspector((Inspector)null);
				return;
			case BelfiusInspecSolverPackage.POSSIBLE_INSPECTOR__RANK:
				setRank(RANK_EDEFAULT);
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
			case BelfiusInspecSolverPackage.POSSIBLE_INSPECTOR__INSPECTOR:
				return inspector != null;
			case BelfiusInspecSolverPackage.POSSIBLE_INSPECTOR__RANK:
				return rank != RANK_EDEFAULT;
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
		result.append(" (Rank: ");
		result.append(rank);
		result.append(')');
		return result.toString();
	}

} //PossibleInspectorImpl
