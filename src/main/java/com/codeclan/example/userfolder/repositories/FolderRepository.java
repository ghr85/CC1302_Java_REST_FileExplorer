package com.codeclan.example.userfolder.repositories;

import com.codeclan.example.userfolder.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FolderRepository extends JpaRepository<Folder,Long> {
}
