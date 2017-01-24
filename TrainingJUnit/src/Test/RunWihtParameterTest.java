package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Operaciones.Calculadora;

@RunWith(value = Parameterized.class)
public class RunWihtParameterTest {

	@Parameters
	public static Iterable<Object[]> setTests(){
		return Arrays.asList(new Object[][]{
			{1, 1, 2}, {12, 12, 24}, {111, 112, 223}
		});
//		List<Object[]> listTest = new ArrayList<>();
//		listTest.add( new Object[] {1, 1, 2} );
//		listTest.add( new Object[] {12, 12, 24} );
//		listTest.add( new Object[] {111, 112, 223} );
//		return listTest;
	}
	
	private int a, b, esperado;

	public RunWihtParameterTest(int a, int b, int esperado) {
		this.a = a;
		this.b = b;
		this.esperado = esperado;
	}
	
	// pruebas unitarias que se van a ejecutar con los distintos parametros colocados arriba
	@Test
	public void sumaTest(){
		Calculadora cal = new Calculadora();
		int result = cal.suma(a, b);
		assertEquals(result, esperado);
	}

}
