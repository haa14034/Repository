package at.haas.reparaturcenter.repository;

import java.util.List;

import javax.persistence.EntityManager;

import at.haas.reparaturcenter.domain.Reparatur;

public class ReparaturRepository extends AbstractJpaRepository<Reparatur> {

	public ReparaturRepository(EntityManager entityManager) {
		super(entityManager);
	}
	
	public List<Reparatur> findAll() {
        return entityManager().createQuery("SELECT r FROM Reparatur r", Reparatur.class).getResultList();
    }

    public Reparatur findById(Long id) {
        return entityManager().find(Reparatur.class, id);
    }

}
