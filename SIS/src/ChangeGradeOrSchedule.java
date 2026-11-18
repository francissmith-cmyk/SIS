import java.util.Scanner;

public class ChangeGradeOrSchedule
	{
		public static void ChangeGradeOrSchedule()
		{
			Scanner userIntInput = new Scanner (System.in);
			System.out.println("What would you like to do?");
			System.out.println("1) Change Grade");
			System.out.println("2) Change Schedulee");
			int decision = userIntInput.nextInt();
			if(decision == 1)
				{
					ChangeGrade();
				}
			else if(decision == 2)
				{
					ChangeSchedule();
				}
			else 
				{
				System.out.println("Please select a valid number.");
				ChangeGradeOrSchedule();
				}
		}

		private static void ChangeGrade()
			{
				System.out.println("Who's grade do you wish to change?");
				for (Student s : Txt.Directory) 
					{
				 System.out.print(s.getFirstName()+" ");
		            System.out.print(s.getLastName()+": ");
		            System.out.print(s.getPeriod1());
		            System.out.print(" "+ s.getGrade1()+", ");
		            System.out.print(s.getPeriod2());
		            System.out.print(" "+ s.getGrade2()+", ");
		            System.out.print(s.getPeriod3());
		            System.out.println(" "+ s.getGrade3());
					}	
			}

		private static void ChangeSchedule()
			{
				
				
			}
	}
