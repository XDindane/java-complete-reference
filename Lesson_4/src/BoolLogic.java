// Ukazka pouziti booleovskych logickych operatoru.
class BoolLogic {
        public static void main(String args[]) {
                boolean a = true;
                boolean b = false;
                boolean c = a | b;
                boolean d = a & b;
                boolean e = a ^ b;
                boolean f = (!a & b) | (a & !b);
                boolean g = !a;
                System.out.println("Hodnota a = " + a);
                System.out.println("Hodnota b = " + b);
                System.out.println("Hodnota a|b = " + c);
                System.out.println("Hodnota a&b = " + d);
                System.out.println("Hodnota a^b = " + e);
                System.out.println("Hodnota !a&b|a&!b = " + f);
                System.out.println("Hodnota !a = " + g);
        }
}
