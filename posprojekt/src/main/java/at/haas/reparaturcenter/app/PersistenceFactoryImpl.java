package at.haas.reparaturcenter.app;

import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import at.grueneis.timetable.repositoryjpa.ClassRoomRepository;
import at.grueneis.timetable.repositoryjpa.CurriculumRepository;
import at.grueneis.timetable.repositoryjpa.CurriculumSubjectRepository;
import at.grueneis.timetable.repositoryjpa.SchoolClassRepository;
import at.grueneis.timetable.repositoryjpa.SubjectRepository;
import at.grueneis.timetable.repositoryjpa.TeacherRepository;
import at.grueneis.timetable.repositoryjpa.TeachingUnitRepository;
import at.haas.reparaturcenter.repository.*;

public class PersistenceFactoryImpl implements PersistenceFactory {
	private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private final HashMap<Class<?>, JpaRepository> repositories = new HashMap<>();
    
    public void setup() {
        entityManagerFactory = Persistence.createEntityManagerFactory("spengergassePU");
        entityManager = entityManagerFactory.createEntityManager();

        repositories.put(AutomarkeRepository.class, new AutomarkeRepository(entityManager));
        repositories.put(KundeRepository.class, new KundeRepository(entityManager));
        repositories.put(MitarbeiterRepository.class, new MitarbeiterRepository(entityManager));
        repositories.put(PersonRepository.class, new PersonRepository(entityManager));
        repositories.put(ReparaturRepository.class, new ReparaturRepository(entityManager));;
    }
	
    public void teardown() {
        if (entityManager != null) {
            entityManager.close();
        }
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }
    
    public AutomarkeRepository automarkeRepository() {
		return (AutomarkeRepository)repositories.get(AutomarkeRepository.class);
	}

    public KundeRepository kundeRepository() {
    	return (KundeRepository)repositories.get(KundeRepository.class);
	}

    public MitarbeiterRepository mitarbeiterRepository() {
    	return (MitarbeiterRepository)repositories.get(MitarbeiterRepository.class);
	}

    public PersonRepository personRepository() {
    	return (PersonRepository)repositories.get(PersonRepository.class);
	}

    public ReparaturRepository reparaturRepository() {
    	return (ReparaturRepository)repositories.get(ReparaturRepository.class);
	}

}
