package service;

import java.util.List;

import dao.BookDAO;
import test.scott.DeptManager_소현우;
import vo.BookVO;

public class BookServiceImpl implements BookService {

	private BookDAO dao = null;
	DeptManager_소현우 dm = null;

	public BookServiceImpl() {
		super();
	}

	public BookServiceImpl(BookDAO dao) {
		super();
		this.dao = dao;
	}

	public BookDAO getDao() {
		return dao;
	}

	public void setDao(BookDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<BookVO> bookList() {
		return dao.bookList();
	}

	@Override
	public int addBook(BookVO vo) throws Exception {

		return dao.addBook(vo);
	}

}