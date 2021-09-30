package com.itdotaer;

import com.itdotaer.executor.ScheduleExecutor;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * com.itdotaer.Application
 *
 * @author itdotaer
 * @date 2021/9/29
 */
@SpringBootApplication(scanBasePackages = {"com.itdotaer"})
public class Application implements ApplicationContextAware {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ScheduleExecutor scheduleExecutor = applicationContext.getBean(ScheduleExecutor.class);
        System.out.println("finished");
    }
}
