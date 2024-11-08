package com.yug.User_access_managment_final.Service;

import com.yug.User_access_managment_final.Repo.UserRepo;
import com.yug.User_access_managment_final.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User registerUser(User user) {
        user.setRole("Employee");
        return userRepo.save(user);
    }

    public User authenticateUser(String username, String password) {
        Optional<User> userOptional = userRepo.findByUsername(username);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return user.getPassword().equals(password) ? user : null;
        } else {
            return null; // if No user is found
        }
    }
}
