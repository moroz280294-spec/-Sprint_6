import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static TestData.TestDataFood.PREDATOR_FOOD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void getFood_ShouldReturnPredatorFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        assertEquals(PREDATOR_FOOD, lion.getFood());
    }
    @Test
    void getKittens_Default_ReturnsOne() {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        assertEquals(1, lion.getKittens());
    }

    @Test
    void getFood_ShouldDelegateToFelinePredator() throws Exception {
        when(feline.getFood("Хищник")).thenReturn(PREDATOR_FOOD);

        Lion lion = new Lion(feline);

        assertEquals(PREDATOR_FOOD, lion.getFood());
        verify(feline).getFood("Хищник");
    }

    @Test
    void getKittens_ShouldDelegateToFeline() {
        when(feline.getKittens()).thenReturn(3);

        Lion lion = new Lion(feline);

        assertEquals(3, lion.getKittens());
        verify(feline).getKittens();
    }
}