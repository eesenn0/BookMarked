package com.bookmarked.portal.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmarked.portal.quote.QuoteEntity;

public interface UserManagementRepository extends JpaRepository<QuoteEntity, Long> {

    void save(UserAccount userAccount);

}
