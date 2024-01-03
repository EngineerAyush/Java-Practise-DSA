import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DublicateParanthesisTest {

    @Test
    public void testIsDublicate() {
        // Test case with duplicate parentheses
        String s1 = "((a+b))";
        assertEquals(true, DublicateParanthesis.IsDublicate(s1));

        // Test case without duplicate parentheses
        String s2 = "((a+b)+c)";
        assertEquals(false, DublicateParanthesis.IsDublicate(s2));

        // Test case with nested duplicate parentheses
        String s3 = "(((a+b)))";
        assertEquals(true, DublicateParanthesis.IsDublicate(s3));

        // Test case with no parentheses
        String s4 = "abc";
        assertEquals(false, DublicateParanthesis.IsDublicate(s4));

        // Test case with empty string
        String s5 = "";
        assertEquals(false, DublicateParanthesis.IsDublicate(s5));
    }
}