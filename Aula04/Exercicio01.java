package Aula04;

import java.util.Stack;

public class Exercicio01 {
    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<Character>();
        
        String mat = "2*(3 + 1)]"; /*Dá pra tirar o ] que a resposta fica balanceada. */
        boolean balanceada = true;
        for (int i = 0; i <mat.length(); i++) {
            char caractere = mat.charAt(i);
            System.out.println("Analisando caractere" + caractere);

            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                if (pilha.isEmpty()) {
                    balanceada = false;
                } else {
                    pilha.pop();
                }
            }
        }

        if (!pilha.isEmpty()) {
            balanceada = false;
        }
        System.out.println("A expressão " + (balanceada ? "" : "não") + " está balanceada");
    }
    
}
