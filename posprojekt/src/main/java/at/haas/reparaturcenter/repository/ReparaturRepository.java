package at.haas.reparaturcenter.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import at.haas.reparaturcenter.domain.Reparatur;

@Repository
public interface ReparaturRepository extends CrudRepository<Reparatur, Long> {

    List<Reparatur> findByPreis(double preis);

    List<Reparatur> findBySelbstkosten(double selbstkosten);

    List<Reparatur> findByEingangsdatum(Date eingangsdatum);
    
    List<Reparatur> findByRetourgabedatum(Date retourgabedatum);

    List<Reparatur> findByReparaturen(int reparaturen);
    
    List<Reparatur> findByServices(int services);
}
