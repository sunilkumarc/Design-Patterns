package state;

public class Main {

	public static void main(String[] args) {
		
		VendingMachine newMachine = new VendingMachine();
		newMachine.insertCash(Coin.FIVE);
		newMachine.requestProduct(1);
	}
}
