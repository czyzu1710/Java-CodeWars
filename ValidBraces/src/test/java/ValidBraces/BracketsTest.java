package ValidBraces;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BraceCheckerTest{
 	BraceChecker braceChecker = new BraceChecker();

	@Test
	void TestSplitExpression(){
		List<String> expected = List.of("{", "[", "(", ")", "]", "}");
		assertEquals(expected,BraceChecker.split("{[()]}"));
	}
	@Test
	void TestSplitWithSpaces(){
		List<String> expected = List.of("{", "[", "(", ")", "]", "}");
		assertEquals(expected,BraceChecker.split("   {  [(   ) ]   }	"));
	}

	@Test
	void TestOneRighBracket(){
		String oneBracket = "]";
		boolean result = braceChecker.isValid(oneBracket);
		assertFalse(result);
	}

	@Test
	void TestOddNumberOfBraceChecker(){
		var bI = "[[(";
	   	var bII = "()((())";
		var bIII = "[]{}[}[[}]}";

		var result01 = braceChecker.isValid(bI);
		var result02 = braceChecker.isValid(bII);
		var result03 = braceChecker.isValid(bIII);

		assertFalse(result01 | result02 | result03 );
	}

	@Test
	void TestOneFullBracket(){
		String bracket = "()";
		boolean result = braceChecker.isValid(bracket);
		assertTrue(result);

	}
	@Test
	void TestDifferentLeftRight(){
		String bracket = "(]";

		boolean result = braceChecker.isValid(bracket);
		assertFalse(result);
	}

	@Test
	void TestFullGood(){
		String bracket = "([])";
		boolean result = braceChecker.isValid(bracket);
		assertTrue(result);
	}
	@Test
	void TestLeftsOnly(){
		String bracket = "((";
		boolean result = braceChecker.isValid(bracket);
		assertFalse(result);

	}
}
