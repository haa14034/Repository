package at.haas.reparaturcenter.repositoryjpa;

import java.util.List;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import at.haas.reparaturcenter.domain.Kunde;

@Repository
public class KundeJpaRepository extends AbstractJpaRepository<Kunde> {
	@Autowired
	
	public List<Kunde> findAll() {
        return entityManager().createQuery("SELECT k FROM Kunde k", Kunde.class).getResultList();
    }

    public Kunde findById(Long id) {
        return entityManager().find(Kunde.class, id);
    }
}
