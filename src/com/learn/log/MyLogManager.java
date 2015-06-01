package com.learn.log;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * ��־����
 * 
 * @author
 * 
 */
public class MyLogManager {

	private static Logger logger;

	static {
		InputStream is1 = null;
		InputStream is2 = null;
		try {
			// ��ȡ�����ļ�,������Ӧ���ļ�Ŀ¼
			String logFilePath = "";
			is1 = new FileInputStream(
					"F:\\log.properties");
			Properties properties = new Properties();
			properties.load(is1);
			String pattern = properties
					.getProperty("java.util.logging.FileHandler.pattern");
			logFilePath = pattern.substring(0, pattern.lastIndexOf("/"));
			File file = new File(logFilePath);
			if (!file.exists()) {
				file.mkdirs();
			}
			// ���³�ʼ����־���Բ����¶�ȡ��־����
			is2 = new FileInputStream(
					"F:\\log.properties");
			LogManager logManager = LogManager.getLogManager();
			logManager.readConfiguration(is2);

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is1.close();
				is2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ��ȡ��־����
	 * 
	 * @param clazz
	 * @return
	 */
	public static Logger getLogger(Class<?> clazz) {
		logger = Logger.getLogger(clazz.getName());
		return logger;
	}
}
