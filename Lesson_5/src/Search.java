// Prohledani pole pomoci for-each verze smycky for.
class Search {
        public static void main(String args[]) {
                int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
                int val = 5;
                boolean found = false;
                
                // pouziti for-each verze smycky for k vyhledani
                // zadane hodnoty v poli nums
                for(int x : nums) {
                        if(x == val) {
                                found = true;
                                break;
                        }
                }
                
                if(found)
                        System.out.println("Hodnota nalezena!");
        }
}
