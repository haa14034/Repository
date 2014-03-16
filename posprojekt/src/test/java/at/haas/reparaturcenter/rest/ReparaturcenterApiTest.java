
package at.haas.reparaturcenter.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;/*
/**
 *
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(loader = AnnotationConfigWebContextLoader.class, classes = RestApplicationConfig.class)
//@WebAppConfiguration
public class ReparaturcenterApiTest {

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
}
