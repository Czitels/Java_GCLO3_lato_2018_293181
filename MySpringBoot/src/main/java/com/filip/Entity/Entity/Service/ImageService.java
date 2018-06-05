package com.filip.Entity.Entity.Service;

import com.filip.Entity.Entity.Dao.ImageDao;
import com.filip.Entity.Entity.Entity.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ImageService {

    @Autowired
    public ImageDao imageDao;
    public Collection<Image> getallimages(){
        return imageDao.getallimages();
    }
    public Image getImageById(int Id){
        return this.imageDao.getImageById(Id);
    }
}
