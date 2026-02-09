public class Square
{
    double side;
    void getinput (double s)
    {
        side = s;
    }
    double calArea()
    {
        return side * side;
    }
    public static void main(String [] args)
    {
        Square s = new Square ();
        s.getinput(12.3);
        System.out.println("Area of square = "+ s.calArea());
    }
}