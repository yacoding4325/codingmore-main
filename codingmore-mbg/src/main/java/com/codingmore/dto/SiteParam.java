package com.codingmore.dto;

/**站点
 * @Author yaCoding
 * @create 2022-09-02 下午 10:56
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 站点
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Site对象", description="站点")
public class SiteParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("站点名称")
    @NotBlank(message = "站点名称不能为空")
    private String siteName;

    @ApiModelProperty("站点介绍")
    private String siteDesc;

    @NotBlank(message = "关键字不能为空")
    @ApiModelProperty("关键字")
    private String keywords;

    @ApiModelProperty("属性")
    private String attribute;

}
