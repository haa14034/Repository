package at.haas.reparaturcenter.repository;

import java.util.List;
import javax.persistence.EntityManager;
import at.haas.reparaturcenter.domain.Automarke;

public class AutomarkeRepository extends AbstractJpaRepository<Automarke> {

	public AutomarkeRepository(EntityManager entityManager) {
		super(entityManager);
	}
	
	public List<Automarke> findAll() {
        return entityManager().createQuery("SELECT am FROM Automarke am", Automarke.class).getResultList();
    }

    public Automarke findById(Long id) {
        return entityManager().find(Automarke.class, id);
    }

}
