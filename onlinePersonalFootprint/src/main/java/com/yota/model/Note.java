package com.yota.model;

import lombok.Data;

@Data
public class Note {
    private Long id;
    private String title;
    private String content;
    private Long userId;
}
