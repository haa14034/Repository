package at.haas.reparaturcenter.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import at.haas.reparaturcenter.domain.Automarke;


@Repository
public interface AutomarkeRepository extends CrudRepository<Automarke, Long> {

    List<Automarke> findByMarke(String marke);

    List<Automarke> findByGruppe(String gruppe);
    
    List<Automarke> findByAnfangsjahrgang(int anfangsjahrgang);
}
