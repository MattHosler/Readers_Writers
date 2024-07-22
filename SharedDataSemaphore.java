import java.util.concurrent.Semaphore;
public class SharedDataSemaphore extends SharedData{
	
	private int numOfReaders =0;// how many readers are reading the shared data
	
	private Semaphore mutex = new Semaphore(1); // used as mutual exclusion for "numOfReaders"
	private Semaphore wrt = new Semaphore(1); // Used as mutual exclusion for the writers 

	public void startWriting() throws InterruptedException{
		wrt.acquire();
	}// startWriting
	
	public  void endWriting() throws InterruptedException{
		wrt.release();
	}
	
	public void startReading() throws InterruptedException{
		mutex.acquire();
		numOfReaders++;
		if(numOfReaders ==1){
			wrt.acquire();
		}
		mutex.release();
	}//startReading
	
	public void endReading() throws InterruptedException{
		mutex.acquire();
		numOfReaders--;
		if(numOfReaders ==0){
			wrt.release();
		}
		mutex.release();
	}
	

}
