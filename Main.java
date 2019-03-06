import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Choose your figure: (triangle, square, circle)");
            System.out.println("If you wish to exit type: exit");
            String figure = scanner.nextLine().toLowerCase();


            switch (figure) {
                case "triangle":

                        System.out.println("Enter length's: ");
                        try {
                            double a = scanner.nextDouble();
                            double b = scanner.nextDouble();
                            double c = scanner.nextDouble();
                            try {
                                Triangle triangle = new Triangle(a, b, c);
                                triangle.print();
                            }catch(IllegalArgumentException e){
                                System.out.println("Sides have to be positive");
                            }
                            catch (ArithmeticException e){
                                System.out.println("Triangle can not be built using these sides");
                            }

                        } catch (Exception e) {
                            System.out.println("Invalid argument, please enter a number");
                        }
                        break;

                case "square":
                    System.out.println("Enter side length: ");
                    try {
                        double a = scanner.nextDouble();
                       try {
                           Square square = new Square(a);
                           square.print();
                       }catch(IllegalArgumentException e){
                           System.out.println("Side length have to be positive");
                       }
                    } catch (Exception e) {
                        System.out.println("Invalid argument, please enter a number");
                    }
                    break;

                case "circle":
                    System.out.println("Enter radius: ");
                    try{
                        double r = scanner.nextDouble();
                        try{
                            Circle circle = new Circle(r);
                            circle.print();
                        }catch(IllegalArgumentException e){
                            System.out.println("Radius have to be positive");
                        }
                    }catch(Exception e) {
                        System.out.println("Invalid argument, please enter a number");
                    }
                    break;

                case "exit":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid argument");
                    break;

            }
            String blank = scanner.nextLine();
        }
    }
}
