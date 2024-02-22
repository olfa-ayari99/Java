package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.LockSupport;

public class threadDemo {

    public static void main(String[] args){
        final int NTASKS = 100; 
        //pour excecuter les taches d'une manière concurrente
        ExecutorService service = Executors.newVirtualThreadPerTaskExecutor();
         for (int i = 0; i < NTASKS; i++) {
            service.submit(() -> {
               long id = Thread.currentThread().threadId(); 
               LockSupport.parkNanos(1_000_000_000);
               System.out.println(id);
            });
         }
         service.close();
    }
    
}
