
public class ReadersWritersTest {
	
	public static void main(String[] args){
		int numOfReaders = 5;
		int numOfWriters = 5;
		
		SharedData data  = new SharedDataSemaphore();
		Reader [] readers = new Reader[numOfReaders];
		Writer [] writers = new Writer[numOfWriters];
		
		for(int i = 0; i< numOfReaders; i++){
			String name = "R" + Integer.toString(i);
			readers[i] = new Reader(name, data);
			readers[i].start();
		}//for
		
		for (int i = 0; i< numOfWriters; i++){
			String name = "W" + Integer.toString(i);
			writers[i] = new Writer(name, data);
			writers[i].start();
		}
	}

}
