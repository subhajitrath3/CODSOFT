package internship;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of subjects
        System.out.print("Enter the number of subjects: ");
        int Subjects = scanner.nextInt();
        double[] marks = new double[Subjects];
        double totalMarks = 0;
        boolean right = false;
        // Input marks for each subject
        for (int i = 0; i < Subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        for (int i = 1; i < Subjects; i++) {
            if (marks[i] > 100) {
                right = true;
                System.out.println("Invalid Inputs Found at Position :" + (i + 1));
                System.out.println("Grades = N.A");
            }
        }
        while (!right) {
            // Calculate average percentage
            double avg = (double) totalMarks / Subjects;

            // Determine grade based on average percentage
            String grades;

            if (avg >= 95) {
                grades = "O";
            } else if (avg < 95 && avg >= 90) {
                grades = "A";
            } else if (avg < 90 && avg >= 80) {
                grades = "B";
            } else if (avg < 80 && avg >= 70) {
                grades = "C";
            } else if (avg < 70 && avg >= 60) {
                grades = "D";
            } else if (avg < 60 && avg >= 50) {
                grades = "E";
            } else {
                grades = "F";
            }
            float avgpercent = (float) totalMarks / Subjects;

            // Display the results
            System.out.println("Total Marks Obtained is :" + totalMarks);
            System.out.println("Average Percent Obtained is :" + avgpercent + "%");
            System.out.println("Grades Obtained is :" + grades);
            break;
        }
    }
}