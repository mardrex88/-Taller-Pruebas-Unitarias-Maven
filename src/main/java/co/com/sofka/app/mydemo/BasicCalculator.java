package co.com.sofka.app.mydemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }



    public Long res(Long number1, Long number2) {
        logger.info( "Resting {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiply(Long number1, Long number2) {
        logger.info( "Multiplying {} x {}", number1, number2 );
        return number1 * number2;
    }

    public Long split(Long number1, Long number2) {
        logger.info( "dividing {} ÷ {}", number1, number2 );
        return number1 / number2;
    }
}
