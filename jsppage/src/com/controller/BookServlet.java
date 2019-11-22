package com.controller;

import com.domain.Book;
import com.domain.PageBean;
import com.service.BookService;
import com.service.impl.BookServiceImpl;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BookService service= new BookServiceImpl();
//        List<Book> books = service.getAllBook();

        String pageNum = req.getParameter("pageNum");
        if (pageNum==null||pageNum.equals("")){
            pageNum="1";
        }
        PageBean pb = service.getBookByPage(Integer.parseInt(pageNum), 10);
        req.setAttribute("pb",pb);
        req.getRequestDispatcher("/booklist.jsp").forward(req,resp);


    }
}
