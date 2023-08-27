package com.bookmarked.portal.quote;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class QuoteEntity {
    
    private @Id @GeneratedValue Long id;
    private String username;
    private String bookName;
    private String quote;

    protected QuoteEntity() {

    }

    public QuoteEntity(String username, String bookName, String quote) {
        this.id = null;
        this.username = username;
        this.bookName = bookName;
        this.quote = quote;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "QuoteEntity [id=" + id + ", username=" + username + ", bookName=" + bookName + ", quote=" + quote + "]";
    }

    
}
