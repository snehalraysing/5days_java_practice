import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int result;

		System.out.println("Enter n1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter n2: ");
		int n2 = sc.nextInt();

        int ch;
		do
		{
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Choose Operation: ");
			ch = sc.nextInt();

			switch(ch)
			{
				case 1: System.out.println("ADDITION");
				        result = n1+n2;
						System.out.println("Result is: " + result);
						break;

				case 2: System.out.println("SUBTRACTION");
				        result = n1-n2;
						System.out.println("Result is: " + result);
					    break;

				case 3: System.out.println("MULTIPLICATION");
					    result = n1*n2;
						System.out.println("Result is: " + result);
					    break;

				case 4: System.out.println("DIVISION");
					    result = n1/n2;
					    System.out.println("Result is: " + result);
					    break;

				case 5:System.out.println("THANKYOU");
					   break;

				default:System.out.println("Wrong Choice.")	  ;
				break;
			}

		}
		while(ch!=5);

	}
}