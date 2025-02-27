package labassignment2_statepattern;


public class VMachine //Client Class
{

	public static void main(String[] args) 
	{
		VendingMachine vm = new VendingMachine();
		System.out.println("Selecting item...");
		vm.selectItem(); //Transitions to ItemSelectedState
		
		System.out.println("\nInserting Coin...");
		vm.insertCoin();
		
		System.out.println("\nDispensing item...");
		vm.dispenseItem();
		
		System.out.println("\nSetting Machine Out Of Order...");
		vm.setOutOfOrder(); //Returns the result in OutOfOrder State
		
		System.out.println("\nTrying to select item in OutOfOrder State...");
		vm.setOutOfOrder(); //Returns the result in OutOfOrder State as ALL operations are disallowed
		
		System.out.println("\nAfter dispense of item(s) is/are complete...");
		vm.insertCoin(); //Transitions back to IdleState after successful dispense process
	}
}
