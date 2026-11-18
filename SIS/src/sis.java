import java.util.Scanner;
public class sis 
{
	public static void main(String[] args) 

	{
		mainMenu();
	}
	private static void mainMenu() {
		Scanner userIntInput = new Scanner (System.in);
		System.out.println("What would you like to do?");
		System.out.println("1) add or delete a student");
		System.out.println("2) change student grades/schedule");
		System.out.println("3) sort students");
		int decision = userIntInput.nextInt();
		if(decision == 1)
			{
			addOrDelete();
			}
		else if(decision == 2)
			{
			changeGradeorSchedule();
			}
		else if(decision == 3)
			{
			sortStudents();
			}
		else 
			{
			System.out.println("Please select a valid number.");
			mainMenu();
			}
	}
	private static void sortStudents() 
		{
		System.out.println("How would you like to sort the students?");
		System.out.println("1)Sort by last name");
		System.out.println("2)Sort by GPA");
		System.out.println("3)Sort by period ");

		}

	private static void changeGradeorSchedule() 
		{
		
		Scanner userIntInput = new Scanner(System.in);
		Scanner userStringInput = new Scanner(System.in);
		boolean isChanging = true;
		while (isChanging)
			{
			System.out.println("What do you want to change?");
			System.out.println("1) Student grade");
			System.out.println("2) Student schedule");
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
	private static void addOrDelete() 
		{
		System.out.println("What do you need to do?");
		System.out.println("1) Add student");
		System.out.println("2) Delete student");
		}
}