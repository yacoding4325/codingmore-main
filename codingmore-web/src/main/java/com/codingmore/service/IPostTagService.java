package com.codingmore.service;

/**
 * @Author yaCoding
 * @create 2022-07-26 下午 5:10
 */

import com.baomidou.mybatisplus.extension.service.IService;
import com.codingmore.model.PostTag;

import java.util.List;

/**
 * 标签表 服务类
 */
public interface IPostTagService extends IService<PostTag> {

    List<PostTag> getByPostId(Long postId);
}
