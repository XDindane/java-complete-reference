// Ukazka prace s operatorem ?.
class Ternary {
        public static void main(String args[]) {
                int i, k;
                
                i = 10;
                k = i < 0 ? -i : i; // vypocet absolutni hodnoty i
                System.out.print("Absolutni hodnota ");
                System.out.println(i + " je " + k);
                
                i = -10;
                k = i < 0 ? -i : i; // vypocet absolutni hodnoty i
                System.out.print("Absolutni hodnota ");
                System.out.println(i + " je " + k);
        }
}
