public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Krzysztof";
        s1.age = 21;

        s1.sayHello();
        s1.displayName();
        s1.displayAge();

        System.out.println("\n-------------------------\n");

        Student s2 = new Student();
        s2.name = "Anna";
        s2.age = 32;

        s2.sayHello();
        s2.displayName();
        s2.displayAge();

        System.out.println("\n-------------------------\n");

        Student s3 = new Student();
        s3.name = "Bob";
        s3.age = 22;
        s3.averageGrade = 3.5f;
        s3.isValid = true;
        s3.studentIdCard = 228528;

        s3.semesterInfo();
        s3.changeCardStatus(false);
        s3.cardInfo();

        System.out.println("\n-------------------------\n");

        Student s4 = new Student();
        s4.name = "Tom";
        s4.age = 25;
        s4.averageGrade = 4.2f;
        s4.isValid = true;
        s4.studentIdCard = 228528;

        s4.semesterInfo();
        s4.cardInfo();
        s4.changeCardStatus(true);

        


    }
}
