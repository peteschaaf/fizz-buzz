package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {

    @Test
    public void shouldBeAbleToCreateFizzBuzzObject(){
        //Arrange and Action
        FizzBuzz underTest = new FizzBuzz();
        //Assertion
        assertTrue(underTest != null);

    }

    @Test
    public void given1ShouldReturn1(){
        //Arrangement
        FizzBuzz underTest = new FizzBuzz();

        //Action
        String result = underTest.interpret(1);

        //Assertion
        assertEquals("1", result);
    }
    @Test
    public void given2ShouldReturn2(){
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(2);

        assertEquals("2", result);
    }
    @Test
    public void given3ShouldReturnFizz() {
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(3);

        assertEquals("Fizz", result);
    }
    @Test
    public void given5ShouldReturnBuzz() {
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(5);

        assertEquals("Buzz", result);
    }

    @Test
    public void given6ShouldReturnFizz(){
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(6);

        assertEquals("Fizz", result);
    }
    @Test
    public void given10ShouldReturnBuzz(){
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(10);

        assertEquals("Buzz", result);

    }
    @Test
    public void given15ShouldReturnFizzBuzz(){
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(15);

        assertEquals("FizzBuzz", result);

    }
    @Test
    public void given30ShouldReturnFizzBuzz(){
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(30);

        assertEquals("FizzBuzz", result);

    }

}
