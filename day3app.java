package in.conceptarchitect.financeapp; 
import in.conceptarchitect.finance.ATM; 
import in.conceptarchitect.finance.Bank; 
public class App { 	
    public static void main(String[] args) { 		
        // TODO Auto-generated method stub 		 		
        Bank B=new Bank(3254,"pa@ss",3500); 		
        ATM A=new ATM(); 		 		
        A.withdraw(3254,"p@ss",3500); 		
        A.Deposit(3254, 4000); 		 		
        A.changePassword("p@ss","nikesh@1"); 		 		 		 	} }