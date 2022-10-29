package section1.Thread;
/* 1.
public class thread_Runnable_Thread{
    public static void main(String[] args) {
        Runnable task1 = new ThreadTask1();
        Thread thread1 = new Thread(task1);
        //위의 두 줄 축약
        //Thread thread1 = new Thread(new ThreadTask1());

        thread1.start();

        //반복문 추가
        for (int i =0; i<50; i++){
            System.out.println("^");
        }
    }
}

//Runnable 인터페이스를 구현하는 클래스
class ThreadTask1 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i<50; i++){
            System.out.println("ㅋ");
        }
    }
}

 */

//2. thread 클래스를 상속받는 하위 클래스에서 run() 구현하여 스레드 생성하는 클래스
/*public class thread_Runnable_Thread{
    public static void main(String[] args) {

        Thread thread2 = new ThreadTask2();
        thread2.start();

        //반복문 추가
        for (int i =0; i<50; i++){
            System.out.println("^");
        }
    }
}



class ThreadTask2 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i<50; i++){
            System.out.println("ㅋ");
        }
    }
}

*/

//3. 익명 객체를 사용하여 스레드 생성하고 실행하기

//3-1 Runnable 익명 구현 객체를 활용한 스레드 생성 및 실행
//public class thread_Runnable_Thread {
//    public static void main(String[] args) {
//        //익명 Runnable 구현 객체를 활용하여 스레드 생성
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                //반복문
//            }
//        });
//        thread.start();
//
//        //반복문
//    }
//}

//3-2 Thread 익명 하위 객체를 활용한 스레드 생성 및 실행

public class thread_Runnable_Thread {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                //반복문
            }
        };

        thread.start();
        //반목문


    }
}