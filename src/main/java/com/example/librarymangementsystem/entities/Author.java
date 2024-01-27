package com.example.librarymangementsystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String authorName;
    private int authorAge;
    @Column(unique = true,nullable = false)
    private String emailId;
    //private int rating;
    private int noOfBooksWritten;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private List<Book> bookList=new ArrayList<>();


    public Author(String authorName, int authorAge, String emailId) {
        this.authorName = authorName;
        this.authorAge = authorAge;
        this.emailId = emailId;
    }
}
