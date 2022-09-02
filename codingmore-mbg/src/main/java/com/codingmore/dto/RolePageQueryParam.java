package com.codingmore.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author yaCoding
 * @create 2022-09-02 下午 10:52
 */

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Role对象", description="角色")
public class RolePageQueryParam {
    long pageSize;
    long page;
    @ApiModelProperty(value = "关键字")
    String keyword;
}

