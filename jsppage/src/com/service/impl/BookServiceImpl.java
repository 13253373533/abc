package com.service.impl;

import com.dao.Bookdao;
import com.dao.impl.BookdaoImpl;
import com.domain.Book;
import com.domain.PageBean;
import com.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {
    Bookdao dao=new BookdaoImpl();
    @Override
    public List<Book> getAllBook() {
        return dao.selectAll();
    }

    @Override
    public PageBean getBookByPage(int pageNum, int pageSize) {
        PageBean pb=new PageBean();
        int count=dao.getCount();
        pb.setCount(count);
        pb.setBooks(dao.selectBookByPage(pageNum,pageSize));
        pb.setCurrentPage(pageNum);
        int total= (int) Math.ceil(count*1.0/pageSize);
        pb.setTotalPage(total);
        return pb;
    }

}
