package state;

public interface VendingMachineState {
	void insertCash(Coin amount);
	void requestProduct(int coice);
}
