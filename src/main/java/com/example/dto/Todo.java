package com.example.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Todo {
    private String id;
    private String content;
    private String description;
    private String FinishTill;
    private LocalDateTime createdDate;
}
///ToDo (id, content, description (text), FinishTill, created Date) .