public class TestClass {


  private static   TestClass testClass;
    private TestClass(){
        //bean
    }

    public static TestClass getInstance(){
        if (testClass == null){
            return getInstance();
        }
        testClass= new TestClass();

        return testClass;
    }


}
