/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package at.haas.reparaturcenter.webapp.automarke;

import at.haas.reparaturcenter.domain.Automarke;
import at.haas.reparaturcenter.repository.AutomarkeRepository;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import java.util.Date;

/**
 *
 */
public class AutomarkeForm extends Form<Automarke> {
    @SpringBean
    private AutomarkeRepository automarkeRepository;

    public AutomarkeForm(String id) {
        super(id, new CompoundPropertyModel<Automarke>(new Automarke("Nissan", "Renault-Nissan", 1980)));
        add(new TextField<Automarke>("marke"));
        add(new TextField<Automarke>("gruppe"));
        add(new TextField<Automarke>("anfangsjahrgang"));
    }

    @Override
    public final void onSubmit() {
        Automarke automarke = getModelObject();
        automarkeRepository.save(automarke);
        System.out.println(automarke);
    }
}
