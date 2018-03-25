package com.aia.vitality.membership.services.impl;

import com.aia.vitality.membership.dto.ActivateMembershipRequest;
import com.aia.vitality.membership.dto.ActivateMembershipResponse;
import com.aia.vitality.membership.repository.MemberRepository;
import com.aia.vitality.membership.services.MemberService;

public class MemberServiceImpl implements MemberService{
	
	MemberRepository memberRepository;

	public void executeMemberEnrollment(ActivateMembershipRequest activateMembershipRequest,ActivateMembershipResponse activateMembershipResponse) {

		/**
		 * 1.Based on the request type call methods for member profile
		 * 	1.1 individual
		 *  1.2 corporate
		 *  	1.2.1 create group
		 *  	1.2.1 group structure
		 * 2. Assign role
		 * 	2.1 assign some role to member
		 * 3. Status
		 */
		
	}
	
	
}
