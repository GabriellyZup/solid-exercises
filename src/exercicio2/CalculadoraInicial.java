//package exercicio2;
//
//Exercício 2: Open/Closed Principle (OCP)
//Enunciado:
//Você está desenvolvendo uma calculadora para o banco que realiza operações básicas como soma e subtração. No entanto, o gerente pediu para adicionar uma nova operação: multiplicação. Refatore o código para que ele siga o Princípio Aberto/Fechado (OCP), permitindo adicionar novas operações sem modificar o código existente.
//
//Código inicial (errado):
//
//public class Calculadora {
//    public int calcular(int a, int b, String operacao) {
//        if (operacao.equals("soma")) {
//            return a + b;
//        } else if (operacao.equals("subtracao")) {
//            return a - b;
//        }
//        return 0;
//    }
//}
//Tarefa:
//Crie uma interface Operacao.
//Implemente classes separadas para cada operação (Soma, Subtração, Multiplicação).
//Refatore a classe Calculadora para usar a interface.