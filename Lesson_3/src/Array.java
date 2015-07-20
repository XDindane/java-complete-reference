// Ukazka prace s jednodimenzionalnim polem.
class Array {
        public static void main(String args[]) {
                int dny_mesice[];
                dny_mesice = new int[12];
                dny_mesice[0] = 31;
                dny_mesice[1] = 28;
                dny_mesice[2] = 31;
                dny_mesice[3] = 30;
                dny_mesice[4] = 31;
                dny_mesice[5] = 30;
                dny_mesice[6] = 31;
                dny_mesice[7] = 31;
                dny_mesice[8] = 30;
                dny_mesice[9] = 31;
                dny_mesice[10] = 30;
                dny_mesice[11] = 31;
                System.out.println("Duben ma " + dny_mesice[3] + " dni.");
        }
}

