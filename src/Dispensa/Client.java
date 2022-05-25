package Dispensa;

public class Client {

	public static void main(String[] args) {
		Despensa atm = new Despensa();
		atm.withdraw(230);
		System.out.println("-----------");
		atm.withdraw(66);
	}
}
