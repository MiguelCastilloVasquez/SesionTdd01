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
	@Test
	public void sumarMenosUnoYSieteEsSeis(){
		/* Arrange*/
		Calculadora calculadora = new Calculadora();
		/* Act*/
		int resul=calculadora.sumar(-1,7);
		/* Assert*/
		assertThat(resul,equalTo(6));
	}
	
	@Test
	public void restarDocientosMenosSetentaYTresEsCientoVeinteYSiete(){
		/* Arrange*/
		Calculadora calculadora = new Calculadora();
		/* Act*/
		int resul=calculadora.restar(200,73);
		/* Assert*/
		assertThat(resul,equalTo(127));
	}
	
	@Test
	public void restarMenosDiezMenosCincoEsMenosQuince(){
		/* Arrange*/
		Calculadora calculadora = new Calculadora();
		/* Act*/
		int resul=calculadora.restar(-10,5);
		/* Assert*/
		assertThat(resul,equalTo(-15));
	}
}
