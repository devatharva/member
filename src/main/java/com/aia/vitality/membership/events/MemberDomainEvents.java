package com.aia.vitality.membership.events;

public class MemberDomainEvents {

	MemberSuccessEvents memberSuccessEvents;
	MemberFailureEvents memberFailureEvents;
	public MemberSuccessEvents getMemberSuccessEvents() {
		return memberSuccessEvents;
	}
	public void setMemberSuccessEvents(MemberSuccessEvents memberSuccessEvents) {
		this.memberSuccessEvents = memberSuccessEvents;
	}
	public MemberFailureEvents getMemberFailureEvents() {
		return memberFailureEvents;
	}
	public void setMemberFailureEvents(MemberFailureEvents memberFailureEvents) {
		this.memberFailureEvents = memberFailureEvents;
	}
	
	
}
