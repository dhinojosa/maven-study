package com.evolutionnext.ejb;

import com.evolutionnext.model.Album;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import java.io.Serializable;

/**
 * @author Daniel Hinojosa
 * @since 6/12/14 4:46 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */

@Named
@Stateless
public class AlbumServiceBean implements Serializable {

    @PersistenceUnit
    private EntityManager entityManager;


    public String create(Album album) {
        entityManager.persist(album);
        entityManager.flush();
        return "success";
    }
}
