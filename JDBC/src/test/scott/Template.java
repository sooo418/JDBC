package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class Template {
	public static void main(String[] args) {

		String sql = "";

		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			con = JDBCUtil.getConnection();
			//ps = con.prepareStatement(sql);
			st = con.createStatement();
			
			ps = con.prepareStatement(sql);
			//? 세팅작업
			
			//실행
			
			//결과값핸들링
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {

		} finally {
			JDBCUtil.close(con, st, rs);
		}

	}
}
