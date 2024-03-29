package com.codingmore.service.impl;

import com.codingmore.model.Links;
import com.codingmore.mapper.LinksMapper;
import com.codingmore.service.ILinksService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * <p>
 * 链接信息表 服务实现类
 * </p>
 *
 */
@Service
public class LinksServiceImpl extends ServiceImpl<LinksMapper, Links> implements ILinksService {

    @Override
    public boolean save(Links entity) {
        return super.save(entity);
    }

    @Override
    public boolean saveBatch(Collection<Links> entityList) {
        return super.saveBatch(entityList);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Links> entityList) {
        return super.saveOrUpdateBatch(entityList);
    }
}
