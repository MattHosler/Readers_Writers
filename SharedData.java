package Bank438;


public abstract class SharedData {
	public abstract void startDeposit() throws InterruptedException;
	
	public abstract void endDeposit() throws InterruptedException;
	
	public abstract void startWithdraw() throws InterruptedException;
	
	public abstract void endWithdraw() throws InterruptedException;
	
	public abstract void startCheck() throws InterruptedException;
	
	public abstract void endCheck() throws InterruptedException;
	
}//Shared Data
