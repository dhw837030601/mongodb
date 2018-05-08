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
public class MonthFinReport implements Serializable{

    private static final long serialVersionUID = -4402405700879728871L;
    private String month;
    private List<String> balance;
    private List<String> interests;
    private List<String> cash;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public List<String> getBalance() {
        return balance;
    }

    public void setBalance(List<String> balance) {
        this.balance = balance;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public List<String> getCash() {
        return cash;
    }

    public void setCash(List<String> cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("month", month)
                .add("balance", balance)
                .add("interests", interests)
                .add("cash", cash)
                .toString();
    }
}
