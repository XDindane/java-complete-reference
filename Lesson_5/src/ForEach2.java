// Pouziti prikazu break spolu se smyckou for ve stylu for-each.
class ForEach2 {
        public static void main(String args[]) {
                int sum = 0;
                int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
                
                // pouziti for-each stylu smycky for pro zobrazeni
                // jednotlivych hodnot a vypoctu celkoveho souctu
                for(int x : nums) {
                        System.out.println("Hodnota je: " + x);
                        sum += x;
                        if(x == 5) break; // preruseni smycky kdyz je nactena hodnota 5
                }
                System.out.println("Celkovy soucet prvnich 5 prvku je: " + sum);
        }
}
