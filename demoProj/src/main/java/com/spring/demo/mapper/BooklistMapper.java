package com.spring.demo.mapper;

import java.util.List;

import com.spring.demo.vo.BooklistVO;

public interface BooklistMapper {
	public List<BooklistVO> selectAll();
	
	public BooklistVO selectOne(String bid);
	
	public List<BooklistVO> selectByCat(String bcategory);
}
