package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		// update
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("데이터 변경");
		System.out.print("고객번호 : ");
		int custid = scan.nextInt();
		System.out.print("변경할 이름 : ");
		String changedName = scan.next();
		System.out.print("변경할 주소 : ");
		String changedAddress = scan.next();
		System.out.print("변경할 전화번호 : ");
		String changedPhone = scan.next();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##oing";
			String password = "1114";

			conn = DriverManager.getConnection(url, user, password);

			String sql = "update customer set name = ?, address = ?, phone = ? where custid = ?";

			pstmt = conn.prepareStatement(sql); // delete에 사용
			
			pstmt.setString(1, changedName);
            pstmt.setString(2, changedAddress);
            pstmt.setString(3, changedPhone);
            pstmt.setInt(4, custid);

			result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("변경 성공");
				sql = "select * from customer";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			} else {
				System.out.println("변경 실패");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
