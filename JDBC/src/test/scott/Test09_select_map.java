package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.BookVO;

public class Test09_select_map {
	public static void main(String[] args) {

		String sql = "select * from book";

		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		List<BookVO> books = new ArrayList<BookVO>();
		

		try {
			con = JDBCUtil.getConnection();
			//ps = con.prepareStatement(sql);
			st = con.createStatement();
			
			//ps = con.prepareStatement(sql);
			//? 세팅작업
			
			//실행
			rs=st.executeQuery(sql);
			//결과값핸들링
			while(rs.next()) {
				//System.out.print(rs.getString("bookno")+"   ");
				//System.out.print(rs.getString("title")+"   ");
				//System.out.print(rs.getInt("price")+"   ");
				//System.out.print(rs.getDate("pubdate")+"   ");
				//System.out.println();
				BookVO book = new BookVO();
				book.setPrice(rs.getInt("price"));
				book.setAuthor(rs.getString("author"));
				book.setBookno(rs.getInt("bookno"));
				book.setTitle(rs.getString("title"));
				book.setPubdate(rs.getDate("pubdate").toString());
				//System.out.println(book);
				books.add(book);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {

		} finally {
			JDBCUtil.close(con, st, rs);
		}
		System.out.println("Book List");
		for( BookVO d:books) {
			System.out.println(d);
		}
	}
}
