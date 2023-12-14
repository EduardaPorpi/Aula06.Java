package Transportes;

public class Cidade {

	public static void main(String[] args) {
		Moto honda = new Moto("honda", "preta", 2018);
		honda.motor = "1.4";
		System.out.printf("A moto %s tem %d rodas com um motor de %s na cor %s feita no ano %d" , honda.modelo, honda.rodas, honda.motor, honda.cor, honda.ano);
	
		Carro ford = new Carro("ford", "branco", 2020);
		ford.motor = "1.6";
		ford.portas = 4;
		System.out.printf("\nO carro %s tem %d rodas com um motor de %s, %d portas, na cor %s feito no ano %d",ford.modelo, ford.rodas, ford.motor, ford.portas, ford.cor, ford.ano);
	
		Carroça charrete = new Carroça("charrete", "cinza", 1978);
		charrete.animal = "cavalo";
		System.out.printf("\nA carroca %s e puxada por %s, na cor %s feita no ano de %d", charrete.modelo, charrete.animal, charrete.cor, charrete.ano);
	
		Bike bic = new Bike("Caloi", "verde", 2022);
		bic.quadro = "aluminio";
		System.out.printf("\nA bicicleta %s com quadro de %s na cor %s feita no ano de %d", bic.modelo, bic.quadro, bic.cor, bic.ano);
	}
}