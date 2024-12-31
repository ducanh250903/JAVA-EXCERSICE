package psi.com;

/*
Bài 5: Tính diện tích và chu vi hình tròn
Tạo lớp Circle với thuộc tính radius (bán kính).
Cung cấp các phương thức:
calculateArea(): Tính diện tích.
calculatePerimeter(): Tính chu vi.
Viết chương trình cho phép người dùng nhập bán kính, sau đó in ra diện tích và chu vi.
Công thức:

Diện tích = π * r²
Chu vi = 2 * π * r

 */

import java.util.Scanner;

public class Circle {
    private double radius;
    float PI = 3.14f;

    public Circle(double radius) {
        if (radius > 0) {
           this.radius = radius;
        } else {
            throw new IllegalArgumentException("Ban kinh phai lon hon 0");
        }
    }

    public double calculateArea() {
//        return Math.PI * radius * radius;
        return PI * radius * radius;
    }

    public double calculatePerimeter() {
//        return 2 * Math.PI * radius;
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nhap ban kinh: ");
        double radius = scan.nextDouble();

        try {
            Circle circle = new Circle(radius);
            System.out.println("Dien tich hinh tron: " + circle.calculateArea());
            System.out.println("chu vi hinh tron: " + circle.calculatePerimeter());
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

}
