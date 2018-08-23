package com.us;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by adam.
 */
@ManagedBean(name = "DefaultBean")
@SessionScoped
public class DefaultBean implements Serializable {

    private String name;

    @PostConstruct
    public void init() {
        name = "Adam";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
