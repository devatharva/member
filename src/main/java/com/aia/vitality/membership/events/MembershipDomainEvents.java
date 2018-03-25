package com.aia.vitality.membership.events;

public class MembershipDomainEvents {
	
	MembershipSuccessEvent membershipSuccessEvents;
	MembershipFailureEvents membershipFailureEvents;
	
	public MembershipSuccessEvent getMembershipSuccessEvents() {
		return membershipSuccessEvents;
	}
	public void setMembershipSuccessEvents(MembershipSuccessEvent membershipSuccessEvents) {
		this.membershipSuccessEvents = membershipSuccessEvents;
	}
	public MembershipFailureEvents getMembershipFailureEvents() {
		return membershipFailureEvents;
	}
	public void setMembershipFailureEvents(MembershipFailureEvents membershipFailureEvents) {
		this.membershipFailureEvents = membershipFailureEvents;
	}
	
	
}
