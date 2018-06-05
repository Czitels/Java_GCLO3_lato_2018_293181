package com.filip.Entity.Entity.Controller;

import com.filip.Entity.Entity.Entity.Image;
import com.filip.Entity.Entity.Service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/images")
public class ImageController {

    @Autowired
    public ImageService imageService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Image> getallimages(){
        return imageService.getallimages();
    }

    @RequestMapping(value = "/{index}", method = RequestMethod.GET)
    public Image getImageById(@PathVariable("index") int index ){
        return imageService.getImageById(index);

    }
}
