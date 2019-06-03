
public class Losango extends Figura {
	private Double diagonal1;
	private Double diagonal2;
	
	public Losango (Double diagonal1, Double diagonal2) {
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
		super.area = calculaArea();
	}
	
	public Double getDiagonal1() {
		return diagonal1;
	}
	public void setDiagonal1(Double diagonal1) {
		this.diagonal1 = diagonal1;
	}
	public Double getDiagonal2() {
		return diagonal2;
	}
	public void setDiagonal2(Double diagonal2) {
		this.diagonal2 = diagonal2;
	}
	
	@Override
	public Double calculaArea() {
		return (this.diagonal1 * this.diagonal2)/2;
	}
	
	
}
