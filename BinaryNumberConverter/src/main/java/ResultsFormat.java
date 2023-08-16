import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

//class to format the result in the array to BigInt or BigDec
public class ResultsFormat {
    String stringResultWholeNumber = "";
    String stringResultDecimalFraction = "0.";

    //TODO: Delete public static from the fieds @finalResultToNumber and @finalResultToNumber2
    //FIXME: Make these two fields non-static. Declared static to monitor values.
    public static BigInteger formattedResultWholeNumber = BigInteger.ZERO;
    public static BigDecimal formattedResultDecimalFraction = BigDecimal.ZERO;

    //format the whole number result by parsing the resultant Array from the conversion
    public BigInteger wholeNumberResultsGenerator(ArrayList convertedNumber) {
        for (int i = convertedNumber.size() - 1; i >= 0; i--) {
            //reverse the content of the array to keep track of the changes
            //reversedResult.add(BigInteger.valueOf((convertedNumber.get(i))));
            stringResultWholeNumber = stringResultWholeNumber.concat(convertedNumber.get(i).toString());
        }
        formattedResultWholeNumber = (new BigInteger(stringResultWholeNumber));
        //System.out.println("THE BINARY VALUE OF " + InputGenerator.wholeNumber + " IS " + finalResultToNumber);
        return formattedResultWholeNumber;
    }

    //format the decimal fraction result
    public BigInteger fractionNumberResultsGenerator(ArrayList convertedNumber) {
        for (int i = 0; i <= convertedNumber.size() - 1; i++) {
            stringResultDecimalFraction = stringResultDecimalFraction.concat(convertedNumber.get(i).toString());
        }

        formattedResultDecimalFraction = (new BigDecimal(stringResultDecimalFraction));
        //System.out.println("THE BINARY VALUE OF " + InputGenerator.fractionNumber + " IS " + finalResultToNumberTwo);
        return formattedResultWholeNumber;
    }
}