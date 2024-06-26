package org.example.boardpjt.domain;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

public class Article {
    private Long id;
    private String title; // 제목
    private String content; // 내용
    private Integer viewCount; // 조회수
    private String hashTag; // 해시태그

    private LocalDateTime createdAt; // 생성일시
    private String createBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; // 수정자
}
