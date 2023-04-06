package com.dev.springaop.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public boolean isEligibleForLogIn(String user){
        return user.equals("admin");
    }
}
