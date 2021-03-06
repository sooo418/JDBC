package test.hr;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import util.JDBCUtil;

public class empTest_소현우 {
	public static void main(String[] args) {
		String sql = //"select 직속부하직원수, 관리자사번, 관리자이름" + " from("
				//+ "select count(m.manager_id) 직속부하직원수, e.employee_id 관리자사번, e.last_name 관리자이름"
				//+ " from employees e join employees m" + " on e.employee_id =m.manager_id"
				//+ " group by e.employee_id,e.last_name)" + " where 직속부하직원수>7" + " order by 직속부하직원수";
				"select count(m.manager_id) 직속부하직원수, e.employee_id 관리자사번, e.last_name 관리자이름"
				+ " from employees e join employees m"
				+ " on e.employee_id =m.manager_id"
				+ " group by e.employee_id,e.last_name"
				+ " having count(m.manager_id)>7"
				+ " order by 1";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			con = JDBCUtil.getConnection();//로딩,연결
			st = con.createStatement();//statement생성
			rs=st.executeQuery(sql);//실행
			while (rs.next()) {
				System.out.print(rs.getInt(1)+"   ");
				System.out.print(rs.getString(2)+"   ");
				System.out.print(rs.getString(3)+"   ");
				System.out.println();
			}//결과값핸들링
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, st, rs);
		}
		
	}
}
