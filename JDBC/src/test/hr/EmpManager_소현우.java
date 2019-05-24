package test.hr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class EmpManager_소현우 {
	public static void printEmployee(String jobs[]) {
		String sql = "select employee_id 사번, first_name 이름, salary 연봉" + " from employees e join jobs j"
				+ " on e.job_id = j.job_id"
				+ " where lower(j.job_title) in (?,?)";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = JDBCUtil.getConnection();// 로딩,연결
			ps = con.prepareStatement(sql);// statement생성
			ps.setString(1, jobs[0].toLowerCase());
			ps.setString(2, jobs[1].toLowerCase());// ?세팅
			rs = ps.executeQuery();// 실행

			while (rs.next()) {
				System.out.print(rs.getString(1) + "   ");
				System.out.print(rs.getString(2) + "   ");
				System.out.print(rs.getString(3) + "   ");
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
	}

}
