package pkg1;

import static org.junit.Assert.assertTrue;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void mainTest(){
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        App.main(null);
        assertTrue(os.toString().contains("Hello"));
        assertTrue(os.toString().contains("World"));
    }

}

