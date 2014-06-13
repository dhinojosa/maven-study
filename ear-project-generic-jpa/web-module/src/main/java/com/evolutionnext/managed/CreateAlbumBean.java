package com.evolutionnext.managed;

import com.evolutionnext.model.Album;
import com.evolutionnext.services.AlbumServiceBean;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 * @author Daniel Hinojosa
 * @since 6/13/14 1:13 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */

@ManagedBean(name = "createAlbumBean")
public class CreateAlbumBean {
    private Album album;

    @EJB
    private AlbumServiceBean albumServiceBean;

    @PostConstruct
    public void init() {
        this.album = new Album();
    }

    public Album getAlbum() {
        return album;
    }

    public String create() {
        try {
            albumServiceBean.create(album);
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null,
                  new FacesMessage(FacesMessage.SEVERITY_INFO, "Unable to store in database","Unable to store in database" + e.getMessage()));
            return "failure";
        }
        return "success";
    }
}
