import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static TestData.TestDataFood.PREDATOR_FOOD;
import static org.mockito.Mockito.*;

public class LionTest {
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
        Feline felineMock = mock(Feline.class);
        when(felineMock.getFood("Хищник")).thenReturn(PREDATOR_FOOD);

        Lion lion = new Lion(felineMock);

        assertEquals(PREDATOR_FOOD, lion.getFood());
        verify(felineMock).getFood("Хищник");
    }

    @Test
    void getKittens_ShouldDelegateToFeline() {
        Feline felineMock = mock(Feline.class);
        when(felineMock.getKittens()).thenReturn(3);

        Lion lion = new Lion(felineMock);

        assertEquals(3, lion.getKittens());
        verify(felineMock).getKittens();
    }
}