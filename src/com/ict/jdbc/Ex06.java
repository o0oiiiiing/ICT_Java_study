package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// scanner를 이용해서 번호, 이름, 주소, 전화번호를 받아서 customer테이블에 삽입 후 확인
		
		Scanner scan = new Scanner(System.in);
		System.out.print("번호 : ");
		int number = scan.nextInt();
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("주소 : ");
		String address = scan.next();
		System.out.print("전화번호 : ");
		String phone = scan.next();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##oing";
			String password = "1114";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "insert into customer"
					+ " values("
					+ number + ","
					+ "'" + name + "',"
					+ "'" + address + "',"
					+ "'" + phone + "')";
			
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate(sql);
			
			if (result>0) {
				System.out.println("삽입 성공");
				sql = "select * from customer";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			} else {
				System.out.println("삽입 실패");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
