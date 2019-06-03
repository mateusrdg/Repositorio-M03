
public class Circulo extends Figura {
	private double raio;
	
	public Circulo (Double raio) {
		this.raio = raio;
		super.area = calculaArea(); 
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public Double calculaArea() {
		return (this.raio * this.raio) * Math.PI;
	}
	
	
}
