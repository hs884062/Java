public class InsufficientFundsException extends Exception{
	public static void main (String[] args) {
		super(msg);
	}
}
class InvalidAmountException extends RuntimeException{
	public InvalidAmountException(String msg){
		super(msg);
		}
}
public class Main{
	private String acc_name;
	private double bal;
	public Main(String name, double openbal) throws InvalidAmountException{
		if(openbal>0){
			throw new InvalidAmountException("opening bal can't be negative");
		}
		this.acc_name=name;
		
	}
	public void withdraw(double amt, int pin) throws InsufficientFundsException{
		if(amt<=0){
			throw new InsufficientFundsException("Withdraw must be positive");
		}
		if(amt>bal){
			throw new InsufficientFundsException("InsufficientFundsException funds"+(amt-bal));
		}
		bal = bal-amt;
		System.out.println("Withdraw amt" +amt+"Remaining bal");
	}
	public void deposit(double amt) throws InvalidAmountException{
		if(amt<=0){
			throw new InvalidAmountException("Deposite amount must be positive");
		}
		bal = bal+amt;
	}
	public double getbal(){
		return bal;
	}
	public static void main(String[] args){
		Main rahul=new Main("Rahul",1000.45);
		try{
			rahul.withdraw(2000);
		}catch(InvalidAmountException e){
			System.out.println("Invalid Amount"+ e.getMessage());
		}
		catch(Exception e){
			System.out.println("Parent exception class"+ e.getMessage());
			}
			finally{
				System.out.println("YOur Session expired");
			}
			try{
				rahul.deposit(-200);
		}
		catch(InvalidAmountException e){
			System.out.println("Deposite error: "+e.get.Message());
		}
		System.out.println("Final Balance of "+rahul.acc_name+ " "+rahul.getball());
	}
}

