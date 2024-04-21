public class Circle implements Shape {

    @Override
    public void getArea() {
        System.out.println("What is the value of the radius?");
        double radius = sc.nextDouble();
        double areaValue = Math.pow(pi*radius,2);
        System.out.println("The value of the area is: "+areaValue);
        System.exit(0);
    }
    @Override
    public void getPerimeter() {
        System.out.println("What is the value of the diameter?");
        double diameter = sc.nextDouble();
        double diameterValue = diameter * pi;
        System.out.println("The value of the perimeter is: "+diameterValue);
        System.exit(0);
    }
}
