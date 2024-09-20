package br.com.rogersantos;

public class ChevroletFactory implements ICarFactory {

	@Override
	public ICar createCar() {
		// TODO Auto-generated method stub
		return new ChevroletCar();
	}

}
