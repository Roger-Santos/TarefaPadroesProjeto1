package br.com.rogersantos;

public class ChevroletCar implements ICar {

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Chevrolet info: Ligando o carro.");
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("Chevrolet info: Limpando o carro.");
	}

	@Override
	public void mechanicCheck() {
		// TODO Auto-generated method stub
		System.out.println("Chevrolet info: Manutenção em dia.");
	}

	@Override
	public void fuelCar() {
		// TODO Auto-generated method stub
		System.out.println("Chevrolet info: Combustível em 100%.");
	}

}
