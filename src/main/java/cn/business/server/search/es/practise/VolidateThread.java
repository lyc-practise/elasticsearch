package cn.business.server.search.es.practise;

import java.util.concurrent.TimeUnit;

public class VolidateThread extends Thread {

    public Boolean door = false;


    public void run(){
        whileFalse();
    }

    public void whileTrue(){
        while(door){
            System.out.println("the door is open");
            if(!door)whileFalse();
        }
    }

    public void whileFalse(){
        while(!door){
            System.out.println("the door is close");
            if(door)whileTrue();
        }
    }



    public static void main(String[] args) throws InterruptedException {

        VolidateThread t = new VolidateThread();
        t.start();
        TimeUnit.SECONDS.sleep(1);
        t.door = true;
        System.out.println("door:" + t.door);


    }
}