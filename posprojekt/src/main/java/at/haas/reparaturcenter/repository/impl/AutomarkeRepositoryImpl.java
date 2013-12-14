package at.haas.reparaturcenter.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import com.mysema.query.jpa.impl.JPAQuery;

import at.grueneis.timetable.domain.ClassRoom;
import at.haas.reparaturcenter.domain.Automarke;
import at.haas.reparaturcenter.domain.QAutomarke;

public class AutomarkeRepositoryImpl implements AutomarkeRepositoryCustom{

	@PersistenceContext
    EntityManager entityManager;
	
	public List<Automarke> findWithQueryDsl(String marke) {
		JPAQuery query = new JPAQuery(entityManager);
        QAutomarke automarke = QAutomarke.automarke;

        query.from(automarke).
                where(automarke.marke.eq(marke)).
                orderBy(automarke.anfangsjahrgang.asc());

        return query.list(automarke);
	}

	public List<Automarke> findWithJqlQuery(String marke) {
		return entityManager.
                createQuery("from Automarke where marke = :marke", Automarke.class).
                setParameter("marke", marke).
                getResultList();
	}

	public List<Automarke> findWithCriteriaApi(String marke) {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Automarke> query = builder.createQuery(Automarke.class);
        Root<Automarke> root = query.from(Automarke.class);
        Predicate markePredicate = builder.equal(root.get("marke"), marke);
        query.where(markePredicate);

        return entityManager.
                createQuery(query.select(root)).
                getResultList();
	}

}
