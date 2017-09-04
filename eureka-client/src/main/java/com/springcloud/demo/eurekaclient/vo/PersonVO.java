package com.springcloud.demo.eurekaclient.vo;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 * @author xinj.xue
 * @description：PersonVO
 * @date 2017-08-29 10:13
 **/
public class PersonVO extends BaseEntity {
    @NotEmpty(message = "请输入姓名")
    private String name;
    @NotNull(message = "请输入年龄")
    @Max(value = 35,message = "年龄不能超过35岁")
    private Integer age;
    @NotNull(message = "请输入身高")
    private Integer height;

    private String errMsg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
