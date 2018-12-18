package ru.smartsarov.citylighting;

public class UspdState {
	private int device_id;
	private boolean ph_a;
	private boolean ph_b;
	private boolean ph_c;
	private boolean relay1;
	private boolean relay2;
	private String ip_addr;
	private int uid;
	private String phis_addr;
	private Long ts_last_telemetry;
	private String link_type;

	
	public int getDevice_id() {
		return device_id;
	}
	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}
	public boolean isPh_a() {
		return ph_a;
	}
	public void setPh_a(boolean ph_a) {
		this.ph_a = ph_a;
	}
	public boolean isPh_b() {
		return ph_b;
	}
	public void setPh_b(boolean ph_b) {
		this.ph_b = ph_b;
	}
	public boolean isPh_c() {
		return ph_c;
	}
	public void setPh_c(boolean ph_c) {
		this.ph_c = ph_c;
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

	public UspdState(int device_id, boolean ph_a, boolean ph_b, boolean ph_c, boolean relay1, boolean relay2,
			String ip_addr, int uid, String phis_addr, Long ts_last_telemetry, String link_type) {
		this.device_id = device_id;
		this.ph_a = ph_a;
		this.ph_b = ph_b;
		this.ph_c = ph_c;
		this.relay1 = relay1;
		this.relay2 = relay2;
		this.ip_addr = ip_addr;
		this.uid = uid;
		this.phis_addr = phis_addr;
		this.ts_last_telemetry = ts_last_telemetry;
		this.link_type = link_type;
	}
	public UspdState() {
		this.device_id = 0;
		this.ph_a = false;
		this.ph_b = false;
		this.ph_c = false;
		this.relay1 = false;
		this.relay2 = false;
		this.ip_addr = "";
		this.uid = 0;
		this.phis_addr = "";
		this.ts_last_telemetry = 0L;
		this.link_type = "";
	}
	public UspdState  addParamToUspdState(int pinIndex, boolean val) {
		switch (pinIndex) {
		 case 1:
			 setPh_a(val);
			 break;
		 case 2:
			 setPh_b(val);
			 break;	 
		 case 3:
			 setPh_c(val);
			 break;	 
		 case 8: 	
			 setRelay1(val);
			 break;
		 case 12: 	
			 setRelay1(val);
			 break;
		 }
		return this;
	}
	public String getIp_addr() {
		return ip_addr;
	}
	public void setIp_addr(String ip_addr) {
		this.ip_addr = ip_addr;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getPhis_addr() {
		return phis_addr;
	}
	public void setPhis_addr(String phis_addr) {
		this.phis_addr = phis_addr;
	}
	public Long getTs_last_telemetry() {
		return ts_last_telemetry;
	}
	public void setTs_last_telemetry(Long ts_last_telemetry) {
		this.ts_last_telemetry = ts_last_telemetry;
	}
	public String getLink_type() {
		return link_type;
	}
	public void setLink_type(String link_type) {
		this.link_type = link_type;
	}

	
	
}
