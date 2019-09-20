import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Runtime is the main thread in Java
        Runtime runtime = Runtime.getRuntime();

//        System.out.println(runtime.totalMemory());
//        System.out.println(runtime.freeMemory());
//        System.out.println(runtime.maxMemory());

/*        try {
            // for Windows people
            runtime.exec("notepad");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // extends Thread
        ThreadExtendsThread extendsThread = new ThreadExtendsThread();
        ThreadExtendsThread extendsThreadTwo = new ThreadExtendsThread();
        // start the thread
        extendsThread.start();
        //extendsThreadTwo.start();

        // grouping threads together
        ThreadGroup threadGroup = new ThreadGroup("Name for my group");

        // implements Runnable
        ThreadImplementsRunnable runnableThread = new ThreadImplementsRunnable();
        Thread thread = new Thread(threadGroup, runnableThread);
        thread.start();

        System.out.println(thread.getThreadGroup().getName());


    }
}
