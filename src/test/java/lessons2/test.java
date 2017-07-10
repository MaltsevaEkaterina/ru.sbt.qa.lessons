package lessons2;

import org.junit.Before;
import org.junit.Test;
import ru.sbt.lessons2.Calc;

/**
 * Created by Мрр on 10.07.2017.
 */
public class test {
    Calc calc;

    @Before
    public void method() {
      calc =  new Calc();
    }
    @Test
    public void requestTest(){
        calc.request("{\"operand1\": \"2\", \"operation\": \"mult\",\"operand2\": \"2\"}", "http://localhost:8888/calc");
    }
    @Test
    public void requestTest2(){
        calc.request("{\"operand1\": \"10\", \"operation\": \"minus\",\"operand2\": \"5\"}", "http://localhost:8888/calc ");
    }
}
