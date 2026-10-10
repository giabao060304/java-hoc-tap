public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("SV01", "An", 8.5);
        Student s2 = new Student("SV02", "Bình", 6.0);

        System.out.println(s1); // gọi toString()
        System.out.println(s2.getName() + ": " + s2.rank());

        s2.setGpa(7.2);
        s2.setGpa(15); // bị từ chối, gpa vẫn là 7.2
        System.out.println(s2.getName() + ": " + s2.getGpa());

    }
}
