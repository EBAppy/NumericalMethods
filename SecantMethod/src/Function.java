

public class Function {
    double functionResult;
    double stoppingCriterionResult;


    public Function(){
    }

    //defining the function, f(X) which root is to be determined
    //this can be changed to the function f(X)
    public double myFunction(double X) {
        functionResult = Math.pow(X, 12) - X + 2; //Change the function as needed
        return functionResult;
    }

    //defining the stopping criterion for the iteration of the function, f(X)
    //the stopping criterion can be changed to suit your preference
    public double stoppingCriterion(double X_nPlus1, double X_n){
        stoppingCriterionResult = X_nPlus1 - X_n;
        return stoppingCriterionResult;
    }
}
