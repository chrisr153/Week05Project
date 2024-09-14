
public class App {

	public static void main(String[] args) {
		
		Logger logger = new SpacedLogger();
		
		Logger loggerA = new AsteriskLogger();

		
		
		logger.info("Hello");
		logger.error("HELLA ERRORS");
		
		loggerA.info("Hello");
		loggerA.error("HELLA ERRORS");
		
		


	}

}
