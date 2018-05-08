package com.dhw.mongo.testMongodb.bean.mongodbInfo.lpInfo;


import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.List;

/**
 * @param
 * @author zhanghuan
 * @description com.wallet.trade.credit.entity
 * @return
 * @throws
 * @date 2017/11/6
 */
public class LpInfo implements Serializable{

    private static final long serialVersionUID = 7887860856902954259L;
    private Basic basic;
    private Idcard idcard;
    private EduInfo eduInfo;
    private Integer hdStartTime;
    private List<HouseInfo> houseInfo;
    private Resume resume;
    private PropertyInfo propertyInfo;

    public Basic getBasic() {
        return basic;
    }

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public Idcard getIdcard() {
        return idcard;
    }

    public void setIdcard(Idcard idcard) {
        this.idcard = idcard;
    }

    public EduInfo getEduInfo() {
        return eduInfo;
    }

    public void setEduInfo(EduInfo eduInfo) {
        this.eduInfo = eduInfo;
    }

    public Integer getHdStartTime() {
        return hdStartTime;
    }

    public void setHdStartTime(Integer hdStartTime) {
        this.hdStartTime = hdStartTime;
    }

    public List<HouseInfo> getHouseInfo() {
        return houseInfo;
    }

    public void setHouseInfo(List<HouseInfo> houseInfo) {
        this.houseInfo = houseInfo;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public PropertyInfo getPropertyInfo() {
        return propertyInfo;
    }

    public void setPropertyInfo(PropertyInfo propertyInfo) {
        this.propertyInfo = propertyInfo;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("basic", basic)
                .add("idcard", idcard)
                .add("eduInfo", eduInfo)
                .add("hdStartTime", hdStartTime)
                .add("houseInfo", houseInfo)
                .add("resume", resume)
                .add("propertyInfo", propertyInfo)
                .toString();
    }
}
