/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.GetCnttarch;


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
public class GetCnttarchRecord extends TableRecordImpl<GetCnttarchRecord> {

    private static final long serialVersionUID = 143810205;

    /**
     * Setter for <code>GET_CNTTARCH.CNT_ID</code>.
     */
    public void setCntId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.CNT_ID</code>.
     */
    public Integer getCntId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>GET_CNTTARCH.TS_NUM</code>.
     */
    public void setTsNum(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.TS_NUM</code>.
     */
    public Integer getTsNum() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>GET_CNTTARCH.CNT_AB_ID</code>.
     */
    public void setCntAbId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.CNT_AB_ID</code>.
     */
    public Integer getCntAbId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>GET_CNTTARCH.CNT_SNUM</code>.
     */
    public void setCntSnum(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.CNT_SNUM</code>.
     */
    public String getCntSnum() {
        return (String) get(3);
    }

    /**
     * Setter for <code>GET_CNTTARCH.CNT_BTYPE</code>.
     */
    public void setCntBtype(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.CNT_BTYPE</code>.
     */
    public Integer getCntBtype() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>GET_CNTTARCH.CNT_NAME</code>.
     */
    public void setCntName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.CNT_NAME</code>.
     */
    public String getCntName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>GET_CNTTARCH.CNTB_NAME</code>.
     */
    public void setCntbName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.CNTB_NAME</code>.
     */
    public String getCntbName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>GET_CNTTARCH.USK_IP</code>.
     */
    public void setUskIp(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.USK_IP</code>.
     */
    public String getUskIp() {
        return (String) get(7);
    }

    /**
     * Setter for <code>GET_CNTTARCH.Q1</code>.
     */
    public void setQ1(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.Q1</code>.
     */
    public Double getQ1() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>GET_CNTTARCH.Q2</code>.
     */
    public void setQ2(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.Q2</code>.
     */
    public Double getQ2() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>GET_CNTTARCH.W1</code>.
     */
    public void setW1(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.W1</code>.
     */
    public Double getW1() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>GET_CNTTARCH.W2</code>.
     */
    public void setW2(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.W2</code>.
     */
    public Double getW2() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>GET_CNTTARCH.M1</code>.
     */
    public void setM1(Double value) {
        set(12, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.M1</code>.
     */
    public Double getM1() {
        return (Double) get(12);
    }

    /**
     * Setter for <code>GET_CNTTARCH.M2</code>.
     */
    public void setM2(Double value) {
        set(13, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.M2</code>.
     */
    public Double getM2() {
        return (Double) get(13);
    }

    /**
     * Setter for <code>GET_CNTTARCH.M3</code>.
     */
    public void setM3(Double value) {
        set(14, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.M3</code>.
     */
    public Double getM3() {
        return (Double) get(14);
    }

    /**
     * Setter for <code>GET_CNTTARCH.M4</code>.
     */
    public void setM4(Double value) {
        set(15, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.M4</code>.
     */
    public Double getM4() {
        return (Double) get(15);
    }

    /**
     * Setter for <code>GET_CNTTARCH.GM1</code>.
     */
    public void setGm1(Double value) {
        set(16, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.GM1</code>.
     */
    public Double getGm1() {
        return (Double) get(16);
    }

    /**
     * Setter for <code>GET_CNTTARCH.GM2</code>.
     */
    public void setGm2(Double value) {
        set(17, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.GM2</code>.
     */
    public Double getGm2() {
        return (Double) get(17);
    }

    /**
     * Setter for <code>GET_CNTTARCH.GM3</code>.
     */
    public void setGm3(Double value) {
        set(18, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.GM3</code>.
     */
    public Double getGm3() {
        return (Double) get(18);
    }

    /**
     * Setter for <code>GET_CNTTARCH.GM4</code>.
     */
    public void setGm4(Double value) {
        set(19, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.GM4</code>.
     */
    public Double getGm4() {
        return (Double) get(19);
    }

    /**
     * Setter for <code>GET_CNTTARCH.V1</code>.
     */
    public void setV1(Double value) {
        set(20, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.V1</code>.
     */
    public Double getV1() {
        return (Double) get(20);
    }

    /**
     * Setter for <code>GET_CNTTARCH.V2</code>.
     */
    public void setV2(Double value) {
        set(21, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.V2</code>.
     */
    public Double getV2() {
        return (Double) get(21);
    }

    /**
     * Setter for <code>GET_CNTTARCH.V3</code>.
     */
    public void setV3(Double value) {
        set(22, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.V3</code>.
     */
    public Double getV3() {
        return (Double) get(22);
    }

    /**
     * Setter for <code>GET_CNTTARCH.V4</code>.
     */
    public void setV4(Double value) {
        set(23, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.V4</code>.
     */
    public Double getV4() {
        return (Double) get(23);
    }

    /**
     * Setter for <code>GET_CNTTARCH.GV1</code>.
     */
    public void setGv1(Double value) {
        set(24, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.GV1</code>.
     */
    public Double getGv1() {
        return (Double) get(24);
    }

    /**
     * Setter for <code>GET_CNTTARCH.GV2</code>.
     */
    public void setGv2(Double value) {
        set(25, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.GV2</code>.
     */
    public Double getGv2() {
        return (Double) get(25);
    }

    /**
     * Setter for <code>GET_CNTTARCH.GV3</code>.
     */
    public void setGv3(Double value) {
        set(26, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.GV3</code>.
     */
    public Double getGv3() {
        return (Double) get(26);
    }

    /**
     * Setter for <code>GET_CNTTARCH.GV4</code>.
     */
    public void setGv4(Double value) {
        set(27, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.GV4</code>.
     */
    public Double getGv4() {
        return (Double) get(27);
    }

    /**
     * Setter for <code>GET_CNTTARCH.T1</code>.
     */
    public void setT1(Double value) {
        set(28, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.T1</code>.
     */
    public Double getT1() {
        return (Double) get(28);
    }

    /**
     * Setter for <code>GET_CNTTARCH.T2</code>.
     */
    public void setT2(Double value) {
        set(29, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.T2</code>.
     */
    public Double getT2() {
        return (Double) get(29);
    }

    /**
     * Setter for <code>GET_CNTTARCH.T3</code>.
     */
    public void setT3(Double value) {
        set(30, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.T3</code>.
     */
    public Double getT3() {
        return (Double) get(30);
    }

    /**
     * Setter for <code>GET_CNTTARCH.T4</code>.
     */
    public void setT4(Double value) {
        set(31, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.T4</code>.
     */
    public Double getT4() {
        return (Double) get(31);
    }

    /**
     * Setter for <code>GET_CNTTARCH.P1</code>.
     */
    public void setP1(Double value) {
        set(32, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.P1</code>.
     */
    public Double getP1() {
        return (Double) get(32);
    }

    /**
     * Setter for <code>GET_CNTTARCH.P2</code>.
     */
    public void setP2(Double value) {
        set(33, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.P2</code>.
     */
    public Double getP2() {
        return (Double) get(33);
    }

    /**
     * Setter for <code>GET_CNTTARCH.P3</code>.
     */
    public void setP3(Double value) {
        set(34, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.P3</code>.
     */
    public Double getP3() {
        return (Double) get(34);
    }

    /**
     * Setter for <code>GET_CNTTARCH.P4</code>.
     */
    public void setP4(Double value) {
        set(35, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.P4</code>.
     */
    public Double getP4() {
        return (Double) get(35);
    }

    /**
     * Setter for <code>GET_CNTTARCH.LTIME</code>.
     */
    public void setLtime(Timestamp value) {
        set(36, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.LTIME</code>.
     */
    public Timestamp getLtime() {
        return (Timestamp) get(36);
    }

    /**
     * Setter for <code>GET_CNTTARCH.CSTATE</code>.
     */
    public void setCstate(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.CSTATE</code>.
     */
    public String getCstate() {
        return (String) get(37);
    }

    /**
     * Setter for <code>GET_CNTTARCH.TWRK</code>.
     */
    public void setTwrk(Integer value) {
        set(38, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.TWRK</code>.
     */
    public Integer getTwrk() {
        return (Integer) get(38);
    }

    /**
     * Setter for <code>GET_CNTTARCH.TNWRK</code>.
     */
    public void setTnwrk(Integer value) {
        set(39, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.TNWRK</code>.
     */
    public Integer getTnwrk() {
        return (Integer) get(39);
    }

    /**
     * Setter for <code>GET_CNTTARCH.ADR_ID</code>.
     */
    public void setAdrId(Integer value) {
        set(40, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.ADR_ID</code>.
     */
    public Integer getAdrId() {
        return (Integer) get(40);
    }

    /**
     * Setter for <code>GET_CNTTARCH.FLT_ID</code>.
     */
    public void setFltId(Integer value) {
        set(41, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.FLT_ID</code>.
     */
    public Integer getFltId() {
        return (Integer) get(41);
    }

    /**
     * Setter for <code>GET_CNTTARCH.HOME_ID</code>.
     */
    public void setHomeId(Integer value) {
        set(42, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.HOME_ID</code>.
     */
    public Integer getHomeId() {
        return (Integer) get(42);
    }

    /**
     * Setter for <code>GET_CNTTARCH.STRT_ID</code>.
     */
    public void setStrtId(Integer value) {
        set(43, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.STRT_ID</code>.
     */
    public Integer getStrtId() {
        return (Integer) get(43);
    }

    /**
     * Setter for <code>GET_CNTTARCH.CITY_ID</code>.
     */
    public void setCityId(Integer value) {
        set(44, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.CITY_ID</code>.
     */
    public Integer getCityId() {
        return (Integer) get(44);
    }

    /**
     * Setter for <code>GET_CNTTARCH.REGION_ID</code>.
     */
    public void setRegionId(Integer value) {
        set(45, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.REGION_ID</code>.
     */
    public Integer getRegionId() {
        return (Integer) get(45);
    }

    /**
     * Setter for <code>GET_CNTTARCH.ADR_STR</code>.
     */
    public void setAdrStr(String value) {
        set(46, value);
    }

    /**
     * Getter for <code>GET_CNTTARCH.ADR_STR</code>.
     */
    public String getAdrStr() {
        return (String) get(46);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetCnttarchRecord
     */
    public GetCnttarchRecord() {
        super(GetCnttarch.GET_CNTTARCH);
    }

    /**
     * Create a detached, initialised GetCnttarchRecord
     */
    public GetCnttarchRecord(Integer cntId, Integer tsNum, Integer cntAbId, String cntSnum, Integer cntBtype, String cntName, String cntbName, String uskIp, Double q1, Double q2, Double w1, Double w2, Double m1, Double m2, Double m3, Double m4, Double gm1, Double gm2, Double gm3, Double gm4, Double v1, Double v2, Double v3, Double v4, Double gv1, Double gv2, Double gv3, Double gv4, Double t1, Double t2, Double t3, Double t4, Double p1, Double p2, Double p3, Double p4, Timestamp ltime, String cstate, Integer twrk, Integer tnwrk, Integer adrId, Integer fltId, Integer homeId, Integer strtId, Integer cityId, Integer regionId, String adrStr) {
        super(GetCnttarch.GET_CNTTARCH);

        set(0, cntId);
        set(1, tsNum);
        set(2, cntAbId);
        set(3, cntSnum);
        set(4, cntBtype);
        set(5, cntName);
        set(6, cntbName);
        set(7, uskIp);
        set(8, q1);
        set(9, q2);
        set(10, w1);
        set(11, w2);
        set(12, m1);
        set(13, m2);
        set(14, m3);
        set(15, m4);
        set(16, gm1);
        set(17, gm2);
        set(18, gm3);
        set(19, gm4);
        set(20, v1);
        set(21, v2);
        set(22, v3);
        set(23, v4);
        set(24, gv1);
        set(25, gv2);
        set(26, gv3);
        set(27, gv4);
        set(28, t1);
        set(29, t2);
        set(30, t3);
        set(31, t4);
        set(32, p1);
        set(33, p2);
        set(34, p3);
        set(35, p4);
        set(36, ltime);
        set(37, cstate);
        set(38, twrk);
        set(39, tnwrk);
        set(40, adrId);
        set(41, fltId);
        set(42, homeId);
        set(43, strtId);
        set(44, cityId);
        set(45, regionId);
        set(46, adrStr);
    }
}
