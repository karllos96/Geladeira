
public class Geladeira {

	private String marca;
	private String modelo;
	private String cor;
	private int volume;
	private int potencia;
	private int portas;
	
	public Geladeira (String marca, String modelo, String cor, int volume, int potencia, int portas) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.volume = volume;
		this.potencia = potencia;
		this.portas = portas;
	}
	
	public void ImprimirInfoGeladeira (){
		
		System.out.println("_________Geladeira_________");
		System.out.println("*****"+ marca + "  " + modelo + "*****");
		System.out.println("Cor: " + cor);
		System.out.println("Volume: " + volume  + " Litros");
		System.out.println("Potência: " + potencia);
		System.out.println("Número de Portas: " + portas);
	}
	
	public static void main(String[] args) {
		Geladeira gelasamsung = new Geladeira ("Samsung", "RT42", "Prata", 411, 175, 2);
		Geladeira gelabrastemp = new Geladeira ("Brastemp", "BRO85AK", "Prata Inox", 554, 57, 3);
		
		gelasamsung.ImprimirInfoGeladeira();
		gelabrastemp.ImprimirInfoGeladeira();
	}

}
