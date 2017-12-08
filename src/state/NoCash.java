package state;

public class NoCash implements VendingMachineState {
	
	VendingMachine machine;
	
	NoCash(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCash(Coin amount) {
		System.out.println("You have inserted coin " + amount + ". Please select a product now.");
		machine.setMachineState(new HasCash(machine));
	}

	@Override
	public void requestProduct(int coice) {
		System.out.println("Insert a coin first.");
	}

}
