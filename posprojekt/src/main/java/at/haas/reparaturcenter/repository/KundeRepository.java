package at.haas.reparaturcenter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import at.haas.reparaturcenter.domain.Kunde;


@Repository
public interface KundeRepository extends CrudRepository<Kunde, Long> {

    List<Kunde> findByName(String name);

    List<Kunde> findByAdresse(String adresse);
    
    List<Kunde> findByPlz(int plz);
    
    List<Kunde> findByGeschlecht(boolean geschlecht);
}
