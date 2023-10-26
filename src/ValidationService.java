import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class ValidationService {
    private final List<String> romanNumbersList = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");
    private final Converter converter = new Converter();

    private boolean validateExprecion(String[] action) throws Exception {
        if(isValidSplitString(action) && isValidNumber(action[0], action[2]) && isValidSign(action[1])){
            return true;
        }else {
            return false;
        }
    }
    /**
     * проверка валидности входных данных
     * @param action массив - число, действие, число
     * @return возвращает тру если римские, фолс - если арабские, null - если не прошло и то и то
     */
    public Boolean validate(String[] action) throws Exception {
        if(isValidRomanExprecion(action)){
            return true;
        }else if(validateExprecion(action)){
            return false;
        }
        return null;
    }

    private boolean isValidRomanExprecion (String[] action) throws Exception {
        if(romanNumbersList.contains(action[0]) && romanNumbersList.contains(action[2]) && isValidSign(action[1])) {
            return true;
        }else {
            return false;
        }
    }

    private boolean isValidNumber(String firstNumber, String secondNumber) throws Exception {

            int first = converter.convertStringToInt(firstNumber);
            int second = converter.convertStringToInt(secondNumber);

            if (first >= 1 && first <= 10 && second <= 10 && second >= 1) {
                return true;
            } else{
                throw new Exception();
            }
    }

    private boolean isValidSign(String sign) throws Exception {
            if(sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")){
                return true;
            }else{
                throw new Exception();

            }
    }

    private boolean isValidSplitString(String[] splitString) throws Exception {
        if (splitString.length == 3) {
            return true;
        } else {
            throw new Exception();
        }
    }

}
