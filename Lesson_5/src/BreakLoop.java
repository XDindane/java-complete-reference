// Pouziti prikazu break k opusteni smycky for.
class BreakLoop {
        public static void main(String args[]) {
                for(int i=0; i<100; i++) {
                        if(i == 10) break; // ukonceni smycky je-li i rovno 10
                        System.out.println("i: " + i);
                }
                System.out.println("Smycka ukoncena.");
        }
}
