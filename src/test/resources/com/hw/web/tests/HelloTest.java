/**
 * 
 */
package com.hw.web.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @FileName : HelloTest.java
 * @Project : ȸ������ ���� �Խ���
 * @Date : 2020. 7. 2 
 * @�ۼ��� : Jeong Hye Won
 * @���α׷� ���� : ������ �Խ���
 */



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/META-INF/*-context.xml")
public class HelloTest {
   @Autowired
   @Qualifier("hello")
	/**
	 * Test method for {@link com.hw.web.tests.Hello#sayHello()}.
	 */
	@Test
	public void testSayHello() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.hw.web.tests.Hello#print()}.
	 */
	@Test
	public void testPrint() {
		fail("Not yet implemented");
	}

}
