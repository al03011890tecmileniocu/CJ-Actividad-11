import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        System.out.println("Choose a shape: ");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Choose '1' or '2' if you wish to calculate the area or the perimeter");
                int choiceAlt1 = sc.nextInt();
                if (choiceAlt1 == 1) {
                    circle.getArea();
                } else {
                    circle.getPerimeter();
                }
            case 2:
                System.out.println("Choose '1' or '2' if you wish to calculate the area or the perimeter");
                int choiceAlt2 = sc.nextInt();
                if (choiceAlt2 == 1) {
                    triangle.getArea();
                } else {
                    triangle.getPerimeter();
                }
            case 3:
                System.out.println("Choose '1' or '2' if you wish to calculate the area or the perimeter");
                int choiceAlt3 = sc.nextInt();
                if (choiceAlt3 == 1) {
                    square.getArea();
                } else {
                    square.getPerimeter();
                }
        }
    }
}
