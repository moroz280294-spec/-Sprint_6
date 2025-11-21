import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Test;

import static TestData.TestDataFood.PREDATOR_FOOD;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LionTest {
    @Test
public void getFood_ShouldReturnPredatorFood() throws Exception {
    Feline feline = new Feline();
    Lion lion = new Lion(feline);
    assertEquals(PREDATOR_FOOD, lion.getFood());
}


}


