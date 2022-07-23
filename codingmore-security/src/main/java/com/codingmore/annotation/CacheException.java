package com.codingmore.annotation;

/**
 * @Author yaCoding
 * @create 2022-07-23 上午 10:57
 */

import java.lang.annotation.*;

/**
 * 自定义注解，有该注解的缓存方法会抛出异常
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
