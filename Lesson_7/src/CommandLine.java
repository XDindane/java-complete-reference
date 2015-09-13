// Zobrazeni vsech argumentu prikazoveho radku.
class CommandLine {
        public static void main(String args[]) {
                for(int i=0; i<args.length; i++)
                System.out.println("Argument args[" + i + "]: " + args[i]);
        }
}
