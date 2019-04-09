package com.codeclan.example.userfolder;

import com.codeclan.example.userfolder.models.File;
import com.codeclan.example.userfolder.models.Folder;
import com.codeclan.example.userfolder.models.User;
import com.codeclan.example.userfolder.repositories.FileRepository;
import com.codeclan.example.userfolder.repositories.FolderRepository;
import com.codeclan.example.userfolder.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserfolderApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {

	}

	@Test
	public void createFileAndFolderThenSave(){
		Folder redFolder = new Folder("The Red Folder");
		folderRepository.save(redFolder);
		File davey = new File("TopSecret", "Txt", 326, redFolder);
		fileRepository.save(davey);
	}

	@Test
	public void createPirateAndRaidThenSave(){

		Folder redFolder = new Folder("The Red Folder");
		folderRepository.save(redFolder);

		File yellowFile = new File("Yellow", ".txt", 32, redFolder);
		fileRepository.save(yellowFile);

        User user = new User("Dave");
		userRepository.save(user);


		user.addFolder(redFolder);
		userRepository.save(user);

	}

}
