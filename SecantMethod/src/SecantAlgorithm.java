import java.text.DecimalFormat;

public class SecantAlgorithm {

    Function myNewFunction = new Function();
    int n = 1;
    double stop;
    DecimalFormat decimalFormat = new DecimalFormat("0.000000");

    //initialize the value X_(n-1)
    double X_nMinus1 = -2.6;

    //initialize the value X_n
    double X_n = -2.4;

    //declare X_nPlus1
    double X_nPlus1;

    //define the function f(X)


    //define the iteration for the secant method
    //-----------DON'T TOUCH THIS----------------
    public void secantMethod(){
        System.out.println("n" + "\t" + "X_nMinus1 " + "\t \t \t" + "X_n " + "\t \t \t \t" + "X_nPlus1" + "\t \t \t" +
                "X_nPlus1 - X_n");
        do {
            X_nPlus1 = X_n - ((X_n - X_nMinus1) * (myNewFunction.myFunction(X_n) /
                    (myNewFunction.myFunction(X_n) - myNewFunction.myFunction(X_nMinus1))));

            System.out.println(n + "\t" + decimalFormat.format(X_nMinus1) + "\t \t \t" + decimalFormat.format(X_n) +
                    "\t \t \t" + decimalFormat.format(X_nPlus1) + "\t \t \t" + decimalFormat.format((X_nPlus1 - X_n)));
            n++;
            stop = X_nPlus1 - X_n;
            X_nMinus1 = X_n;
            X_n = X_nPlus1;

        } while (stop > 0.01);

    }

}