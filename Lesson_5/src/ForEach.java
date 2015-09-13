// Ukazka pouziti for-each stylu smycky for.
class ForEach {
        public static void main(String args[]) {
                int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
                int sum = 0;
                
                // pouziti for-each stylu smycky for pro zobrazeni
                // jednotlivych hodnot a vypoctu celkoveho souctu
                for(int x : nums) {
                        System.out.println("Hodnota je: " + x);
                        sum += x;
                }
                
                System.out.println("Celkovy soucet je: " + sum);
        }
}
