package com.dev.springaop.aop;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
@Slf4j
@RequiredArgsConstructor
@Data
public class Logger {
    private final String beforeLoggedIn;
    private final String afterLoggedIn;


    @Before("execution(public boolean isEligibleForLogIn())")
    private void putLog(){
        log.info("Verification complete");
    }
}
