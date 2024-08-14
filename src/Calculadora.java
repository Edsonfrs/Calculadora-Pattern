import java.util.HashMap;
import java.util.Map;

public class Calculadora {

    private static Calculadora instancia = null;

    private Map<String, EstrategiaCalculo> estrategiaCalculoMap;

    private Calculadora() {
        estrategiaCalculoMap = new HashMap<>();
    }

    EstrategiaCalculo estrategiaCalculo;

    public void  adicionaEstrategiaCalculo(String nome, EstrategiaCalculo estrategia) {
        estrategiaCalculoMap.put(nome, estrategia);
    }

    public static Calculadora getInstancia() {
        if (instancia == null) {
            instancia = new Calculadora();
        }
        return instancia;
    }

    public double calcular(String name, double valor1, double valor2) {
        return estrategiaCalculoMap.get(name).calcular(valor1, valor2);
    }
}
