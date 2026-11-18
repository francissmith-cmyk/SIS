public class sis {
    public static void main(String[] args) 
    {
        Txt.main(args);
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
}
