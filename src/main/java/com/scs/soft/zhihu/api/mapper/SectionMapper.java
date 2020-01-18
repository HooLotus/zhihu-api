package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Section;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * @author WU, Homer
 * @version 1.0
 * @date 2020/1/15
 */
public interface SectionMapper {
    /*
     * 根据专题id查询标签列表
     * @param speciaLId
     *@return List<Section>
     */


    @Select("SELECT * FROM t section WHERE special_ id = #{specialId} ")
    List<Section> getSectionsBySpecialId(String specialId);
}
