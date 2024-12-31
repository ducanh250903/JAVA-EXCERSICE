package psi.com;

/*
Bài 2: Tính diện tích hình chữ nhật
Tạo class Rectangle với các thuộc tính: width, height.
Thêm phương thức calculateArea() trả về diện tích.
Viết chương trình sử dụng class Rectangle để tính diện tích của một hình chữ nhật.
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public static void main (String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        double area = rectangle.calculateArea();
        System.out.println("The area of the rectangle is " + area);

    }

}
 */

public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public static void main (String[] args) {
        Rectangle rectangle = new Rectangle(6.0, 5.0);
        double area = rectangle.calculateArea();
        System.out.println("Dien tich hinh chu nhat la: " + area);
    }
}
