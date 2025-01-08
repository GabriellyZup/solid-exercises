//package exercicio5;
//
//public class DispositivosEntradaIncial {
//    Exercício 5: Dependency Inversion Principle (DIP)
//    Enunciado:
//    Você está criando um sistema para gerenciar dispositivos de entrada de um computador. Atualmente, a classe Computador depende diretamente da classe Teclado, o que dificulta a substituição por outros dispositivos, como um mouse. Refatore o código para que ele siga o Princípio da Inversão de Dependência (DIP).
//
//    Código inicial (errado):
//
//    public class Teclado {
//        public void digitar() {
//            System.out.println("Digitando...");
//        }
//    }
//
//    public class Computador {
//        private Teclado teclado;
//
//        public Computador() {
//            this.teclado = new Teclado();
//        }
//    }
//    Tarefa:
//    Crie uma interface DispositivoEntrada com o método usar().
//    Faça com que Teclado implemente essa interface.
//    Modifique a classe Computador para depender da interface, e não da implementação concreta.
//}
