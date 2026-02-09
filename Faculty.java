import java.util.Scanner;
public class Faculty
{
    int age;
    String name;
    void getData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\nFaculty Name : ");
        name = scan.nextLine();
        System.out.println("\n\nFaculty Age : ");
        age = scan.nextInt();
    }
    void display()
    {
        System.out.println("Faculty Name : "+name);
        System.out.println("Faculty Age : "+age);
    }
    public static void main(String [] args)
    {
        Faculty f = new Faculty();
        f.getData();
        System.out.println("\n\nFaculty Details");
        System.out.println("\n-----------------");
        f.display();
    }
}