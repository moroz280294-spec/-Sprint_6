
import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static TestData.TestDataFood.PREDATOR_FOOD;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getFood_ShouldReturnMeat() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assertEquals(PREDATOR_FOOD, cat.getFood());
    }

    @Test
    public void getSound_ShouldReturnMeow() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFood_ShouldDelegateToPredator() throws Exception {
        when(feline.eatMeat()).thenReturn(PREDATOR_FOOD);

        Cat cat = new Cat(feline);

        assertEquals(PREDATOR_FOOD, cat.getFood());
        verify(feline, times(1)).eatMeat();
    }
}
