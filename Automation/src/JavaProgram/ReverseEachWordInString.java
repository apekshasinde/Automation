package JavaProgram;

public class ReverseEachWordInString
{
public static void main(String[] args)
{
	String s="Hello World";
	String rev="";
	String[] words=s.split(" ");
	for(int i=0;i<words.length;i++)
	{
		String word=words[i];
		String temp="";
		for(int j=word.length()-1;j>=0;j--)
		{
			temp+=word.charAt(j);
		}
		rev+=temp+" ";
	
	}
System.out.println(rev);
}
}
