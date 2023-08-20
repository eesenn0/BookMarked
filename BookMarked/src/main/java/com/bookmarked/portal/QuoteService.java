package com.bookmarked.portal;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    private final QuoteRepository repository;

    public QuoteService(QuoteRepository repository) {
        this.repository = repository;
    }

    public List<QuoteEntity> getQuotes() {
        return repository.findAll();
    }
}
