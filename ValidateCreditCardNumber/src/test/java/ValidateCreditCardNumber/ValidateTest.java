package ValidateCreditCardNumber;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ValidateTest{
    @Test
    void testTooManyDigits(){
        assertFalse(Validate.validate("11111111111111111"));
    }

    @Test
    void testNumber891(){
        assertFalse(Validate.validate("891"));
    }
}
