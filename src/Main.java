
public class Main {

	/**
	 * O c�digo a seguir resultaria em um nullPointerException, pois o desconto passado para o m�todo
	 * statico calcularDesconto � um valor null, portanto ao invocar qualquer propriedade ou m�todo
	 * com um valor null resultar� em uma excess�o. Para evitar esse comportamento � necess�rio fazer uma 
	 * verifica��o se o objeto passado est� nulo, por�m isso pode poluir bastante o c�digo.
	 * */
	public static void main(String[] args) {
		
		CalculadorDesconto calculadorDesconto = null;
		calcularDesconto(calculadorDesconto, 50, 10);
		
		/*Refatorando para o padr�o null object*/
		
		calculadorDesconto = new SemDesconto();
		System.out.println(calcularDesconto(calculadorDesconto, 50, 10));
		
		calculadorDesconto = new DescontoPercentual();
		System.out.println(calcularDesconto(calculadorDesconto, 50, 0.15));
		
		calculadorDesconto = new DescontoReal();
		System.out.println(calcularDesconto(calculadorDesconto, 50, 10));		
	}
	
	public static double calcularDesconto(CalculadorDesconto calculadorDesconto, double valorTotal, 
			double valorDesconto){
		
		return calculadorDesconto.calcularDesconto(valorTotal, valorDesconto);
	}
}
