package br.com.rogersantos;

public class HondaCar implements ICar {
	
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Honda info: Ligando o carro.");
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("Honda info: Limpando o carro.");
	}

	@Override
	public void mechanicCheck() {
		// TODO Auto-generated method stub
		System.out.println("Honda info: Manutenção em dia.");
	}

	@Override
	public void fuelCar() {
		// TODO Auto-generated method stub
		System.out.println("Honda info: Combustível em 100%.");
	}

}
