package Bank438;
import java.util.concurrent.Semaphore;
public class SharedDataSemaphore extends SharedData{
	
	private int numOfReaders =0;// how many readers are reading the shared data
	
	private Semaphore mutex = new Semaphore(1); // used as mutual exclusion for "numOfReaders"
	private Semaphore cng = new Semaphore(1); // Used as mutual exclusion for the Change



	public void startDeposit() throws InterruptedException {
		cng.acquire();
		
	} // Start Deposit


	public void endDeposit() throws InterruptedException {
		cng.release();
		
	} // End Deposit


	public void startWithdraw() throws InterruptedException {
		cng.acquire();
		
	}// Start Withdraw


	public void endWithdraw() throws InterruptedException {
		cng.release();
		
	}//End Withdraw


	public void startCheck() throws InterruptedException {
		mutex.acquire();
		numOfReaders++;
		if(numOfReaders ==1){
			cng.acquire();
	
		}
		mutex.release();
	}//startCheck


	public void endCheck() throws InterruptedException {
		mutex.acquire();
		numOfReaders--;
		if(numOfReaders == 0){
			cng.release();
		
		}
		mutex.release();
	}//End Check

	

}
