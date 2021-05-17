import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test_Given_WeWantToSeeAWelcomeMessage_When_WeGetTheMessage_Then_theMessageShouldBeExactlyHelloMM(){
        // arrange

        // act
        String actual = Main.GetMessage();

        // assert
        Assertions.assertEquals("hello MM", actual);
    }
}