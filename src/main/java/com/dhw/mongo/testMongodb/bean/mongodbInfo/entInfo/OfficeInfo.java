package com.dhw.mongo.testMongodb.bean.mongodbInfo.entInfo;


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
public class OfficeInfo implements Serializable{

    private static final long serialVersionUID = -3412031677058277467L;
    private RentAgreement rentAgreement;
    private HouseCert houseCert;
    private List<String> picList;

    public RentAgreement getRentAgreement() {
        return rentAgreement;
    }

    public void setRentAgreement(RentAgreement rentAgreement) {
        this.rentAgreement = rentAgreement;
    }

    public HouseCert getHouseCert() {
        return houseCert;
    }

    public void setHouseCert(HouseCert houseCert) {
        this.houseCert = houseCert;
    }

    public List<String> getPicList() {
        return picList;
    }

    public void setPicList(List<String> picList) {
        this.picList = picList;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("rentAgreement", rentAgreement)
                .add("houseCert", houseCert)
                .add("picList", picList)
                .toString();
    }
}
