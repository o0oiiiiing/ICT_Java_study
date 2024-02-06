package com.ict.mybatis2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// config 파일 읽어서 자바에서 MyBatis를 사용할 수 있도록 도와주는 클래스 
public class DBService {
	static private SqlSessionFactory factory;
	static String resource = "com/ict/mybatis2/config.xml";

	// static 초기화
	static {
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// DAO에서 factory를 호출할 메서드
	public static SqlSessionFactory getFactory() {
		return factory;
	}

}
