
import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.Test;

import static TestData.TestDataFood.PREDATOR_FOOD;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CatTest {

    @Test
    public void getFood_ShouldReturnMeat() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assertEquals(PREDATOR_FOOD, cat.getFood());
    }

    @Test
    public void getSound_ShouldReturnMeow() {
        Feline felineMock = mock(Feline.class);
        Cat cat = new Cat(felineMock);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFood_ShouldDelegateToPredator() throws Exception {
        Feline predatorMock = mock(Feline.class);
        when(predatorMock.eatMeat()).thenReturn(PREDATOR_FOOD);

        Cat cat = new Cat(predatorMock);

        assertEquals(PREDATOR_FOOD, cat.getFood());
        verify(predatorMock, times(1)).eatMeat();
    }
}
