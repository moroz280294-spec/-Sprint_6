import com.example.Feline;
import org.junit.jupiter.api.Test;


import static testdata.TestDataFood.PREDATOR_FOOD;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineTest {


    @Test
        public void getFoodShouldReturnMeatTest() throws Exception {
        Feline feline = new Feline();
        assertEquals(PREDATOR_FOOD, feline.eatMeat());
    }
    @Test
    public void getFamilyShouldReturnFelidaeTest() throws Exception {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    void getKittensDefaultReturnsOneTest() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    void getKittensWithArgumentReturnsArgumentTest() {
        Feline feline = new Feline();
        assertEquals(7, feline.getKittens(7));
    }
}
