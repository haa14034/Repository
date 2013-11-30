package at.haas.reparaturcenter.repositoryjpa;

public interface PersistenceFactory {
	AutomarkeJpaRepository automarkeRepository();
	KundeJpaRepository kundeRepository();
	MitarbeiterJpaRepository mitarbeiterRepository();
	PersonJpaRepository personRepository();
	ReparaturJpaRepository reparaturRepository();
}
