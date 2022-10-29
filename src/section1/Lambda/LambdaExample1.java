package section1.Lambda;

public class LambdaExample1 {
    public static void main(String[] args) {
          /*Object obj = new Object(){
      int sum(int num1, int num2){
        return num1+ num2;
      }
}
     */
        ExampleFunction exampleFunction = (num1, num2) -> num1 + num2;
        System.out.println(exampleFunction.sum(10,15));
    }
}

@FunctionalInterface
interface ExampleFunction{
    public abstract int sum(int num1, int num2);
}



//매개변수와 리턴값이 없는 람다식
//@FunctionalInterface
//public interface FunctionalInterface {
//    public void accept();
//}

//FunctionInterface exam = () -> {};
//exam.accept();


//매개변수가 있는 람다식
//@FunctionalInterface
//public interface FunctionalInterface {
//    public void accept(int x);
//}
//
//
//public class FunctionalInterfaceExample {
//    public static void main(String[] args) throws Exception {
//        FunctionalInterface example;
//        example = (x) -> {
//            int result = x * 4;
//            System.out.println(result);
//        };
//        example.accept(2);
//
//        example = (x) -> System.out.println(x * 4);
//        example.accept(2);
//    }
//}
//
// 출력값
//8
//8


//리턴값이 있는 람다식
