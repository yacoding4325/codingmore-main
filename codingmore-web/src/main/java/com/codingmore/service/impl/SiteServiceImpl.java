package com.codingmore.service.impl;

/**
 * @Author yaCoding
 * @create 2022-07-26 下午 8:45
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codingmore.mapper.SiteMapper;
import com.codingmore.model.Site;
import com.codingmore.service.ISiteService;
import org.springframework.stereotype.Service;

/**
 * 站点 服务实现类
 */
@Service
public class SiteServiceImpl extends ServiceImpl<SiteMapper, Site> implements ISiteService {

}
