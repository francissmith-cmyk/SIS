
public class AddorDelete
	{
		public static void AddClass()
		{
			System.out.println("Who's grade do you wish to change?");
					for (Student s : Txt.Directory) 
						{
					 System.out.print(". " + s.getFirstName()+" ");
			            System.out.print(s.getLastName()+": ");
			            System.out.print(s.getPeriod1());
			            System.out.print(" "+ s.getGrade1()+", ");
			            System.out.print(s.getPeriod2());
			            System.out.print(" "+ s.getGrade2()+", ");
			            System.out.print(s.getPeriod3());
			            System.out.println(" "+ s.getGrade3());
						}
		}
	}
