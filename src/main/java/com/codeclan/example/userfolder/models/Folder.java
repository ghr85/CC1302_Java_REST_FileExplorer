package com.codeclan.example.userfolder.models;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<File> files;
    private User user;

    public Folder(){
    }
    public Folder(String name){
        this.name = name;
        this.files = new ArrayList<File>();
    }

}
