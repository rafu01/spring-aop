package com.dev.springaop.controller;


import com.dev.springaop.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoService demoService;

    @GetMapping("/api/v1/login")
    public ResponseEntity<String> isEligible(@RequestBody String user){
        demoService.isEligibleForLogIn(user);
        return ResponseEntity.ok("Loaded");
    }
}
