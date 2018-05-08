package com.dhw.mongo.testMongodb.bean.mongodbInfo.entInfo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.wallet.trade.credit.entity.companyBasicInfo.*;

import java.io.Serializable;
import java.util.List;

/**
 * @param
 * @author admin
 * @description com.wallet.trade.credit.entity.companyBasicInfo2
 * @return
 * @throws
 * @date 2018/4/26
 */
public class EntInfo implements Serializable {

    private static final long serialVersionUID = 1774763722267108753L;
    @JsonProperty("BASIC")
    private List<Basic> basic;
    @JsonProperty("SHAREHOLDER")
    private List<Shareholder> shareholder;
    @JsonProperty("PERSON")
    private List<Person> person;
    @JsonProperty("FRINV")
    private List<Frinv> frinv;
    @JsonProperty("FRPOSITION")
    private List<Frposition> frposition;
    @JsonProperty("ENTINV")
    private List<Entinv> entinv;
    @JsonProperty("ALTER")
    private List<Alter> alter;
    @JsonProperty("FILIATION")
    private List<Filiation> filiation;
    @JsonProperty("SHARESIMPAWN")
    private List<Sharesimpawn> sharesimpawn;
    @JsonProperty("MORDETAIL")
    private List<Mordetail> mordetail;
    @JsonProperty("MORGUAINFO")
    private List<Morguainfo> morguainfo;
    @JsonProperty("PUNISHBREAK")
    private List<Punishbreak> punishbreak;
    @JsonProperty("PUNISHED")
    private List<Punished> punished;
    @JsonProperty("FROZEN")
    private List<Frozen> frozen;
    @JsonProperty("LIQUIDATION")
    private List<Liquidation> liquidation;
    @JsonProperty("CASEINFO")
    private List<Caseinfo> caseinfo;

    private HdInfo hdInfo;
    private List<CreditInfo> creditInfo;
    private List<MoneyRecord> moneyRecord;
    private List<YearFinReport> yearFinReport;
    private List<MonthFinReport> monthFinReport;
    private List<YearTaxReport> yearTaxReport;
    private List<MonthTaxReport> monthTaxReport;
    private List<YearSAReport> yearSAReport;
    private List<MonthSAReport> monthSAReport;
    private OfficeInfo officeInfo;

    public HdInfo getHdInfo() {
        return hdInfo;
    }

    public void setHdInfo(HdInfo hdInfo) {
        this.hdInfo = hdInfo;
    }

    public List<CreditInfo> getCreditInfo() {
        return creditInfo;
    }

    public void setCreditInfo(List<CreditInfo> creditInfo) {
        this.creditInfo = creditInfo;
    }

    public List<MoneyRecord> getMoneyRecord() {
        return moneyRecord;
    }

    public void setMoneyRecord(List<MoneyRecord> moneyRecord) {
        this.moneyRecord = moneyRecord;
    }

    public List<YearFinReport> getYearFinReport() {
        return yearFinReport;
    }

    public void setYearFinReport(List<YearFinReport> yearFinReport) {
        this.yearFinReport = yearFinReport;
    }

    public List<MonthFinReport> getMonthFinReport() {
        return monthFinReport;
    }

    public void setMonthFinReport(List<MonthFinReport> monthFinReport) {
        this.monthFinReport = monthFinReport;
    }

    public List<YearTaxReport> getYearTaxReport() {
        return yearTaxReport;
    }

    public void setYearTaxReport(List<YearTaxReport> yearTaxReport) {
        this.yearTaxReport = yearTaxReport;
    }

    public List<MonthTaxReport> getMonthTaxReport() {
        return monthTaxReport;
    }

    public void setMonthTaxReport(List<MonthTaxReport> monthTaxReport) {
        this.monthTaxReport = monthTaxReport;
    }

    public List<YearSAReport> getYearSAReport() {
        return yearSAReport;
    }

    public void setYearSAReport(List<YearSAReport> yearSAReport) {
        this.yearSAReport = yearSAReport;
    }

    public List<MonthSAReport> getMonthSAReport() {
        return monthSAReport;
    }

    public void setMonthSAReport(List<MonthSAReport> monthSAReport) {
        this.monthSAReport = monthSAReport;
    }

    public OfficeInfo getOfficeInfo() {
        return officeInfo;
    }

    public void setOfficeInfo(OfficeInfo officeInfo) {
        this.officeInfo = officeInfo;
    }

