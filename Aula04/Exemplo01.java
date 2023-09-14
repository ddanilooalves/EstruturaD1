package Aula04;

import java.util.Stack;

public class Exemplo01 {
    public static void main(String args[]) {
        System.out.println("Exemplo de pilha (LIFO): ");
        Stack<String> pilha = new Stack<String>();
        pilha.push("Abacate");
        pilha.push("Banana");
        pilha.push("Cenoura");
        pilha.push("Damasco");
        pilha.push("Espinafre");

        for (String elemento : pilha) {
            System.out.println("Item: " + elemento);
        }

        System.out.println("Topo da pilha: " + pilha.peek());
        System.out.println("Desempilhando: " + pilha.pop());
        System.out.println("Desempilhando: " + pilha.pop());
        System.out.println("Desempilhando: " + pilha.pop());
        System.out.println("Topo da pilha: " + pilha.peek());

        for (String elemento : pilha) {
            System.out.println("Item: " + elemento);
        }
    }   
}
