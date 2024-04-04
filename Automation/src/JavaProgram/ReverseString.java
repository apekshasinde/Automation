package JavaProgram;

public class ReverseString
{
public static void main(String[] args)
{
String s="Hello World";
String temp="";
System.out.println(s);
for(int i=s.length()-1;i>=0;i--)
{
	temp+=s.charAt(i);
	
	}
s=temp;
System.out.println(s);
}
}
