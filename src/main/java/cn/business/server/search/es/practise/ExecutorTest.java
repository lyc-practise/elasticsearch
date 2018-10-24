package cn.business.server.search.es.practise;


import cn.business.server.search.es.utils.FutureTaskUtils;

import java.util.concurrent.*;

public class ExecutorTest {

    public static void main(String[] args) throws InterruptedException, TimeoutException, ExecutionException {

        ExecutorService executorService = Executors.newCachedThreadPool();


        RunnableFuture<Integer> runFuture = FutureTaskUtils.newTaskFor(new CallTest());

        executorService.execute(runFuture);


        TimeUnit.SECONDS.sleep(1);

        System.out.println("睡了1s");
        try{
            System.out.println("取到的结果:" + runFuture.get(1, TimeUnit.SECONDS));
        }catch (Exception e){
            System.out.println("取结果超时异常");
        }

        System.out.println("最终取到的结果：" + runFuture.get());


        Thread.currentThread().

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
