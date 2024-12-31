package psi.com;

//public class Main {
//    public static void main(String[] args) {
////        int num = 10;
////        Integer boxedNum = num;
////        int unboxedNum = boxedNum;
////
////        System.out.println("Autoboxing: " + boxedNum);
////        System.out.println("Unboxing: " + unboxedNum);
////
////        int age = 20;
////        if (age >= 18) {
////            System.out.println("Ban da du tuoi di tu");
////        } else {
////            System.out.println("Ban ch da du tuoi di tu");
////        }
////
////        int day = 1;  // Giá trị ngày
////        switch (day) {
////            case 1:
////                System.out.println("Thứ Hai");
////                break;
////            case 2:
////                System.out.println("Thứ Ba");
////                break;
////            case 3:
////                System.out.println("Thứ Tư");
////                break;
////            default:
////                System.out.println("Không phải ngày hợp lệ");
////        }
////
////        int month = 9;  // Thay đổi giá trị để kiểm tra
////        switch (month) {
////            case 1: case 2: case 3:
////                System.out.println("Mùa Xuân");
////                break;
////            case 4: case 5: case 6:
////                System.out.println("Mùa Hạ");
////                break;
////            case 7: case 8: case 9:
////                System.out.println("Mùa Thu");
////                break;
////            case 10: case 11: case 12:
////                System.out.println("Mùa Đông");
////                break;
////            default:
////                System.out.println("Không hợp lệ");
////        }
////
////
////        for (int i = 0; i < 5; i++) {
////            System.out.println("Lần lặp: " + i);
////        }
//
////        int i = 1;
////        while (i <= 5) {
////            System.out.println("Gia tri cua i: " + i);
////            i++;
////        }
//
////        do {
////            System.out.println("Gia tri cua i: " + i);
////            i++;
////        } while (i <= 5);
////
//        //==== for - while ====
//        //Dung for
////        for (int i = 0; i < 5; i++) {
////            System.out.println("Lan lap: " + i);
////        }
////        // chuyen sang while
////        int i = 0;
////        while (i < 5) {
////            System.out.println("Lan lap: " + i);
////            i++;
////        }
//
//        // ==== Tu while sang do-while ====
//        // Dung while
////        int i = 0;
////        while ( i < 5) {
////            System.out.println("Lan Lap while: " + i);
////            i++;
////        }
////
////        //chuyen sang do - while
////        int j = 0;
////        do {
////            System.out.println("Lan Lap do - while: " + j);
////            j++;
////        } while (j < 5);
//
//        // TASK === Viết một vòng lặp for tính tổng các số từ 1 đến 10 và chuyển nó sang while và do-while ===
////        int sumFor = 0;
////
////        for (int i = 1; i <= 10; i++) {
////            sumFor += i;
////        };
////        System.out.println("Tong(for): " + sumFor);
////
////        int sumWhile = 0;
////        int i = 1;
////        while (i <= 10) {
////            sumWhile += i;
////            i++;
////        }
////        System.out.println("Tong(while): " + sumWhile);
////
////        int sumDoWhile = 0;
////        int j = 1;
////        do {
////            sumDoWhile += j;
////            j++;
////        } while (j <= 10);
////        System.out.println("Tong(do): " + sumDoWhile);
//
//        // TASK === Sử dụng while để in bảng cửu chương từ 2 đến 9, sau đó chuyển đổi sang for. ===
//
//        //While
////        int i = 2; // bd tu 2
////        while (i <= 9) //ket thuc bang 9
////             {
////            int j = 1; // nhan tu 1
////            while (j <= 10) //ket thuc nha la 9
////            {
////                System.out.println(i + " x " + j + " = " + (i * j) );
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
////
////        //chuyen sang for
////        for (int x = 2; x <= 9; x++ ) {
////            for (int y = 1; y <= 10; y++ ) {
////                System.out.println(x + " x " + y + " = " + (x * y));
////
////            }
////            System.out.println();
////
////        }
//
//        // === Khoi tao mang ===
//
//        //a.Khởi tạo mảng với kích thước cố định
////        int [] numbers = new int [5];
////
////
////        for (int i = 0; i < numbers.length; i++) {
////            numbers[i] = i * 10;
////        }
////
////        for (int i = 0; i < numbers.length; i++) {
////            System.out.println("Gia tri tai index: " + i + ": " + numbers[i]);
////        }
//
//        //b.Khởi tạo mảng và khởi tạo trực tiếp giá trị
////        int[] numbers = {10, 20, 30, 40, 50};
////
////        for (int i = 0; i < numbers.length; i++) {
////            System.out.println("Gia tri tai index: " + i + ": " + numbers[i]);
////        }
//
//        //c. Khởi tạo mảng đa chiều
////        int [][] matrix = {
////                {1, 2, 3},
////                {4, 5, 6},
////                {7, 8, 9}
////        };
////
////        for (int i = 0; i < matrix.length; i++) {
////            for(int j = 0; j < matrix[i].length; j++) {
////                System.out.print(matrix[i][j] + " ");
////            }
////            System.out.println();
////        }
//
//        // === Mang 3 chieu ===
//
////        int[][][] array = {
////                {
////                        {1, 2, 3, 4},
////                        {5, 6, 7, 8},
////                        {9, 10, 11, 12}
////                },
////                {
////                        {13, 14, 15, 16},
////                        {17, 18, 19, 20},
////                        {21, 22, 23, 24},
////                }
////        };
////        for (int i = 0; i < array.length; i++) {
////            for (int j = 0; j < array[i].length; j++) {
////                for (int k = 0; k < array[i][j].length; k++) {
////                    System.out.print(array[i][j][k] + " ");
////                }
////                System.out.println();
////            }
////            System.out.println();
////        }
////    }
//}

