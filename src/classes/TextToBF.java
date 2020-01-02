package classes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import maths.Maths;

public class TextToBF 
{
	public static String mTextToBF(String pText)
	{
		int vMin = 256;
		int vMax = 0;
		Map<String, Integer> vChars = new HashMap<String, Integer>();
		List<Integer> vList = new ArrayList<Integer>();
		int vLength = pText.length();
		int vCount = 0;
		for(int vIndex = 0; vIndex < vLength; vIndex++)
		{
			char vChar = pText.charAt(vIndex);
			vMin = Math.min(vChar, vMin);
			vMax = Math.max(vChar, vMax);
			String vStringChar = new String();
			vStringChar += vChar;
			if(!vChars.containsKey(vStringChar))
			{
				vList.add((int)vChar);
				vChars.put(vStringChar, vCount);
				vCount++;
			}
		}		
		String vResult = "";	
		int vHalfMin = 16; 
		int vValue = vMax / vHalfMin;
		int vReste = vMax % vHalfMin;
		
		for(int vIndex = 0; vIndex < vHalfMin; vIndex++)
		{
			vResult += "+";
		}
		vResult += "[";
		for(Integer vCharValue : vList)
		{
			vResult += ">";
			int vQuotien = vCharValue / vHalfMin;
			for(int vIndex = 0; vIndex < vQuotien; vIndex++)
			{
				vResult += "+";
			}
		}
		for(int vIndex = 0; vIndex < vList.size(); vIndex++)
		{
			vResult += "<";
		}
		vResult += "-]";
		for(Integer vCharValue : vList)
		{
			vResult += ">";
			int vCharReste = vCharValue % vHalfMin;
			for(int vIndex = 0; vIndex < vCharReste; vIndex++)
			{
				vResult += "+";
			}
		}
		for(int vIndex = 0; vIndex < vList.size() - 1; vIndex++)
		{
			vResult += "<";
		}
		int vCurrentPosition = 0;
		for(int vIndex = 0; vIndex < pText.length(); vIndex++)
		{			
			String vChar = "";
			vChar += pText.charAt(vIndex);
			int vPosition = vChars.get(vChar);
			if(vPosition > vCurrentPosition)
			{
				int vGoal = vPosition - vCurrentPosition;
				for(int vCharIndex = 0; vCharIndex < vGoal; vCharIndex++)
				{
					vResult += ">";
					vCurrentPosition++;
				}
			}
			if(vPosition < vCurrentPosition)
			{
				int vGoal = vCurrentPosition - vPosition;
				for(int vCharIndex = 0; vCharIndex < vGoal; vCharIndex++)
				{
					vResult += "<";
					vCurrentPosition--;
				}
			}
			vResult += ".";
		}
		return vResult;		
	}
	
	
}
