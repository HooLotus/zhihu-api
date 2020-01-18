package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Special;
import java.util.List;
import java.util.Map;

/**
 * @author WU, Homer
 * @version 1.0
 * @date 2020/1/16 21:53
 */
public interface SpecialService {
    /*
    查询所有专题

    */

    List<Map> selectAll();

    /*
    查询最新专题
    */

    List<Special> selectRecent();
}
