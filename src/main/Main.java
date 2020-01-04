package main;
import bf.BFCodex;
import tests.BFCodexTestSuite;
import tests.runtime.RuntimeTest;

public class Main 
{
	public static void main(String[] pArguments)
	{
		RuntimeTest.mRuntimeTest(BFCodexTestSuite.class);	
		System.out.println("BF code for \"" + pArguments[0] + "\" : " +  BFCodex.mTextToBF(pArguments[0]));
		
	}
}
