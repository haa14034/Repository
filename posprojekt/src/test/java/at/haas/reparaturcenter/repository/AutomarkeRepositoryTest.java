package at.haas.reparaturcenter.repository;

import at.haas.reparaturcenter.repository.RepositoryTestConfiguration;
import at.haas.reparaturcenter.domain.Automarke;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(classes = RepositoryTestConfiguration.class)
public class AutomarkeRepositoryTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    AutomarkeRepository automarkeRepository;

    @Before
    public void setup() {
        // remove existing data
        automarkeRepository.deleteAll();

        // create test data
        automarkeRepository.save(new Automarke("Dodge", "Chrysler Group", 1950));
        automarkeRepository.save(new Automarke("Chevrolet", "GM", 1960));
        automarkeRepository.save(new Automarke("Nissan", "Renault-Nissan", 1980));
    }

    @Test
    public void testFindByMarke() {
        // given

        // when
        List<Automarke> byMarke = automarkeRepository.findByMarke("Dodge");

        // then
        Assert.assertNotNull(byMarke);
        Assert.assertEquals(1, byMarke.size());
        Assert.assertNotNull(byMarke.get(0));
    }

    @Test
    public void testFindByGruppe() {
        // given

        // when
        List<Automarke> byGruppe = automarkeRepository.findByGruppe("GM");

        // then
        Assert.assertNotNull(byGruppe);
        Assert.assertEquals(1, byGruppe.size());
        Assert.assertNotNull(byGruppe.get(0));
    }
    
    @Test
    public void testFindByAnfangsjahrgang() {
        // given

        // when
        List<Automarke> byJahr = automarkeRepository.findByAnfangsjahrgang(1950);

        // then
        Assert.assertNotNull(byJahr);
        Assert.assertEquals(1, byJahr.size());
        Assert.assertNotNull(byJahr.get(0));
    }
    
    /*
    @Test
    public void testQueryDslQuery() {
        // given

        // when
        List<Automarke> byName = automarkeRepository.findWithQueryDsl("B");

        // then
        Assert.assertNotNull(byName);
        Assert.assertEquals(1, byName.size());
        Assert.assertNotNull(byName.get(0));
    }*/

    @Test
    public void testQueryJpaQuery() {
        // given

        // when
        List<Automarke> byMarkeA = automarkeRepository.findWithJqlQuery("Dodge");
        List<Automarke> byMarkeB = automarkeRepository.findWithJqlQuery("Nissan");

        // then
        Assert.assertNotNull(byMarkeA);
        Assert.assertEquals(1, byMarkeA.size());
        Assert.assertNotNull(byMarkeA.get(0));

        Assert.assertNotNull(byMarkeB);
        Assert.assertEquals(1, byMarkeB.size());
        Assert.assertNotNull(byMarkeB.get(0));
    }

    @Test
    public void testQueryCriteriaApi() {
        // given

        // when
        List<Automarke> byMarkeA = automarkeRepository.findWithCriteriaApi("Dodge");
        List<Automarke> byMarkeB = automarkeRepository.findWithCriteriaApi("Nissan");

        // then
        Assert.assertNotNull(byMarkeA);
        Assert.assertEquals(1, byMarkeA.size());
        Assert.assertNotNull(byMarkeA.get(0));

        Assert.assertNotNull(byMarkeB);
        Assert.assertEquals(1, byMarkeB.size());
        Assert.assertNotNull(byMarkeB.get(0));
    }
}
