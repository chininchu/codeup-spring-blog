package com.codeup.codeupspringblog.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


@Entity
@Table(name = "posts")

public class Post {

    // Created an ID using Spring
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    // Created a title using Spring
    @Column(nullable = false, columnDefinition = "VARCHAR(100)")
    private String title;


    // Created a body using Spring
    @Column(nullable = false, columnDefinition = "TEXT")
    private String body;


    public Post(String title, String body) {
        this.title = title;
        this.body = body;


    }



}
