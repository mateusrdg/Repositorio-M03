
public class Quadrado extends Figura {
	private double lado;
	
	public Quadrado (Double lado) {
		this.lado = lado;
		super.area = calculaArea();
	}

	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public Double calculaArea() {
		return this.lado * this.lado;
	}

}
