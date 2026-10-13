package buoi10;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Student student1 = new Student("S001");
        Student student2 = new Student("S002");
        Student student3 = new Student("S003");
        Student student4 = new Student("S004");

        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.add(student3);
        studentManager.add(student4);

        System.out.println("Danh sách sinh viên:");
        studentManager.printAll();

        String searchId = "S002";
        Student foundStudent = studentManager.findById(searchId);
        if (foundStudent != null) {
            System.out.println("Tìm thấy sinh viên với ID: " + searchId);
        } else {
            System.out.println("Không tìm thấy sinh viên với ID: " + searchId);
        }

        String removeId = "S001";
        studentManager.removeById(removeId);
        System.out.println("Danh sách sinh viên sau khi xóa ID: " + removeId);
        studentManager.printAll();
    }

}
