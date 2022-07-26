package com.codingmore.service;

/**
 * @Author yaCoding
 * @create 2022-07-26 下午 5:42
 */

import com.baomidou.mybatisplus.extension.service.IService;
import com.codingmore.model.TermTaxonomy;
import com.codingmore.vo.TermTaxonomyTreeNode;

import java.util.List;

/**
 * 栏目 服务类
 */

public interface ITermTaxonomyService extends IService<TermTaxonomy> {



    /**
     * 根据站点id和父栏目id获得所有子孙栏目节点
     * @param parentId 父栏目id
     * @return
     */
    List<TermTaxonomyTreeNode> getAllByParentId(Long parentId);

    /**
     * 根据父栏目id获得直属子栏目
     * @param parentId 父栏目id，如果为null则返回null
     * @return
     */
    List<TermTaxonomyTreeNode> getChildrenByParentId(Long parentId);
}

