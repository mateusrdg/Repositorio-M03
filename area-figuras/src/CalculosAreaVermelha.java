
public class CalculosAreaVermelha {
	public Double area1 (Quadrado quadrado, Losango losango) {
		return quadrado.getArea() - (losango.getArea() * 2);
	}
	public Double area2 (Quadrado quadrado, Circulo circulo) {
		return quadrado.getArea() - (circulo.getArea() * 4);
	}
}
