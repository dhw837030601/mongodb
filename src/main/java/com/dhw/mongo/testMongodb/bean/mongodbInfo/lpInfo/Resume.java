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
public class Resume implements Serializable{

    private List<String> imageList;

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("imageList", imageList)
                .toString();
    }
}
