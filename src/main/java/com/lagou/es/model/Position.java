package com.lagou.es.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Position {
    //主键
    private String id;

    //公司名称
    private String companyName;

    //职位名称
    private String positionName;

    //职位诱惑
    private String  positionAdvantage;

    //薪资
    private String salary;

    //薪资下限
    private int salaryMin;

    //薪资上限
    private int salaryMax;

    //学历
    private String education;

    //工作年限
    private String workYear;

    //发布时间
    private String publishTime;

    //工作城市
    private String city;

    //工作地点
    private String workAddress;

    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    //工作模式
    private String jobNature;
}
