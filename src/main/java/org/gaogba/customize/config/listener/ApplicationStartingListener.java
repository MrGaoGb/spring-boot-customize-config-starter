package org.gaogba.customize.config.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

import java.util.concurrent.TimeUnit;

/**
 * @author Mr.Gao
 * @date 2023/2/16 17:38
 * @apiNote:表示应用在启动的时候做的事情
 */
public class ApplicationStartingListener implements ApplicationListener<ApplicationStartingEvent> {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        log.info("ApplicationStartingListener ~~~~~~~~~~~启动中!!!!!");
        //int num = 1000 / 0;
        log.info("ApplicationStartingListener ~~~~~~~~~~~启动完成!!!!!");
    }
}