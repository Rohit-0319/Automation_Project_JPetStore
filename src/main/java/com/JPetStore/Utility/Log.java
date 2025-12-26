package com.JPetStore.Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

    // Initialize Log4j2 logger
    public static Logger log = LogManager.getLogger(Log.class);

    public static void startTestCase(String testCaseName) {
        log.info("======================================");
        log.info("TEST STARTED : " + testCaseName);
        log.info("======================================");
    }

    public static void endTestCase(String testCaseName) {
        log.info("======================================");
        log.info("TEST ENDED : " + testCaseName);
        log.info("======================================");
    }

    public static void info(String message) {
        log.info(message);
    }

    public static void warn(String message) {
        log.warn(message);
    }

    public static void error(String message) {
        log.error(message);
    }

    public static void fatal(String message) {
        log.fatal(message);
    }
}
