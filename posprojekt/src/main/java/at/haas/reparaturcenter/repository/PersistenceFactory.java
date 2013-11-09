package at.haas.reparaturcenter.repository;

public interface PersistenceFactory {
	AutomarkeRepository automarkeRepository();
	KundeRepository kundeRepository();
	MitarbeiterRepository mitarbeiterRepository();
	PersonRepository personRepository();
	ReparaturRepository reparaturRepository();
}
