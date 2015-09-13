// Ukazka pouziti zebriku prikazu if-else-if.
class IfElse {
        public static void main(String args[]) {
                int month = 4; // Duben
                String season;
                if(month == 12 || month == 1 || month == 2)
                        season = "zima";
                else if(month == 3 || month == 4 || month == 5)
                        season = "jaro";
                else if(month == 6 || month == 7 || month == 8)
                        season = "leto";
                else if(month == 9 || month == 10 || month == 11)
                        season = "podzim";
                else
                        season = "podivny mesic";
                System.out.println("Duben je soucasti rocniho obdobi " + season + ".");
        }
}
