package com.codingmore.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.codingmore.dto.PostsPageQueryParam;
import com.codingmore.dto.PostsParam;
import com.codingmore.model.Posts;
import com.codingmore.vo.PostsVo;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author yaCoding
 * @create 2022-07-05 下午 2:42
 */

public interface IPostsService extends IService<Posts> {
    /**
     * 保存内容
     * @param postsParam
     * @return
     */
    void savePosts(PostsParam postsParam);

    /**
     * 修改内容
     * @param postsParam
     * @return
     */
    void updatePosts(PostsParam postsParam);

    /**
     * 定时发布文章后调用
     *
     * @param postId
     */
    boolean updatePostByScheduler(Long postId);

    boolean removePostsById(Long id);


    IPage<PostsVo> findByPage(PostsPageQueryParam postsPageQueryParam);

    PostsVo getPostsById(Long id);

    int  insertPostTermTaxonomy(Long[] postsIds, Long[] termTaxonomyIds);

    String uploadMd(MultipartFile file);

    /**
     * 置顶/取消置顶方法
     * @param postsId 文章id
     * @param flag 标志位：0-不置顶；1-置顶
     */
    void setOnTop(Long postsId, Integer flag);
}
