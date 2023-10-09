

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
                if (secondNumber == 0){
                    System.out.println("Output: " + "\n" + "На ноль деление запрещено");
                    break;
                }
                int res3 = firstNumber / secondNumber;
                return res3;
        }
        return null;
    }

//        switch (complete){
//            case "-":
//                if (firstNumber >= 1 && firstNumber<=10 && secondNumber <=10 && secondNumber>=1){
//                    System.out.print("Output: " + "\n" + (firstNumber - secondNumber));
//                } else
//                    System.out.println("Output: " + "\n" + "Число не удовлетворяет требованиям");
//                break;
//            case "+":
//                if (firstNumber >= 1 && firstNumber<=10 && secondNumber <=10 && secondNumber>=1) {
//                    System.out.print("Output: " + "\n" + (firstNumber + secondNumber));
//                } else
//                    System.out.println("Output: " + "\n" + "Число не удовлетворяет требованиям");
//                break;
//            case "*":
//                if (firstNumber >= 1 && firstNumber<=10 && secondNumber <=10 && secondNumber>=1) {
//                    System.out.print("Output: " + "\n" + (firstNumber * secondNumber));
//                } else
//                    System.out.println("Output: " + "\n" + "Число не удовлетворяет требованиям");
//                break;
//            case "/":
//                if (firstNumber >= 1 && firstNumber<=10 && secondNumber <=10 && secondNumber>=1) {
//                    System.out.print("Output: " + "\n" + (firstNumber / secondNumber));
//                } else if (secondNumber == 0){
//                    System.out.println("Output: " + "\n" + "На ноль деление запрещено");
//                }
//                    else
//                    System.out.println("Output: " + "\n" + "Число не удовлетворяет требованиям");
//                break;
//            default:
//                System.out.println("Output: " + "\n" + "Такого действия нет");
//        }
}
