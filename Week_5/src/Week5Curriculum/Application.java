package Week5Curriculum;

public class Application {

	
	public static void main(String[] args) {
		
		Logger logger = new FileLogger();
		
		logger.info("Hello");
		logger.warning("This is a warning");
		logger.error("Oops, this is an error!");
		logger.fatal("Fatal error");
		
		logger.close();
		
		
	}

}
