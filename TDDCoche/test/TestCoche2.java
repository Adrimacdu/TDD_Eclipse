import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestCoche2 {

	@Test
	public void test_al_crear_un_coche_la_velocidad_sea_cero() {
		Coche nuevoCoche = new Coche();
		Assert.assertEquals(0, nuevoCoche.velocidad);
	}
	
	@Test
	public void test_al_acelerar_la_velocidad_aumenta() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.acelerar(30);
		Assert.assertEquals(30, nuevoCoche.velocidad);
	}
		
	@Test
	public void test_al_decelerar_la_velocidad_disminuye() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad=50;
		nuevoCoche.decelerar(20);
		Assert.assertEquals(30, nuevoCoche.velocidad);
	}
	
	@Test
	public void test_al_decelerar_la_velocidad_no_puede_ser_menor_a_cero() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad=50;
		nuevoCoche.decelerar(80);
		Assert.assertEquals(0, nuevoCoche.velocidad);
	}
	
}
