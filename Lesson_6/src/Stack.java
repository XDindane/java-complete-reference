// Tato trida implementuje kod zasobniku pro az 10 celych cisel
class Stack {
        int stck[] = new int[10];
        int tos;
        
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
