package test.scott;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import util.JDBCUtil;

public class Test02 {
	public static void main(String[] args) {
		// emp 부서 별 평균 급여(소수점 두자리)와 인원 수를 구해서 출력하세요.
		String sql = "select dname as 부서,round(avg(sal),2) as 평균,count(ename) as 인원수"
				+ " from emp,dept where emp.deptno=dept.deptno" + " group by emp.deptno,dname" + " order by 평균 desc";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			// Class.forName(driver); // 1.드라이버 로딩
			// con = DriverManager.getConnection(url, user, pw);// 2.database 연결
			con = JDBCUtil.getConnection();
			st = con.createStatement(); // 3.sql 관리 객체 Statement 생성
			rs = st.executeQuery(sql); // 4.sql 구문 실행

			// 5.결과값 처리
			while (rs.next()) {
				System.out.print(rs.getString("부서") + "   ");
				System.out.print(rs.getString(2) + "   ");
				System.out.print(rs.getString(3) + "   ");
				// System.out.print(rs.getString(4)+" ");
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(con, st, rs);
		}

	}

}
