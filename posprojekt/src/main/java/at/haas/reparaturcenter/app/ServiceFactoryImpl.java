package at.haas.reparaturcenter.app;

import at.haas.reparaturcenter.repositoryjpa.PersistenceFactory;
import at.haas.reparaturcenter.service.ReparaturcenterManagementService;
import at.haas.reparaturcenter.service.ServiceFactory;

public class ServiceFactoryImpl implements ServiceFactory {
    private PersistenceFactory persistenceFactory;

    public ServiceFactoryImpl(PersistenceFactory persistenceFactory) {
        this.persistenceFactory = persistenceFactory;
    }
    
    public ReparaturcenterManagementService reparaturcenterManagementService() {
        return new ReparaturcenterManagementService();
    }
}
