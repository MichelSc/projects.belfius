/**
 */
package projects.belfius.solver.BelfiusInspecSolver.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import projects.belfius.solver.BelfiusInspecSolver.util.BelfiusInspecSolverAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BelfiusInspecSolverItemProviderAdapterFactory extends BelfiusInspecSolverAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BelfiusInspecSolverItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link projects.belfius.solver.BelfiusInspecSolver.Domain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainItemProvider domainItemProvider;

	/**
	 * This creates an adapter for a {@link projects.belfius.solver.BelfiusInspecSolver.Domain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainAdapter() {
		if (domainItemProvider == null) {
			domainItemProvider = new DomainItemProvider(this);
		}

		return domainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projects.belfius.solver.BelfiusInspecSolver.Inspector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InspectorItemProvider inspectorItemProvider;

	/**
	 * This creates an adapter for a {@link projects.belfius.solver.BelfiusInspecSolver.Inspector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInspectorAdapter() {
		if (inspectorItemProvider == null) {
			inspectorItemProvider = new InspectorItemProvider(this);
		}

		return inspectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projects.belfius.solver.BelfiusInspecSolver.Inspection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InspectionItemProvider inspectionItemProvider;

	/**
	 * This creates an adapter for a {@link projects.belfius.solver.BelfiusInspecSolver.Inspection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInspectionAdapter() {
		if (inspectionItemProvider == null) {
			inspectionItemProvider = new InspectionItemProvider(this);
		}

		return inspectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisitTimeWindowItemProvider visitTimeWindowItemProvider;

	/**
	 * This creates an adapter for a {@link projects.belfius.solver.BelfiusInspecSolver.VisitTimeWindow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVisitTimeWindowAdapter() {
		if (visitTimeWindowItemProvider == null) {
			visitTimeWindowItemProvider = new VisitTimeWindowItemProvider(this);
		}

		return visitTimeWindowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InspectionTimeWindowItemProvider inspectionTimeWindowItemProvider;

	/**
	 * This creates an adapter for a {@link projects.belfius.solver.BelfiusInspecSolver.InspectionTimeWindow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInspectionTimeWindowAdapter() {
		if (inspectionTimeWindowItemProvider == null) {
			inspectionTimeWindowItemProvider = new InspectionTimeWindowItemProvider(this);
		}

		return inspectionTimeWindowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projects.belfius.solver.BelfiusInspecSolver.Location} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationItemProvider locationItemProvider;

	/**
	 * This creates an adapter for a {@link projects.belfius.solver.BelfiusInspecSolver.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocationAdapter() {
		if (locationItemProvider == null) {
			locationItemProvider = new LocationItemProvider(this);
		}

		return locationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projects.belfius.solver.BelfiusInspecSolver.PossibleInspector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PossibleInspectorItemProvider possibleInspectorItemProvider;

	/**
	 * This creates an adapter for a {@link projects.belfius.solver.BelfiusInspecSolver.PossibleInspector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPossibleInspectorAdapter() {
		if (possibleInspectorItemProvider == null) {
			possibleInspectorItemProvider = new PossibleInspectorItemProvider(this);
		}

		return possibleInspectorItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (domainItemProvider != null) domainItemProvider.dispose();
		if (inspectorItemProvider != null) inspectorItemProvider.dispose();
		if (inspectionItemProvider != null) inspectionItemProvider.dispose();
		if (visitTimeWindowItemProvider != null) visitTimeWindowItemProvider.dispose();
		if (inspectionTimeWindowItemProvider != null) inspectionTimeWindowItemProvider.dispose();
		if (locationItemProvider != null) locationItemProvider.dispose();
		if (possibleInspectorItemProvider != null) possibleInspectorItemProvider.dispose();
	}

}