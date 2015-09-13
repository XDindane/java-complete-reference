// Tato trida definuje zasobnik celych cisel, do nehoz lze ulozit az 10 hodnot.
class Stack {
        /* Clenske promenne stck a tos jsou nyni deklarovany 
        jako private. To znamena, ze je neni mozne ani
        zamerne ani nahodne zmenit tak, aby to vedlo
        k poskozeni zasobniku.
        */
        private int stck[] = new int[10];
        private int tos;
        
        // Inicializace vrcholu zasobniku
        Stack() {
                tos = -1;
        }
        
        // Pridani noveho prvku do zasobniku
        void push(int item) {
                if(tos==9)
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
