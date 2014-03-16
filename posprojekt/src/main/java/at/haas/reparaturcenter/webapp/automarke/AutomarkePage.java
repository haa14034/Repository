/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package at.haas.reparaturcenter.webapp.automarke;

import at.haas.reparaturcenter.webapp.ReparaturcenterManagementPage;
import org.apache.wicket.Component;

/**
 *
 */
public class AutomarkePage extends ReparaturcenterManagementPage {

    protected Component contentPanel() {
        return new AutomarkePanel("automarkePanel");
    }
}
