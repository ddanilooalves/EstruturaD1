package Aula02;

public class Exemplo013 {
    public static void main(String[] args) {

        System.out.println(converterParaDolar(5000));

    }

    public static double converterParaDolar(double valorReal) {
        double valorDolar = valorReal / 4.88;
        return valorDolar;
    }

}
