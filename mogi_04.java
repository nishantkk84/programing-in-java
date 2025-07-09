
public class mogi_04 {
	
	public static void main(String[] args) {
       
        int[] TBL = {10, 95, 23, 45, 87, 63, 10, 40, 60, 85, 33, 26, 97, 71, 55};
        int countMultiplesOf4 = 0;
        int countIndexMultiplesOf3 = 0;

        System.out.println("Array values:");
        for (int i = 0; i < TBL.length; i++) {
            System.out.print(TBL[i] + " ");
        }
        System.out.println("\n");

        
        for (int value : TBL) {
            if (value % 4 == 0) {
                countMultiplesOf4++;
            }
        }
        System.out.println("Number of values that are multiples of 4: " + countMultiplesOf4);

       
        for (int i = 1; i < TBL.length; i++) {
            if (i % 3 == 0) {
                countIndexMultiplesOf3++;
            }
        }
        System.out.println("Number of values for which the index is a multiple of 3 (excluding index 0): " + countIndexMultiplesOf3);
    }

}
