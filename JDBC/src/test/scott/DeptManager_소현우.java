package test.scott;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.DeptVO;

public class DeptManager_소현우 {

	public List<DeptVO> getDepts() {
		List<DeptVO> deptList = new ArrayList<DeptVO>();
		String sql = "select * from Dept";

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			con = JDBCUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			while (rs.next()) {
				DeptVO dept = new DeptVO();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLec(rs.getString("loc"));
				deptList.add(dept);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, st, rs);
		}
		return deptList;
	}
}
