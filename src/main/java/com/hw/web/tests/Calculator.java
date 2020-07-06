/**
 * 
 */
package com.hw.web.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hw.web.proxies.Box;

/**
 * @FileName : Calculator.java
 * @Project : ȸ������ ���� �Խ���
 * @Date : 2020. 7. 3 
 * @�ۼ��� : Jeong Hye Won
 * @���α׷� ���� : Junit�׽�Ʈ Ŭ����
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
