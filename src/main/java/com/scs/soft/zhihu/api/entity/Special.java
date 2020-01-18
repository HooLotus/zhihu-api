package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;


/**
 * @author WU, Homer
 * @version 1.0
 * @date 2020/1/15
 */

@Data
@Builder
public class Special {
    private String specialId;
    private String title;
    private String introduction;
    private String banner;
    private Integer viewCount;
    private Integer followersCount;
    private Date updated;
}
