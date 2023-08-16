import java.util.HashMap;

public class DifferentiationTable {

    public HashMap<String, String> getDerivatives() {
        //hashmap to create the derivatives table.
        HashMap<String, String> derivatives = new HashMap<>();
        derivatives.put("\\^[d]*$", "0");
        derivatives.put("x", "1");
        derivatives.put("Math.pow(Math.exp(0),x)", "Math.pow(Math.exp(0),x);");
        derivatives.put("Math.log()", "1/x");
        derivatives.put("sin x", "cos x");
        derivatives.put("-sin x", "-cos x");
        derivatives.put("cos x", "-sin x");
        derivatives.put("-cos x", "sin x");




        derivatives.forEach((k,v) -> {
            System.out.println(k + "[" + v + "]");
        });

        return derivatives;
    }


}
