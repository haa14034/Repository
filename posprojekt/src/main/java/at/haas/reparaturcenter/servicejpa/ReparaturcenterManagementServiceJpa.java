package at.haas.reparaturcenter.servicejpa;

import org.springframework.beans.factory.annotation.Autowired;

import at.haas.reparaturcenter.domain.Kunde;
import at.haas.reparaturcenter.repositoryjpa.KundeJpaRepository;
import at.haas.reparaturcenter.repositoryjpa.MitarbeiterJpaRepository;


public class ReparaturcenterManagementServiceJpa implements ServiceJpa {

    @Autowired
    private KundeJpaRepository kundeJpaRepository;

    @Autowired
    private MitarbeiterJpaRepository mitarbeiterJpaRepository;

    public void createNewKunde(int kId, String name ,String adresse, int plz, boolean geschlecht) {
        // start transaction
        // write audit log
        Kunde kunde = new Kunde(kId, name, adresse, plz, geschlecht);
        kundeJpaRepository.persist(kunde);
        // end (commit) transaction
    }

	public void setKundeJpaRepository(KundeJpaRepository kundeJpaRepository) {
		this.kundeJpaRepository = kundeJpaRepository;
	}

	public void setMitarbeiterJpaRepository(MitarbeiterJpaRepository mitarbeiterJpaRepository) {
		this.mitarbeiterJpaRepository = mitarbeiterJpaRepository;
	}
}
