public class Square implements Shape {
    @Override
    public void getArea() {
        System.out.println("What is the value of the side?");
        double side = sc.nextDouble();
        //Formula de area
        double areaValue = Math.pow(side,2);
        System.out.println("The value of the area is: "+areaValue);
        System.exit(0);
    }
    @Override
    public void getPerimeter() {
        System.out.println("What is the value of the side?");
        double side = sc.nextDouble();
        //Diameter formula
        double diameterValue = side*4;
        System.out.println("The value of the perimeter is: "+diameterValue);
        System.exit(0);
    }
}