// VD Tham Tri
//public class Main {
//    public static void main(String[] args) {
//        int x = 5;
//        changeValue(x);
//        System.out.println("Gia tri khi goi ham: " + x);
//
//    }
//    public static void changeValue(int x) {
//        x = 10;
//    }
//
//}

//VD Tham Chieu

//class Person {
//       String name;
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Person person = new Person();

//        person.name = "Trinh";
//        chageName(person);
//        System.out.println("Ten sau khi goi ham: " + person.name);
//    }
//    public static void chageName(Person person) {
//        person.name = "Trinh stupid";
//    }
//
//}

/*
//Bài 1: Mảng 1 chiều
//Khởi tạo một mảng số nguyên có 6 phần tử và gán giá trị vào mảng đó. Sau đó, sử dụng vòng lặp for để in ra các phần tử trong mảng.
public interface Main {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Phan tu tai index: " + i + ":" + numbers[i]);
        }
    }
}
 */
/*
//Bài 2: Mảng 2 chiều
//Khởi tạo một mảng 2 chiều có 3 hàng và 4 cột, sau đó gán giá trị vào từng phần tử của mảng và in mảng ra màn hình.

public interface Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 */

//=====Bài tập thực hành Ngày 1: =====
/*
Viết chương trình nhập tuổi từ người dùng, kiểm tra và in ra kết quả:

Nếu >= 18: "Bạn đã đủ tuổi trưởng thành."
Nếu < 18: "Bạn chưa đủ tuổi trưởng thành."

import java.util.Scanner;

public interface Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tuoi cua ban: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Ban da du tuoi truong thanh.");
        } else {
            System.out.println("Ban chua du tuoi truong thanh.");
        }

    }
}
 */
/*
Bai 2: Tính tổng các số chẵn từ 1 đến n
Viết chương trình nhập một số nguyên n từ người dùng và tính tổng các số chẵn từ 1 đến n.

import java.util.Scanner;

public interface Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("tổng các số chẵn tu 1 den: " + n + " la: " + sum);
        scanner.close();
    }
}
 */

/*
Bài 3: Tham trị
Viết chương trình:

Khai báo một biến int x = 10.
Tạo hàm modifyValue(int number) thay đổi number = 50.
Gọi hàm từ main() và kiểm tra giá trị x sau khi gọi hàm.

import java.util.Scanner;

public interface Main {
    public static void main(String[] args) {
        int x = 10;
        modiflyValue(x);
        System.out.println("Gia tri sau khi goi ham; " + x);
    }
    public static void modiflyValue(int number) {
        number = 50;
        System.out.println("Gia tri cua number ben trong ham: " + number);
    }
}

 */


/*
Bài 4: Tham chiếu
Viết chương trình:

Tạo lớp Rectangle với thuộc tính width, height.
Tạo hàm updateDimensions(Rectangle r) để thay đổi width và height.
Khởi tạo một đối tượng Rectangle, gọi hàm updateDimensions() và kiểm tra kết quả.
 */
/*
class Rectangle {
    int width;
    int height;
}

public interface Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.width = 10;
        rect.height = 20;

        updateDimemsions(rect);
        System.out.println("Chieu rong: " + rect.width + ", Chieu cao: " + rect.height);
    }

    public static void updateDimemsions(Rectangle r) {
        r.width = 20;
        r.height = 40;
    }

}
 */


// Tuần 3
/*
1.1-1.2. Cách khai báo và sử dụng class:
 */



public class Main {
    private String name;
    private int age;

    //constructor
    public Main(String name, int age) {
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
        Main person = new Main("Ly", 25);
        person.introduce();
    }
}

