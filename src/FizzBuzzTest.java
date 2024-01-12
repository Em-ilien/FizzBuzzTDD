import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void transform1ShouldReturn1() {
        assertEquals("1", fizzBuzz.transform(1));
    }

    @Test
    void transform2ShouldReturn2() {
        assertEquals("2", fizzBuzz.transform(2));
    }

    @Test
    void transform3ShouldReturnFizz() {
        assertEquals("Fizz", fizzBuzz.transform(3));
    }

    @Test
    void transform5ShouldReturnBuzz() {
        assertEquals("Buzz", fizzBuzz.transform(5));
    }

    @Test
    void transform15ShouldReturnFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.transform(15));
    }

    @Test
    void transform6ShouldReturnFizz() {
        assertEquals("Fizz", fizzBuzz.transform(6));
    }

    @Test
    void transform10ShouldReturnBuzz() {
        assertEquals("Buzz", fizzBuzz.transform(10));
    }

    @Test
    void transform30ShouldReturnFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.transform(30));
    }

    @Test
    void transform7ShouldReturn7() {
        assertEquals("7", fizzBuzz.transform(7));
    }

    @Test
    void transform11ShouldReturn11() {
        assertEquals("11", fizzBuzz.transform(11));
    }

    @Test
    void enter1To5ShouldReturn12Fizz4Buzz() {
        assertEquals("12Fizz4Buzz", fizzBuzz.enter(1, 5));
    }

    @Test
    void enter1To6ShouldReturn12Fizz4BuzzFizz() {
        assertEquals("12Fizz4BuzzFizz", fizzBuzz.enter(1, 6));
    }

    @Test
    void enter1To30ShouldReturn12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz() {
        assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz", fizzBuzz.enter(1, 30));
    }

    @Test
    void enter50To60ShouldReturnBuzzFizz5253FizzBuzz56Fizz5859FizzBuzz() {
        assertEquals("BuzzFizz5253FizzBuzz56Fizz5859FizzBuzz", fizzBuzz.enter(50, 60));
    }

    @Test
    void enter1To100ShouldReturnCorrectly() {
        assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz3132Fizz34BuzzFizz3738FizzBuzz41Fizz4344FizzBuzz4647Fizz49BuzzFizz5253FizzBuzz56Fizz5859FizzBuzz6162Fizz64BuzzFizz6768FizzBuzz71Fizz7374FizzBuzz7677Fizz79BuzzFizz8283FizzBuzz86Fizz8889FizzBuzz9192Fizz94BuzzFizz9798FizzBuzz", fizzBuzz.enter(1, 100));
    }
}