package com.codeclan.example.userfolder.components;

import com.codeclan.example.userfolder.models.File;
import com.codeclan.example.userfolder.models.Folder;
import com.codeclan.example.userfolder.models.User;
import com.codeclan.example.userfolder.repositories.FileRepository;
import com.codeclan.example.userfolder.repositories.FolderRepository;
import com.codeclan.example.userfolder.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;

    public void run(ApplicationArguments args){

        User user2 = new User("Davina");
        User user1 = new User("Davey");
        userRepository.save(user1);
        userRepository.save(user2);

        Folder folder1 = new Folder("TestFolder1");
        folderRepository.save(folder1);
        Folder folder2 = new Folder("TestFolder2");
        folderRepository.save(folder2);
        Folder folder3 = new Folder("TestFolder3");
        folderRepository.save(folder3);
        user1.addFolder(folder1);
        user1.addFolder(folder2);
        user2.addFolder(folder3);
        folderRepository.save(folder1);
        folderRepository.save(folder2);
        folderRepository.save(folder3);


        File file1 = new File("TestFile1","txt",35,folder1);
        File file2 = new File("TestFile2","txt",35,folder2);
        File file3 = new File("TestFile3","txt",35,folder3);
        fileRepository.save(file1);
        fileRepository.save(file2);
        fileRepository.save(file3);



    }
}