    @JsonIgnore
    public List<Basic> getBasic() {
        return basic;
    }
    @JsonIgnore
    public void setBasic(List<Basic> basic) {
        this.basic = basic;
    }
    @JsonIgnore
    public List<Shareholder> getShareholder() {
        return shareholder;
    }
    @JsonIgnore
    public void setShareholder(List<Shareholder> shareholder) {
        this.shareholder = shareholder;
    }
    @JsonIgnore
    public List<Person> getPerson() {
        return person;
    }
    @JsonIgnore
    public void setPerson(List<Person> person) {
        this.person = person;
    }
    @JsonIgnore
    public List<Frinv> getFrinv() {
        return frinv;
    }
    @JsonIgnore
    public void setFrinv(List<Frinv> frinv) {
        this.frinv = frinv;
    }
    @JsonIgnore
    public List<Frposition> getFrposition() {
        return frposition;
    }
    @JsonIgnore
    public void setFrposition(List<Frposition> frposition) {
        this.frposition = frposition;
    }
    @JsonIgnore
    public List<Entinv> getEntinv() {
        return entinv;
    }
    @JsonIgnore
    public void setEntinv(List<Entinv> entinv) {
        this.entinv = entinv;
    }
    @JsonIgnore
    public List<Alter> getAlter() {
        return alter;
    }
    @JsonIgnore
    public void setAlter(List<Alter> alter) {
        this.alter = alter;
    }
    @JsonIgnore
    public List<Filiation> getFiliation() {
        return filiation;
    }
    @JsonIgnore
    public void setFiliation(List<Filiation> filiation) {
        this.filiation = filiation;
    }
    @JsonIgnore
    public List<Sharesimpawn> getSharesimpawn() {
        return sharesimpawn;
    }
    @JsonIgnore
    public void setSharesimpawn(List<Sharesimpawn> sharesimpawn) {
        this.sharesimpawn = sharesimpawn;
    }
    @JsonIgnore
    public List<Mordetail> getMordetail() {
        return mordetail;
    }
    @JsonIgnore
    public void setMordetail(List<Mordetail> mordetail) {
        this.mordetail = mordetail;
    }
    @JsonIgnore
    public List<Morguainfo> getMorguainfo() {
        return morguainfo;
    }
    @JsonIgnore
    public void setMorguainfo(List<Morguainfo> morguainfo) {
        this.morguainfo = morguainfo;
    }
    @JsonIgnore
    public List<Punishbreak> getPunishbreak() {
        return punishbreak;
    }
    @JsonIgnore
    public void setPunishbreak(List<Punishbreak> punishbreak) {
        this.punishbreak = punishbreak;
    }
    @JsonIgnore
    public List<Punished> getPunished() {
        return punished;
    }
    @JsonIgnore
    public void setPunished(List<Punished> punished) {
        this.punished = punished;
    }
    @JsonIgnore
    public List<Frozen> getFrozen() {
        return frozen;
    }
    @JsonIgnore
    public void setFrozen(List<Frozen> frozen) {
        this.frozen = frozen;
    }
    @JsonIgnore
    public List<Liquidation> getLiquidation() {
        return liquidation;
    }
    @JsonIgnore
    public void setLiquidation(List<Liquidation> liquidation) {
        this.liquidation = liquidation;
    }
    @JsonIgnore
    public List<Caseinfo> getCaseinfo() {
        return caseinfo;
    }
    @JsonIgnore
    public void setCaseinfo(List<Caseinfo> caseinfo) {
        this.caseinfo = caseinfo;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("basic", basic)
                .add("shareholder", shareholder)
                .add("person", person)
                .add("frinv", frinv)
                .add("frposition", frposition)
                .add("entinv", entinv)
                .add("alter", alter)
                .add("filiation", filiation)
                .add("sharesimpawn", sharesimpawn)
                .add("mordetail", mordetail)
                .add("morguainfo", morguainfo)
                .add("punishbreak", punishbreak)
                .add("punished", punished)
                .add("frozen", frozen)
                .add("liquidation", liquidation)
                .add("caseinfo", caseinfo)
                .add("hdInfo", hdInfo)
                .add("creditInfo", creditInfo)
                .add("moneyRecord", moneyRecord)
                .add("yearFinReport", yearFinReport)
                .add("monthFinReport", monthFinReport)
                .add("yearTaxReport", yearTaxReport)
                .add("monthTaxReport", monthTaxReport)
                .add("yearSAReport", yearSAReport)
                .add("monthSAReport", monthSAReport)
                .add("officeInfo", officeInfo)
                .toString();
    }
}
