package com.nicolaslahehe.app.rest.Repo;

import com.nicolaslahehe.app.rest.Models.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<user, Long> {
    
}
