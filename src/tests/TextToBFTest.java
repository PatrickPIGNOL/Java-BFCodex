package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bf.BFCodex;
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
		assertEquals(vResult, BFCodex.mTextToBF("Hello World !"));
	}
}
