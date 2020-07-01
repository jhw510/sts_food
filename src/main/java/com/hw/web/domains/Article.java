package com.hw.web.domains;

/**
 * @FileName : ${file_name}
 * @Project : 회원들을 위한 게시판
 * @Date : ${date} 
 * @작성자 : Jeong Hye Won
 * @프로그램 설명 : 간단한 게시판
 */



import org.springframework.stereotype.Component;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import lombok.Data;

@Lazy
@Data
@Component
public class Article {
	private int artSeq, imageSeq;
	private String userid, comments, message, rating, boardType, title, content; 
}