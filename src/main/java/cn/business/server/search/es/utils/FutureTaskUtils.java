package cn.business.server.search.es.utils;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class FutureTaskUtils {

    /**
     * 用Runnable 和 result 封装 FutureTask
     * @param command
     * @param result
     * @param <T>
     * @return
     */
    public static <T> FutureTask<T> newTaskFor(Runnable command, T result){
        return new FutureTask<T>(command, result);
    }

    /**
     * 用Runnable 和 result 封装 FutureTask
     * @param command
     * @param <T>
     * @return
     */
    public static <T> FutureTask<T> newTaskFor(Runnable command){
        return newTaskFor(command, null);
    }

    /**
     * 用Callable 封装 FutureTask
     * @param command
     * @param <T>
     * @return
     */
    public static <T> FutureTask<T> newTaskFor(Callable<T> command){
        return new FutureTask<>(command);
    }
}
