package com.aia.vitality.membership.events;

public class MemberFailureEvents {

	boolean isMemeberCreated;
	private String reason;

	public boolean isMemeberCreated() {
		return isMemeberCreated;
	}

	public void setMemeberCreated(boolean isMemeberCreated) {
		this.isMemeberCreated = isMemeberCreated;
	}
	
}
