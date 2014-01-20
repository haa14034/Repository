package at.haas.reparaturcenter.repositoryjpa;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import at.haas.reparaturcenter.domain.Person;

@Repository
public class PersonJpaRepository extends AbstractJpaRepository<Person> {
	
	public List<Person> findAll() {
        return entityManager().createQuery("SELECT p FROM Person p", Person.class).getResultList();
    }

    public Person findById(Long id) {
        return entityManager().find(Person.class, id);
    }

}
