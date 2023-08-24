package Aula02;

public class Exemplo014 {
    public static void main(String[] args) {
        calcularImpostoGasolina(40, 5.89);
    }

    public static void calcularImpostoGasolina(double litros, double precoLitro) {
        double calcularValorTotal = litros * precoLitro;
        double valorImpostoFederal = 0.25 * calcularValorTotal;
        double valorImpostoEstadual = 0.35 * calcularValorTotal;
        
        System.out.println("Total: " + calcularValorTotal);
        System.out.println("Valor do IF: " + valorImpostoFederal);
        System.out.println("Valor do IE: " + valorImpostoEstadual);
        double totalImpostos = valorImpostoFederal + valorImpostoEstadual;
        System.out.println("Total impostos: " + totalImpostos);
    }
}
