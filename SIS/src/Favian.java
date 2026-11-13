import java.util.Scanner;

public class Favian
	{
		public static void main(String[] args) 
			{
				
				int aura = 0;
				Scanner userIntInput = new Scanner(System.in);
				Scanner userStringInput = new Scanner(System.in);
				System.out.println("What is your name");
				String name = userStringInput.nextLine();
				if(name.equals(name))
					aura++;
				if(aura == 1)
					System.out.println("Frank is aura");
				else
					System.out.println("your has ZERO aura");
			}
	}
