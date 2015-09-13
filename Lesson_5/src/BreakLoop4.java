// Pouziti prikazu break k opusteni vnorenych smycek.
class BreakLoop4 {
        public static void main(String args[]) {
                outer: for(int i=0; i<3; i++) {
                        System.out.print("Pruchod " + i + ": ");
                        for(int j=0; j<100; j++) {
                                if(j == 10) break outer; // opusteni obou smycek
                                System.out.print(j + " ");
                        }
                        System.out.println("Toto se nevytiskne.");
                }
                System.out.println("Smycky dokonceny.");
        }
}
