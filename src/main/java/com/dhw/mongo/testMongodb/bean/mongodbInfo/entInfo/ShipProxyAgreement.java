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
public class ShipProxyAgreement implements Serializable{

    private static final long serialVersionUID = 3004645748796183845L;
    private String shipComName;
    private String startTime;
    private String endTime;
    private List<String> imageList;

    public String getShipComName() {
        return shipComName;
    }

    public void setShipComName(String shipComName) {
        this.shipComName = shipComName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("shipComName", shipComName)
                .add("startTime", startTime)
                .add("endTime", endTime)
                .add("imageList", imageList)
                .toString();
    }
}
