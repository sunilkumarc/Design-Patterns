package state;

public class HasCash implements VendingMachineState {

	VendingMachine machine;
	
	HasCash(VendingMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertCash(Coin amount) {
		System.out.println("Coin is already inserted. Please select a product.");
	}

	@Override
	public void requestProduct(int choice) {
		System.out.println("Your selected product " + choice + " is getting dispensed.");
		machine.setMachineState(new NoCash(machine));
	}
}
