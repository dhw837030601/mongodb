package com.dhw.mongo.testMongodb.bean.mongodbInfo.entInfo;



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
public class YearFinReport implements Serializable{

    private static final long serialVersionUID = -4402405700879728871L;
    private String year;
    private List<String> balance;
    private List<String> interests;
    private List<String> cash;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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


}
