/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package at.haas.reparaturcenter.webapp;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class ReparaturcenterManagementApplication extends WebApplication {
    @Override
    public Class<? extends Page> getHomePage() {
        return ReparaturcenterManagementPage.class;
    }

    @Override
    public void init() {
        super.init();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        //Scan package for annotated beans
        ctx.scan("at.haas.reparaturcenter.webapp");
        ctx.refresh();

        getComponentInstantiationListeners().add(new SpringComponentInjector(this, ctx));
    }
}
