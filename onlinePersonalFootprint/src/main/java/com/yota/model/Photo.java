package com.yota.model;

import lombok.Data;

@Data
public class Photo {

    private Long id;
    private String description;
    private String title;
    private String url;
    private Long userId;

}
