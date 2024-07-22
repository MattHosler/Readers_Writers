package Bank438;

public class Bank438 {


	public static void main(String[] args) {
		int bankAccount1 = 3;
		int bankAccount2 = 2;
		int bankAccount3 = 1;
		
		//SharedData data  = new SharedDataSemaphore();
		//SharedData data2 = new SharedDataSemaphore();
		//SharedData data3 = new SharedDataSemaphore();
		
		SharedData data  = new SharedDataMonitor();
		SharedData data2 = new SharedDataMonitor();
		SharedData data3 = new SharedDataMonitor();
		
		
		
		
		
		Withdraw[] withdrawers1 = new Withdraw[bankAccount1];
		Check[] checkers1 = new Check[bankAccount1];
		Deposit[] depositers1 = new Deposit[bankAccount1];
		
		for(int i = 0; i < bankAccount1; i++){
		String name = "BA1 Holder" + Integer.toString(i);
		withdrawers1[i] = new Withdraw(name,data);
		withdrawers1[i].start();
		}
		
		for(int i = 0; i < bankAccount2; i++){
			String name = "BA2 Holder" + Integer.toString(i);
			checkers1[i] = new Check(name,data2);
			checkers1[i].start();
			}
			for(int i = 0; i < bankAccount2; i++){
				String name = "BA2 Holder" + Integer.toString(i);
				depositers1[i] = new Deposit(name,data2);
				depositers1[i].start();
				}
	
			
			
			
			
			
		Withdraw[] withdrawers2 = new Withdraw[bankAccount1];
		Check[] checkers2 = new Check[bankAccount1];
		Deposit[] depositers2 = new Deposit[bankAccount1];
		
		
		for(int i = 0; i < bankAccount2; i++){
			String name = "BA2 Holder" + Integer.toString(i);
			withdrawers2[i] = new Withdraw(name,data2);
			withdrawers2[i].start();
			}
			
			for(int i = 0; i < bankAccount2; i++){
			String name = "BA2 Holder" + Integer.toString(i);
			checkers2[i] = new Check(name,data2);
			checkers2[i].start();
			}
			for(int i = 0; i < bankAccount2; i++){
				String name = "BA2 Holder" + Integer.toString(i);
				depositers2[i] = new Deposit(name,data2);
				depositers2[i].start();
				}

			
			
			
			Withdraw[] withdrawers3 = new Withdraw[bankAccount1];
			Check[] checkers3 = new Check[bankAccount1];
			Deposit[] depositers3 = new Deposit[bankAccount1];
			
			
			for(int i = 0; i < bankAccount3; i++){
				String name = "BA3 Holder" + Integer.toString(i);
				withdrawers3[i] = new Withdraw(name,data3);
				withdrawers3[i].start();
				}
				
				for(int i = 0; i < bankAccount3; i++){
				String name = "BA3 Holder" + Integer.toString(i);
				checkers3[i] = new Check(name,data3);
				checkers3[i].start();
				}
				for(int i = 0; i < bankAccount3; i++){
					String name = "BA3 Holder" + Integer.toString(i);
					depositers3[i] = new Deposit(name,data3);
					depositers3[i].start();
					}
	}//


}
