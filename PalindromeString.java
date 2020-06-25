import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class PalindromeString
{
	public static boolean isPalindrome(String input)
	{
		return input.equalsIgnoreCase(new StringBuilder().append(input).reverse().toString());
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		List<String> palindrome = new ArrayList<String>();
		List<String> res;
		Predicate<String> predicate=StringPalindrome::isPalindrome;      
		int num;
		
		System.out.print("Enter no of strings : ");
		num = s.nextInt();
		
		System.out.println("Enter strings");
		for(int iter=1;iter<=num;iter++)
		{
			palindrome.add(s.next());
		}
		
		res=palindrome.stream().filter(predicate).collect(Collectors.toList());
		
		System.out.println(res);
	}
}
