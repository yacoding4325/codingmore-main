package com.codingmore.service.impl;

/**
 * @Author yaCoding
 * @create 2022-07-26 下午 4:50
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codingmore.mapper.CommentsMapper;
import com.codingmore.model.Comments;
import com.codingmore.service.ICommentsService;

/**
 * 评论表 服务实现类
 */
public class CommentsServiceImpl extends ServiceImpl <CommentsMapper, Comments> implements ICommentsService {
}
