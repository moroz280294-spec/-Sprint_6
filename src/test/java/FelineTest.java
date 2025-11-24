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
    @Test
    public void getFamily_ShouldReturnFelidae() throws Exception {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    void getKittens_Default_ReturnsOne() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    void getKittens_WithArgument_ReturnsArgument() {
        Feline feline = new Feline();
        assertEquals(7, feline.getKittens(7));
    }
}
