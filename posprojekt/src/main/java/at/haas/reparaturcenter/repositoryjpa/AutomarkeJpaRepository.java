package at.haas.reparaturcenter.repositoryjpa;

import java.util.List;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import at.haas.reparaturcenter.domain.Automarke;

@Repository
public class AutomarkeJpaRepository extends AbstractJpaRepository<Automarke> {
	
	public List<Automarke> findAll() {
        return entityManager().createQuery("SELECT am FROM Automarke am", Automarke.class).getResultList();
    }

    public Automarke findById(Long id) {
        return entityManager().find(Automarke.class, id);
    }

}
