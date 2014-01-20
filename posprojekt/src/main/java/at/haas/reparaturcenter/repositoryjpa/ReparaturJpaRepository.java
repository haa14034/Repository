package at.haas.reparaturcenter.repositoryjpa;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import at.haas.reparaturcenter.domain.Reparatur;

@Repository
public class ReparaturJpaRepository extends AbstractJpaRepository<Reparatur> {
	
	public List<Reparatur> findAll() {
        return entityManager().createQuery("SELECT r FROM Reparatur r", Reparatur.class).getResultList();
    }

    public Reparatur findById(Long id) {
        return entityManager().find(Reparatur.class, id);
    }

}
