//package exercicio3;
//
//public class GeometicInicial {
//
//    Exercício 3: Liskov Substitution Principle (LSP)
//    Enunciado:
//    Você está criando um sistema para calcular áreas de formas geométricas. Atualmente, a classe Quadrado herda de Retangulo, mas isso está causando problemas porque o comportamento de Quadrado não é consistente com o de Retangulo. Refatore o código para que ele siga o Princípio da Substituição de Liskov (LSP).
//
//    Código inicial (errado):
//
//    public class Retangulo {
//        protected int largura;
//        protected int altura;
//
//        public void setLargura(int largura) {
//            this.largura = largura;
//        }
//
//        public void setAltura(int altura) {
//            this.altura = altura;
//        }
//
//        public int getArea() {
//            return largura * altura;
//        }
//    }
//
//    public class Quadrado extends Retangulo {
//        @Override
//        public void setLargura(int largura) {
//            this.largura = largura;
//            this.altura = largura;
//        }
//
//        @Override
//        public void setAltura(int altura) {
//            this.altura = altura;
//            this.largura = altura;
//        }
//    }
//    Tarefa:
//    Crie uma interface Forma com o método getArea().
//    Implemente classes separadas para Retangulo e Quadrado, sem herança direta entre elas.
//}
