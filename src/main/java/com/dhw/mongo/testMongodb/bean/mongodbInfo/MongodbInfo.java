package com.dhw.mongo.testMongodb.bean.mongodbInfo;


import com.google.common.base.MoreObjects;
import com.wallet.trade.credit.entity.mongodbInfo.entInfo.EntInfo;
import com.wallet.trade.credit.entity.mongodbInfo.lpInfo.LpInfo;

import java.io.Serializable;

/**
 * @param
 * @author zhanghuan
 * @description com.wallet.trade.credit.entity
 * @return
 * @throws
 * @date 2017/11/6
 */
public class MongodbInfo implements Serializable{

    private static final long serialVersionUID = 4246055301085489728L;
    private Integer userId;
    private EntInfo entInfo;
    private LpInfo lpInfo;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public EntInfo getEntInfo() {
        return entInfo;
    }

    public void setEntInfo(EntInfo entInfo) {
        this.entInfo = entInfo;
    }

    public LpInfo getLpInfo() {
        return lpInfo;
    }

    public void setLpInfo(LpInfo lpInfo) {
        this.lpInfo = lpInfo;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("userId", userId)
                .add("entInfo", entInfo)
                .add("lpInfo", lpInfo)
                .toString();
    }
}
