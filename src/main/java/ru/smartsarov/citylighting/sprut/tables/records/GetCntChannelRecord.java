/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.GetCntChannel;


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
public class GetCntChannelRecord extends TableRecordImpl<GetCntChannelRecord> {

    private static final long serialVersionUID = 1850916977;

    /**
     * Setter for <code>GET_CNT_CHANNEL.CNT_ID</code>.
     */
    public void setCntId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.CNT_ID</code>.
     */
    public Integer getCntId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.CNTB_ID</code>.
     */
    public void setCntbId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.CNTB_ID</code>.
     */
    public Integer getCntbId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.CNT_AB_ID</code>.
     */
    public void setCntAbId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.CNT_AB_ID</code>.
     */
    public Integer getCntAbId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.CNT_SNUM</code>.
     */
    public void setCntSnum(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.CNT_SNUM</code>.
     */
    public String getCntSnum() {
        return (String) get(3);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.CNT_NAME</code>.
     */
    public void setCntName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.CNT_NAME</code>.
     */
    public String getCntName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.USK_IP</code>.
     */
    public void setUskIp(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.USK_IP</code>.
     */
    public String getUskIp() {
        return (String) get(5);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.INDEX_PUT</code>.
     */
    public void setIndexPut(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.INDEX_PUT</code>.
     */
    public Integer getIndexPut() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.TYPE_PUT</code>.
     */
    public void setTypePut(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.TYPE_PUT</code>.
     */
    public Integer getTypePut() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.CHANNEL_NAME</code>.
     */
    public void setChannelName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.CHANNEL_NAME</code>.
     */
    public String getChannelName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.CHANNEL_TYPE_NAME</code>.
     */
    public void setChannelTypeName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.CHANNEL_TYPE_NAME</code>.
     */
    public String getChannelTypeName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.CHANNEL_TYPE_DEM</code>.
     */
    public void setChannelTypeDem(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.CHANNEL_TYPE_DEM</code>.
     */
    public String getChannelTypeDem() {
        return (String) get(10);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.CHANNEL_TYPE_ID</code>.
     */
    public void setChannelTypeId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.CHANNEL_TYPE_ID</code>.
     */
    public Integer getChannelTypeId() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.VAL</code>.
     */
    public void setVal(Double value) {
        set(12, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.VAL</code>.
     */
    public Double getVal() {
        return (Double) get(12);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.SERVER_TIME</code>.
     */
    public void setServerTime(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.SERVER_TIME</code>.
     */
    public Timestamp getServerTime() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.COUNTER_TIME</code>.
     */
    public void setCounterTime(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.COUNTER_TIME</code>.
     */
    public Timestamp getCounterTime() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.STATE</code>.
     */
    public void setState(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.STATE</code>.
     */
    public Integer getState() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.CSTATE</code>.
     */
    public void setCstate(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.CSTATE</code>.
     */
    public String getCstate() {
        return (String) get(16);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.ADR_ID</code>.
     */
    public void setAdrId(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.ADR_ID</code>.
     */
    public Integer getAdrId() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.FLT_ID</code>.
     */
    public void setFltId(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.FLT_ID</code>.
     */
    public Integer getFltId() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.HOME_ID</code>.
     */
    public void setHomeId(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.HOME_ID</code>.
     */
    public Integer getHomeId() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.STRT_ID</code>.
     */
    public void setStrtId(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.STRT_ID</code>.
     */
    public Integer getStrtId() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.CITY_ID</code>.
     */
    public void setCityId(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.CITY_ID</code>.
     */
    public Integer getCityId() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.REGION_ID</code>.
     */
    public void setRegionId(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.REGION_ID</code>.
     */
    public Integer getRegionId() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.ADR_STR</code>.
     */
    public void setAdrStr(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.ADR_STR</code>.
     */
    public String getAdrStr() {
        return (String) get(23);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.CNT_REQUEST</code>.
     */
    public void setCntRequest(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.CNT_REQUEST</code>.
     */
    public Integer getCntRequest() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>GET_CNT_CHANNEL.CHANNEL_ID</code>.
     */
    public void setChannelId(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>GET_CNT_CHANNEL.CHANNEL_ID</code>.
     */
    public Integer getChannelId() {
        return (Integer) get(25);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetCntChannelRecord
     */
    public GetCntChannelRecord() {
        super(GetCntChannel.GET_CNT_CHANNEL);
    }

    /**
     * Create a detached, initialised GetCntChannelRecord
     */
    public GetCntChannelRecord(Integer cntId, Integer cntbId, Integer cntAbId, String cntSnum, String cntName, String uskIp, Integer indexPut, Integer typePut, String channelName, String channelTypeName, String channelTypeDem, Integer channelTypeId, Double val, Timestamp serverTime, Timestamp counterTime, Integer state, String cstate, Integer adrId, Integer fltId, Integer homeId, Integer strtId, Integer cityId, Integer regionId, String adrStr, Integer cntRequest, Integer channelId) {
        super(GetCntChannel.GET_CNT_CHANNEL);

        set(0, cntId);
        set(1, cntbId);
        set(2, cntAbId);
        set(3, cntSnum);
        set(4, cntName);
        set(5, uskIp);
        set(6, indexPut);
        set(7, typePut);
        set(8, channelName);
        set(9, channelTypeName);
        set(10, channelTypeDem);
        set(11, channelTypeId);
        set(12, val);
        set(13, serverTime);
        set(14, counterTime);
        set(15, state);
        set(16, cstate);
        set(17, adrId);
        set(18, fltId);
        set(19, homeId);
        set(20, strtId);
        set(21, cityId);
        set(22, regionId);
        set(23, adrStr);
        set(24, cntRequest);
        set(25, channelId);
    }
}
