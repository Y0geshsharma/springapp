package com.example.websocketdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WebsocketDemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("Running testcases...");
	    assertEquals(true, new WebsocketDemoApplicationTests().checkEquality(1,1)); 	
	    assertEquals(false, new WebsocketDemoApplicationTests().checkEquality(23,3)); 	
	    assertEquals(false, new WebsocketDemoApplicationTests().checkEquality(12,5)); 	
	    assertEquals(true, new WebsocketDemoApplicationTests().checkEquality(45,45)); 	
	    assertEquals(true, new WebsocketDemoApplicationTests().checkEquality(10,10)); 	
	System.out.println("Testcases Finished...");
	    
	}
	public boolean checkEquality(int a,int b){
		return a==b;
	}

}
