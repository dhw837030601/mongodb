package com.dhw.mongo.testMongodb.bean.mongodbInfo.lpInfo;


import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * @param
 * @author zhanghuan
 * @description com.wallet.trade.credit.entity
 * @return
 * @throws
 * @date 2017/11/6
 */
public class Basic implements Serializable{

    private static final long serialVersionUID = 4246055301085489728L;
    private String name;
    private String sex;
    private String birth;
    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("sex", sex)
                .add("birth", birth)
                .add("mobile", mobile)
                .toString();
    }
}
