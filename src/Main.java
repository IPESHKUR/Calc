import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static ValidationService validationService = new ValidationService();
    static CalculateService calculateService = new CalculateService();
    static Converter converter = new Converter();

    public static void main(String[] args) throws Exception {

        System.out.println("Input: ");
        Scanner scanner = new Scanner(System.in);
        String completeAction = scanner.nextLine();

        calc(completeAction);
    }

    public static String calc(String input) throws Exception {

        List<String> romanNumbersList = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "L", "XC", "C");

        String[] action = input.split(" ");

        Boolean validNumber = validationService.validate(action);
        int arabianFirstNumber = 0;
        int arabianSecondNumber = 0;

        if(validNumber != null){
            if (validNumber) {
                arabianFirstNumber = romanNumbersList.indexOf(action[0]) + 1;
                arabianSecondNumber = romanNumbersList.indexOf(action[2]) + 1;
            }else {
                arabianFirstNumber = Integer.parseInt(action[0]);
                arabianSecondNumber = Integer.parseInt(action[2]);
            }
            Integer resultCalculate = calculateService.getResultCalculate(arabianFirstNumber, action[1], arabianSecondNumber);

            if(validNumber && resultCalculate > 0){
                String resultCalculateRoman = converter.convertArabToRoman(resultCalculate);
                System.out.println("Output: " + "\n" + resultCalculateRoman);
            }else if(!validNumber){
                System.out.println("Output: " + "\n" + resultCalculate);
            }else{
                throw new Exception();
            }
        }
        return null;

    }

}

