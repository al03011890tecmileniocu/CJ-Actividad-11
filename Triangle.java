public class Triangle implements Shape {
    @Override
    public void getArea() {
        System.out.println("What is the value of the base?");
        double base = sc.nextDouble();
        System.out.println("What is the value of the height?");
        double height = sc.nextDouble();
        //Area formula
        double areaValue = (height*base)/2;
        System.out.println("The value of the area is: "+areaValue);
        System.exit(0);
    }
    @Override
    public void getPerimeter() {
        System.out.println("What is the value of the first side?");
        double sideOne = sc.nextDouble();
        System.out.println("What is the value of the second side?");
        double sideTwo = sc.nextDouble();
        System.out.println("What is the value of the third side?");
        double sideThree = sc.nextDouble();
        //Perimeter formula
        double diameterValue = (sideOne + sideTwo + sideThree);
        System.out.println("The value of the perimeter is: "+diameterValue);
        System.exit(0);
    }
}
