public class OperacaoAdicao implements EstrategiaCalculo {

    @Override
    public double calcular(double valor1, double valor2) {
        return valor1 + valor2;
    }
}
