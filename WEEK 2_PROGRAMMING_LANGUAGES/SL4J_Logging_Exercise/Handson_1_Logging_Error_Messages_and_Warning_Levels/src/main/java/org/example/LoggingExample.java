package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample{
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        String user = "ABC";
        int userId = 6401676;
        logger.trace("TRACE: App starting...");
        logger.debug("DEBUG: Loaded user config");
        logger.info("INFO: Processing user {} with ID {}", user, userId);
        logger.warn("WARN: User {} has no email linked!", user);
        try {
            int result = divide(10, 0);
            logger.info("Result is: {}", result);
        } catch (ArithmeticException e) {
            logger.error("ERROR: Division failed due to {}", e.toString(), e);
        }
        logger.info("App finished.");
    }
    private static int divide(int a, int b) {
        return a / b;
    }
}
