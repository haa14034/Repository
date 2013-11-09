package at.haas.reparaturcenter.repository;

import java.util.List;
import javax.persistence.EntityManager;
import at.haas.reparaturcenter.domain.Kunde;

public class KundeRepository extends AbstractJpaRepository<Kunde> {

	public KundeRepository(EntityManager entityManager) {
		super(entityManager);
	}
	
	public List<Kunde> findAll() {
        return entityManager().createQuery("SELECT k FROM Kunde k", Kunde.class).getResultList();
    }

    public Kunde findById(Long id) {
        return entityManager().find(Kunde.class, id);
    }
}
