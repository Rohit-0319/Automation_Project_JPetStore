package com.JPetStore.Utility;

public class LoggerUtil {

    public static void info(String message) {
        Log.info(message);              // For Log4j
        ExtentLogger.info(message);     // For Extent report
    }

    public static void pass(String message) {
        Log.info("PASS: " + message);
        ExtentLogger.pass(message);
    }

    public static void fail(String message) {
        Log.error("FAIL: " + message);
        ExtentLogger.fail(message);
    }

    public static void error(String message, Throwable t) {
        Log.error(message);
        ExtentLogger.fail(message + " | Exception: " + t.getMessage());
    }
}
