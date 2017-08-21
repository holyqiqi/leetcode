package others.thread;

/**
 * Created by zhumengqi on 17-8-14.
 * 单个线程
 */
public class SingleThread extends Thread{
    public static int a = 1;

    @Override
    public void run() {
        super.run();
        int a = 1;
        printThread(a);
        // printThread();
    }
    public int printThread(int a) {
        System.out.println(a);
        return a;
    }

}
