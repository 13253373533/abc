package com.dao.impl;

import com.dao.Bookdao;
import com.domain.Book;
import com.util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookdaoImpl implements Bookdao {
    @Override
    public List<Book> selectAll() {
        List<Book> books=new ArrayList<>();
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            conn = DBUtils.getConnection();
            String sql="select * from book";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                int num = rs.getInt("num");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                String author = rs.getString("author");
                Book book = new Book(num,name,price,author);
                books.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,ps,conn);
        }
        return books;
    }

    @Override
    public List<Book> selectBookByPage(int pageNum,int pageSize) {
        List<Book> books=new ArrayList<>();
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            conn = DBUtils.getConnection();
            String sql="select * from book limit ?,?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,(pageNum-1)*pageSize);
            ps.setInt(2,pageSize);
            rs = ps.executeQuery();
            while (rs.next()){
                int num = rs.getInt("num");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                String author = rs.getString("author");
                Book book = new Book(num,name,price,author);
                books.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,ps,conn);
        }
        return books;
    }

    @Override
    public int getCount() {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        int count=0;
        try {
            conn = DBUtils.getConnection();
            String sql="select count(num) from book";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()){
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,ps,conn);
        }
        return count;
    }
}
