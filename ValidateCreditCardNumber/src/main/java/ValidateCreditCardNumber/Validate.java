package ValidateCreditCardNumber;
import java.util.stream.*;
import java.util.*;

class Validate{
    public static boolean validate(String cardNumber){

        var  digits = Arrays.stream(cardNumber.split(""))
        .filter(s -> s.matches("[0-9]{1}"))
        .mapToInt(Integer::parseInt)
        .toArray();

        if(digits.length > 16){
            return false;
        }

        var offset = digits.length % 2;

        for(int i = offset; i < digits.length; i+=2){
            digits[i] *=2;
            if(digits[i] > 9){
                digits[i] -= 9;
            }
        }
        return IntStream.of(digits).sum() % 10 == 0;
    }
}
