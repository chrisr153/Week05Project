
public class AsteriskLogger implements Logger {

	@Override
	public void info(String info) {

		System.out.println("***" + info + "***");
		
		
	}

	@Override
	public void error(String error) {
		
		StringBuilder asteriskMark = new StringBuilder();
		
		for (int i= 0; i < error.length(); i++) {
			asteriskMark.append("*");
		}
		
		System.out.println("*********"+asteriskMark+"****");
		System.out.println("***Error: "+ error + "***");
		System.out.println("*********"+asteriskMark+"****");
	}
	
	

}
