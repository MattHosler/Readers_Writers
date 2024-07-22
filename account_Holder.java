package Bank438;

import java.lang.reflect.Array;

public class account_Holder {
	
	public account_Holder(int AccountHolders, SharedData data){
		super();
	}
	

	
	
	public void getBalance(Check[] array, int AccountHolders, SharedData data){
		for(int i = 0; i < AccountHolders; i++){
		String name = "BA1 Holder" + Integer.toString(i);
		array[i] = new Check(name,data);
		array[i].start();
		}
	}

}
