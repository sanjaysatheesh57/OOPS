import java.util.Scanner;
public class Emp
{
    int empno;
    String name;

    void getData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEmployee Name :");
        name = scan.nextLine();
        
        System.out.println("\nEmployee No :");
        empno = scan.nextInt();
    }

    void display()
    {
        System.out.println("Employee name : "+name);
        System.out.println("Employee no : "+empno);
    }

    public static void main(String[] args)
    {
        Emp e = new Emp();
        e.getData();

        System.out.println("\nEmployee Details\n");
        System.out.println("_-_-_-_-_-_-_-_-_-_-_");

        e.display();
    }
}
