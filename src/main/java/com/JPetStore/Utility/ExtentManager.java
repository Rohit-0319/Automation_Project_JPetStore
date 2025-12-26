package com.JPetStore.Utility;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getExtent() {

        if (extent == null) {

       
        	
            ExtentSparkReporter spark =
                new ExtentSparkReporter("Extent_Reports/ExtentReport.html");

            
            extent = new ExtentReports();
            extent.attachReporter(spark);

            extent.setSystemInfo("Project", "JPetStore Automation");
            extent.setSystemInfo("Tester", "Rohit Kumar Jaiswal");
            extent.setSystemInfo("Browser", "Chrome");
        }
        return extent;
    }
    
    // it will take browser details from here we don't need to manually write
    public static void setBrowserInfo(String browser) {
        getExtent().setSystemInfo("Browser", browser);
    }
    
       
    
}

