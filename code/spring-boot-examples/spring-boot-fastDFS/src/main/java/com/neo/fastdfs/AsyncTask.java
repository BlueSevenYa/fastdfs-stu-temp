package com.neo.fastdfs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2018-11-29-21:47
 */
@Component
public class AsyncTask {

    private static final Logger log = LoggerFactory.getLogger(AsyncTask.class);

    @Async
    public void test1() throws InterruptedException {
        log.info("test1===task");

        Thread.sleep(20000);
        log.info("sleep 3000ms");
    }

}
