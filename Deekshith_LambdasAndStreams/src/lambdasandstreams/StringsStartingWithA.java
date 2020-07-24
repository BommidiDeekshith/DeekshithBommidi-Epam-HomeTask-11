package lambdasandstreams;

import java.util.*;
import java.util.stream.*;

public class StringsStartingWithA 
{
	static List<String> FilterStrings(List<String> stringsList)
	{
		return stringsList.stream().filter(s->s.startsWith("a")).filter(s->s.length()==3).collect(Collectors.toList());
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
		List<String> answerList=FilterStrings(stringsList);
		System.out.print("The valid Strings are : ");
		for(String item:answerList)
		{
			System.out.print(item+" ");
		}
		sc.close();
	}
}
