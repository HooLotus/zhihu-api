package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Special;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * @author WU, Homer
 * @version 1.0
 * @date 2020/1/16
 */



@SpringBootTest(classes = ZhihuApiApplication.class)
class SpeciaLMapperTest {
    @Resource
    private SpeciaLMapper speciaLMapper;


    @Test
    void selectAll() {
        List<Map> specials =speciaLMapper.selectAll();
        specials.forEach(System.out::println);
    }


    @Test
    void selectRecent() {
        List<Special> specials =speciaLMapper.selectRecent();
        specials.forEach(System.out::println);
    }
}