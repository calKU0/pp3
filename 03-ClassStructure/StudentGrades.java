import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class StudentGrades {

    String studentName;
    double[] grades;
    int numberOfGrades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    StudentGrades(String name, int numberOfGrades) 
    {
        Random rdm = new Random();
        this.numberOfGrades = rdm.nextInt(numberOfGrades);
        this.studentName = name;
    }

    StudentGrades(String name) 
    {
        this.studentName = name;

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many grades? ");
        int amount = scanner.nextInt();
        grades = new double[amount];

        for (int i = 0; i < amount; i++) {
            System.out.print("\nEnter " + (i + 1) + " grade: ");
            double grade = scanner.nextDouble();
            grades[i] = grade;
        }

        scanner.close();
    }

    public double lowestGrade()
    {
        double lowestGrade = this.grades[0];
        for (int i = 0; i <= this.grades.length - 1; i++)
        {
            for (int z = 1; z <= this.grades.length - 1; z++)
            {
                if (this.grades[i] < this.grades[z] & this.grades[i] < lowestGrade)
                {
                    lowestGrade = this.grades[i];
                }
            }
        }

        return lowestGrade;
    }

    public double highestGrade()
    {
        double highestGrade = this.grades[0];
        for (int i = 0; i <= this.grades.length - 1; i++)
        {
            for (int z = 1; z <= this.grades.length - 1; z++)
            {
                if (this.grades[i] > this.grades[z] & this.grades[i] > highestGrade)
                {
                    highestGrade = this.grades[i];
                }
            }
        }

        return highestGrade;
    }

    public int numberOfGrades()
    {
        return grades.length;
    }

    public double arithmeticMean()
    {
        double sum = 0;
        for(double grade : grades)
        {
            sum = sum + grade;
        }
        
        return sum / grades.length;
    }

    public String studentInfo()
    {
        return "Student name: " + this.studentName + "\nStudent's grades: " + Arrays.toString(this.grades) + "\nLowest grade: " + lowestGrade() + "\nHighest grade: " + highestGrade() + "\nArithmetic Mean: " + arithmeticMean();
    }

    public static void main(String[] args) {
        double[] g1 = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        double[] g2 = {2.0, 3.0, 2.0, 4.5, 4.5};
        StudentGrades s1 = new StudentGrades("Amanda", g1);
        StudentGrades s2 = new StudentGrades("James", g2);
        StudentGrades s3 = new StudentGrades("Ala");

        System.out.println(s1.studentInfo());
        System.out.println(s2.studentInfo());
        System.out.println(s3.studentInfo());
    }
}

