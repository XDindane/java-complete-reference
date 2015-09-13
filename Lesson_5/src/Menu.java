// Pouziti smycky do-while pro zobrazeni nabidky a umozneni vyberu
class Menu {
        public static void main(String args[])
        throws java.io.IOException {
                char choice;
                
                do {
                        System.out.println("Napoveda pro: ");
                        System.out.println(" 1. if");
                        System.out.println(" 2. switch");
                        System.out.println(" 3. while");
                        System.out.println(" 4. do-while");
                        System.out.println(" 5. for\n");
                        System.out.println("Vyberte jednu volbu:");
                        choice = (char) System.in.read();
                } while( choice < '1' || choice > '5');
                
                System.out.println("\n");
                
                switch(choice) {
                case '1':
                        System.out.println("Prikaz if:\n");
                        System.out.println("if(podminka) prikaz;");
                        System.out.println("else prikaz;");
                        break;
                case '2':
                        System.out.println("Prikaz switch:\n");
                        System.out.println("switch(vyraz) {");
                        System.out.println(" case konstanta:");
                        System.out.println(" posloupnost prikazu");
                        System.out.println(" break;");
                        System.out.println(" //...");
                        System.out.println("}");
                        break;
                case '3':
                        System.out.println("Prikaz while:\n");
                        System.out.println("while(podminka) prikaz;");
                        break;
                case '4':
                        System.out.println("Prikaz do-while:\n");
                        System.out.println("do {");
                        System.out.println(" prikaz;");
                        System.out.println("} while (podminka);");
                        break;
                case '5':
                        System.out.println("Prikaz for:\n");
                        System.out.print("for(pocatek; podminka; iterace)");
                        System.out.println(" prikaz;");
                        break;
                }
        }
}
