package com.example.demo.app.Controller;

import com.example.demo.app.Model.DTO.MainPageDTO;
import com.example.demo.app.Service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class AController {
    @Autowired
    AService service;

    // 홈 화면
    @GetMapping("/")
    public MainPageDTO GetMainPage(){
        return service.GetMainPage();
    }


}
