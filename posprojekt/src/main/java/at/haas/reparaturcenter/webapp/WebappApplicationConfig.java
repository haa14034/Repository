/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package at.haas.reparaturcenter.webapp;

import at.haas.reparaturcenter.domain.DomainConfiguration;
import at.haas.reparaturcenter.repository.RepositoryConfiguration;
import at.haas.reparaturcenter.rest.RestPackage;
import at.haas.reparaturcenter.service.ServiceConfiguration;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Import(value = {DomainConfiguration.class, RepositoryConfiguration.class, ServiceConfiguration.class})
@Configuration
public class WebappApplicationConfig {

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
    }
}
