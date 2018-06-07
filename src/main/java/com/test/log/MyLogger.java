package com.test.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ryan Miao at 2018-06-07 20:27
 **/
public class MyLogger {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyLogger.class);

    public void testLog() {
        LOGGER.info("test log");
    }

    public static void main(String[] args) {
        MyLogger myLogger = new MyLogger();
        myLogger.testLog();
    }

}
