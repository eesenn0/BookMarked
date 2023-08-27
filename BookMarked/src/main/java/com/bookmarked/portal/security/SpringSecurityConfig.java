package com.bookmarked.portal.security;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.bookmarked.portal.user.UserAccount;
import com.bookmarked.portal.user.UserManagementRepository;

@Configuration
@EnableMethodSecurity
public class SpringSecurityConfig {
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner initUsers(UserManagementRepository repository) {
        return args -> {
            repository.save(new UserAccount("admin", passwordEncoder().encode("password")));
        };
    }
}
