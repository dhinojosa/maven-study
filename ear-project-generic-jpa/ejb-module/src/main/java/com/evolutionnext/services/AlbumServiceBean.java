package com.evolutionnext.services;

import com.evolutionnext.model.Album;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Daniel Hinojosa
 * @since 6/13/14 11:20 AM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
@Stateless
public class AlbumServiceBean {

    @PersistenceContext
    private EntityManager entityManager;


    public Album create(Album album) throws Exception {
        entityManager.persist(album);
        return album;
    }
}
