package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.TextToBF;
import junit.framework.TestCase;

public class TextToBFTest extends TestCase
{
	@BeforeEach
	public void setUp() throws Exception 
	{
	}

	@AfterEach
	public void tearDown() throws Exception 
	{
	}

	@Test
	public void test() 
	{
		String vResult = "++++++++++++++++[>++++>++++++>++++++>++++++>++>+++++>+++++++>++++++>++<<<<<<<<<-]>++++++++>+++++>++++++++++++>+++++++++++++++>>+++++++>++>++++>+<<<<<<<<.>.>..>.>.>.<<.>>>.<<<<.>>>>>.<<<.>>>>.";
		assertEquals(vResult, TextToBF.mTextToBF("Hello World !"));
	}
}
