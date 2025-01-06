//package exercicio1;
//
//Exercício 1: Single Responsibility Principle (SRP)
//Enunciado:
//Você foi contratado por um banco para criar um sistema que gere relatórios financeiros. Atualmente, a classe RelatorioFinanceiro faz duas coisas: gera o relatório e envia por e-mail. Refatore o código para que ele siga o Princípio da Responsabilidade Única (SRP).
//
//Código inicial (errado):
//
//public class RelatorioFinanceiro {
//    public void gerarRelatorio() {
//        System.out.println("Gerando relatório financeiro...");
//    }
//
//    public void enviarPorEmail() {
//        System.out.println("Enviando relatório por e-mail...");
//    }
//}
//Tarefa:
//Separe as responsabilidades em classes diferentes.
//Crie uma classe para gerar o relatório e outra para enviar o e-mail.