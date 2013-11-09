package at.haas.reparaturcenter.repository;

import java.util.List;

import javax.persistence.EntityManager;

import at.haas.reparaturcenter.domain.Person;

public class PersonRepository extends AbstractJpaRepository<Person> {

	public PersonRepository(EntityManager entityManager) {
		super(entityManager);
	}
	
	public List<Person> findAll() {
        return entityManager().createQuery("SELECT p FROM Person p", Person.class).getResultList();
    }

    public Person findById(Long id) {
        return entityManager().find(Person.class, id);
    }

}
