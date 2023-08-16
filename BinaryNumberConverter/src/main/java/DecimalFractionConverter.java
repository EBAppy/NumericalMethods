import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;

//class to convert the decimal fraction part of the input value
public class DecimalFractionConverter extends NumberConverter {

    //overridden method from the abstract class NumberConverter
    @Override
    public ArrayList numberConverter() {
        BigDecimal fractionNumber = new InputGenerator().getFractionNumber();
        //cast the number to the ceiling to check if it is 0
        int counter = (int) (Math.ceil(InputGenerator.fractionNumber.doubleValue()));

        if (counter == 0) {
            digitValues.add(BigInteger.ZERO);
            //System.out.println(counter);
        } else {
            while (true) {
                BigInteger digit = ((fractionNumber.multiply(new BigDecimal(2))).compareTo(BigDecimal.ONE) >= 0) ?
                        BigInteger.ONE : BigInteger.ZERO;
                BigDecimal subtrahendValue = ((fractionNumber.multiply(new BigDecimal(2))))
                        .setScale(0, RoundingMode.FLOOR);
                BigDecimal valueOfD = subtrahendValue;
                BigDecimal valueOfM = ((fractionNumber.multiply(BigDecimal.valueOf(2)))
                        .subtract(subtrahendValue));
                BigDecimal numberMonitor = valueOfD.add(valueOfM);
                digitValues.add(digit);
                fractionNumber = valueOfM;
                counter = (int) (Math.ceil(fractionNumber.doubleValue()));
                if (counter == 0 || (digitValues.size() > 25))
                    break;
            }
        }
        ResultsFormat resultFormat = new ResultsFormat();
        resultFormat.fractionNumberResultsGenerator(digitValues);
/*        System.out.println("THE BINARY VALUE OF " + InputGenerator.fractionNumber + " IS " + ResultsFormat
        .finalResultToNumberTwo);*/
        return digitValues;
    }
}
