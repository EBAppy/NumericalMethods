import java.math.BigInteger;
import java.util.ArrayList;


public class WholeNumberConverter extends NumberConverter {

    //overridden method from the abstract class NumberConverter
    @Override
    public ArrayList numberConverter(){
        BigInteger wholeNumber = new InputGenerator().getWholeNumber();
        if (wholeNumber == BigInteger.ZERO) {
            digitValues.add(BigInteger.ZERO);
            //System.out.print(digitValues);
        } else {
            while (wholeNumber != BigInteger.ZERO) {
                //ternary to convert number%2 and return the remainder 
                digit = (wholeNumber.mod(BigInteger.TWO).equals(BigInteger.ZERO)) ? BigInteger.ZERO : BigInteger.ONE;
                wholeNumber = (wholeNumber.subtract(digit)).divide(BigInteger.TWO);
                digitValues.add(digit);
                digitValuesKeys.add(counter);
                counter.add(BigInteger.ONE);
            }
        }
        //System.out.println(digitValues); //Print the values of the array
        ResultsFormat resultFormat = new ResultsFormat();
        resultFormat.wholeNumberResultsGenerator(digitValues);

        //System.out.println("THE BINARY VALUE OF " + InputGenerator.wholeNumber + " IS " + ResultsFormat
        // .finalResultToNumber);
        return digitValues;
    }
}