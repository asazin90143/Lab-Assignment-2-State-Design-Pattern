package labassignment2_statepattern;

public class IdleState implements VendingMachineState //Concrete State Class 1
{

	@Override
	public void selectItem(VendingMachine vendingMachine)
	{
		 System.out.println("Item(s) selected! Please insert coins.");
		 vendingMachine.TransitiontoNextState(new ItemSelectedState() );
	}

	@Override
	public void insertCoin(VendingMachine vendingMachine) 
	{
		System.out.println("Select item(s) first.");
	}

	@Override
	public void dispenseItem(VendingMachine vendingMachine) 
	{
		System.out.println("Select item(s) first."); 
	}

	@Override
	public void setOutOfOrder(VendingMachine vendingMachine) 
	{
		System.out.println("Out of Order!"); 
		vendingMachine.TransitiontoNextState(new OutOfOrderState() );
	}
}
