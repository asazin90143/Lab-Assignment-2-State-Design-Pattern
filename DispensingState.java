package labassignment2_statepattern;

public class DispensingState implements VendingMachineState //Concrete State Class 3
{
	@Override
	public void dispenseItem(VendingMachine vendingMachine) 
	{
		 System.out.println("Dispense is complete! Item(s) is/are ready to consume.");
		 vendingMachine.setBalance(0); //Balance resets after dispensing.
		 vendingMachine.TransitiontoNextState(new IdleState() ); //automatically goes back to idle state after dispense process is completed.
	}

	@Override
	public void selectItem(VendingMachine vendingMachine) 
	{
		System.out.println("Please wait, item is being dispensed.");
	}

	@Override
	public void insertCoin(VendingMachine vendingMachine) 
	{
		System.out.println("Please wait, item is being dispensed.");
	}

	@Override
	public void setOutOfOrder(VendingMachine vendingMachine) 
	{
		System.out.println("Out of Order!"); 
		vendingMachine.TransitiontoNextState(new OutOfOrderState() );
	}
}