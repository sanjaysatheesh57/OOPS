class Employee
{
    int Eno;
    String Ename;

    Employee(int e, String n)
    {
        Eno = e;
        Ename = n;
    }

    void display()
    {
        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("Employee Name   : " + Ename);
        System.out.println("Employee number : " + Eno);
    }
}

public class EmployeeDemo   
{
    public static void main(String[] args)
    {
        Employee ob = new Employee(445, "Sulu");
        ob.display();
    }
}
