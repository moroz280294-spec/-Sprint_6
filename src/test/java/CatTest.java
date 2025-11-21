
import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.Test;

import java.util.List;

import static TestData.TestDataFood.PREDATOR_FOOD;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {  @Test
public void getFood_ShouldReturnMeat() throws Exception {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);
    assertEquals(PREDATOR_FOOD, cat.getFood());
}
}
