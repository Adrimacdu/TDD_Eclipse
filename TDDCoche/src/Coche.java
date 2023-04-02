
public class Coche {

	public int velocidad;

	public void acelerarAdrianMac(int aceleracion) {
		velocidad+=aceleracion;
	}

	public void decelerarAdrianMac(int deceleracion) {
		velocidad-=deceleracion;
		if(velocidad < 0) {
			velocidad=0;
		}
	}
}
