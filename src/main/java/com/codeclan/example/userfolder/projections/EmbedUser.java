package com.codeclan.example.userfolder.projections;

import com.codeclan.example.userfolder.models.File;
import com.codeclan.example.userfolder.models.Folder;
import com.codeclan.example.userfolder.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name="embedUser", types = Folder.class)
public interface EmbedUser {
    String getName();
    User getUser();
    List<File> getFiles();
}
