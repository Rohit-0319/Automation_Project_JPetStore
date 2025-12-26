package com.JPetStore.Utility;

import com.aventstack.extentreports.ExtentTest;

public class ExtentLogger {

    public static void info(String message) {
        ExtentTest test = ExtentTestListener.test.get();
        if (test != null) {
            test.info(message);
        }
    }

    public static void pass(String message) {
        ExtentTest test = ExtentTestListener.test.get();
        if (test != null) {
            test.pass(message);
        }
    }

    public static void fail(String message) {
        ExtentTest test = ExtentTestListener.test.get();
        if (test != null) {
            test.fail(message);
        }
    }
}
