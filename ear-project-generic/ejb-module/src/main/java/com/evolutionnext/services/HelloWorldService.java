package com.evolutionnext.services;


import com.evolutionnext.model.Hello;

import javax.ejb.Stateful;
import java.io.Serializable;


/**
 * @author Daniel Hinojosa
 * @since 6/13/14 11:20 AM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
@Stateful
public class HelloWorldService implements Serializable {
    public void hello(Hello hello) {
        System.out.println("Received Hello World Message" + hello.getName());
    }
}
