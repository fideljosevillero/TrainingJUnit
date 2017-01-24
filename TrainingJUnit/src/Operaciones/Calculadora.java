package Operaciones;

public class Calculadora {

	public int suma(int a, int b){
		return a + b;
	}
	
	public int resta(int a, int b){
		return a - b;
	}
	
	public int multiplicacion(int a, int b){
		return a * b;
	}
	
	public float divicion(int a, int b){
		if(b == 0){
			throw new ArithmeticException("No se puede dividor por cero!!!");
		}
		return a / b;
	}
	
	public void timeOut(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
	
}
