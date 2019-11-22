package com.dao;

import com.domain.Book;

import java.util.List;

public interface Bookdao {
    List<Book> selectAll();
    List<Book> selectBookByPage(int pageNum,int pageSize);
    int getCount();
}
