package psi.com;


// Tuần 3
/*
1.1-1.2. Cách khai báo và sử dụng class:
 */

public class Person {
    private String name;
    private int age;

    //constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Iam " + name + " , " + age + " year old."); 
    }

    public static void main(String[] args) {
        Person person = new Person("Ly", 25);
        person.introduce();
    }
}

