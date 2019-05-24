package service;

import java.util.List;

import vo.BookVO;
import vo.DeptVO;

public interface BookService {
	List<BookVO> bookList();
	
	int addBook(BookVO vo) throws Exception;
}
