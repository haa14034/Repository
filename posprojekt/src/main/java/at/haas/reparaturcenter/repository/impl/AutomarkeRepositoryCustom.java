package at.haas.reparaturcenter.repository.impl;

import java.util.List;

import at.haas.reparaturcenter.domain.Automarke;


public interface AutomarkeRepositoryCustom {

	List<Automarke> findWithQueryDsl(String marke);

    List<Automarke> findWithJqlQuery(String marke);

    List<Automarke> findWithCriteriaApi(String marke);
}
