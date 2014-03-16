/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package at.haas.reparaturcenter.webapp;

import org.apache.wicket.protocol.http.WicketFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 *
 */
@WebFilter(value = "/web/*", initParams = {
        @WebInitParam(name = "applicationClassName", value = "at.haas.reparaturcenter.webapp.ReparaturcenterManagementApplication"),
        @WebInitParam(name = "filterMappingUrlPattern", value = "/web/*")})
public class ReparaturcenterManagementFilter extends WicketFilter {
}
