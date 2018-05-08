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
public class YearTaxReport implements Serializable{

    private static final long serialVersionUID = 7777548103270706440L;
    private String year;
    private List<String> imageList;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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
                .add("year", year)
                .add("imageList", imageList)
                .toString();
    }
}
