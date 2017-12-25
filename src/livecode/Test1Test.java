package livecode;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Test1Test {
	Test1 test = new Test1();
	String input = "abc";
	String target = "bca";
	String input1 = "cdeab";
	@Test
	public void testAna() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    test.checkAna(input, target);
	    String expect = "IS Anagram\n";
	    String result = outContent.toString();
	    System.out.println(result);
	    assertEquals(expect , result);
	}
	@Test
	public void testPermutation() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    test.permutations(input);
	    String expect = "abc\nacb\nbac\nbca\ncab\ncba\n";
	    String result = outContent.toString();
	    System.out.println(result);
	    assertEquals(expect , result);
	}
	@Test
	public void testsorting() {
	    assertEquals("abcde" , test.sortString(input1));
	}

}
