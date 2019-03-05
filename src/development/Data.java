package development;

import java.util.Observable;

public class Data extends Observable{
	
	private int number;
	private int number2;
	
	public Data() {
		setNumber(0);
		setNumber2(0);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
		int[] arr = {getNumber(),getNumber2()};
		setChanged();
		notifyObservers(arr);
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
		int[] arr = {getNumber(),getNumber2()};
		setChanged();
		notifyObservers(arr);
	}

}
