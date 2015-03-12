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
import projects.belfius.solver.BelfiusInspecSolver.Domain;
import projects.belfius.solver.BelfiusInspecSolver.Inspection;
import projects.belfius.solver.BelfiusInspecSolver.Inspector;
import projects.belfius.solver.BelfiusInspecSolver.Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.DomainImpl#getInspectors <em>Inspectors</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.DomainImpl#getInspections <em>Inspections</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.DomainImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.DomainImpl#getSubDomains <em>Sub Domains</em>}</li>
 *   <li>{@link projects.belfius.solver.BelfiusInspecSolver.impl.DomainImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getInspectors() <em>Inspectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInspectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Inspector> inspectors;

	/**
	 * The cached value of the '{@link #getInspections() <em>Inspections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInspections()
	 * @generated
	 * @ordered
	 */
	protected EList<Inspection> inspections;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getSubDomains() <em>Sub Domains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<Domain> subDomains;

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
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BelfiusInspecSolverPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inspector> getInspectors() {
		if (inspectors == null) {
			inspectors = new EObjectContainmentEList<Inspector>(Inspector.class, this, BelfiusInspecSolverPackage.DOMAIN__INSPECTORS);
		}
		return inspectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inspection> getInspections() {
		if (inspections == null) {
			inspections = new EObjectContainmentEList<Inspection>(Inspection.class, this, BelfiusInspecSolverPackage.DOMAIN__INSPECTIONS);
		}
		return inspections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this, BelfiusInspecSolverPackage.DOMAIN__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Domain> getSubDomains() {
		if (subDomains == null) {
			subDomains = new EObjectContainmentEList<Domain>(Domain.class, this, BelfiusInspecSolverPackage.DOMAIN__SUB_DOMAINS);
		}
		return subDomains;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BelfiusInspecSolverPackage.DOMAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BelfiusInspecSolverPackage.DOMAIN__INSPECTORS:
				return ((InternalEList<?>)getInspectors()).basicRemove(otherEnd, msgs);
			case BelfiusInspecSolverPackage.DOMAIN__INSPECTIONS:
				return ((InternalEList<?>)getInspections()).basicRemove(otherEnd, msgs);
			case BelfiusInspecSolverPackage.DOMAIN__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case BelfiusInspecSolverPackage.DOMAIN__SUB_DOMAINS:
				return ((InternalEList<?>)getSubDomains()).basicRemove(otherEnd, msgs);
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
			case BelfiusInspecSolverPackage.DOMAIN__INSPECTORS:
				return getInspectors();
			case BelfiusInspecSolverPackage.DOMAIN__INSPECTIONS:
				return getInspections();
			case BelfiusInspecSolverPackage.DOMAIN__LOCATIONS:
				return getLocations();
			case BelfiusInspecSolverPackage.DOMAIN__SUB_DOMAINS:
				return getSubDomains();
			case BelfiusInspecSolverPackage.DOMAIN__NAME:
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
			case BelfiusInspecSolverPackage.DOMAIN__INSPECTORS:
				getInspectors().clear();
				getInspectors().addAll((Collection<? extends Inspector>)newValue);
				return;
			case BelfiusInspecSolverPackage.DOMAIN__INSPECTIONS:
				getInspections().clear();
				getInspections().addAll((Collection<? extends Inspection>)newValue);
				return;
			case BelfiusInspecSolverPackage.DOMAIN__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case BelfiusInspecSolverPackage.DOMAIN__SUB_DOMAINS:
				getSubDomains().clear();
				getSubDomains().addAll((Collection<? extends Domain>)newValue);
				return;
			case BelfiusInspecSolverPackage.DOMAIN__NAME:
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
			case BelfiusInspecSolverPackage.DOMAIN__INSPECTORS:
				getInspectors().clear();
				return;
			case BelfiusInspecSolverPackage.DOMAIN__INSPECTIONS:
				getInspections().clear();
				return;
			case BelfiusInspecSolverPackage.DOMAIN__LOCATIONS:
				getLocations().clear();
				return;
			case BelfiusInspecSolverPackage.DOMAIN__SUB_DOMAINS:
				getSubDomains().clear();
				return;
			case BelfiusInspecSolverPackage.DOMAIN__NAME:
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
			case BelfiusInspecSolverPackage.DOMAIN__INSPECTORS:
				return inspectors != null && !inspectors.isEmpty();
			case BelfiusInspecSolverPackage.DOMAIN__INSPECTIONS:
				return inspections != null && !inspections.isEmpty();
			case BelfiusInspecSolverPackage.DOMAIN__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case BelfiusInspecSolverPackage.DOMAIN__SUB_DOMAINS:
				return subDomains != null && !subDomains.isEmpty();
			case BelfiusInspecSolverPackage.DOMAIN__NAME:
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

} //DomainImpl
