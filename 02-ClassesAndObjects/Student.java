public class Student {
    String name;
    int age;
    int studentIdCard;
    boolean isValid;
    int semesterNumber;
    float averageGrade;


    void sayHello()
    {
        System.out.println("Hello from " + name);
    }
    void displayName()
    {
        System.out.println("My name is " + name);
    }
    void displayAge()
    {
        System.out.println("I'm " + age + " years old");
    }
    void semesterInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Semester number: " + semesterNumber);
        System.out.println("Average grade: " + averageGrade);
    }
    void cardInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Card ID: " + studentIdCard);
        System.out.println(isValid ? "Valid" : "Invalid");
    }
    void changeCardStatus(boolean valid)
    {
        isValid = valid;
    }
}


