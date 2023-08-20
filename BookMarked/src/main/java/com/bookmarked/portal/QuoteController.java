package com.bookmarked.portal;

import org.springframework.stereotype.Controller;

@Controller
public class QuoteController {
    
    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }
}
