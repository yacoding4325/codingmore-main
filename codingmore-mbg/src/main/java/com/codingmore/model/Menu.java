package com.codingmore.model;

/**
 * @Author yaCoding
 * @create 2022-08-30 下午 11:38
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 *  * 后台菜单表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Menu对象", description="后台菜单表")
public class Menu implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @TableId(value = "menu_id",type = IdType.AUTO)
    private Long menuId;

    @ApiModelProperty(value = "父级ID")
    private Long parentId;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "菜单名称")
    private String title;

    @ApiModelProperty(value = "菜单级数")
    private Integer level;

    @ApiModelProperty(value = "菜单排序")
    private Integer sort;

    @ApiModelProperty(value = "前端名称")
    private String name;

    @ApiModelProperty(value = "前端图标")
    private String icon;

    @ApiModelProperty(value = "前端隐藏")
    private Integer hidden;

}
