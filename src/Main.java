public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = Calculadora.getInstancia();

        calculadora.adicionaEstrategiaCalculo("+", (a, b) -> (a + b));
        calculadora.adicionaEstrategiaCalculo("-", (a, b) -> (a - b));
        calculadora.adicionaEstrategiaCalculo("/", (a, b) -> (a / b));
        calculadora.adicionaEstrategiaCalculo("*", (a, b) -> (a * b));

        System.out.println(calculadora.calcular("+", 7, 5 ));
        System.out.println(calculadora.calcular("-", 7, 5 ));
        System.out.println(calculadora.calcular("*", 7, 5 ));
        System.out.println(calculadora.calcular("/", 7, 5 ));


    }
}