package steps.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public  void before(){
        System.out.println("Hook- Before annotation");

    }

    @After
    public void after(){
        System.out.println("Hook -After annotation");
    }
}
