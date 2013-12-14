package at.haas.reparaturcenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import at.haas.reparaturcenter.domain.Kunde;
import at.haas.reparaturcenter.repositoryjpa.KundeJpaRepository;

@Service
public class ReparaturcenterManagementService {
	@Autowired
	private KundeJpaRepository kundeRepository;

	public void createNewKunde(int kId, String name ,String adresse, int plz, boolean geschlecht) {
		// start transaction
		// write audit log
		Kunde kunde = new Kunde(kId, name, adresse, plz, geschlecht);
		kundeRepository.persist(kunde);
		// end (commit) transaction
	}
}
