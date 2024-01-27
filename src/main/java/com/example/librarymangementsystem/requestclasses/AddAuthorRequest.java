package com.example.librarymangementsystem.requestclasses;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddAuthorRequest {
    private String authorName;
    private int authorAge;
    private String emailId;
}
