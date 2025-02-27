# Lab_Assignment_2_StatePattern
<h2>Problem:</h2>
<p>A vending machine needs to manage different states, including "Idle", "ItemSelected", "Dispensing", and "OutOfOrder". Each state has specific rules and restrictions regarding allowed operations, and the vending machine has associated attributes like item inventory and balance.</p>

<h2>Requirements:</h2>
&nbsp;&nbsp;&nbsp;&nbsp;<b>1. Idle State:</b> <br>
&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; Allow item selection. <br>
&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; Disallow dispensing items and inserting coins. <br>

&nbsp;&nbsp;&nbsp;&nbsp;<b>2. ItemSelected State:</b> <br>
&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; Allow inserting coins and dispensing items. <br>
&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; Disallow item selection. <br> 

&nbsp;&nbsp;&nbsp;&nbsp;<b>3. Dispensing State:</b> <br>
&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; Allow no operations. <br>
&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; Automatically transition back to the "Idle" state after dispensing is complete.<br> 

&nbsp;&nbsp;&nbsp;&nbsp;<b>4. OutOfOrder State:</b> <br>
&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; Disallow all operations. <br>

<p><b>Current System:</b> The system currently relies on conditional statements within the VendingMachine class to check the machine state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.</p>

<h2>Implement the State Pattern to improve code maintainability and flexibility:</h2>
&nbsp;&nbsp;&nbsp;&nbsp; <b>1. Define VendingMachine States:</b> 
&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<p>Create separate classes representing different machine states: IdleState, ItemSelectedState, DispensingState, and OutOfOrderState.</p>

&nbsp;&nbsp;&nbsp;&nbsp; <b>2. Implement State Interface:</b> 
&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; <p>Define an interface VendingMachineState with methods for common actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder.</p>

&nbsp;&nbsp;&nbsp;&nbsp; <b>3. Implement State Behaviors:</b>. 
&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; <p>Each concrete state class implements the VendingMachineState interface, providing specific behavior for its respective state. For example, the IdleState class would allow item selection, while the OutOfOrderState wouldn't allow any operations.</p>

&nbsp;&nbsp;&nbsp;&nbsp; <b>4. Update VendingMachine Class:</b> <br> 
&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; Include attributes for item inventory and balance. <br>
&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; Remove state-specific logic from the VendingMachine class. <br>
&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; Introduce a reference to the current VendingMachineState object. <br>
&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; Delegate actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder to the current state object through its corresponding methods.
## UML Diagram
![UML Diagram](https://github.com/TrixiePicana/Lab_Assignment_2_StatePattern/blob/main/Lab%20Assignment%202_%20State%20Pattern_UML%20Diagram.jpg)  
