
public class DescontoReal implements CalculadorDesconto {


	@Override
	public double calcularDesconto(double valorTotal, double valorDesconto) {
		return valorTotal -= valorDesconto;
	}

}
