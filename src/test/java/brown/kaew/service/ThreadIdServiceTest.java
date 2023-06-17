package brown.kaew.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.jupiter.api.Test;

class ThreadIdServiceTest {

    @Test
    void theadLocalTest() {

        ExecutorService executorService = Executors.newFixedThreadPool(8);
        for (int i = 0; i < 24; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("ThreadId : " + ThreadIdService.get());
                }
            });
        }
        executorService.shutdown();
    }

}