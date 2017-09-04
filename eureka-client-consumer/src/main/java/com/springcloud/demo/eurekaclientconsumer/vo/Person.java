package com.springcloud.demo.eurekaclientconsumer.vo;

/**
 * @author xinj.xue
 * @description：
 * @date 2017-08-30 11:53
 **/
public class Person {
    private String name;
    private Integer age;
    private Integer height;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

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
}
