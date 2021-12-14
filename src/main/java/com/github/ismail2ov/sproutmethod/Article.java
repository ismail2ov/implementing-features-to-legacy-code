package com.github.ismail2ov.sproutmethod;

import lombok.Data;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
public class Article {
    private UUID id;

    private String title;

    private String summary;

    private String content;

    private String url;

    private OffsetDateTime createdAt;

    private OffsetDateTime updatedAt;

    public void postDate() {
        // publish created date
    }
}
