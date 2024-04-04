package JavaProgram;

import java.util.HashSet;

import org.openqa.selenium.grid.Main;

public class FrequencyOfTheCharacter 
{
public static void main(String[] args) 
{
	String str="Hello World";
	HashSet<Character> set=new HashSet<>();
	for(int i=0;i<str.length();i++)
	{
		set.add(str.charAt(i));
		
	}
	for(Character ch:set)
	{
		int count=0;
		for(int j=o;j<str.length();j+)
			+
		
			if(str.charAt(i)==ch)
			{
				count++;
			}
				
		
		System.out.println(ch+ " = "+ count);
	}
	
}
}
