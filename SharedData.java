
public abstract class SharedData {
	public abstract void startWriting() throws InterruptedException;
	
	public abstract void endWriting() throws InterruptedException;
	
	public abstract void startReading() throws InterruptedException;
	
	public abstract void endReading() throws InterruptedException;
	
}//Shared Data
