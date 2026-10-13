// // // // // public class Main {
// // // // // public static void main(String[] args) {
// // // // // Student s1 = new Student("SV01", "An", 8.5);
// // // // // Student s2 = new Student("SV02", "Bình", 6.0);

// // // // // System.out.println(s1); // gọi toString()
// // // // // System.out.println(s2.getName() + ": " + s2.rank());

// // // // // s2.setGpa(7.2);
// // // // // s2.setGpa(15); // bị từ chối, gpa vẫn là 7.2
// // // // // System.out.println(s2.getName() + ": " + s2.getGpa());

// // // // // }
// // // // // }
// // // // import java.util.Scanner;

// // // // public class Main {
// // // // public static void main(String[] args) {
// // // // Scanner sc = new Scanner(System.in);

// // // // StudentManager manager = new StudentManager(5);
// // // // manager.inputAll(sc);

// // // // System.out.println("\nSinh viên có GPA cao nhất:");
// // // // System.out.println(manager.findTopStudent());

// // // // sc.close();
// // // // }
// // // // }
// // // public class Main {
// // // public static void main(String[] args) {

// // // Employee[] employees = {
// // // new FullTimeEmployee("An"),
// // // new PartTimeEmployee("Binh", 30)
// // // };

// // // for (Employee employee : employees) {
// // // System.out.printf(
// // // "%s: %,.0f VND%n",
// // // employee.name,
// // // employee.calculateSalary());
// // // }
// // // }
// // // }
// // public class Main {

// // public static void main(String[] args) {
// // Animal dog = new Dog("Buddy");
// // dog.makeSound(); // Output: Woof!

// // Animal cat = new Cat("Whiskers");
// // cat.makeSound(); // Output: Meow!
// // }
// // }

// public class Main {
//     public static void main(String[] args) {
//         Television tv = new Television();

//         tv.turnOn();
//         tv.turnOff();
//     }
// }
public class Main {
    public static void main(String[] args) {
        double price = 200000;

        Discountable discount10 = new PercentageDiscount();
        Discountable discount50000 = new FixedDiscount();

        System.out.println("Gia goc: " + price);
        System.out.println(
                "Sau khi giam 10%: " + discount10.applyDiscount(price));
        System.out.println(
                "Sau khi giam 50.000: " + discount50000.applyDiscount(price));
    }
}