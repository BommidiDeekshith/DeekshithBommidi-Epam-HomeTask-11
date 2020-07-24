package lambdasandstreams;

import java.util.*;
import java.util.stream.IntStream;

public class PalindromeStrings {
	static List<String> PalindromeCheck(List<String> stringsList)
	{
		List<String> answerList=new ArrayList<String>();
		for(String item:stringsList)
		{
			String tempString =item.toLowerCase();
			tempString.replace("\\s","");
			int stringSize=tempString.length();
			if(IntStream.range(0,stringSize/2).noneMatch(i->tempString.charAt(i)!=tempString.charAt(stringSize-i-1)))
				answerList.add(item);
		}
		return answerList;
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Size of the list : ");
		int listSize = sc.nextInt();
		System.out.print("\nEnter the elements of the List : ");
		List<String> stringsList = new ArrayList<String>();
		for(int count=0;count<listSize;count++)
		{
			String element =sc.next();
			stringsList.add(element);
		}
		List<String> updatedList = PalindromeCheck(stringsList);
		System.out.print("\nPalindromes in the given List are : ");
		for(String item : updatedList)
		{
			System.out.print(item+" ");
		}
		sc.close();
	}
}
