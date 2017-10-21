
public class Main {

	/**
	 * O código a seguir resultaria em um nullPointerException, pois o desconto passado para o método
	 * statico calcularDesconto é um valor null, portanto ao invocar qualquer propriedade ou método
	 * com um valor null resultará em uma excessão. Para evitar esse comportamento é necessário fazer uma 
	 * verificação se o objeto passado está nulo, porém isso pode poluir bastante o código.
	 * */
	public static void main(String[] args) {
		
		CalculadorDesconto calculadorDesconto = null;
		calcularDesconto(calculadorDesconto, 50, 10);
		
		/*Refatorando para o padrão null object*/
		
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
