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

    @Test
    void testNumber0912562428(){
        assertTrue(Validate.validate("0912562428"));
    }

    @Test
    void testNumber8522170385(){
        assertFalse(Validate.validate("8522170385"));
    }

    @Test
    void testNumber054445(){
        assertTrue(Validate.validate("054445"));
    }

    @Test
    void testNumber063631(){
        assertFalse(Validate.validate("063631"));
    }

    @Test
    void testNumber1271(){
        assertTrue(Validate.validate("1271"));
    }

    @Test
    void testNumber2079(){
        assertFalse(Validate.validate("2079"));
    }

}
