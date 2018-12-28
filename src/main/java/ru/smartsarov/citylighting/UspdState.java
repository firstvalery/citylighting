package ru.smartsarov.citylighting;

import java.math.BigDecimal;
import java.util.List;

public class UspdState {
	private int deviceId;
	private boolean phA;
	private boolean phB;
	private boolean phC;
	private boolean relay1;
	private boolean relay2;
	private String ipAddr;
	private int uid;
	private String phisAddr;
	private Long tsLastTelemetry;
	private String linkType;
	private int blockStandalone;
	private int blockAll;
	private String lastCmd = "";
	private String lastCmdState = "";
	private Long tslastCmdServer;
	private Long tslastCmdUsk;
	private List<List<BigDecimal[]>> geoData = null;

	
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public boolean isPhA() {
		return phA;
	}
	public void setPh_a(boolean phA) {
		this.phA = phA;
	}
	public boolean isPhB() {
		return phB;
	}
	public void setPh_b(boolean phB) {
		this.phB = phB;
	}
	public boolean isPhC() {
		return phC;
	}
	public void setPh_c(boolean phC) {
		this.phC = phC;
	}
	public boolean isRelay1() {
		return relay1;
	}
	public void setRelay1(boolean relay1) {
		this.relay1 = relay1;
	}
	public boolean isRelay2() {
		return relay2;
	}
	public void setRelay2(boolean relay2) {
		this.relay2 = relay2;
	}

	public UspdState(int deviceId, boolean phA, boolean phB, boolean phC, boolean relay1, boolean relay2,
			String ipAddr, int uid, String phisAddr, Long tsLastTelemetry, String linkType) {
		this.deviceId = deviceId;
		this.phA = phA;
		this.phB = phB;
		this.phC = phC;
		this.relay1 = relay1;
		this.relay2 = relay2;
		this.ipAddr = ipAddr;
		this.uid = uid;
		this.phisAddr = phisAddr;
		this.tsLastTelemetry = tsLastTelemetry;
		this.linkType = linkType;
	}
	public UspdState() {
		this.deviceId = 0;
		this.phA = false;
		this.phB = false;
		this.phC = false;
		this.relay1 = false;
		this.relay2 = false;
		this.ipAddr = "";
		this.uid = 0;
		this.phisAddr = "";
		this.tsLastTelemetry = 0L;
		this.linkType = "";
	}

	public String getIpAddr() {
		return ipAddr;
	}
	public void setIp_addr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getPhisAddr() {
		return phisAddr;
	}
	public void setPhis_addr(String phisAddr) {
		this.phisAddr = phisAddr;
	}
	public Long getTsLastTelemetry() {
		return tsLastTelemetry;
	}
	public void setTsLastTelemetry(Long tsLastTelemetry) {
		this.tsLastTelemetry = tsLastTelemetry;
	}
	public String getLinkType() {
		return linkType;
	}
	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}
	public List<List<BigDecimal[]>> getGeoData() {
		return geoData;
	}
	public void setGeoData(List<List<BigDecimal[]>> geoData) {
		this.geoData = geoData;
	}
	public int getBlockStandalone() {
		return blockStandalone;
	}
	public void setBlockStandalone(int blockStandalone) {
		this.blockStandalone = blockStandalone;
	}
	public int getBlockAll() {
		return blockAll;
	}
	public void setBlockAll(int blockAll) {
		this.blockAll = blockAll;
	}
	public String getLastCmd() {
		return lastCmd;
	}
	public void setLastCmd(String lastCmd) {
		this.lastCmd = lastCmd;
	}
	public String getLastCmdState() {
		return lastCmdState;
	}
	public void setLastCmdState(String lastCmdState) {
		this.lastCmdState = lastCmdState;
	}
	public Long getTslastCmdServer() {
		return tslastCmdServer;
	}
	public void setTslastCmdServer(Long tslastCmdServer) {
		this.tslastCmdServer = tslastCmdServer;
	}
	public Long getTslastCmdUsk() {
		return tslastCmdUsk;
	}
	public void setTslastCmdUsk(Long tslastCmdUsk) {
		this.tslastCmdUsk = tslastCmdUsk;
	}

	
	
}
