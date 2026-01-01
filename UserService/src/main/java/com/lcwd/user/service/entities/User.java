package com.lcwd.user.service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "micro_users")
public class User {

    @Id
    @Column(name = "ID")
    private String userId;

    @Column(name = "NAME", length = 20)
    private String name;

    @Getter
    @Column(name = "EMAIL")
    private String email;

    @Getter
    @Column(name = "ABOUT")
    private String about;

    public void setAbout(String about) {
        this.about = about;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {

        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAbout() {
        return about;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }



    @Transient
    private List<Rating> ratings  = new ArrayList<>();
}
