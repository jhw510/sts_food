/**
 * 
 */
package com.hw.web.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hw.web.proxies.Box;

/**
 * @FileName : Calculator.java
 * @Project : 회원들을 위한 게시판
 * @Date : 2020. 7. 3 
 * @작성자 : Jeong Hye Won
 * @프로그램 설명 : Junit테스트 클래스
 */
@Component
public class Calculator {
	@Autowired Box<Integer> box;
	
	public int sum(int a, int b) {
		box.put("res", a + b);
		return box.get("res");
	}
	public int substract(int a, int b) {
		return a - b;
	}
	public int absoluteVal(int a) {
		return Math.abs(a);
	}
	
 
}
