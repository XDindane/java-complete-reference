// Pouziti prikazu break v pripade vnorenych smycek.
class BreakLoop3 {
        public static void main(String args[]) {
                for(int i=0; i<3; i++) {
                        System.out.print("Pruchod " + i + ": ");
                        for(int j=0; j<100; j++) {
                                if(j == 10) break; // ukonceni smycky je-li j rovno 10
                                System.out.print(j + " ");
                        }
                        System.out.println();
                }
                System.out.println("Vsechny smycky ukonceny.");
        }
}
