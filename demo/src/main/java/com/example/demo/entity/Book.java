package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;

    private String author;

    private String isbn;

    private Date published;

    private String publisher;

    @Column(length = 2000)
    private String summary;

   // private List<Review> reviews;

   // private List<Genre> genres;


    public Book() {
    }

    public Book(String title, String author, String isbn, Date published, String publisher, String summary) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.published = published;
        this.publisher = publisher;
        this.summary = summary;
    }

    public Book(Long id, String title, String author, String isbn, Date published, String publisher, String summary) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.published = published;
        this.publisher = publisher;
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
