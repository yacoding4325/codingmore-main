package com.codingmore.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codingmore.dto.PostsPageQueryParam;
import com.codingmore.model.Posts;
import com.codingmore.vo.PostsVo;

import java.util.List;

/**
 * @Author yaCoding
 * @create 2022-07-25 下午 10:55
 */

/**
 * 文章 服务类
 */

public interface IPostsService extends IService<Posts> {
    List<PostsVo> findByPageWithTagPaged(PostsPageQueryParam postsPageQueryParam);
}
