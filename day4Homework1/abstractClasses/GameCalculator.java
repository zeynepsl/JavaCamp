package day4Homework1;

//herkes için hesaplama olacak : base class
public abstract class GameCalculator {
	public abstract void hesapla();
	//kim bu class ý inherit ediyorsa hesaplayý override etmek zorunda
	
	
	//gameOver olduðu gibi kullanýlacak kimse override edemez
	public final void gameOver() {
		
	}
}
