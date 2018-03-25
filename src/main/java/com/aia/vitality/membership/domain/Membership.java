package com.aia.vitality.membership.domain;

public class Membership {
	
	private Long membershipID;
	
	private Member member;

	public Long getMembershipID() {
		return membershipID;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public void setMembershipID(Long membershipID) {
		this.membershipID = membershipID;
	}

	public Member getMember() {
		return member;
	}
	
	
}

