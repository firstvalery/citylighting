/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.GetCntc_209;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetCntc_209Record extends TableRecordImpl<GetCntc_209Record> {

    private static final long serialVersionUID = 393188130;

    /**
     * Setter for <code>GET_CNTC_209.CNT_ID</code>.
     */
    public void setCntId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.CNT_ID</code>.
     */
    public Integer getCntId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>GET_CNTC_209.CNT_AB_ID</code>.
     */
    public void setCntAbId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.CNT_AB_ID</code>.
     */
    public Integer getCntAbId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>GET_CNTC_209.CNT_SNUM</code>.
     */
    public void setCntSnum(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.CNT_SNUM</code>.
     */
    public String getCntSnum() {
        return (String) get(2);
    }

    /**
     * Setter for <code>GET_CNTC_209.CNT_NAME</code>.
     */
    public void setCntName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.CNT_NAME</code>.
     */
    public String getCntName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>GET_CNTC_209.CNTB_NAME</code>.
     */
    public void setCntbName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.CNTB_NAME</code>.
     */
    public String getCntbName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>GET_CNTC_209.USK_IP</code>.
     */
    public void setUskIp(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.USK_IP</code>.
     */
    public String getUskIp() {
        return (String) get(5);
    }

    /**
     * Setter for <code>GET_CNTC_209.Q</code>.
     */
    public void setQ(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.Q</code>.
     */
    public Double getQ() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>GET_CNTC_209.W</code>.
     */
    public void setW(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.W</code>.
     */
    public Double getW() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>GET_CNTC_209.G1</code>.
     */
    public void setG1(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.G1</code>.
     */
    public Double getG1() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>GET_CNTC_209.G2</code>.
     */
    public void setG2(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.G2</code>.
     */
    public Double getG2() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>GET_CNTC_209.M1</code>.
     */
    public void setM1(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.M1</code>.
     */
    public Double getM1() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>GET_CNTC_209.M2</code>.
     */
    public void setM2(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.M2</code>.
     */
    public Double getM2() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>GET_CNTC_209.TA</code>.
     */
    public void setTa(Double value) {
        set(12, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.TA</code>.
     */
    public Double getTa() {
        return (Double) get(12);
    }

    /**
     * Setter for <code>GET_CNTC_209.T1</code>.
     */
    public void setT1(Double value) {
        set(13, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.T1</code>.
     */
    public Double getT1() {
        return (Double) get(13);
    }

    /**
     * Setter for <code>GET_CNTC_209.T2</code>.
     */
    public void setT2(Double value) {
        set(14, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.T2</code>.
     */
    public Double getT2() {
        return (Double) get(14);
    }

    /**
     * Setter for <code>GET_CNTC_209.T3</code>.
     */
    public void setT3(Double value) {
        set(15, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.T3</code>.
     */
    public Double getT3() {
        return (Double) get(15);
    }

    /**
     * Setter for <code>GET_CNTC_209.T4</code>.
     */
    public void setT4(Double value) {
        set(16, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.T4</code>.
     */
    public Double getT4() {
        return (Double) get(16);
    }

    /**
     * Setter for <code>GET_CNTC_209.P1</code>.
     */
    public void setP1(Double value) {
        set(17, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.P1</code>.
     */
    public Double getP1() {
        return (Double) get(17);
    }

    /**
     * Setter for <code>GET_CNTC_209.P2</code>.
     */
    public void setP2(Double value) {
        set(18, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.P2</code>.
     */
    public Double getP2() {
        return (Double) get(18);
    }

    /**
     * Setter for <code>GET_CNTC_209.P3</code>.
     */
    public void setP3(Double value) {
        set(19, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.P3</code>.
     */
    public Double getP3() {
        return (Double) get(19);
    }

    /**
     * Setter for <code>GET_CNTC_209.CTIME</code>.
     */
    public void setCtime(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.CTIME</code>.
     */
    public Timestamp getCtime() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>GET_CNTC_209.STATE</code>.
     */
    public void setState(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.STATE</code>.
     */
    public Integer getState() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>GET_CNTC_209.ADR_ID</code>.
     */
    public void setAdrId(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.ADR_ID</code>.
     */
    public Integer getAdrId() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>GET_CNTC_209.FLT_ID</code>.
     */
    public void setFltId(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.FLT_ID</code>.
     */
    public Integer getFltId() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>GET_CNTC_209.HOME_ID</code>.
     */
    public void setHomeId(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.HOME_ID</code>.
     */
    public Integer getHomeId() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>GET_CNTC_209.STRT_ID</code>.
     */
    public void setStrtId(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.STRT_ID</code>.
     */
    public Integer getStrtId() {
        return (Integer) get(25);
    }

    /**
     * Setter for <code>GET_CNTC_209.CITY_ID</code>.
     */
    public void setCityId(Integer value) {
        set(26, value);
    }

    /**
     * Getter for <code>GET_CNTC_209.CITY_ID</code>.
     */
    public Integer getCityId() {
        return (Integer) get(26);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetCntc_209Record
     */
    public GetCntc_209Record() {
        super(GetCntc_209.GET_CNTC_209);
    }

    /**
     * Create a detached, initialised GetCntc_209Record
     */
    public GetCntc_209Record(Integer cntId, Integer cntAbId, String cntSnum, String cntName, String cntbName, String uskIp, Double q, Double w, Double g1, Double g2, Double m1, Double m2, Double ta, Double t1, Double t2, Double t3, Double t4, Double p1, Double p2, Double p3, Timestamp ctime, Integer state, Integer adrId, Integer fltId, Integer homeId, Integer strtId, Integer cityId) {
        super(GetCntc_209.GET_CNTC_209);

        set(0, cntId);
        set(1, cntAbId);
        set(2, cntSnum);
        set(3, cntName);
        set(4, cntbName);
        set(5, uskIp);
        set(6, q);
        set(7, w);
        set(8, g1);
        set(9, g2);
        set(10, m1);
        set(11, m2);
        set(12, ta);
        set(13, t1);
        set(14, t2);
        set(15, t3);
        set(16, t4);
        set(17, p1);
        set(18, p2);
        set(19, p3);
        set(20, ctime);
        set(21, state);
        set(22, adrId);
        set(23, fltId);
        set(24, homeId);
        set(25, strtId);
        set(26, cityId);
    }
}
