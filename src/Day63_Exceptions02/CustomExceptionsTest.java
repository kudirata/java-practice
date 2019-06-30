package Day63_Exceptions02;

public class CustomExceptionsTest {
	public static void main(String[] args) throws NeedSomeCoffeeException {
		double balance = 2000;
		double transaction = 210;
		
		if(transaction > balance) {
			//throw new InsufficientFundsException();
			throw new InsufficientFundsException("Balance is too low.");
		}else {
			System.out.println("Purchase successful.");
			balance -= transaction;
		}
		
		throw new NeedSomeCoffeeException("getting sleepy");
		
	}
}
