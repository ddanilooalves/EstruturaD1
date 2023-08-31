package Aula03;
import java.util.*;
public class Exemplo01 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        mostrarTodos(lista);
        lista.add(10);
        lista.add(20);
        lista.add(30);
        mostrarTodos(lista);
        System.out.println("Tamanho da lista: " + lista.size());
        /*Mostra o tamanho da lista */
        System.out.println("Elemento do índice 2: " + lista.get(2));
        /*Mostra o valor/elemento do índice */
        System.out.println("Removendo elemento do índice 1: ");
        lista.remove(1);
        mostrarTodos(lista);
        System.out.println("índice do elemento 30: " + lista.indexOf(30));
        /*Mostra o indice do valor/elemento da lista */
        System.out.println("Removendo número de valor 30: ");
        lista.remove((Integer) 30);
        mostrarTodos(lista);
        System.out.println("Contem o número 3: " + lista.contains(3));
        /*Mostrar se o número está na lista ou não com true and false */
    }

    private static void mostrarTodos(List<Integer> lista) {
        if (lista == null || lista.size() == 0) {
            System.out.print("Lista vazia!");
        }
        for (Object item : lista) {
            System.out.print(item + " ");
        }
    }
}