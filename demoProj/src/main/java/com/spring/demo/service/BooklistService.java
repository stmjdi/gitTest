package com.spring.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.dao.BooklistDAO;
import com.spring.demo.vo.BooklistVO;

@Service
public class BooklistService {
	
	@Autowired
	BooklistDAO booklistDAO;
	
	public List<BooklistVO> showAllBooks(){
		return booklistDAO.selectAllBooks();
	}
	
	public BooklistVO showBookDetail(String bid) {
		return booklistDAO.selectOne(bid);
	}
	
	public List<BooklistVO> showBooksByCat(String bcategory){
		return booklistDAO.selectByCat(bcategory);
	}
}
