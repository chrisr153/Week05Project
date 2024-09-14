
public class SpacedLogger implements Logger {

	@Override
	public void info(String info) {
	
		for (int i= 0; i <info.length(); i++ ) {
			System.out.print(info.charAt(i)+ " ");
		}
		System.out.println();
	}

	@Override
	public void error(String error) {
		
		StringBuilder  spacedWord = new StringBuilder();
		
		for (int i= 0; i <error.length(); i++ ) {
			spacedWord.append(error.charAt(i)+ " ");
		}
		System.out.println("Error: " + spacedWord);
	}
	
	//public static String addSpacedLog(String info) {
		
	//	StringBuilder spacedLog = new StringBuilder();
		
		
		
	//	for (int i=0; i < info.length(); i ++) {
	//		spacedLog.append(info.charAt(i));
	//		if (i < info.length()-1) {
	//			spacedLog.append(" ");
	//			}
	//	}
		
	//	return spacedLog.toString();
	//}

}
