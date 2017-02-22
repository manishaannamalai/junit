package com.manisha.bookapp.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.manisha.bookapp.model.Book;
import com.manisha.bookapp.util.ConnectionUtil;

public class BookDAO {
	private JdbcTemplate jdbctemplate=ConnectionUtil.getJdbcTemplate();
	public void save (Book book){
		String sql="insert into books(name,price)values(?,?)";
		Object[] args={book.getName(),book.getPrice()};
		int rows=jdbctemplate.update(sql,args);
		System.out.println("no.of.rows inserted"+rows);

}
	public List<Book>findAll(){
		String sql="select id,name,price from books";
		return jdbctemplate.query(sql,(rs,rowNum) ->{
			Book book=new Book();
		book.setId(rs.getInt("id"));
		book.setName(rs.getString("name"));
		book.setPrice(rs.getFloat("price"));
		return book;
	});
	}
}
