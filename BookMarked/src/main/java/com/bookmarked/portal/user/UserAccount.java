package com.bookmarked.portal.user;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UserAccount {
    
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String password;

    protected UserAccount() {

    }

    public UserAccount(String username, String password) {
        this.id = null;
        this.username = username;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        UserAccount user = (UserAccount) o;

        return Objects.equals(id, user.id) && Objects.equals(username, user.username) 
            && Objects.equals(password, user.password);
    }

    @Override
    public String toString() {
        return "UserAccount [id=" + id + ", username=" + username + ", password=" + password + "]";
    }

    
}
