class Rectangle
{
double length;
double breadth;
double perimeter;
double area;
    public static void main (String arr[])
    {
    Rectangle r1 = new Rectangle ();
    Rectangle r2 = new Rectangle ();
    Rectangle r3 = new Rectangle ();
 
    ri.length = 25.67; r2.length = 30.44; r3.length = 55.78;
    r1.breadth = 20.14; r2.breadth = 28.77; r3.breadth = 42.65;

    r1.perimeter = 2*(r1.length+r1.breadth);
    r2.perimeter = 2*(r2.length+r2.breadth);
    r3.perimeter = 2*(r3.length+r3.breadth);

    r1.area = r1.length*r1.breadth;
    r2.area = r2.length*r2.breadth;
    r3.area = r3.length*r3.breadth;

    System.out.println("1st rectangle: perimeter = "+r1.perimeter+" area = "+r1.area);
    System.out.println("2st rectangle: perimeter = "+r2.perimeter+" area = "+r2.area);
    System.out.println("3st rectangle: perimeter = "+r3.perimeter+" area = "+r3.area);
    }
}
