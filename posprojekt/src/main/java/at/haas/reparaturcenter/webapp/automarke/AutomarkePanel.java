/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package at.haas.reparaturcenter.webapp.automarke;

import at.haas.reparaturcenter.webapp.ContentPanel;

/**
 *
 */
public class AutomarkePanel extends ContentPanel {
    public AutomarkePanel(String id) {
        super(id);
        add(new AutomarkeForm("automarkeForm"));
    }
}
