package com.dhw.mongo.testMongodb.bean.mongodbInfo.entInfo;


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
public class HdInfo implements Serializable{

    private static final long serialVersionUID = 7710273974943344810L;
    private JlAgreement jlAgreement;
    private JointResponsibility jointResponsibility;
    private ShipProxyAgreement shipProxyAgreement;
    private InternationalProxyCer internationalProxyCer;
    private PeerAgreement peerAgreement;
    private CarrierWithoutShipCer carrierWithoutShipCer;
    private OtherMemberCer otherMemberCer;

    public JlAgreement getJlAgreement() {
        return jlAgreement;
    }

    public void setJlAgreement(JlAgreement jlAgreement) {
        this.jlAgreement = jlAgreement;
    }

    public JointResponsibility getJointResponsibility() {
        return jointResponsibility;
    }

    public void setJointResponsibility(JointResponsibility jointResponsibility) {
        this.jointResponsibility = jointResponsibility;
    }

    public ShipProxyAgreement getShipProxyAgreement() {
        return shipProxyAgreement;
    }

    public void setShipProxyAgreement(ShipProxyAgreement shipProxyAgreement) {
        this.shipProxyAgreement = shipProxyAgreement;
    }

    public InternationalProxyCer getInternationalProxyCer() {
        return internationalProxyCer;
    }

    public void setInternationalProxyCer(InternationalProxyCer internationalProxyCer) {
        this.internationalProxyCer = internationalProxyCer;
    }

    public PeerAgreement getPeerAgreement() {
        return peerAgreement;
    }

    public void setPeerAgreement(PeerAgreement peerAgreement) {
        this.peerAgreement = peerAgreement;
    }

    public CarrierWithoutShipCer getCarrierWithoutShipCer() {
        return carrierWithoutShipCer;
    }

    public void setCarrierWithoutShipCer(CarrierWithoutShipCer carrierWithoutShipCer) {
        this.carrierWithoutShipCer = carrierWithoutShipCer;
    }

    public OtherMemberCer getOtherMemberCer() {
        return otherMemberCer;
    }

    public void setOtherMemberCer(OtherMemberCer otherMemberCer) {
        this.otherMemberCer = otherMemberCer;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("jlAgreement", jlAgreement)
                .add("jointResponsibility", jointResponsibility)
                .add("shipProxyAgreement", shipProxyAgreement)
                .add("internationalProxyCer", internationalProxyCer)
                .add("peerAgreement", peerAgreement)
                .add("carrierWithoutShipCer", carrierWithoutShipCer)
                .add("otherMemberCer", otherMemberCer)
                .toString();
    }
}
