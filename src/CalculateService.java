
public class CalculateService {


    public Integer getResultCalculate(int firstNumber, String symbol, int secondNumber) {

        switch (symbol) {
            case "-":
                int res = firstNumber - secondNumber;
                return res;
            case "+":
                int res1 = firstNumber + secondNumber;
                return res1;
            case "*":
                int res2 = firstNumber * secondNumber;
                return res2;
            case "/":
                int res3 = firstNumber / secondNumber;
                return res3;
        }
        return null;
    }



}
