package com.codingmore.webapi;

/**
 * @Author yaCoding
 * @create 2022-07-18 下午 11:09
 */

/**
 * 封装API的错误码
 * Created by zhanglei on 2019/4/19.
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}