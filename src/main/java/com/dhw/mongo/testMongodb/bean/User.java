package com.dhw.mongo.testMongodb.bean;


import org.springframework.data.annotation.Id;

/**
 * @author dhw
 * @version V1.0
 * @description 描述
 * @ClassName: User
 * @Date 2018/4/18
 */
public class User {
    @Id
    private Integer id;
    private String name;
    private int age;
    public User(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
