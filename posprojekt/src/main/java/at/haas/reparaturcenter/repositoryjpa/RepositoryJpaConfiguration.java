/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package at.haas.reparaturcenter.repositoryjpa;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import at.haas.reparaturcenter.domain.DomainPackage;

/**
 * Spring configuration to introduce pure JPA repositories.
 */
@Configuration
@ComponentScan(basePackageClasses = RepositoryJpaPackage.class)
public class RepositoryJpaConfiguration {}
