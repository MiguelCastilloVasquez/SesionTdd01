package cl.ubb.agil;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class CalculadoraTest {
	private Calculadora calculadora;
	
	@Before
	public void setup(){
		calculadora = new Calculadora();
	}
	
	@Test
	public void sumarDosYTresEsCinco(){
		/* Arrange*/
		
		/* Act*/
		int resul=calculadora.sumar(2,3);
		/* Assert*/
		assertThat(resul,equalTo(5));
		
	}
	@Test
	public void sumarMenosUnoYSieteEsSeis(){
		/* Arrange*/
		
		/* Act*/
		int resul=calculadora.sumar(-1,7);
		/* Assert*/
		assertThat(resul,equalTo(6));
	}
	
	@Test
	public void restarDocientosMenosSetentaYTresEsCientoVeinteYSiete(){
		/* Arrange*/
		
		/* Act*/
		int resul=calculadora.restar(200,73);
		/* Assert*/
		assertThat(resul,equalTo(127));
	}
	
	@Test
	public void restarMenosDiezMenosCincoEsMenosQuince(){
		/* Arrange*/
		
		/* Act*/
		int resul=calculadora.restar(-10,5);
		/* Assert*/
		assertThat(resul,equalTo(-15));
	}
	@Test
	public void multiplicarSeisPorTresEsDieciocho(){
		/* Arrange*/
		
		/* Act*/
		int resul=calculadora.multiplicar(6,3);
		/* Assert*/
		assertThat(resul,equalTo(18));
	}
}
