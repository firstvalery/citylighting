/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.GetUskc;


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
public class GetUskcRecord extends TableRecordImpl<GetUskcRecord> {

    private static final long serialVersionUID = 1460416704;

    /**
     * Setter for <code>GET_USKC.ADR_STR</code>.
     */
    public void setAdrStr(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>GET_USKC.ADR_STR</code>.
     */
    public String getAdrStr() {
        return (String) get(0);
    }

    /**
     * Setter for <code>GET_USKC.USK_ID</code>.
     */
    public void setUskId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>GET_USKC.USK_ID</code>.
     */
    public Integer getUskId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>GET_USKC.USK_AB_ID</code>.
     */
    public void setUskAbId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>GET_USKC.USK_AB_ID</code>.
     */
    public Integer getUskAbId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>GET_USKC.USK_UID</code>.
     */
    public void setUskUid(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>GET_USKC.USK_UID</code>.
     */
    public Integer getUskUid() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>GET_USKC.USK_TYPE_ID</code>.
     */
    public void setUskTypeId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>GET_USKC.USK_TYPE_ID</code>.
     */
    public Integer getUskTypeId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>GET_USKC.USK_TYPE</code>.
     */
    public void setUskType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>GET_USKC.USK_TYPE</code>.
     */
    public String getUskType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>GET_USKC.USK_IP</code>.
     */
    public void setUskIp(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>GET_USKC.USK_IP</code>.
     */
    public String getUskIp() {
        return (String) get(6);
    }

    /**
     * Setter for <code>GET_USKC.USK_KEY</code>.
     */
    public void setUskKey(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>GET_USKC.USK_KEY</code>.
     */
    public String getUskKey() {
        return (String) get(7);
    }

    /**
     * Setter for <code>GET_USKC.ADR_ID</code>.
     */
    public void setAdrId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>GET_USKC.ADR_ID</code>.
     */
    public Integer getAdrId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>GET_USKC.FLT_ID</code>.
     */
    public void setFltId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>GET_USKC.FLT_ID</code>.
     */
    public Integer getFltId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>GET_USKC.HOME_ID</code>.
     */
    public void setHomeId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>GET_USKC.HOME_ID</code>.
     */
    public Integer getHomeId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>GET_USKC.STRT_ID</code>.
     */
    public void setStrtId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>GET_USKC.STRT_ID</code>.
     */
    public Integer getStrtId() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>GET_USKC.CITY_ID</code>.
     */
    public void setCityId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>GET_USKC.CITY_ID</code>.
     */
    public Integer getCityId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>GET_USKC.REGION_ID</code>.
     */
    public void setRegionId(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>GET_USKC.REGION_ID</code>.
     */
    public Integer getRegionId() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>GET_USKC.STIME</code>.
     */
    public void setStime(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>GET_USKC.STIME</code>.
     */
    public Timestamp getStime() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>GET_USKC.STATE</code>.
     */
    public void setState(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>GET_USKC.STATE</code>.
     */
    public Integer getState() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>GET_USKC.V</code>.
     */
    public void setV(Double value) {
        set(16, value);
    }

    /**
     * Getter for <code>GET_USKC.V</code>.
     */
    public Double getV() {
        return (Double) get(16);
    }

    /**
     * Setter for <code>GET_USKC.V_ADC</code>.
     */
    public void setVAdc(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>GET_USKC.V_ADC</code>.
     */
    public Integer getVAdc() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>GET_USKC.T</code>.
     */
    public void setT(Double value) {
        set(18, value);
    }

    /**
     * Getter for <code>GET_USKC.T</code>.
     */
    public Double getT() {
        return (Double) get(18);
    }

    /**
     * Setter for <code>GET_USKC.T_ADC</code>.
     */
    public void setTAdc(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>GET_USKC.T_ADC</code>.
     */
    public Integer getTAdc() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>GET_USKC.TWRK</code>.
     */
    public void setTwrk(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>GET_USKC.TWRK</code>.
     */
    public Integer getTwrk() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>GET_USKC.TWRK_TEXT</code>.
     */
    public void setTwrkText(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>GET_USKC.TWRK_TEXT</code>.
     */
    public String getTwrkText() {
        return (String) get(21);
    }

    /**
     * Setter for <code>GET_USKC.SENSOR</code>.
     */
    public void setSensor(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>GET_USKC.SENSOR</code>.
     */
    public String getSensor() {
        return (String) get(22);
    }

    /**
     * Setter for <code>GET_USKC.SIGNAL_LEVEL</code>.
     */
    public void setSignalLevel(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>GET_USKC.SIGNAL_LEVEL</code>.
     */
    public Integer getSignalLevel() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>GET_USKC.MODEM_STAT</code>.
     */
    public void setModemStat(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>GET_USKC.MODEM_STAT</code>.
     */
    public Integer getModemStat() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>GET_USKC.VERS</code>.
     */
    public void setVers(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>GET_USKC.VERS</code>.
     */
    public String getVers() {
        return (String) get(25);
    }

    /**
     * Setter for <code>GET_USKC.VERDATE</code>.
     */
    public void setVerdate(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>GET_USKC.VERDATE</code>.
     */
    public String getVerdate() {
        return (String) get(26);
    }

    /**
     * Setter for <code>GET_USKC.ZNAME</code>.
     */
    public void setZname(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>GET_USKC.ZNAME</code>.
     */
    public String getZname() {
        return (String) get(27);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetUskcRecord
     */
    public GetUskcRecord() {
        super(GetUskc.GET_USKC);
    }

    /**
     * Create a detached, initialised GetUskcRecord
     */
    public GetUskcRecord(String adrStr, Integer uskId, Integer uskAbId, Integer uskUid, Integer uskTypeId, String uskType, String uskIp, String uskKey, Integer adrId, Integer fltId, Integer homeId, Integer strtId, Integer cityId, Integer regionId, Timestamp stime, Integer state, Double v, Integer vAdc, Double t, Integer tAdc, Integer twrk, String twrkText, String sensor, Integer signalLevel, Integer modemStat, String vers, String verdate, String zname) {
        super(GetUskc.GET_USKC);

        set(0, adrStr);
        set(1, uskId);
        set(2, uskAbId);
        set(3, uskUid);
        set(4, uskTypeId);
        set(5, uskType);
        set(6, uskIp);
        set(7, uskKey);
        set(8, adrId);
        set(9, fltId);
        set(10, homeId);
        set(11, strtId);
        set(12, cityId);
        set(13, regionId);
        set(14, stime);
        set(15, state);
        set(16, v);
        set(17, vAdc);
        set(18, t);
        set(19, tAdc);
        set(20, twrk);
        set(21, twrkText);
        set(22, sensor);
        set(23, signalLevel);
        set(24, modemStat);
        set(25, vers);
        set(26, verdate);
        set(27, zname);
    }
}
