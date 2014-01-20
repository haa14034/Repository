package at.haas.reparaturcenter.servicejpa;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import at.haas.reparaturcenter.domain.DomainConfiguration;
import at.haas.reparaturcenter.repositoryjpa.RepositoryJpaConfiguration;
import at.haas.reparaturcenter.servicejpa.ServiceJpaConfiguration;

/**
*
*/
@Configuration
@Import({DomainConfiguration.class, RepositoryJpaConfiguration.class, ServiceJpaConfiguration.class})
public class ServiceTestConfiguration {

   @Bean
   public DataSource dataSource() {
       return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
   }
}