package com.codingmore.service;

import com.codingmore.util.WebRequestParam;

/**
 * @Author yaCoding
 * @create 2022-07-25 下午 10:55
 */

/**
 * 前端请求处理策略
 */

public interface ILearnWebRequestStrategy {
    String handleRequest(WebRequestParam webRequestParam);
}
