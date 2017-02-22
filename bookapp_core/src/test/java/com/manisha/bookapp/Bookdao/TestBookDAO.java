package com.manisha.bookapp.Bookdao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.manisha.bookapp.dao.BookDAO;
import com.manisha.bookapp.model.Book;

public class TestBookDAO {

	@Test
	public void test() {
		Book book=new Book();
		book.setName("java");
		book.setPrice(200f);
		BookDAO dao=new BookDAO();
		dao.save(book);
	}
	@Test
public void testFindAll(){
		BookDAO dao=new BookDAO();
		dao.findAll();
		List<Book>list=dao.findAll();
		for(Book b:list){
			System.out.println(b);
		}
	
}
}
