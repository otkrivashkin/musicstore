package com.bin.otkrivashkin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Note1 on 17.07.2017.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error,
                        @RequestParam(value = "msg", required = false) String msg,
                        Model model) {

        if (error != null) {
            model.addAttribute("error", "Invalid username or password.");
        }

        if (msg != null) {
            model.addAttribute("msg", "You have been logged out successfully!");
        }



        return "login";
    }

}
