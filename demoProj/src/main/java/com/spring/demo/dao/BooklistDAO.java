package com.spring.demo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.demo.mapper.BooklistMapper;
import com.spring.demo.vo.BooklistVO;

@Repository
public class BooklistDAO {
	@Autowired
	SqlSession sqlSession;
	
	public List<BooklistVO> selectAllBooks(){
		BooklistMapper booklistMapper = sqlSession.getMapper(BooklistMapper.class);
		return booklistMapper.selectAll();
	}
	
	public BooklistVO selectOne(String bid) {
		BooklistMapper booklistMapper = sqlSession.getMapper(BooklistMapper.class);
		return booklistMapper.selectOne(bid);
	}
	
	public List<BooklistVO> selectByCat(String bcategory){
		System.out.println("dao : " + bcategory);
		BooklistMapper booklistMapper = sqlSession.getMapper(BooklistMapper.class);
		return booklistMapper.selectByCat(bcategory);
	}
}
