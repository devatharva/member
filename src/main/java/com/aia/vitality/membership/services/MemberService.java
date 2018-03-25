package com.aia.vitality.membership.services;

import com.aia.vitality.membership.dto.ActivateMembershipRequest;
import com.aia.vitality.membership.dto.ActivateMembershipResponse;

public interface MemberService {
	

	public void executeMemberEnrollment(ActivateMembershipRequest activateMembershipRequest,ActivateMembershipResponse activateMembershipResponse);

}
