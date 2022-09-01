package com.codingmore.dto;

/**
 * @Author yaCoding
 * @create 2022-09-01 下午 10:31
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * <p>
 *  * 标签表
 *  * </p>
 */

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="PostTag对象", description="标签表")
public class PostTagParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "post_tag_id")
    private Long postTagId;

    @ApiModelProperty(value = "标签名称")
    @NotBlank(message = "标签名称不能为空")
    private String description;
}
