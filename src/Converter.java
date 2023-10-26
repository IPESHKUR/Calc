import java.util.Arrays;
import java.util.List;

public class Converter {
    private final List<String> romanNumbers = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "L", "XC", "C");

    public Integer convertStringToInt (String numberOfString){
        int n = Integer.parseInt(numberOfString);
        return n;
    }

    public String convertArabToRoman (int resultCalculateArab){
        String result = "";

        try{
            while (resultCalculateArab != 0){
                if(resultCalculateArab == 100){
                    resultCalculateArab = resultCalculateArab - 100;
                    result = result.concat(romanNumbers.get(12));

                }else if(resultCalculateArab >= 90){
                    resultCalculateArab = resultCalculateArab - 90;
                    result = result.concat(romanNumbers.get(11));

                } else if (resultCalculateArab >= 50){
                    resultCalculateArab = resultCalculateArab - 50;
                    result = result.concat(romanNumbers.get(10));

                }else if(resultCalculateArab > 10){
                    resultCalculateArab = resultCalculateArab - 10;
                    result = result.concat(romanNumbers.get(9));
                }else {
                    result = result.concat(romanNumbers.get(resultCalculateArab - 1));
                    resultCalculateArab = 0;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }

}

