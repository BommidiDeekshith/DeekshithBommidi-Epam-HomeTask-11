package lambdasandstreams;

import java.util.*;


public class IntegersListAverage {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Size of the list : ");
		int listSize = sc.nextInt();
		System.out.print("\nEnter the elements of the List : ");
		List<Integer> numbersList = new ArrayList<Integer>();
		for(int count=0;count<listSize;count++)
		{
			int number=sc.nextInt();
			numbersList.add(number);
		}
		
		numbersList.stream().mapToInt(number->number)
							.average()
							.ifPresent(avg->System.out.print("\nAverage is :"+avg));
		
		sc.close();
		
	}

}
