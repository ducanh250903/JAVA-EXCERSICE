//package psi.com;
//
//import java.util.ArrayList;
//
///*
//Tạo lớp cha Animal với thuộc tính name và phương thức makeSound().
//Tạo các lớp con:
//Dog: Ghi đè phương thức makeSound() để in ra "Gâu gâu".
//Cat: Ghi đè phương thức makeSound() để in ra "Meo meo".
//Viết chương trình tạo danh sách các đối tượng Animal và gọi makeSound() cho từng đối tượng.
// */
//class Animal {
//    protected String name;
//
//    public Animal(String name) {
//        this.name = name;
//    }
//
//    public void makeSound() {
//        System.out.println("Animal phát ra âm thanh.");
//    }
//}
//
//class Dog extends Animal {
//    //constructor
//    public Dog(String name) {
//        super(name);
//    }
//
//    @Override
//    public void makeSound() {
//        System.out.println(name + "Gâu gâu");
//    }
//}
//
//class Cat extends Animal {
//    public Cat(String name) {
//        super(name);
//    }
//
//    @Override
//    public void makeSound() {
//        System.out.println(name + "Meo meo");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Animal> animals = new ArrayList<Animal>();
//        animals.add(new Dog("Dog"));
//        animals.add(new Cat("Cat"));
//
//             //hiem thi cac phan tu animal
//        for (Animal animal : animals) {
//            animal.makeSound();
//        }
//    }
//}
//
//
