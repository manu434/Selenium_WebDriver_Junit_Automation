package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitdemo {

	@Before
	public void setup() {
		System.out.println("before test exection steps");

	}

	@Test
	public void test() {
		System.out.println("Test executon steps:");

	}

	@After
	public void completion() {
		System.out.println("close and quit method");

	}

}
