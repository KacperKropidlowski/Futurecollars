package Task2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3,4,5,4);
        System.out.println(triangle1.getArea());
        System.out.println(triangle1.getPerimeter());

        Square square1 = new Square(5);
        System.out.println(square1.getArea());
        System.out.println(square1.getPerimeter());

        Rectangle rectangular1 = new Rectangle(3,8);
        System.out.println(rectangular1.getArea());
        System.out.println(rectangular1.getPerimeter());

        Circle circle1 = new Circle(7);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

    }
}
