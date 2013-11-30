package at.haas.reparaturcenter.repositoryjpa;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import at.haas.reparaturcenter.domain.Mitarbeiter;

@Repository
public class MitarbeiterJpaRepository extends AbstractJpaRepository<Mitarbeiter> {
	@Autowired
	
	public List<Mitarbeiter> findAll() {
        return entityManager().createQuery("SELECT ma FROM Mitarbeiter ma", Mitarbeiter.class).getResultList();
    }

    public Mitarbeiter findById(Long id) {
        return entityManager().find(Mitarbeiter.class, id);
    }
}
