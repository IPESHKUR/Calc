import javax.swing.*;

public class ValidationService {

    Converter converter = new Converter();

    public boolean validateExprecion(String[] action){
        if(isValidSplitString(action) && isValidNumber(action[0], action[2]) && isValidSign(action[1]) == true){
            return true;
        }else {
            return false;
        }

    }
    private boolean isValidNumber(String firstNumber, String secondNumber) {
        try {
            int first = converter.convertStringToInt(firstNumber);
            int second = converter.convertStringToInt(secondNumber);


            if (first >= 1 && first <= 10 && second <= 10 && second >= 1) {
                return true;
            } else {
                System.out.println("Данное число не подходит ");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Калькулятор работает только с целыми числами от 1 до 10 ");
            return false;
        }
    }

    private boolean isValidSign(String sign) {
        if(sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")){
            return true;
        }else {
            System.out.println("Указан некорректный знак опереции ");
            return false;
        }
    }

    private boolean isValidSplitString(String[] splitString) {
        if (splitString.length == 3) {
            return true;
        } else {
            System.out.println("Введено некорректное выражение ");
            return false;
        }

    }

}
