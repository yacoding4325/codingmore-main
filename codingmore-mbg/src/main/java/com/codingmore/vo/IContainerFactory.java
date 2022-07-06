package com.codingmore.vo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yaCoding
 * @create 2022-07-05 下午 3:01
 */

public interface IContainerFactory {
    IContainerFactory defaultContainerFactory = new IContainerFactory() {
        public Map<String, Object> getAttrsMap() {
            return new HashMap();
        }
    };
    Map getAttrsMap();
}
