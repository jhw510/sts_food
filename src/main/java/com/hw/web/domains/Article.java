package com.hw.web.domains;

/**
 * @FileName : ${file_name}
 * @Project : ȸ������ ���� �Խ���
 * @Date : ${date} 
 * @�ۼ��� : Jeong Hye Won
 * @���α׷� ���� : ������ �Խ���
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