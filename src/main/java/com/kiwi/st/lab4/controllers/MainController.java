package com.kiwi.st.lab4.controllers;

import com.kiwi.st.lab4.dto.LoginForm;
import com.kiwi.st.lab4.dto.Response;
import com.kiwi.st.lab4.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MainController {

    @Autowired
    private MainService mainService;

    @PostMapping("/login")
    public Response login(LoginForm form) {
        return mainService.tryLogin(form);
    }

    @GetMapping("/hello")
    public String sayHello(String code) {
        return mainService.sayHello(code);
    }
}
