package at.haas.reparaturcenter.repository;

import java.util.List;
import javax.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import at.haas.reparaturcenter.domain.BasePersistable;

public abstract class AbstractJpaRepository<T extends BasePersistable> implements JpaRepository {
	protected final Logger logger = LoggerFactory.getLogger(getClass());
    private final EntityManager entityManager;
    
    public AbstractJpaRepository(EntityManager entityManager) {
        if (entityManager == null) {
            throw new IllegalArgumentException("An entityManager must be specified.");
        }
        this.entityManager = entityManager;
    }

    protected EntityManager entityManager() {
        return entityManager;
    }

    public abstract List<T> findAll();

    public abstract T findById(Long id);

    public void persist(T entity) {
        entityManager.persist(entity);
    }
}
