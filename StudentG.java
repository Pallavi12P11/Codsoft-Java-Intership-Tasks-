import java.util.Scanner;

public class StudentG{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of Maths:");
        int mathMarks = sc.nextInt();

        System.out.println("Enter marks of English:");
        int englishMarks = sc.nextInt();

        System.out.println("Enter marks of Science:");
        int scienceMarks = sc.nextInt();

        System.out.println("Enter marks of Hindi:");
        int hindiMarks = sc.nextInt();

        int totalMarks = mathMarks + englishMarks + scienceMarks + hindiMarks;
        double percentage = ((double) totalMarks / 400) * 100;

        System.out.println("Total Marks is " + totalMarks);
        System.out.println("Percentage is " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B+");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 50) {
            System.out.println("Grade: C+");
        } else if (percentage >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}
