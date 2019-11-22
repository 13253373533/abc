package com.domain;

import java.util.List;

public class PageBean {
    private int count;
    private List<Book> books;
    private int currentPage;
    private int totalPage;

    public PageBean(int count, List<Book> books, int currentPage, int totalPage) {
        this.count = count;
        this.books = books;
        this.currentPage = currentPage;
        this.totalPage = totalPage;
    }

    public PageBean() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
