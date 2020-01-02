package main;
import classes.TextToBF;
import tests.BFCodexTestSuite;
import tests.runtime.RuntimeTest;

public class Main 
{
	public static void main(String[] pArguments)
	{
		RuntimeTest.mRuntimeTest(BFCodexTestSuite.class);	
		System.out.println("BF code for \"" + pArguments[0] + "\" : " +  TextToBF.mTextToBF(pArguments[0]));
	}
}
