package com.codingmore.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.codingmore.dto.PostsPageQueryParam;
import com.codingmore.model.Posts;
import com.codingmore.vo.PostsVo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author yaCoding
 * @create 2022-07-25 下午 10:55
 */

/**
 * 文章 服务类
 */

public interface IPostsService extends IService<Posts> {

    IPage<PostsVo> findByPageWithTag(PostsPageQueryParam postsPageQueryParam);

    List<PostsVo> findByPageWithTagPaged(PostsPageQueryParam postsPageQueryParam);

    List<Posts> listByTermTaxonomyId(Long termTaxonomyId);

    PostsVo getPostsById(Long id);

    void increasePageView(Long id, HttpServletRequest request);

    void increaseLikeCount(Long id, HttpServletRequest  request);

    int getPageView(Long id);

    int getLikeCount(Long id);

    Boolean hasClickedLike(Long id, HttpServletRequest request);

}
