package com.kodilla.patterns.singleton;

import java.util.ArrayList;

public class LoggerArrayList {
    private static LoggerArrayList loggerInstance = null;
    private ArrayList<String> lastLog = null;

    private LoggerArrayList(){
    }

    public static LoggerArrayList getInstance(){
        if(loggerInstance == null){
            synchronized (LoggerArrayList.class){
                if (loggerInstance == null){
                    loggerInstance = new LoggerArrayList();
                }
            }
        }
        return loggerInstance;
    }

    public void addLogg(String value){
        lastLog.add(value);
    }

    public String getListLog(int number) {
        return lastLog.get(number);
    }
}

