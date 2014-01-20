package at.haas.reparaturcenter.repositoryjpa;

import org.junit.Assert;
import org.junit.Test;
import at.haas.reparaturcenter.domain.Automarke;


public class AutomarkeJpaRepositoryTest extends AbstractJpaRepositoryTest{
	
	@Test
    public void verifyFindByUnknownId() {
        AutomarkeJpaRepository automarkeJpaRepository = new AutomarkeJpaRepository();
        automarkeJpaRepository.setEntityManager(entityManager);

        Automarke automarke = automarkeJpaRepository.findById(1l);

        Assert.assertNull(automarke);
    }

    @Test
    public void verifyFindById() {
    	AutomarkeJpaRepository automarkeJpaRepository = new AutomarkeJpaRepository();
    	automarkeJpaRepository.setEntityManager(entityManager);

    	Automarke automarke = new Automarke("Dodge", "Chrysler Group", 1950);
    	automarkeJpaRepository.persist(automarke);

        Automarke automarke2 = automarkeJpaRepository.findById(automarke.getId());

        Assert.assertNotNull(automarke2);
        Assert.assertEquals(automarke, automarke2);
    }
}
