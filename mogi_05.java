
public class mogi_05 {
 public static void main(String[] args) {
        
        int[][] TBL2 = {
            {5, 3, 2, 1, 4, 0, 0},  
            {4, 5, 4, 5, 5, 0, 0},  
            {3, 2, 5, 4, 3, 0, 0},  
            {2, 3, 3, 1, 1, 0, 0},  
            {0, 0, 0, 0, 0, 0, 0}  
        };

        
        for (int i = 0; i < 4; i++) { 
            int sum = 0;
            for (int j = 0; j < 5; j++) { 
                sum += TBL2[i][j];
            }
            TBL2[i][5] = sum; 
            TBL2[i][6] = sum / 5; 
        }

       
        for (int j = 0; j < 5; j++) {
            int columnSum = 0;
            for (int i = 0; i < 4; i++) { 
                columnSum += TBL2[i][j];
            }
            TBL2[4][j] = columnSum; 
        }

        
        int totalSum = 0;
        for (int j = 0; j < 5; j++) {
            totalSum += TBL2[4][j];
        }
        TBL2[4][5] = totalSum; 
        TBL2[4][6] = totalSum / 5; 

        
        System.out.println("Q1\tQ2\tQ3\tQ4\tQ5\ttotal\tavg\t");
        for (int i = 0; i < TBL2.length; i++) {
            for (int j = 0; j < TBL2[i].length; j++) {
                System.out.print(TBL2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
