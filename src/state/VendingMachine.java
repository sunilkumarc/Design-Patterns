package state;

public class VendingMachine {

	VendingMachineState machineState;
	
	void setMachineState(VendingMachineState state) {
		machineState = state;
	}
	
	VendingMachine() {
		machineState = new NoCash(this);
	}
	
	void insertCash(Coin amount) {
		machineState.insertCash(amount);
	}
	
	void requestProduct(int choice) {
		machineState.requestProduct(choice);
	}
}
