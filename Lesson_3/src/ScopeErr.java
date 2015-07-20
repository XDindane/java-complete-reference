// Tento program nebude mozne zkompilovat.
class ScopeErr {
        public static void main(String args[]) {
                int bar = 1;
                { // vytvoreni noveho rozsahu platnosti
                        // Chyba v dobe kompilace – promenna bar jiz definovana!
                        int bar = 2; 
                }
        }
}
