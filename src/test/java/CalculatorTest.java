import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class CalculatorTest {

//    @Test(expected = RuntimeException.class)
//    @DisplayName("whenMoreThan2NumbersAreUsedThenExceptionIsThrown")  //shows name of test method in terminal
//    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
//        Calculator.add("1,2,3");
//    }

    @Test
    @DisplayName("when 2 numbers are used then no exception is thrown")
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        Calculator.add("1,2");
        Assert.assertTrue(true);
    }

    @Test(expected = RuntimeException.class)
    @DisplayName("when non number is used then exception is thrown")
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
        Calculator.add("1,X");
    }

    @Test
    @DisplayName("when any number of numbers is used then return values are their sums")
    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
        Assert.assertEquals(3 + 6 + 15 + 18 + 46 + 33, Calculator.add("3,6,15,18,46,33"));
    }

    @Test
    @DisplayName("When new line is used between numbers then return values is their sum")
    public final void whenNewLineIsUsedBetweenNumbersThenReturnValuesIsTheirSums() {
        Assert.assertEquals(6+15, Calculator.add("6\n15"));
    }

}
