// Ukazka prace s nekterymi metodami tridy String.
class StringDemo2 {
        public static void main(String args[]) {
                String strOb1 = "Prvni objekt typu String";
                String strOb2 = "Druhy objekt typu String";
                String strOb3 = strOb1;
                
                System.out.println("Delka retezce strOb1: " + strOb1.length());
                
                System.out.println("Znak na 3. miste retezce strOb1: " + strOb1.charAt(3));
                
                if(strOb1.equals(strOb2))
                        System.out.println("Retezec strOb1 == Retezec strOb2");
                else
                        System.out.println("Retezec strOb1 != Retezec strOb2");
                
                if(strOb1.equals(strOb3))
                        System.out.println("Retezec strOb1 == Retezec strOb3");
                else
                        System.out.println("Retezec strOb1 != Retezec strOb3");
        }
}
