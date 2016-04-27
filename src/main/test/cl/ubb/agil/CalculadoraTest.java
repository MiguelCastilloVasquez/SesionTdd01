package cl.ubb.agil;
import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class CalculadoraTest {
	
	@Test
	public void sumarDosYTresEsCinco(){
		/* Arrange*/
		Calculadora calculadora = new Calculadora();
		/* Act*/
		int resul=calculadora.sumar(2,3);
		/* Assert*/
		assertThat(resul,equalTo(5));
		
	}
}
