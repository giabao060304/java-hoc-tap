
// // public class Main {
// // public static void main(String[] args) {
// // StudentManager studentManager = new StudentManager();
// // Student student1 = new Student("S001");
// // Student student2 = new Student("S002");
// // Student student3 = new Student("S003");
// // Student student4 = new Student("S004");

// // studentManager.add(student1);
// // studentManager.add(student2);
// // studentManager.add(student3);
// // studentManager.add(student4);

// // System.out.println("Danh sách sinh viên:");
// // studentManager.printAll();

// // String searchId = "S002";
// // Student foundStudent = studentManager.findById(searchId);
// // if (foundStudent != null) {
// // System.out.println("Tìm thấy sinh viên với ID: " + searchId);
// // } else {
// // System.out.println("Không tìm thấy sinh viên với ID: " + searchId);
// // }

// // String removeId = "S001";
// // studentManager.removeById(removeId);
// // System.out.println("Danh sách sinh viên sau khi xóa ID: " + removeId);
// // studentManager.printAll();
// // }

// // }
// package buoi10;

// import java.util.HashSet;
// import java.util.Set;

// public class Main {
// public static void main(String[] args) {

// // 1. Truoc khi ghi de equals() va hashCode()
// Set<StudentBefore> setBefore = new HashSet<>();

// setBefore.add(new StudentBefore());
// setBefore.add(new StudentBefore("SV01", "Binh"));

// System.out.println("=== TRUOC KHI GHI DE ===");
// System.out.println("So luong: " + setBefore.size());
// for (StudentBefore s : setBefore) {
// System.out.println(s);
// }

// // 2. Sau khi ghi de equals() va hashCode()
// Set<Student> setAfter = new HashSet<>();

// setAfter.add(new Student("SV01", "An", 3.2));
// setAfter.add(new Student("SV01", "Binh", 3.5));

// System.out.println("\n=== SAU KHI GHI DE ===");
// System.out.println("So luong: " + setAfter.size());
// for (Student s : setAfter) {
// System.out.println(s);
// }
// }
// }