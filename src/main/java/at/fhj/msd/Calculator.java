package at.fhj.msd;

public class Calculator {

    double add(double number1, double number2){
        return number1 + number2;
    }
    double minus(double number1, double number2){
        return number1 - number2;
    }
    double divide(double number1, double number2){
        return number1 / number2;
    }
    double multiply(double number1, double number2){
        return number1 * number2;
    }
    double factorial(double number){
        int factorial = 1;
        if(number < 0)
            return 0;
        for(int i = 1; i <= number; i++){
            factorial *= i;
        }
        return factorial;
    }
}
