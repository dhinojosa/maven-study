package com.evolutionnext.model;

import javax.faces.bean.ManagedBean;

/**
 * @author Daniel Hinojosa
 * @since 6/13/14 11:19 AM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */

@ManagedBean
public class Hello {

    public Hello() {
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
