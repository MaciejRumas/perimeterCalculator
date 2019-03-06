public class Square extends Figure implements Print{

        double a;
        double calculateArea()
        {
            return a*a;
        }

        double calculatePerimeter()
        {
            return 4*a;
        }

        public Square(double a) {
            if(a < 0)
            {
                throw new IllegalArgumentException();
            }
            this.a = a;
        }

        public void print()
        {
            System.out.println("Side: "+ a );
            System.out.println("Perimeter: "+ calculatePerimeter());
            System.out.println("Area: "+ calculateArea());
        }

}
