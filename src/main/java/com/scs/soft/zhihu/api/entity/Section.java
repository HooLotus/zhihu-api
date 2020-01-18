package com.scs.soft.zhihu.api.entity;


import lombok.Builder;
import lombok.Data;

/**
 * @author WU, Homer
 * @version 1.0
 * @date 2020/1/15
 */
@Data
@Builder
public class Section {
    private String sectionId;
    private String specialId;
    private String sectionTitle;
}
