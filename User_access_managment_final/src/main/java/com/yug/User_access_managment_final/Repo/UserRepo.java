package com.yug.User_access_managment_final.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yug.User_access_managment_final.model.User;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
