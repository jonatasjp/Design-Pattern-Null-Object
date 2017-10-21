
public class DescontoPercentual implements CalculadorDesconto {

	@Override
	public double calcularDesconto(double valorTotal, double valorDesconto) {
		return valorTotal -= valorTotal * valorDesconto;
	}

}
