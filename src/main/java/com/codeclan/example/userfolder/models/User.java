package com.codeclan.example.userfolder.models;

import com.sun.tools.javac.util.List;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="users")
public class User {

    @Column
    private  String userName;
    @Column
    private ArrayList<Folder> folders;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public User(){}

    public User(String userName){
        this.userName = userName;
        this.folders = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<Folder> getFolders() {
        return folders;
    }

    public void setFolders(ArrayList<Folder> folders) {
        this.folders = folders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addFolder(Folder folder) {
        this.folders.add(folder);
    }
}
