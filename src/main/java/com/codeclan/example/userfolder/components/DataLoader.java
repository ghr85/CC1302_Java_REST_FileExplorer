package com.codeclan.example.userfolder.components;

import com.codeclan.example.userfolder.repositories.FileRepository;
import com.codeclan.example.userfolder.repositories.FolderRepository;
import com.codeclan.example.userfolder.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;

    public void run(ApplicationArguments args){

    }
}
