package com.neo.controller;

import com.neo.fastdfs.AsyncTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2018-11-29-21:45
 */


@RestController
public class HelloController {

    private static final Logger log= LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private AsyncTask asyncTask;

    @GetMapping(value = "/test1")
    public String test1() throws InterruptedException {
        log.info("controller");
        long time1=System.currentTimeMillis();
        Thread.sleep(1000);

        asyncTask.test1();

        long time2=System.currentTimeMillis();

        log.info("time total is :"+(time2-time1));
        return "success";
    }

}
