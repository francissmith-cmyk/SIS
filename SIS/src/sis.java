import java.util.Scanner;
public class sis 
{
	public static void main(String[] args) 
		{
			
		}
	
	public static void studentGradeAndScheduleChange()
		{
			Scanner userIntInput = new Scanner(System.in);
			Scanner userStringInput = new Scanner(System.in);
			boolean isChanging = true;
			while (isChanging)
				{
				System.out.println("What would you want to change");
				System.out.println("(1) Change Grade");
				System.out.println("(2) Change Class");
				int change = userIntInput.nextInt();
				if(change == 1)
					{
						
					}
				else if(change == 2)
					{
						
					}
				else
					{
						System.out.println("Invalid");
						isChanging = true;
					}
				}
		}
}
