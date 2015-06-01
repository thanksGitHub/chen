package com.learn.log;

	import java.util.logging.SimpleFormatter;
	import java.io.FileInputStream;  
	import java.util.logging.Level;  
	import java.util.logging.Logger;  
	  
	public class LoggerTest {  
	  
	    private static Logger logger = MyLogManager.getLogger(LoggerTest.class);  
	  
	    public static void main(String[] args) {  
	        try {  
	            logger.info("打印信息");  
	            //不存在的路径  
	            String filePath = "log.properties";  
	            /** 
	             * 会抛出异常： 
	             * java.io.FileNotFoundException: C:\workspace\log\src\com\log\log.properties (系统找不到指定的路径。) 
	             */  
	            new FileInputStream(filePath);  
	        } catch (Exception e) {  
	            logger.log(Level.SEVERE, e.getMessage(), e);  
	        }  
	    }  
	  
}  


