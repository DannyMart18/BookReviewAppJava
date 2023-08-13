package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    //private User user;

    private int rating;

    private String comment;

    private Date datePosted;

    public Review() {
    }

    public Review(Book book, int rating, String comment, Date datePosted) {
        this.book = book;
        this.rating = rating;
        this.comment = comment;
        this.datePosted = datePosted;
    }

    public Review(Long id, Book book, int rating, String comment, Date datePosted) {
        this.id = id;
        this.book = book;
        this.rating = rating;
        this.comment = comment;
        this.datePosted = datePosted;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
