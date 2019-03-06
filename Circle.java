public class Circle extends Figure implements Print{

    double r;
    double calculateArea()
    {
        return Math.PI * r * r;
    }

    double calculatePerimeter()
    {
        return 2*Math.PI * r;
    }

    public Circle(double r) {
        if(r < 0)
        {
            throw new IllegalArgumentException();
        }
        this.r = r;
    }

    public void print()
    {
        System.out.println("Radius: "+ r );
        System.out.println("Perimeter: "+ calculatePerimeter());
        System.out.println("Area: "+ calculateArea());
    }
}
