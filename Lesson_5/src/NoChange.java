// Iteracni promenna smycky for ve stylu for-each je pouze pro cteni.
class NoChange {
        public static void main(String args[]) {
                int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
                
                for(int x: nums) {
                        System.out.print(x + " ");
                        x = x * 10; // toto nema zadny vliv na pole nums
                }
                
                System.out.println();
                
                for(int x : nums)
                        System.out.print(x + " ");
                
                System.out.println();
        }
}
