package com.fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class Article {
    private long id;
    private String title; // 제목
    private String content; // 본문
    private String hashtag; // 해시태그

    private LocalDateTime createdAt; // 생성일시
    private String createdBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일시
    private String mpdifiedBy; // 수정자
}
