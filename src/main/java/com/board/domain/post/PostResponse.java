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
    /*
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	public int getCnt() {
		return cnt;
	}
	public Boolean getNoticeYn() {
		return noticeYn;
	}
	public Boolean getDeleteYn() {
		return deleteYn;
	}
	public LocalDateTime getInsertTime() {
		return insertTime;
	}
	public LocalDateTime getUpdateTime() {
		return updateTime;
	}*/  
    

}