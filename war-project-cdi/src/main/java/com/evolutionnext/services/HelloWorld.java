package com.evolutionnext.services;

import com.evolutionnext.model.Hello;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;


/**
 * @author Daniel Hinojosa
 * @since 6/13/14 11:20 AM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
@Named("helloWorld")
@SessionScoped
public class HelloWorld implements Serializable{

    @Inject
    private Hello hello;

    public void setHello(Hello hello) {
        this.hello = hello;
    }

    public String greet() {
        return "success";
    }

}
