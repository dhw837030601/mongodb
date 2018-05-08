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
public class JointResponsibility implements Serializable{

    private static final long serialVersionUID = 310399290187310836L;
    private String video;
    private List<String> imageList;

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
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
                .add("video", video)
                .add("imageList", imageList)
                .toString();
    }
}
