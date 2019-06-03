import java.util.Scanner;

public class AreaFiguraMain {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Double larguraQuadrado;
		
		CalculosAreaVermelha cav = new CalculosAreaVermelha();
		
		System.out.printf("Informe a largura do quadrado 1 :\n");
		larguraQuadrado = ler.nextDouble(); 
		
		Quadrado quadrado = new Quadrado(larguraQuadrado);
		
		Losango losango = new Losango (larguraQuadrado, (larguraQuadrado/2));
		
		Circulo circulo = new Circulo(larguraQuadrado/4);
		
		System.out.println("Area 1: " + cav.area1(quadrado, losango));
		System.out.println("Area 2: " + cav.area2(quadrado, circulo));
		
	}

}
