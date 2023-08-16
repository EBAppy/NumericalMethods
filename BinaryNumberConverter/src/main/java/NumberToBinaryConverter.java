import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.Pattern;

public class NumberToBinaryConverter {


    public void convertNumber(){
        String pattern = "^[\\d]*[.?][0]$";

        InputGenerator input1 = new InputGenerator();
        input1.askUserInput();

        DecimalFractionConverter converter1 = new DecimalFractionConverter();
        BigDecimal fractionNumberResult = new BigDecimal(new ResultsFormat().fractionNumberResultsGenerator
                                            (converter1.numberConverter()));

        WholeNumberConverter converter2 = new WholeNumberConverter();
        BigInteger wholeNumberResult = new ResultsFormat().wholeNumberResultsGenerator(converter2.numberConverter());


        BigDecimal ANSWER =
                (ResultsFormat.formattedResultDecimalFraction).add(new BigDecimal(ResultsFormat.formattedResultWholeNumber));

        if(Pattern.matches(pattern, (ANSWER).toString())){
            System.out.println("THE BINARY VALUE OF " + InputGenerator.valueInput + "₁₀" + " IS "   + "\n" +
                    "==================");
            System.out.println((ANSWER).toBigInteger() + "₂");
        }else{
            System.out.println("THE BINARY VALUE OF " + InputGenerator.valueInput + "₁₀" + " IS " + "\n" +
                    "==================");
            System.out.println(ANSWER + "₂");
        }


    }

}