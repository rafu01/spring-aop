package com.dev.springaop.aop;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Slf4j
@RequiredArgsConstructor
@Data
public class Logger {
    private final String beforeLoggedIn;
    private final String afterLoggedIn;

    private void putLog(){
        log.info("Verification complete");
    }
}
