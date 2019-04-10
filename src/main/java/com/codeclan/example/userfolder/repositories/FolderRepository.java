package com.codeclan.example.userfolder.repositories;

import com.codeclan.example.userfolder.models.Folder;
import com.codeclan.example.userfolder.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface FolderRepository extends JpaRepository<Folder,Long> {
}
