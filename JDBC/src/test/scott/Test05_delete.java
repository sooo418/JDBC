package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class Test05_delete {
	public static void main(String[] args) {

		String sql = "delete from book where bookno=?";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			con = JDBCUtil.getConnection();
			//ps = con.prepareStatement(sql);
			
			ps = con.prepareStatement(sql);
			//? 세팅작업
			ps.setInt(1, 1);
			//실행
			row=ps.executeUpdate();
			//결과값핸들링
			System.out.println("delete row:  "+row);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {

		} finally {
			JDBCUtil.close(con, ps, rs);
		}

	}
}
