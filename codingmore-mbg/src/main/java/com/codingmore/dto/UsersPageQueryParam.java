package com.codingmore.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author yaCoding
 * @create 2022-09-03 下午 10:50
 */

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Users对象", description="用户")
public class UsersPageQueryParam {
    long pageSize;
    long page;
    @ApiModelProperty("用户名")
    String userLogin;
    @ApiModelProperty("昵称")
    String userNicename;
    @ApiModelProperty("角色id")
    Long roleId;
}
