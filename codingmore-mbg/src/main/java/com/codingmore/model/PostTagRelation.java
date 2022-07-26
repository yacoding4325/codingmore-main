package com.codingmore.model;

/**
 * @Author yaCoding
 * @create 2022-07-26 下午 5:13
 */

import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 标签文章关系表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="PostTagRelation对象", description="标签文章关系表")
public class PostTagRelation implements Serializable {

    private static final Long serialVersionUID = 1L;

    @ApiModelProperty(value = "对应文章ID")
    @MppMultiId
    private Long postId;

    @ApiModelProperty(value = "标签ID")
    @MppMultiId
    private Long postTagId;

    @ApiModelProperty(value = "排序")
    private Integer termOrder;

}
