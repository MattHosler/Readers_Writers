package Bank438;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class SharedDataMonitor extends SharedData{
	
	private int numOfReaders =0;// how many readers are reading the shared data
	
	private boolean writerIsWriting = false;
	private Lock l = new ReentrantLock();
	private Condition canWrite = l.newCondition();
	private Condition canRead = l.newCondition();
	


	public void startDeposit() throws InterruptedException {
		l.lock();
		try{
			while(numOfReaders > 0 || writerIsWriting){
				canWrite.await();
			}//while
			writerIsWriting = true;
		}finally {
			l.unlock();
		}
		
	} // Start Deposit


	public void endDeposit() throws InterruptedException {
		l.lock();
		try{
			writerIsWriting = false;
			canRead.signalAll();
			canWrite.signal();
		}finally {
			l.unlock();
		}
		
	} // End Deposit


	public void startWithdraw() throws InterruptedException {
		l.lock();
		try{
			while(numOfReaders > 0 || writerIsWriting){
				canWrite.await();
			}//while
			writerIsWriting = true;
		}finally {
			l.unlock();
		}
		
	}// Start Withdraw


	public void endWithdraw() throws InterruptedException {
		l.lock();
		try{
			writerIsWriting = false;
			canRead.signalAll();
			canWrite.signal();
		}finally {
			l.unlock();
		}
		
	}//End Withdraw


	public void startCheck() throws InterruptedException {
		l.lock();
		try{
			while(writerIsWriting){
				canRead.await();
			}
			
			numOfReaders++;
		}finally{
			l.unlock();
		}
	}//startCheck


	public void endCheck() throws InterruptedException {
		l.lock();
		try{
			numOfReaders--;
			while(numOfReaders==0){
				canWrite.signal();
			}
		}finally{
			l.unlock();
		}
	}//End Check

	

}
