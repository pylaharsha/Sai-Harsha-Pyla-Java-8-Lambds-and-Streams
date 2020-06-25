import java.util.Scanner;
import java.util.*;
import java.util.function.BiFunction;
public class AverageOfNumbers
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int number,av;
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		System.out.print("Enter number of numbers:");
		number=s.nextInt();
		System.out.println("Enter number");
		for(int iter=1;iter<=number;iter++)
		{
			numbers.add(s.nextInt());
		}
		av=avgOfListOfIntegers(numbers,( a, b)->a+b);
		System.out.println("Average of given numbers is : "+av);
	}
	public static int avgOfListOfIntegers(ArrayList<Integer> numbers,BiFunction<Integer,Integer,Integer> biFunction)
	{
		int sum=0,average;
		BiFunction<Integer,Integer,Integer> findDiv=(a,b)->a/b;
		for(int num:numbers)
		{
			sum=biFunction.apply(sum,num);
		}
		average=findDiv.apply(sum,numbers.size());
		return average;
	}
}
