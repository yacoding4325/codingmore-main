package com.codingmore.exception;

/**
 * @Author yaCoding
 * @create 2022-07-18 下午 11:02
 */

import com.codingmore.webapi.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 */

public class Asserts {

    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }

}
