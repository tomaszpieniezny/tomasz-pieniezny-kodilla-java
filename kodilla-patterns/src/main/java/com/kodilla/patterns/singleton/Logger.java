package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger loggerInstance = null;
    private String lastLog = "";

    private Logger(){
    }

    public static Logger getInstance(){
        if(loggerInstance == null){
            synchronized (Logger.class){
                if (loggerInstance == null){
                    loggerInstance = new Logger();
                }
            }
        }
        return loggerInstance;
    }

    public void Log (String log){
        lastLog = log;
        System.out.println("Log: [" + lastLog + "]");
    }

    public String getLastLog() {
        return lastLog;
    }

}
