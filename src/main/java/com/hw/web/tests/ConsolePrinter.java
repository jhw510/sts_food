/**
 * 
 */
package com.hw.web.tests;

/**
 * @FileName : ConsolPrinter.java
 * @Project : 회원들을 위한 게시판
 * @Date : 2020. 7. 2 
 * @작성자 : Jeong Hye Won
 * @프로그램 설명 : 간단한 게시판
 */
public class ConsolePrinter implements Printer{

	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
		 System.out.println(message);
	}

}
