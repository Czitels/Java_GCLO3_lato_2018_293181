package com.filip.Entity.Entity.Entity;


import java.nio.file.attribute.FileTime;

public class Image {
    public Image(int index, String name, String resolution, long size, FileTime created) {
        this.index = index;
        this.name = name;
        this.resolution = resolution;
        this.size = size;
        this.created = created;
    }

    public int index;
    public String name;
    public String resolution;
    public long size;
    public FileTime created;

}
