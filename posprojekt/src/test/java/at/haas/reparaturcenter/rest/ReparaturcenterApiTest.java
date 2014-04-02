
package at.haas.reparaturcenter.rest;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigWebContextLoader.class, classes = RestApplicationConfig.class)
@WebAppConfiguration
public class ReparaturcenterApiTest {
/**
    @Resource
    private WebApplicationContext webApplicationContext;

    @Test
    public void readFromEmptyListOfTeachers() throws Exception {

        MockMvc mockMvc = webAppContextSetup(webApplicationContext).build();

        mockMvc.
                perform(get("/teachers")).
                andExpect(status().isOk());
    }

    @Test
    public void insertNewTeacher() throws Exception {

        MockMvc mockMvc = webAppContextSetup(webApplicationContext).build();

        mockMvc.
                perform(
                        post("/teachers").
                                contentType(MediaType.APPLICATION_JSON).
                                content("{\"shortName\":\"GRJ\", \"name\":\"Joachim Grüneis\", \"birthDate\":\"1971-05-10\"}")).
                andExpect(status().isCreated());
    }
 */
}
