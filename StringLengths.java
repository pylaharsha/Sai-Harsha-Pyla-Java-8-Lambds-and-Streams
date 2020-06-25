import java.util.function.Predicate;
import java.util.stream.*;
//import java.util.stream.Collectors;
//import java.util.Scanner;
import java.util.*;
public class StringLengths
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int num,iter;
		List<String> strings=new ArrayList<String>();
		List<String> res;//=new ArrayList<String>();
		Predicate<String> predicate = (str)->str.length()==3&&str.startsWith("a");
		
		System.out.print("Enter no of strings : ");
		num=s.nextInt();
		
		System.out.println("Enter strings");
		for(iter=1;iter<=num;iter++)
		{
			strings.add(s.next());
		}
		
		res=strings.stream().filter(predicate).collect(Collectors.toList());
		
		System.out.println(res);
	}
}
