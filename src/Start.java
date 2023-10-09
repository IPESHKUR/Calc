import java.util.Scanner;

public class Start {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        ValidationService validationService = new ValidationService();
        CalculateService calculateService = new CalculateService();


        String completeAction = scanner.nextLine();
        String[] action = completeAction.split(" ");

        boolean b = validationService.validateExprecion(action);
        if(b){
            Integer resultCalculate = calculateService.getResultCalculate(Integer.parseInt(action[0]), action[1], Integer.parseInt(action[2]));
            if(resultCalculate != null){
                System.out.println("Output: " + "\n" + resultCalculate);
            }

        }

    }


}

