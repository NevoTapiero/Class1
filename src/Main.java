public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0.16, 1.0);
        System.out.println(r1.toString());
        r1.setLength((r1.getLength()/4));
        r1.setWidth((r1.getWidth()*4));
        System.out.println(r1.toString());
        System.out.println(r1.isSquare());
        System.out.println("the area of the Rectangle is: " + r1.calculateArea());

    }
}