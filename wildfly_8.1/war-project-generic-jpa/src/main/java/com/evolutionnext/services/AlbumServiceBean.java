package com.evolutionnext.services;

import com.evolutionnext.model.Album;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.*;

/**
 * @author Daniel Hinojosa
 * @since 6/13/14 11:20 AM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
@ManagedBean
@SessionScoped
public class AlbumServiceBean {

    private Album album;

    @Resource
    UserTransaction ut;

    @PostConstruct
    public void init() {
        this.album = new Album();
    }

    @PersistenceContext
    private EntityManager entityManager;


    public String create() {
        try {
            ut.begin();
            entityManager.persist(album);
            ut.commit();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            try {
                ut.rollback();
                return "failure";
            } catch (SystemException e1) {
                e1.printStackTrace();
            }
        }

        return "success";
    }

    public Album getAlbum() {
        return album;
    }
}
