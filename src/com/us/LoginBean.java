package com.us;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by adam.
 */
@Named
@ViewScoped
public class LoginBean implements Serializable {

    public LoginBean() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }

    @PostConstruct
    public void init() {

    }

    public String authenticate() {
        return "default";
    }

}
