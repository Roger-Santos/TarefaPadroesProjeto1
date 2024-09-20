package br.com.rogersantos;

public class Cliente {

	public static void main(String[] args) {
		//Criando carro da Chevrolet
		ICarFactory fabricaChevrolet = new ChevroletFactory();
		ICar carroChevrolet = fabricaChevrolet.createCar();
		
		carroChevrolet.clean();
		carroChevrolet.fuelCar();
		carroChevrolet.mechanicCheck();
		carroChevrolet.startEngine();
		
		//Criando carro da Honda
		ICarFactory fabricaHonda = new HondaFactory();
		ICar carroHonda = fabricaHonda.createCar();
		
		carroHonda.clean();
		carroHonda.fuelCar();
		carroHonda.mechanicCheck();
		carroHonda.startEngine();
	}
}
