package ExceptionH;

public class ExceptionH {
	public void amountCheck (int a) throws LessAmount{
		if (a<100) {
			throw new LessAmount("Amount is less  "+a);
			
		}
	}

	
	public static void main(String[] args) {
		
		ExceptionH ex = new ExceptionH();
	
		try {
			ex.amountCheck(80);
		}
		catch (Exception e) {
			System.out.println("Add Amount");
		}
	}
	
	}

