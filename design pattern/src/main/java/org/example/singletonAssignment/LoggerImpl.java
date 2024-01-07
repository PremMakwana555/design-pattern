//package org.example.singletonAssignment;
//
//
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.lang.*;
//import java.time.Instant;
//
//public class LoggerImpl implements Logger {
//
//    PrintWriter printWriter;
//
//    @Override
//    public void log(LogLevel level, String message) {
//        if (printWriter == null) {
//            throw new IllegalStateException();
//        }
//
//        printWriter.print(Instant.now() + " " + level + " " + message);
//    }
//
//    @Override
//    public void setLogFile(String filePath) throws FileNotFoundException {
//        try {
//            printWriter = new PrintWriter(filePath);
//        }catch (FileNotFoundException fe){
//            fe.printStackTrace();
//        }
//    }
//
//    @Override
//    public String getLogFile() {
//        printWriter.println("");
//        return null;
//    }
//
//    @Override
//    public void flush() {
//        printWriter.flush();
//    }
//
//    @Override
//    public void close() {
//        printWriter.close();
//    }
//}