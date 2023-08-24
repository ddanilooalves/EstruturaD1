package Aula02;
/*import java.util.Scanner;*/
public class Exemplo012 {
    
    public static void main(String[] args) {
        mostrarMensagem("Oi!");
        mostrarMensagem("Você sempre vem por aqui?");
        elogiar("Gostei de você", "Bruna");
    }

    public static void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public static void elogiar(String elogio, String name) {
        System.out.println(name + ", " + elogio);
    }
}
