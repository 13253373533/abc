package com.service;

import com.domain.Book;
import com.domain.PageBean;

import java.util.List;

public interface BookService {
    List<Book> getAllBook();
    PageBean getBookByPage(int pageNum, int pageSize);
}
