package com.learn.log;

	import java.util.logging.SimpleFormatter;
	import java.io.FileInputStream;  
	import java.util.logging.Level;  
	import java.util.logging.Logger;  
	  
	public class LoggerTest {  
	  
	    private static Logger logger = MyLogManager.getLogger(LoggerTest.class);  
	  
	    public static void main(String[] args) {  
	        try {  
	            logger.info("��ӡ��Ϣ");  
	            //�����ڵ�·��  
	            String filePath = "log.properties";  
	            /** 
	             * ���׳��쳣�� 
	             * java.io.FileNotFoundException: C:\workspace\log\src\com\log\log.properties (ϵͳ�Ҳ���ָ����·����) 
	             */  
	            new FileInputStream(filePath);  
	        } catch (Exception e) {  
	            logger.log(Level.SEVERE, e.getMessage(), e);  
	        }  
	    }  
	  
}  


