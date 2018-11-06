package cn.business.server.search.es.practise;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorTest {

    public static void main(String[] args) {


//        System.out.println("10000000000000000000000000000000".length());

        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new RunTest());

    }

    static class RunTest implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running!");
            throw new RuntimeException();
        }
    }

    static class CallTest implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {

            System.out.println(Thread.currentThread().getName() + " is running!");
            try{
                TimeUnit.SECONDS.sleep(5);
            }catch (InterruptedException e){
                System.out.println("线程被interrupted");
            }
            System.out.println(Thread.currentThread().getName() + " completing!");
            return 888;
        }
    }
}
