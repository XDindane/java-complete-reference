// Vylepsena verze programu pro rozpoznani rocniho obdobi.
class Switch {
        public static void main(String args[]) {
                int month = 4;
                String season;
                switch (month) {
                case 12:
                case 1:
                case 2:
                        season = "zima";
                        break;
                case 3:
                case 4:
                case 5:
                        season = "jaro";
                        break;
                case 6:
                case 7:
                case 8:
                        season = "leto";
                        break;
                case 9:
                case 10:
                case 11:
                        season = "podzim";
                        break;
                default:
                        season = "podivny mesic";
                }
                System.out.println("Duben je soucasti rocniho obdobi " + season + ".");
        }
}
