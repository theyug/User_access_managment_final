package com.yug.User_access_managment_final.Controller;

import com.yug.User_access_managment_final.Service.UserService;
import com.yug.User_access_managment_final.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {
    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String showSignUpPage() {
        return "signup";
    }

    @PostMapping("/signup")
    public String registerUser(@RequestParam String username, @RequestParam String password, Model model) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userService.registerUser(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String password, Model model) {
        User user = userService.authenticateUser(username, password);
        if (user != null) {
            model.addAttribute("user", user);
            switch (user.getRole()) {
                case "Employee":
                    return "redirect:/requestAccess";
                case "Manager":
                    return "redirect:/pendingRequests";
                case "Admin":
                    return "redirect:/createSoftware";
            }
        }
        model.addAttribute("error", "Invalid credentials");
        return "login";
    }
}

