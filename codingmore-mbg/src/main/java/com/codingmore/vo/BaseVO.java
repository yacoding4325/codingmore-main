package com.codingmore.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author yaCoding
 * @create 2022-07-05 下午 2:55
 */

@Data
public abstract class BaseVO<M extends BaseVO> {
    @ApiModelProperty(value = "attrs")
    protected Map<String, Object> attrs = this.createAttrsMap();

    public BaseVO() {
    }

    private Map<String, Object> createAttrsMap() {
        return IContainerFactory.defaultContainerFactory.getAttrsMap();
    }

    public M put(String key, Object value) {
        this.attrs.put(key, value);
        return (M) this;
    }

    public <T> T get(String attr) {
        return (T) this.attrs.get(attr);
    }
}
