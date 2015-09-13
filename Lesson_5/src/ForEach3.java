// Pouziti for-each verze smycky for pri praci s dvoudimenzionalnim polem.
class ForEach3 {
        public static void main(String args[]) {
                int sum = 0;
                int nums[][] = new int[3][5];
                
                // vlozeni nejakych hodnot do pole nums
                for(int i = 0; i < 3; i++)
                        for(int j = 0; j < 5; j++)
                                nums[i][j] = (i+1)*(j+1);
                
                // pouziti for-each verze smycky for k zobrazeni jednotlivych
                // hodnot a k vypoctu jejich souctu
                for(int x[] : nums) {
                        for(int y : x) {
                                System.out.println("Hodnota je: " + y);
                                sum += y;
                        }
                }
                System.out.println("Celkovy soucet je: " + sum);
        }
}
