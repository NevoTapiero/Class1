public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getDiagonal() {
        double diagonal = (Math.pow(length, length) + Math.pow(width, width));
        return diagonal;
    }

    public double calculateArea(){
        double area = (length * width);
        return area;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public boolean isSquare() {
        if (width==length)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}