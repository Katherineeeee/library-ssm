package com.kk.base.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackDemo {
    private static final Logger log = LoggerFactory.getLogger(LogbackDemo.class);
    public static void main(String[] args) {
        log.debug("====debug");
        log.info("====info");
        log.warn("====warn");
        log.error("====error");
    }
}
