import java.util.Scanner;
public class mogi_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();
        
        System.out.print("name of your department: ");
        String department = scanner.nextLine();
        
        System.out.print("Please enter your score in Japanese: ");
        int japaneseScore = scanner.nextInt();
        
        System.out.print("Please enter your math score: ");
        int mathScore = scanner.nextInt();
        
        System.out.print("Please enter your english score: ");
        int englishScore = scanner.nextInt();

      
        int totalScore = japaneseScore + mathScore + englishScore;
        double averageScore = totalScore / 3.0;


        String grade;
        if (averageScore >= 80) {
            grade = "excellent";
        } else if (averageScore >= 60) {
            grade = "good";
        } else if (averageScore >= 40) {
            grade = "Acceptable";
        } else {
            grade = "Impossible";
        }

       
        System.out.println("３total score of subject " + totalScore + "marks・The average score is" + String.format("%.1f", averageScore) + "marks。");
        System.out.println(department + "student " + name + "The grading of the three," + grade + "");

        scanner.close();
    }
}





