import java.util.Stack;
public class Pila {
    public static void main(String [] args){

        // creacioin de una Pila de numeros enteros

        Stack<Integer> pila = new Stack<>();
         

        //verificar si la fila esta vacia
        System.out.println(pila.empty());

        
        // insertar elementos en la pila
        pila.push(8);
        pila.push(4);
        pila.push(9);
        pila.push(10);
        pila.push(6);

        // imprimir la pila
        System.out.println(pila);

        //mostrar el elemento que esta en el tope de la pila sin removerlo
        System.out.println("Tope de la pila: " + pila.peek());

        //remover el elemento que se encuentra en el tope de l apila
        System.out.println("Elemento removido del tope de la pila: " + pila.pop());
        
        // imprimir la pila
        System.out.println(pila);

        //Buscar y mostrar la posicione del elemento dentro de la pila
        System.out.println(pila.search(10));
        System.out.println(pila.search(9));
        System.out.println(pila.search(4));
        System.out.println(pila.search(8));
        System.out.println(pila.search(50));

    }
}