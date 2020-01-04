package main;
import bf.BFCodex;
import tests.BFCodexTestSuite;
import tests.runtime.RuntimeTest;

public class Main 
{
	public static void main(String[] pArguments)
	{
		//RuntimeTest.mRuntimeTest(BFCodexTestSuite.class);
		if(pArguments[0].contains("BF"))
		{
			System.out.println(BFCodex.mBFToText(pArguments[1]));
		}
		else
		if(pArguments[0].contains("TXT"))
		{
			System.out.println(BFCodex.mTextToBF(pArguments[1]));
		}
		else
		{
			System.out.println("Usage : BFCodex [BF|TXT] [Source|Message]\n");
		}
	}
}
