package 建造者模式.变化是永恒的;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {

	private BMWModel bmw = new BMWModel();
	
	
	@Override
	public void setSequence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		this.bmw.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.bmw;
	}

//product
//builder
//director
//ConcreteBuilder
	
}
