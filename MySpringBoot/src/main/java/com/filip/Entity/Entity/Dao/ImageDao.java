package com.filip.Entity.Entity.Dao;

import com.filip.Entity.Entity.Entity.Image;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class ImageDao {
    private static Map<Integer, Image> images;
    public static int counter;
    static {
        images = new HashMap<Integer, Image>();
        try {
            putImageToMap();
        } catch (IOException e) {
            e.printStackTrace();
        }
        counter = 0;
    }

    public static void putImageToMap() throws IOException {
        BufferedImage img = null;
        img = ImageIO.read(new File("strawberry.jpg"));
        BasicFileAttributes attr = Files.readAttributes(Paths.get("strawberry.jpg"), BasicFileAttributes.class);
        counter++;
        String myresolution = img.getWidth()+"x"+img.getHeight();
        Image myimage = new Image(counter,"strawberry.jpg",myresolution,attr.size(),attr.creationTime());
        images.put(counter,myimage);
    }
    public Collection<Image> getallimages(){
        return this.images.values();
    }
    public Image getImageById(int Id){
        return this.images.get(Id);
    }
}
