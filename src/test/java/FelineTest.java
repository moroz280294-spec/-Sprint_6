import com.example.Feline;
import org.junit.jupiter.api.Test;


import static TestData.TestDataFood.PREDATOR_FOOD;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineTest {


    @Test
        public void getFood_ShouldReturnMeat() throws Exception {
        Feline feline = new Feline();
        assertEquals(PREDATOR_FOOD, feline.eatMeat());
    }
}
