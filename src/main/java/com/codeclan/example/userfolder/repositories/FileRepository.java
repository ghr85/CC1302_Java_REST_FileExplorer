package com.codeclan.example.userfolder.repositories;

import com.codeclan.example.userfolder.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File,Long> {
}
