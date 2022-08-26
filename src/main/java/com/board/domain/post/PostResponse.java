package com.board.domain.post;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostResponse {

    private Long id;                       // PK(번호)
    private String title;                  // 제목
    private String content;                // 내용
    private String writer;                 // 작성자
    private int cnt;                   	   // 조회 수
    private Boolean noticeYn;              // 공지글 여부
    private Boolean deleteYn;              // 삭제 여부
    private LocalDateTime insertTime;     // 등록일
    private LocalDateTime updateTime;    // 수정일
  
}