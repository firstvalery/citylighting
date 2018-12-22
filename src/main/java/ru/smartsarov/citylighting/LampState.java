package ru.smartsarov.citylighting;

public class LampState {
	int deviceId = 0;
	String addres = "";
	int badLampA = 0;
	int badLampB = 0;
	int badLampC = 0;

	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public int getBadLampA() {
		return badLampA;
	}
	public void setBadLampA(int badLampA) {
		this.badLampA = badLampA;
	}
	public int getBadLampB() {
		return badLampB;
	}
	public void setBadLampB(int badLampB) {
		this.badLampB = badLampB;
	}
	public int getBadLampC() {
		return badLampC;
	}
	public void setBadLampC(int badLampC) {
		this.badLampC = badLampC;
	}
	
	public LampState(int deviceId, String addres, int badLampA, int badLampB, int badLampC) {
		this.deviceId = deviceId;
		this.addres = addres;
		this.badLampA = badLampA;
		this.badLampB = badLampB;
		this.badLampC = badLampC;
	}
	
	public LampState() {
		this.deviceId = 0;
		this.addres = "";
		this.badLampA = 0;
		this.badLampB = 0;
		this.badLampC = 0;
	}
	
	
	
}