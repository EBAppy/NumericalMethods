import java.math.BigInteger;
import java.util.ArrayList;

abstract class NumberConverter {

    //variables of the number converter method
    public ArrayList<BigInteger> digitValuesKeys = new ArrayList<>();
    public ArrayList<BigInteger> digitValues = new ArrayList<>();
    public ArrayList<BigInteger> digitValuesDecimal = new ArrayList<>();
    public BigInteger counter = BigInteger.ZERO;
    public BigInteger digit;

    //method to convert input values to binary numbers
    public abstract ArrayList numberConverter();
}