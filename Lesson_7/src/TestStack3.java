// Vylepsena trida Stack, vyuzivajici vlastnost length.
class Stack {
        private int stck[];
        private int tos;

        // Alokace a inicializace zasobniku
        Stack(int size) {
                stck = new int[size];
                tos = -1;
        }

        // Pridani noveho prvku do zasobniku
        void push(int item) {
                if(tos==stck.length-1) // vyuziti vlastnosti length
                        System.out.println("Zasobnik je plny.");
                else
                        stck[++tos] = item;
        }

        // Odebrani prvku ze zasobniku
        int pop() {
                if(tos < 0) {
                        System.out.println("Zasobnik je jiz prazdny.");
                        return 0;
                }
                else
                        return stck[tos--];
        }
}

class TestStack3 {
        public static void main(String args[]) {
                Stack mystack1 = new Stack(5);
                Stack mystack2 = new Stack(8);

                // pridani nejakych cisel do zasobniku
                for(int i=0; i<5; i++) mystack1.push(i);
                for(int i=0; i<8; i++) mystack2.push(i);
                
                // odebrani techto cisel ze zasobniku
                System.out.println("Obsah zasobniku mystack1:");
                for(int i=0; i<5; i++)
                        System.out.println(mystack1.pop());
                
                System.out.println("Obsah zasobniku mystack2:");
                for(int i=0; i<8; i++)
                        System.out.println(mystack2.pop());
        }
}
