package org.example.singletonAssignment;

import java.util.logging.Logger;

public class LoggerSolution{

    public static Logger logger;

    public static Logger getInstance(){
        if(logger == null){
//            logger = new LoggerImpl();
        }
        return logger;
    }

    public static void setInstance(){
        logger = null;
    }

}