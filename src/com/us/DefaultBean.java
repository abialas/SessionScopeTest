package com.us;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import java.io.Serializable;

/**
 * Created by adam.
 */
@ManagedBean(name = "DefaultBean")
@SessionScoped
public class DefaultBean implements Serializable {

    @Inject
    private HttpSession session;

    public String getSampleAttr() {
        return session.getId();
    }
}
