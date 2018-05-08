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
public class CreditInfo implements Serializable{

    private static final long serialVersionUID = -5999922137315991188L;
    private String queryTime;
    private List<String> imageList;

    public String getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(String queryTime) {
        this.queryTime = queryTime;
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
                .add("queryTime", queryTime)
                .add("imageList", imageList)
                .toString();
    }
}
