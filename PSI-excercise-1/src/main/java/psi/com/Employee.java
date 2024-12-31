package psi.com;
/*
Bài tập thực hành Ngày 2:
Bài 1: Quản lý thông tin nhân viên
Tạo class Employee với các thuộc tính: id, name, position.
Viết hàm hiển thị thông tin nhân viên: showInfo().
Tạo 2 đối tượng Employee và gọi phương thức showInfo().
 */
public class Employee {
    private int id;
    private String name;
    private String position;

    //constructor
    public Employee(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public void showInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Position: " + position);
        System.out.println("----------------------------------");

    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John", "Smith");
        Employee e2 = new Employee(2, "John", "Smith");
        e1.showInfo();
        e2.showInfo();
    }

}




