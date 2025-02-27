package labassignment2_statepattern;

public class OutOfOrderState implements VendingMachineState //Concrete State Class 4
{

	@Override
	public void setOutOfOrder(VendingMachine vendingMachine) 
	{
		System.out.println("Vending Machine is Already Out of Order!"); 
	}

	@Override
	public void selectItem(VendingMachine vendingMachine) 
	{
		System.out.println("Out of Order!");
	}

	@Override
	public void insertCoin(VendingMachine vendingMachine) 
	{
		System.out.println("Out of Order!");
	}

	@Override
	public void dispenseItem(VendingMachine vendingMachine) 
	{
		System.out.println("Out of Order!");
	}

}
