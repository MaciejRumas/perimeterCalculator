public class Triangle extends Figure implements Print{
    double a, b, c;
    double calculateArea()
    {
        double p = (a + b + c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    double calculatePerimeter()
    {
        return a + b + c;
    }

    public Triangle(double a, double b, double c) {
        if(a < 0 || b < 0 || c < 0)
        {
            throw new IllegalArgumentException();
        }
        if(a + b <= c || a + c <= b || c + b <= a)
        {
            throw new ArithmeticException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

   public void print()
    {
    System.out.println("Sides: "+ a +", "+ b +", "+ c );
    System.out.println("Perimeter: "+calculatePerimeter());
    System.out.println("Area: "+calculateArea());
    }
}

