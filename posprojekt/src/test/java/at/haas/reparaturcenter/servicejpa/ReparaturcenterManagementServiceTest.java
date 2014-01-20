package at.haas.reparaturcenter.servicejpa;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(classes = ServiceTestConfiguration.class)
public class ReparaturcenterManagementServiceTest extends AbstractJUnit4SpringContextTests {
	
	@Autowired
    ReparaturcenterManagementServiceJpa reparaturcenterManagementServiceJpa;

    @Test
    public void aTest() {
        Assert.assertNotNull(reparaturcenterManagementServiceJpa);
    }
}
