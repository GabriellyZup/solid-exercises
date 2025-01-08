//package exercicio4;
//
//public class GerenciamentoFuncionáriosInicial {
//
//    Interface Segregation Principle (ISP)
//    Enunciado:
//    Você está desenvolvendo um sistema para gerenciar funcionários de um banco. Atualmente, a interface Funcionario força todos os funcionários a implementarem métodos que nem todos utilizam. Refatore o código para que ele siga o Princípio da Segregação de Interfaces (ISP).
//
//    Código inicial (errado):
//
//    public interface Funcionario {
//        void programar();
//        void atenderCliente();
//    }
//
//    public class Desenvolvedor implements Funcionario {
//        public void programar() {
//            System.out.println("Programando...");
//        }
//
//        public void atenderCliente() {
//            // Não faz sentido para um desenvolvedor
//        }
//    }
//
//    public class Atendente implements Funcionario {
//        public void programar() {
//            // Não faz sentido para um atendente
//        }
//
//        public void atenderCliente() {
//            System.out.println("Atendendo cliente...");
//        }
//    }
//    Tarefa:
//    Separe a interface Funcionario em interfaces menores, como Programador e Atendente.
//    Faça com que cada classe implemente apenas a interface que faz sentido para ela.
//}
