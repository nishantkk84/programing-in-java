import java.util.Scanner;
public class mogi_02 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxScore = Integer.MIN_VALUE; 
        int minScore = Integer.MAX_VALUE; 

        
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "Enter the game points for the second person (0-300 points): ");
            int score = scanner.nextInt();

            if (score < 0 || score > 300) {
                System.out.println("Invalid score, must be entered in the range of 0 to 300.");
                i--; 
                continue;
            }

          
            if (score > maxScore) {
                maxScore = score;
            }
            if (score < minScore) {
                minScore = score;
            }
        }

       
        System.out.println("The maximum number of game points for 5 players  " + maxScore + " is。");
        System.out.println("Tminimun number of game points for 5 players " + minScore + " is。");

        scanner.close();
    }
}
