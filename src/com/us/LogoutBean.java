package com.us;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by adam.
 */
@Named
@RequestScoped
public class LogoutBean implements Serializable {

    public void logout() {
        FacesContext
          .getCurrentInstance().getExternalContext().invalidateSession();
    }

}
