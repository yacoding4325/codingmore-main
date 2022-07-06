package com.codingmore.service;

import org.quartz.Job;

import java.util.Date;

/**
 * @Author yaCoding
 * @create 2022-07-05 下午 2:49
 */

public interface IScheduleService {

    /**
     * 通过 Cron 表达式来调度任务
     */
    String scheduleJob(Class<? extends Job> jobBeanClass, String cron, String data);

    /**
     * 指定时间来调度任务
     */
    String scheduleFixTimeJob(Class<? extends Job> jobBeanClass, Date startTime, String data);

    /**
     * 取消定时任务
     */
    Boolean cancelScheduleJob(String jobName);
}
