package com.evolutionnext.managed;

import com.evolutionnext.model.Hello;
import com.evolutionnext.services.HelloWorldService;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;

/**
 * @author Daniel Hinojosa
 * @since 6/13/14 1:13 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */

@Named("helloWorldManagedBean")
public class HelloWorldManagedBean {
    private Hello hello;

    @EJB
    private HelloWorldService helloWorldService;

    @PostConstruct
    public void init() {
        this.hello = new Hello();
    }

    public Hello getHello() {
        return hello;
    }

    public String greet() {
        helloWorldService.hello(hello);
        return "success";
    }
}
