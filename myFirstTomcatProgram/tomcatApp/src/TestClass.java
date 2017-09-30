import com.google.gson.Gson;
import javax.servlet.*;

public class TestClass {

    private void foo() {
        Logic logic = new Logic("Hello World!");
        System.out.println(logic.getExampleStr());

        Gson gson = new Gson();
        String newStr = gson.toJson(logic);
        System.out.println(newStr);
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.foo();
    }
}
