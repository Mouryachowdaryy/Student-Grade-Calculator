import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjects = 5;
        int totalMarks = 0;

        System.out.println("📚 Enter marks for " + subjects + " subjects (out of 100):");

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();

            // Basic validation
            if (marks < 0 || marks > 100) {
                System.out.println("❌ Invalid marks! Please enter between 0–100.");
                i--; // repeat the same subject input
                continue;
            }

            totalMarks += marks;
        }

        double percentage = totalMarks / (double) (subjects);
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 45) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n🎓 Result Summary:");
        System.out.println("Total Marks: " + totalMarks + " / " + (subjects * 100));
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);

        sc.close();
    }
}
