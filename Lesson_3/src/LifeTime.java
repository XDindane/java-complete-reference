// Ukazka zivotnosti promenne.
class LifeTime {
        public static void main(String args[]) {
                int x;
                
                for(x = 0; x < 3; x++) {
                        int y = -1; // y je inicializovana pri kazdem vstupu do bloku
                        // nasledujici radek vzdy zobrazi hodnotu -1
                        System.out.println("Hodnota y je: " + y); 
                        y = 100;
                        System.out.println("Hodnota y nyni je: " + y);
                }
        }
}
