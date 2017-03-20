import org.junit.Assert.*;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;
public class AutoTest {

	@Test
	public void test1(){
		Auto a = new Auto("VW", Color.BLUE, -5);
	}
	

	@Test
	public void test2(){
		Auto a = new Auto("Audi", Color.black, 1000);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test3(){
		Auto a = new Auto(null, Color.red, 1);
	}
	
	@Test
	public void test4(){
		Auto a = new Auto("Ford", null, 130);
	}
	
	@Test
	public void test5(){
		Auto a = new Auto("Puch", Color.cyan, 130);
		System.out.println(a.toString());
	}
	
	@Test
	public void test6(){
		Auto a = new Auto(null, null, 130);
	}
	
	public static void main(String[] args) {
		
	}

}
