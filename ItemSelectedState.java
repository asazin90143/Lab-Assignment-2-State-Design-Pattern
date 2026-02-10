package labassignment2_statepattern;

public class ItemSelectedState implements VendingMachineState //Concrete State Class 2
{

	@Override
	public void insertCoin(VendingMachine vendingMachine) 
	{
		System.out.println("Coin(s) was/were already inserted! Item(s) is/are ready to dispense.");
		vendingMachine.TransitiontoNextState(new DispensingState() );
	}

	@Override
	public void dispenseItem(VendingMachine vendingMachine) 
	{
		System.out.println("Insert coin(s) first.");
	}

	@Override
	public void selectItem(VendingMachine vendingMachine) 
	{
		System.out.println("Item(s) is/are now selected! You can now insert coin(s).");
	}

	@Override
	public void setOutOfOrder(VendingMachine vendingMachine) 
	{
		System.out.println("Out of Order!");
		vendingMachine.TransitiontoNextState(new OutOfOrderState() );
	}
}

