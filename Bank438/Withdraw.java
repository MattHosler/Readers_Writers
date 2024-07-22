package Bank438;

import java.util.Random;

public class Withdraw extends Thread {
	private SharedData data;
	
	private final static int MIN_READING_TIME = 1000;
	private final static int MAX_READING_TIME = 2000;
	private final static int MIN_OTHER_ACTIVITIES_TIME = 1000;
	private final static int MAX_OTHER_ACTIVITIES_TIME = 6000;
	
	private Random random = new Random();
	
	public Withdraw(String name, SharedData d) {
		super(name);
		data = d;
	}
	
	public void run(){
		try{
			while(true){
				data.startWithdraw();
				writeData();
				data.endWithdraw();
				doOtherActivities();
			}//While
		}catch (InterruptedException e){}
	}//run
	
	private void writeData() throws InterruptedException {
		System.out.println("Holder " + getName()+ " starts to Withdraw");
		randomWait(MIN_READING_TIME, MAX_READING_TIME);
		System.out.println("Holder " + getName() + " finishes withdrawing");
	}//writeData
	
	private void doOtherActivities() throws InterruptedException{
		randomWait(MIN_OTHER_ACTIVITIES_TIME, MAX_OTHER_ACTIVITIES_TIME);
	}//doOtherActivities
	
	private void randomWait(int minTime, int maxTime) throws InterruptedException{
		Thread.sleep((random.nextInt(maxTime-minTime +1) + minTime));
	}// randomWait
	
}//Writer
