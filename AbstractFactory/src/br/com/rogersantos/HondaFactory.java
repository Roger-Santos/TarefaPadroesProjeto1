package br.com.rogersantos;

public class HondaFactory implements ICarFactory {

	@Override
	public ICar createCar() {
		// TODO Auto-generated method stub
		return new HondaCar();
	}

}
