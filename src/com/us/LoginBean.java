package com.us;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import java.io.Serializable;

/**
 * Created by adam.
 */
@Named
@ViewScoped
public class LoginBean implements Serializable {

    @Inject
    private HttpSession session;

    @PostConstruct
    public void init() {
        session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }

    public String getSampleAttr() {
        return session.getAttribute("Sample") != null ? session.getAttribute("Sample").toString() :"";
    }

    public String authenticate() {
        return "default";
    }
}
