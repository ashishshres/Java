class Student {
    int roll;
    String name;
}

public class App {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Aryan Adhikari";

        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Bishal Baniya";

        Student s3 = new Student();
        s3.roll = 3;
        s3.name = "Shikshya Mainali";

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%d %s\n", students[i].roll, students[i].name);
            /*
             * 1 Aryan Adhikari
             * 2 Bishal Baniya
             * 3 Shikshya Mainali
             */
        }

        for (Student stud : students) {
            System.out.printf("%d %s\n", stud.roll, stud.name);
            /*
             * 1 Aryan Adhikari
             * 2 Bishal Baniya
             * 3 Shikshya Mainali
             */
        }
    }
}
