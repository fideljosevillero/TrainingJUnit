package Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import Operaciones.Calculadora;

// Suite determina el orden en que se ejecutaran las pruebas unitarias.
@RunWith(value = Suite.class)
@Suite.SuiteClasses({
	RunWihtParameterTest.class,
	CalculadoraTest.class
})
public class TrainingSuiteTest {  }
