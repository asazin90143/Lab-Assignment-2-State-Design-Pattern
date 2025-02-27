package labassignment2_statepattern;

public interface VendingMachineState //State Interface
{
	public void selectItem(VendingMachine vendingMachine);
	public void insertCoin(VendingMachine vendingMachine);
	public void dispenseItem(VendingMachine vendingMachine);
	public void setOutOfOrder(VendingMachine vendingMachine);
}
