package com.codingmore.vo;

/**
 * @Author yaCoding
 * @create 2022-07-23 上午 10:47
 */

import com.codingmore.model.Posts;
import com.codingmore.model.Site;
import com.codingmore.model.TermTaxonomy;

import lombok.Data;

import java.util.List;

/**
 * 首页栏目文章列表
 */

@Data
public class IndexTermTaxonomyPostVo {
    private TermTaxonomy termTaxonomy;
    private List<Posts> posts;
}
