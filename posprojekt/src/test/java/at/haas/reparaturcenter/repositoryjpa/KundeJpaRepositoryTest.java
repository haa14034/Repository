package at.haas.reparaturcenter.repositoryjpa;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import at.haas.reparaturcenter.domain.Kunde;

public class KundeJpaRepositoryTest extends AbstractJpaRepositoryTest{
	@Test
	public void findAllWithoutKunde() {
        KundeJpaRepository kundeJpaRepository = new KundeJpaRepository();
        kundeJpaRepository.setEntityManager(entityManager);

		// expect
		assertThat(kundeJpaRepository.findAll().isEmpty(),
				is(equalTo(Boolean.TRUE)));
	}

	@Test
	public void findByIdWithoutKunde() {
		KundeJpaRepository kundeJpaRepository = new KundeJpaRepository();
		kundeJpaRepository.setEntityManager(entityManager);

		// expect
		assertThat(kundeJpaRepository.findById(0l), is(nullValue()));
	}
	
	/**
	@Test
	public void persistAndFindKunde() {
		KundeJpaRepository kundeJpaRepository = new KundeJpaRepository();
        kundeJpaRepository.setEntityManager(entityManager);

		Kunde kunde = new Kunde(10000, "Max", "MusterAdresse", 1010, true);

		kundeJpaRepository.persist(kunde);
		assertThat(kunde.getId(), is(notNullValue()));
		Long newId = kunde.getId();

		logger.info("Created kunde with id: {} - kunde: {}", newId, kunde);

		Kunde teacherByFind = kundeJpaRepository.findById(newId);
		assertThat(teacherByFind, equalTo(kunde));
	}*/
}
