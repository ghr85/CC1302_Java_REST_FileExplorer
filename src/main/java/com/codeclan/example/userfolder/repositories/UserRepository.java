package com.codeclan.example.userfolder.repositories;

import com.codeclan.example.userfolder.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
