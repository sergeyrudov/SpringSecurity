package com.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getInfoForAllUsers() {
        return "view-all-users";
    }

    @GetMapping("/hr_info")
    public String geyInfoOnlyForHR() {
        return "view-for-hr";
    }

    @GetMapping("/manager_info")
    public String geyInfoOnlyForManagers() {
        return "view-for-managers";
    }


}
