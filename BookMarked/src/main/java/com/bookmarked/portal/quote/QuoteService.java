package com.bookmarked.portal.quote;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    private final QuoteRepository repository;

    public QuoteService(QuoteRepository repository) {
        this.repository = repository;
    }

    public List<QuoteEntity> getAllQuotes() {
        return repository.findAll();
    }

    public QuoteEntity create(NewQuote newQuote, String username) {
        return repository.saveAndFlush(new QuoteEntity(username, newQuote.bookName(), newQuote.quote()));
    }

    public Optional<QuoteEntity> getQuoteById(Long id) {
        return repository.findById(id);
    }

    public void saveQuote(QuoteEntity quote) {
        repository.save(quote);
    }

    public void updateQuote(QuoteEntity quote) {
        repository.save(quote);
    }

    public void deleteQuoteById(Long id) {
        repository.deleteById(id);
    }
}
