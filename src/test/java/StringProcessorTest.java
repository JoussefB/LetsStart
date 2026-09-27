
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class StringProcessorTest {

    @Test
    public void withSuffixDoNothing()
    {
        StringProcessor stringProcessor = new StringProcessor();
        String result = stringProcessor.appendIfMissing("hello world", "world");

        assertEquals("hello world", result);
    }

    @Test
    public void addSuffix()
    {
        StringProcessor stringProcessor = new StringProcessor();
        String result = stringProcessor.appendIfMissing("hello world", "!!!");

        assertEquals("hello world!!!", result);
    }

}