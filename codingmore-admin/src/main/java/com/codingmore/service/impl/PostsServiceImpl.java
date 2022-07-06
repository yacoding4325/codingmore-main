package com.codingmore.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codingmore.dto.PostsPageQueryParam;
import com.codingmore.dto.PostsParam;
import com.codingmore.mapper.PostsMapper;
import com.codingmore.model.Posts;
import com.codingmore.service.IPostsService;
import com.codingmore.vo.PostsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author yaCoding
 * @create 2022-07-05 下午 3:17
 */
//* <p>
// * 文章 服务实现类
// * </p>
@Service
@Slf4j
public class PostsServiceImpl extends ServiceImpl<PostsMapper, Posts> implements IPostsService {
    @Override
    public void savePosts(PostsParam postsParam) {

    }

    @Override
    public void updatePosts(PostsParam postsParam) {

    }

    @Override
    public boolean updatePostByScheduler(Long postId) {
        return false;
    }

    @Override
    public boolean removePostsById(Long id) {
        return false;
    }

    @Override
    public IPage<PostsVo> findByPage(PostsPageQueryParam postsPageQueryParam) {
        return null;
    }

    @Override
    public PostsVo getPostsById(Long id) {
        return null;
    }

    @Override
    public int insertPostTermTaxonomy(Long[] postsIds, Long[] termTaxonomyIds) {
        return 0;
    }

    @Override
    public String uploadMd(MultipartFile file) {
        return null;
    }

    @Override
    public void setOnTop(Long postsId, Integer flag) {

    }
}
