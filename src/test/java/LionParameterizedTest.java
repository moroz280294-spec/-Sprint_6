import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LionParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    void doesHaveMane_ShouldReturnCorrectValue(String sex, boolean expected) throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        assertEquals(expected, lion.doesHaveMane());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Трансформер"})
    void constructor_ShouldThrowExceptionWithCorrectMessage_ForInvalidSex(String invalidSex) {
        Feline feline = new Feline();

        Exception exception = assertThrows(Exception.class, () -> new Lion(invalidSex, feline));

        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}

