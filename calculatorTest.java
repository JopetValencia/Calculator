package ECPE205;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class calculatorTest {
    calculator calc;

    @BeforeAll
    void setup(){
        calc = new calculator();
    }

    @ParameterizedTest
    @ValueSource (ints = {25,16,8,9,7})
    void shouldSolveXPowerY(int value) {
        assertEquals(25, calc.XPowerY(5, 2));
        assertEquals(16, calc.XPowerY(2, 4));
        assertEquals(8, calc.XPowerY(2,3));
        assertEquals(9, calc.XPowerY(3, 2));
        assertEquals(7, calc.XPowerY(7,1));
    }

    @ParameterizedTest
    @ValueSource(ints = {2,3,4,5,6})
    void shouldSolveFactorial(int value){
        assertEquals(2, calc.factorial(2));
        assertEquals(6, calc.factorial(3));
        assertEquals(24, calc.factorial(4));
        assertEquals(120, calc.factorial(5));
        assertEquals(720, calc.factorial(6));
    }

    @ParameterizedTest
    @ValueSource (strings = {"radar","kayak","refer","racecar", "level" })
    void shouldCheckPalindrome(String value){
        assertEquals(value, calc.palindrome(value));
    }

}
