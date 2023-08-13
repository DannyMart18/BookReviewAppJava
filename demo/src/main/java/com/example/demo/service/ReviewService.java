package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.entity.Review;
import com.example.demo.repositories.BookRepository;
import com.example.demo.repositories.ReviewRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Date;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final BookRepository bookRepository;

    public ReviewService(ReviewRepository reviewRepository, BookRepository bookRepository) {
        this.reviewRepository = reviewRepository;
        this.bookRepository = bookRepository;
    }

    @Transactional
    public void addReview(Long bookId, int rating, String comment) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new IllegalArgumentException("Book with id " + bookId + " not found"));

        Date datePosted = new Date();  // sets to current date/time
        Review review = new Review( book, rating, comment, datePosted);
        reviewRepository.save(review);
    }
}
