package com.codingmore.model;

/**
 * @Author yaCoding
 * @create 2022-08-30 下午 11:38
 */

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 *  * 后台菜单表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Menu对象", description="后台菜单表")
public class Menu implements Serializable {
}
