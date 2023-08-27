package com.bookmarked.portal.quote;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuoteController {

    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/quotes")
    public String quotes() {
        return "list-quotes";
    }

    @PostMapping("/new-quote")
    public String newQuote(@ModelAttribute NewQuote newQuote, Authentication authentication) {
        quoteService.create(newQuote, authentication.getName());

        return "redirect:/";
    }
}
