package com.evolutionnext.services;

import com.evolutionnext.model.Hello;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 * @author Daniel Hinojosa
 * @since 6/13/14 11:20 AM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
@ManagedBean
@SessionScoped
public class HelloWorld {

    @ManagedProperty(value="#{hello}")
    private Hello hello;

    public String greet() {
        return "success";
    }

}
