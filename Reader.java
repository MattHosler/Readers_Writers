import java.util.Random;
public class Reader extends Thread{

	private SharedData data;
	
	private final static int MIN_READING_TIME = 1000;
	private final static int MAX_READING_TIME = 2000;
	private final static int MIN_OTHER_ACTIVITIES_TIME = 1000;
	private final static int MAX_OTHER_ACTIVITIES_TIME = 6000;
	
	private Random random = new Random();
	
	public Reader(String name, SharedData d) {
		super(name);
		data = d;
	}
	
	public void run(){
		try{
			while(true){
				data.startReading();
				readData();
				data.endReading();
				doOtherActivities();
			}//While
		}catch (InterruptedException e){}
	}//run
	
	private void readData() throws InterruptedException {
		System.out.println("Reader " + getName()+ " starts to read");
		randomWait(MIN_READING_TIME, MAX_READING_TIME);
		System.out.println("Reader " + getName() + " ends to read");
	}//read
	
	private void doOtherActivities() throws InterruptedException{
		randomWait(MIN_OTHER_ACTIVITIES_TIME, MAX_OTHER_ACTIVITIES_TIME);
	}//doOtherActivities
	
	private void randomWait(int minTime, int maxTime) throws InterruptedException{
		Thread.sleep((random.nextInt(maxTime-minTime +1) + minTime));
	}// randomWait
	
}//Reader
