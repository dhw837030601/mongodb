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
public class EduInfo implements Serializable{

    private static final long serialVersionUID = 5661125127622542265L;
    private String highest;
    private List<String> imageList;

    public String getHighest() {
        return highest;
    }

    public void setHighest(String highest) {
        this.highest = highest;
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
                .add("highest", highest)
                .add("imageList", imageList)
                .toString();
    }
}
