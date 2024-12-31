package psi.com;

public class tinhchat {
    //*1.3. Tính kế thừa (Inheritance)
//Định nghĩa: Kế thừa cho phép 1 class con sử dụng lại các thuộc tính và phương thức của lớp cha (sperclass)
//VD:
////SupperClass
//public class Animal {
//    //protected có thể truy câp trực tiếp trong lớp cha (Animal)
//    protected String name;
//
//    public void eat() {
//        System.out.println(name + "eat");
//    }
//}
//
////Class
//extends kế thừa từ lớp animal
//public class Dog extends Animal {
//    public void bark() {
//        System.out.println(name + " dang sua.");
//    }
//}
//
////SD
//Dog dog = new Dog();
//dog.name = "Rex";
//dog.eat();
//dog.bark();
// */
//
///*
// ============== 1.4. Tính Đa hình(Polymorphism) ============
//ĐN:
//cho phép 1 phương thức có thể thực hiện các hành vi khác nhàu, tùy thuộc vào lớp đối tượng gọi nó
//Loại đa hình:
//- Đa hình tại runtime (Overriding):
//+ Khi lớp con ghi đè (overriding) phương thức của lớp cha
//- Đa hình tại compile-time(ocerloading):
//+ Khi cò nhiều phương thức cùng tên trong 1 lớp nhưng khác tham số
//
////VD: Overriding
//public class Animal {
//    public void makeSound() {
//        System.out.println("Animal phat ra am thanh.");
//    }
//}
//
//public class Cat extends Animal {
//    @Override
//    public void makeSound() {
//        System.out.println("Meo meo.");
//    }
//}
//
////SD
//
//Animal animal = new Cat();
//animal.makeSound();
//
////VD Overloading
//public class Animal {
//    public int add(int a, int b) {
//        return a + b;
//    };
//    public double add(double a, double b) {
//        return a + b;
//    }
//}
//
//Animal animal = new Animal();
//System.out.println(animal.add(2, 3));
//System.out.println(animal.add(2.5, 3.5));
//*/
//
//
////==== Tinh dong goi ====
//
///*
//DN:
//- Đóng gói bảo vệ dữ liệu bằng cách ẩn đi(private) và chỉ cho phép truy cập qua các phương thức công khai (getter, setter).
//- Sử dụng từ khóa private để ẩn đi dữ liệu.
//
//Lợi ích:
//-Dữ liệu an toàn, kiểm soát được truy cập và sửa đổi
//
//
////VD
//
//public class Animal {
//    private double balance;
//
//    //getter
//    public double getBalance() {
//        return balance;
//    }
//
//    //setter
//    public void setBalance(double balance) {
//        if (balance < 0) {
//            this.balance = balance;
//        } else {
//            System.out.println("so du khong hop le");
//        }
//    }
//}
//
////SD
//
//Animal animal = new Animal();
//animal.setBalance(1000);
//System.out.println(account.getBalance());
// */
//
////===== Constructor và Overloading Constructor =====
//
///*
//1. Constructor:
//- là phương thức đặc biệt được gọi tự động khi tạo đối tượng.
//- Dùng để khởi tạo giá trị ban đầu
//
//2. Overloading Constructor:
//- 1 class có thể có nhiều cóntructor với các tham số khác nhau.
//
////VD:
//
//public class Animal {
//    private String name;
//    private int age;
//
//    //constructor khong tham so
//    public Animal() {
//        this.name = "unknown";
//        this.age = 0;
//    }
//
//    //constructor co tham so
//    public Animal(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public void showInfo() {
//        System.out.println(name + ", " + age + " years old.");
//    }
//}
//
//
//
//
////SD
//public static void main(String[] args) {
//    Animal s1 = new Animal();
//    Animal s2 = new Animal("nhat", 25);
//    s1.showInfo();
//    s2.showInfo();
//}
// */

}
