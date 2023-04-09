package com.dev.springaop.controller;


import com.dev.springaop.service.DemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class DemoController {

    private final DemoService demoService;

    @GetMapping("/api/v1/login")
    public ResponseEntity<String> isEligible(@RequestBody String user){
        log.info(user);
        demoService.isEligibleForLogIn(user);
        return new ResponseEntity<>("Loaded", HttpStatus.OK);
    }
}
