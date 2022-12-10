import java.util.Scanner;


public class Solution1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine().trim());

		sc.close();

		for(int i=1;i<=10;i++)
		{
			System.out.println(N +" "+ "x"+" " + i +" "+ "=" +" "+ (N*i));
		}
	}
}
