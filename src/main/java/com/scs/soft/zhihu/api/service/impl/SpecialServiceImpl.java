package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.Special;
import com.scs.soft.zhihu.api.mapper.SpeciaLMapper;
import com.scs.soft.zhihu.api.service.SpecialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author WU, Homer
 * @version 1.0
 * @date 2020/1/16 21:54
 */
@Service
public class SpecialServiceImpl implements SpecialService {
    @Resource
    private SpeciaLMapper speciaLMapper;

    @Override
    public List<Map> selectAll(){
        return speciaLMapper.selectAll();
    }

    @Override
    public List<Special> selectRecent() {
        return speciaLMapper.selectRecent();
    }

}
