import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   @Test
   public void testQ1_1()
   {
      String data = "true\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("Input a boolean: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

    @Test
   public void testQ1_2()
   {
      String data = "false\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("Input a boolean: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

    @Test
   public void testQ2_1()
   {
      String data = "6\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input an integer: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

    @Test
   public void testQ2_2()
   {
      String data = "4\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input an integer: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

    @Test
   public void testQ2_3()
   {
      String data = "5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input an integer: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

    @Test
   public void testQ3_1()
   {
      String data = "pizza\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input pizza: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

    @Test
   public void testQ3_2()
   {
      String data = "pop\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input pizza: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

    @Test
   public void testQ3_3()
   {
      String data = "not pizza\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input pizza: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

    @Test
   public void testQ4_1()
   {
      String data = "0.0\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a number: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

    @Test
   public void testQ4_2()
   {
      String data = "0.1\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a number: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

    @Test
   public void testQ4_3()
   {
      String data = "-2\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a number: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

    @Test
   public void testQ5_1()
   {
      String data = "3\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input an integer: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

    @Test
   public void testQ5_2()
   {
      String data = "0\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input an integer: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

    @Test
   public void testQ5_3()
   {
      String data = "-1\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input an integer: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

    @Test
   public void testQ6_1()
   {
      String data = "zebra\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("Input a word earlier than google: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

    @Test
   public void testQ6_2()
   {
      String data = "dog\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("Input a word earlier than google: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

    @Test
   public void testQ6_3()
   {
      String data = "google\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("Input a word earlier than google: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   

}
