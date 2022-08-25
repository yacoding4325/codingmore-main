package com.codingmore.service;

import com.codingmore.model.PostTag;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 标签表 服务类
 * </p>
 *
 */
public interface IPostTagService extends IService<PostTag> {

   

    /**
     * 获取文章标签
     * @param postId
     * @return
     */
    List<PostTag> getByPostId(Long postId);
}
