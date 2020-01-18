package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Special;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;


import java.sql.Date;
import java.util.List;
import java.util.Map;

/**
 * @author WU, Homer
 * @version 1.0
 * @date 2020/1/15
 */
public interface SpeciaLMapper {
    /*
    查询最新专题
    *@return List<Special>
     */

    @Select("SELECT * FROM t_ special ORDER BY updated DESC LIMIT 0,4 ")
    List<Special> selectRecent();


    /*
     * 查询所有专题
     * @return List<Map>
     */


    @Select("SELECT * FROM t_ special ")
    @Results( {
            @Result(id = true, property = "specialId", column = "special_ _id", javaType = String. class),
            @Result(property = "title", column = "title", javaType = String.class),
            @Result(property = "banner", column = "banner", javaType = String.class),
            @Result(property = "viewCount", column = "view_ count", javaType = Integer.class),
            @Result(property = "followersCount", column =" followers_ count", javaType = Integer.class),
            @Result(property = "updated", column = "updated", javaType = Date.class),
            @Result(property = "sections", column =" special_ id",
                    many = @Many(select = "com.scs.zhihu.api.mapper.SectionMapper.getSectionsBySpecialId")),

    })
    List<Map> selectAll();

}
