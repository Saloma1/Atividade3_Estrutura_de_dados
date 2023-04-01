import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class atividade3 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Stack<Integer> pilha = new Stack<Integer>();
        Queue<Integer> fila = new LinkedList<Integer>();

        // Passo 1
        for (int i = 1; i <= 5; i++) {
            lista.add(i);
        }

        // Passo 2
        while (!lista.isEmpty()) {
            int valor = lista.remove(0);
            pilha.push(valor);
        }

        // Passo 3
        while (!pilha.empty()) {
            int valor = pilha.pop();
            fila.add(valor);
        }

        // Passo 4
        for (int i = 6; i <= 10; i++) {
            lista.add(i);
        }

        // Passo 5
        while (!lista.isEmpty()) {
            int valor = lista.remove(0);
            pilha.push(valor);
        }

        // Passo 3 (repetido)
        while (!pilha.empty()) {
            int valor = pilha.pop();
            fila.add(valor);
        }

        // Passo 6
        while (!fila.isEmpty()) {
            int valor = fila.remove();
            System.out.println(valor);
        }
    }
}