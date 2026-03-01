package com.backlog.app.repositories;
import com.backlog.app.models.User;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
List<User> findByUsername(String username);
List<User> findByEmail(String email);

}


