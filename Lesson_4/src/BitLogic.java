// Ukazka prace s bitovymi logickymi operatory.
class BitLogic {
        public static void main(String args[]) {
                String binary[] = {
                        "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                        "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
                };
                int a = 3; // 0 + 2 + 1 neboli 0011 binarne
                int b = 6; // 4 + 2 + 0 neboli 0110 binarne
                int c = a | b;
                int d = a & b;
                int e = a ^ b;
                int f = (~a & b)|(a & ~b);
                int g = ~a & 0x0f;
                
                System.out.println("Hodnota a binarne = " + binary[a]);
                System.out.println("Hodnota b binarne = " + binary[b]);
                System.out.println("Hodnota a|b binarne = " + binary[c]);
                System.out.println("Hodnota a&b binarne = " + binary[d]);
                System.out.println("Hodnota a^b binarne = " + binary[e]);
                System.out.println("Hodnota ~a&b|a&~b binarne = " + binary[f]);
                System.out.println("Hodnota ~a binarne = " + binary[g]);
        }
}
