package ru.smartsarov.citylighting;

public class UspdState {
	private int device_id;
	private boolean ph_a;
	private boolean ph_b;
	private boolean ph_c;
	private boolean relay1;
	private boolean relay2;
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
	
	public UspdState(int device_id, boolean ph_a, boolean ph_b, boolean ph_c, boolean relay1, boolean relay2) {
		this.device_id = device_id;
		this.ph_a = ph_a;
		this.ph_b = ph_b;
		this.ph_c = ph_c;
		this.relay1 = relay1;
		this.relay2 = relay2;
	}
	
	public UspdState() {
		this.device_id = 0;
		this.ph_a = false;
		this.ph_b = false;
		this.ph_c = false;
		this.relay1 = false;
		this.relay2 = false;
	}
	
}
