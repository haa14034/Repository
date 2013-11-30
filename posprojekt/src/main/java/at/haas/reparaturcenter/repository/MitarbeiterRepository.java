package at.haas.reparaturcenter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import at.haas.reparaturcenter.domain.Mitarbeiter;


@Repository
public interface MitarbeiterRepository extends CrudRepository<Mitarbeiter, Long> {

    List<Mitarbeiter> findByName(String name);

    List<Mitarbeiter> findByLohn(double lohn);

    List<Mitarbeiter> findBySpezialisierung(String spezialisierung);

}
