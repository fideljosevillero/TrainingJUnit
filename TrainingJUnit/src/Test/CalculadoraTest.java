package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Operaciones.Calculadora;

public class CalculadoraTest {
	
	Calculadora cal;
	static int result;
	
	@BeforeClass
	public static void beforeClassTest(){
		result = 0;
		System.out.println("BeforeClass!!!");
	}
	
	@Before
	public void BeforeTest(){
		cal = new Calculadora();
		System.out.println("Before!!!");
	}
	
	@Test
	public void sumaTest(){
		result = cal.suma(10, 7);
		assertEquals("Error Validando la suma ", 17, result);
	}
	
	@Test
	public void restaTest(){
		result = cal.resta(10, 7);
		assertEquals(3, result);
	}
	
	@Test
	public void multiplicarTest(){
		result = cal.multiplicacion(2, 5);
		assertEquals(10, result);
	}
	
	@Test(expected=ArithmeticException.class)
	public void divicionPorCeroTest(){
		cal.divicion(1713, 0);
	}
	
	@Test
	public void divicion(){
		float result = cal.divicion(17, 24);
		// 3er parametro margen de error
		assertEquals(0.7083333333333333, result, 0.871); 
	}
	
	@After
	public void afterTest(){
		System.out.println("After!!!");
	}
	
	@AfterClass
	public static void AfterClassTest(){
		System.out.println("AfterClass!!!");
	}

}
