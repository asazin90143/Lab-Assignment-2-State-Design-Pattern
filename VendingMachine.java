package labassignment2_statepattern;

public class VendingMachine	//Context State Class
{
	private VendingMachineState CurrentState, NextState;
	private int itemCount; //include attributes for item inventory
	private int balance;	//and balance
	
	public VendingMachine()	//Constructor
	{
		CurrentState = new IdleState(); //Default State
		this.itemCount = 10; //Let's say the initial inventory is 10 items.
		this.balance = 0; //Let's say the balance is initially empty.
	}
	
	public VendingMachineState getCurrentState() 
	{
		return CurrentState;
	}
	
	public void setCurrentState(VendingMachineState State) 
	{
		this.CurrentState = CurrentState;
	}
	
	//Delegate actions
	public void selectItem() 
	{
		CurrentState.selectItem(this);
	}
	
	public void insertCoin() 
	{
		CurrentState.insertCoin(this);
	}
	
	public void dispenseItem() 
	{
		CurrentState.dispenseItem(this);
	}
	
	public void setOutOfOrder() 
	{
		CurrentState.setOutOfOrder(this);
	}
	
	//Methods to access and update item count and balance
	public int getItemCount() 
	{
		return itemCount;
	}
	
	public void setItemCount (int itemCount) 
	{
		this.itemCount = itemCount;
	}
	
	public int getBalance() 
	{
		return balance;
	}
	
	public void setBalance(int balance) 
	{
		this.balance = balance;
	}
	
	//Allows state transitions with no presence of conditionals.
	public void TransitiontoNextState (VendingMachineState NextState) 
	{
		setCurrentState(NextState);
	}

}
