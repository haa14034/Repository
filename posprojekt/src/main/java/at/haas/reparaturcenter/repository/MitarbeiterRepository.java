package at.haas.reparaturcenter.repository;

import java.util.List;

import javax.persistence.EntityManager;

import at.haas.reparaturcenter.domain.Mitarbeiter;

public class MitarbeiterRepository extends AbstractJpaRepository<Mitarbeiter> {

	public MitarbeiterRepository(EntityManager entityManager) {
		super(entityManager);
	}
	
	public List<Mitarbeiter> findAll() {
        return entityManager().createQuery("SELECT ma FROM Mitarbeiter ma", Mitarbeiter.class).getResultList();
    }

    public Mitarbeiter findById(Long id) {
        return entityManager().find(Mitarbeiter.class, id);
    }
}
