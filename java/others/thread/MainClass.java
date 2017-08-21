package others.thread;

/**
 * Created by zhumengqi on 17-8-14.
 * 作用： 调用SingleThread的线程类，用来帮助理解。
 */
public class MainClass {
    public static void main(String[] args) {
        SingleThread st = new SingleThread();
        st.start();
        SingleThread st2 = new SingleThread();
        st2.start();
    }
}
