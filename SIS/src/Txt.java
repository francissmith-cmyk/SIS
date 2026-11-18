import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Txt {
    static ArrayList<Student> Directory = new ArrayList<Student>();

    public static void main(String[] args) {
        String data = 
            "Lisa Jenkins Biology B- English A- Algebra C+\n" +
            "Paul Rodriguez English A- Algebra C+ Biology A-\n" +
            "Liz Smith Algebra A- Biology A English B+\n" +
            "Becky Collins Biology B- English A+ Algebra C+\n" +
            "Mark Adams Algebra D Biology A English B\n" +
            "Racquel Lincoln English C+ Algebra B Biology B+\n" +
            "J.J. Kendricks Biology B- English D+ Algebra C+\n" +
            "Jared Paulson Algebra C Biology A English B-\n" +
            "Kelly Nguyen Algebra C+ Biology A- English B+\n" +
            "Bobby Lang Biology B- English A- Algebra C+\n" +
            "Jennifer Martin Algebra C+ Biology A English B\n" +
            "Lissa Martinez Algebra C- Biology A- English B+\n" +
            "Andy Cooper Biology D English F Algebra C+\n" +
            "Rita Morovsky Algebra C Biology A- English B+\n" +
            "Kia Harner Algebra A- Biology A English A+\n" +
            "Jack Foster Biology B- English D Algebra C\n" +
            "Rob Harrington Algebra B+ Biology A English B+\n" +
            "Bella DuBois English C+ Algebra A- Biology B+\n" +
            "Gabe Wright Biology D English A- Algebra B+\n" +
            "Tom Kavanaugh Algebra B+ Biology A- English A-\n" +
            "Terri Casey English C+ Algebra A Biology B\n" +
            "Luke LaGrange English B- Biology D+ Algebra C+\n" +
            "Kari Henderson Algebra B- Biology A- English B+\n" +
            "Henry Li English A- Algebra A Biology B+";
        try (FileWriter writer = new FileWriter("data.txt")) 
        {
            writer.write(data);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        try 
        {
            chooseTheme();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    public static void chooseTheme() throws IOException 
    {
        try (Scanner myFile = new Scanner(new File("data.txt"))) 
        {
            while (myFile.hasNextLine()) {
                String line = myFile.nextLine();
                String[] parts = line.split(" ");
                Student student = new Student(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6], parts[7]
                );
                Directory.add(student);
            }
        }
    }
}