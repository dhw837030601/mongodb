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
public class Idcard implements Serializable{

    private static final long serialVersionUID = 7415424311198025089L;
    private String idType;
    private String idcard;

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("idType", idType)
                .add("idcard", idcard)
                .toString();
    }
}
