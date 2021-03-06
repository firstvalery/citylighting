/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.ChangesCnt;


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
public class ChangesCntRecord extends UpdatableRecordImpl<ChangesCntRecord> {

    private static final long serialVersionUID = 1414637520;

    /**
     * Setter for <code>CHANGES_CNT.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CHANGES_CNT.LOGIN</code>.
     */
    public void setLogin(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.LOGIN</code>.
     */
    public String getLogin() {
        return (String) get(1);
    }

    /**
     * Setter for <code>CHANGES_CNT.CHANGE_TIME</code>.
     */
    public void setChangeTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CHANGE_TIME</code>.
     */
    public Timestamp getChangeTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>CHANGES_CNT.CHANGE_TYPE</code>.
     */
    public void setChangeType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CHANGE_TYPE</code>.
     */
    public Integer getChangeType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_ID</code>.
     */
    public void setCntId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_ID</code>.
     */
    public Integer getCntId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_PID</code>.
     */
    public void setCntPid(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_PID</code>.
     */
    public Integer getCntPid() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_AB_ID</code>.
     */
    public void setCntAbId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_AB_ID</code>.
     */
    public Integer getCntAbId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_UNK_ID</code>.
     */
    public void setCntUnkId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_UNK_ID</code>.
     */
    public Integer getCntUnkId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_ATYPE</code>.
     */
    public void setCntAtype(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_ATYPE</code>.
     */
    public Integer getCntAtype() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_BTYPE</code>.
     */
    public void setCntBtype(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_BTYPE</code>.
     */
    public Integer getCntBtype() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_SNUM</code>.
     */
    public void setCntSnum(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_SNUM</code>.
     */
    public String getCntSnum() {
        return (String) get(10);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_NETADR</code>.
     */
    public void setCntNetadr(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_NETADR</code>.
     */
    public String getCntNetadr() {
        return (String) get(11);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_ENTRY</code>.
     */
    public void setCntEntry(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_ENTRY</code>.
     */
    public Integer getCntEntry() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_QTIME</code>.
     */
    public void setCntQtime(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_QTIME</code>.
     */
    public Integer getCntQtime() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_REQUEST</code>.
     */
    public void setCntRequest(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_REQUEST</code>.
     */
    public Integer getCntRequest() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_NAME</code>.
     */
    public void setCntName(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_NAME</code>.
     */
    public String getCntName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_ADR_ID</code>.
     */
    public void setCntAdrId(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_ADR_ID</code>.
     */
    public Integer getCntAdrId() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_STARTVALUE</code>.
     */
    public void setCntStartvalue(Double value) {
        set(17, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_STARTVALUE</code>.
     */
    public Double getCntStartvalue() {
        return (Double) get(17);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_CORRECTION</code>.
     */
    public void setCntCorrection(Double value) {
        set(18, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_CORRECTION</code>.
     */
    public Double getCntCorrection() {
        return (Double) get(18);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_TRANSFORMATION</code>.
     */
    public void setCntTransformation(Double value) {
        set(19, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_TRANSFORMATION</code>.
     */
    public Double getCntTransformation() {
        return (Double) get(19);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_MAXPOWER</code>.
     */
    public void setCntMaxpower(Double value) {
        set(20, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_MAXPOWER</code>.
     */
    public Double getCntMaxpower() {
        return (Double) get(20);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_MNGLINE</code>.
     */
    public void setCntMngline(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_MNGLINE</code>.
     */
    public Integer getCntMngline() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_SDATE</code>.
     */
    public void setCntSdate(Timestamp value) {
        set(22, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_SDATE</code>.
     */
    public Timestamp getCntSdate() {
        return (Timestamp) get(22);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_EDATE</code>.
     */
    public void setCntEdate(Timestamp value) {
        set(23, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_EDATE</code>.
     */
    public Timestamp getCntEdate() {
        return (Timestamp) get(23);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_VALUE1</code>.
     */
    public void setCntValue1(Double value) {
        set(24, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_VALUE1</code>.
     */
    public Double getCntValue1() {
        return (Double) get(24);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_VALUE2</code>.
     */
    public void setCntValue2(Double value) {
        set(25, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_VALUE2</code>.
     */
    public Double getCntValue2() {
        return (Double) get(25);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_VALUE3</code>.
     */
    public void setCntValue3(Double value) {
        set(26, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_VALUE3</code>.
     */
    public Double getCntValue3() {
        return (Double) get(26);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_CHANNEL</code>.
     */
    public void setCntChannel(Integer value) {
        set(27, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_CHANNEL</code>.
     */
    public Integer getCntChannel() {
        return (Integer) get(27);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_NUM_ABONENT</code>.
     */
    public void setCntNumAbonent(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_NUM_ABONENT</code>.
     */
    public String getCntNumAbonent() {
        return (String) get(28);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_CTYPE</code>.
     */
    public void setCntCtype(Integer value) {
        set(29, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_CTYPE</code>.
     */
    public Integer getCntCtype() {
        return (Integer) get(29);
    }

    /**
     * Setter for <code>CHANGES_CNT.CNT_EXT_MOD</code>.
     */
    public void setCntExtMod(Integer value) {
        set(30, value);
    }

    /**
     * Getter for <code>CHANGES_CNT.CNT_EXT_MOD</code>.
     */
    public Integer getCntExtMod() {
        return (Integer) get(30);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ChangesCntRecord
     */
    public ChangesCntRecord() {
        super(ChangesCnt.CHANGES_CNT);
    }

    /**
     * Create a detached, initialised ChangesCntRecord
     */
    public ChangesCntRecord(Integer id, String login, Timestamp changeTime, Integer changeType, Integer cntId, Integer cntPid, Integer cntAbId, Integer cntUnkId, Integer cntAtype, Integer cntBtype, String cntSnum, String cntNetadr, Integer cntEntry, Integer cntQtime, Integer cntRequest, String cntName, Integer cntAdrId, Double cntStartvalue, Double cntCorrection, Double cntTransformation, Double cntMaxpower, Integer cntMngline, Timestamp cntSdate, Timestamp cntEdate, Double cntValue1, Double cntValue2, Double cntValue3, Integer cntChannel, String cntNumAbonent, Integer cntCtype, Integer cntExtMod) {
        super(ChangesCnt.CHANGES_CNT);

        set(0, id);
        set(1, login);
        set(2, changeTime);
        set(3, changeType);
        set(4, cntId);
        set(5, cntPid);
        set(6, cntAbId);
        set(7, cntUnkId);
        set(8, cntAtype);
        set(9, cntBtype);
        set(10, cntSnum);
        set(11, cntNetadr);
        set(12, cntEntry);
        set(13, cntQtime);
        set(14, cntRequest);
        set(15, cntName);
        set(16, cntAdrId);
        set(17, cntStartvalue);
        set(18, cntCorrection);
        set(19, cntTransformation);
        set(20, cntMaxpower);
        set(21, cntMngline);
        set(22, cntSdate);
        set(23, cntEdate);
        set(24, cntValue1);
        set(25, cntValue2);
        set(26, cntValue3);
        set(27, cntChannel);
        set(28, cntNumAbonent);
        set(29, cntCtype);
        set(30, cntExtMod);
    }
}
