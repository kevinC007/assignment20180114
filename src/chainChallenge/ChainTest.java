package chainChallenge;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChainTest {
	Chain tester = new Chain();
	String[] input1 = {"4-2","BEGIN-3","3-4","2-END"};
	String[] input2 = {"4-2","BEGIN-3","11-77","2-END"};
	String[] input3 = {"4-2","BEGIN-3","3-9","2-END"};
	@Test
	public void test() {
		assertEquals("GOOD",tester.checkChain(input1));
		assertEquals("BAD", tester.checkChain(input2));
	}
	@Test
	public void test1() {
		assertEquals("BAD", tester.checkChain(input3));
	}

}
