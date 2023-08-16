import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;
import java.util.regex.Pattern;

//class to collect input from user
public class InputGenerator {

    private Scanner userInput = new Scanner(System.in);
    public static BigDecimal fractionNumber = BigDecimal.ZERO;
    public static BigInteger wholeNumber = BigInteger.ZERO;
    private BigDecimal number = BigDecimal.ZERO;
    public static String valueInput;
    private String Numerator, Denominator;
    private String patternOne = "^[\\d]*|[\\d]*[.?][\\d]*|[0]*[\\d]*[.?]|[\\d]*[\\/][\\d]*$";
    private String patternTwo = "^[\\d]*[\\/][\\d]*$";

    //ToDo Add an input validation for values in the form a/b
    //FIXME Remove arrays being printed on the console

    public String askUserInput(){
        //validate user input.
        while(true){
            System.out.print("PLEASE, ENTER THE VALUE TO CONVERT TO BINARY: ");
            valueInput = userInput.nextLine();
            if(Pattern.matches(patternOne, valueInput))
                break;
            System.out.println("Please, enter a valid number to convert");
        }
        if(Pattern.matches(patternTwo, valueInput)) {
            String[] valuesInputArray = valueInput.split("/");

            //parse the array values as string values to variables Numerator and Denominator
            Numerator = valuesInputArray[0];
            Denominator = valuesInputArray[1];

            //cast values to a BigDecimal
            number = ((new BigDecimal(Numerator)).divide(new BigDecimal(Denominator), MathContext.DECIMAL128));
            //System.out.println(number);
            valueInput = number.toString();
        }
        number = new BigDecimal(valueInput);
        //System.out.println(valueInput);
        wholeNumber = number.toBigInteger();
        fractionNumber = number.subtract(new BigDecimal(wholeNumber));
        //System.out.println("Whole number is: " + wholeNumber);
        //System.out.println("Decimal fraction is: " + fractionNumber);
        return valueInput;
    }


    //return the BigDecimal decimal fraction value of the input value
    public BigInteger getWholeNumber(){
        return wholeNumber;
    }


    //return the BigDecimal decimal fraction value of the input value
    public BigDecimal getFractionNumber(){
        return fractionNumber;
    }

}
