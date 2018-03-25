package com.aia.vitality.membership.controller;

import com.aia.vitality.membership.dto.ActivateMembershipRequest;
import com.aia.vitality.membership.dto.ActivateMembershipResponse;
import com.aia.vitality.membership.services.MemberService;
import com.aia.vitality.membership.services.MembershipService;
import com.aia.vitality.membership.services.ProductService;
import com.aia.vitality.membership.utilities.ResponseBuilder;

public class MembershipController {

	MemberService memberService;
	MembershipService membershipService;
	ProductService productService;
	
	public ActivateMembershipResponse invokeMembershipProcess(ActivateMembershipRequest activateMembershipRequest)
	{
		
		// Request Validation, Mandatory parameters
		ValidationCommand validationCommand=new ValidationCommand();
		boolean isValidationSuccess=validationCommand.execute();
		
		if(isValidationSuccess)
		{
		ActivateMembershipResponse activateMembershipResponse=new ActivateMembershipResponse();
		memberService.executeMemberEnrollment(activateMembershipRequest,activateMembershipResponse);
		membershipService.executeMembership(activateMembershipRequest,activateMembershipResponse);
		productService.executeProductService(activateMembershipRequest,activateMembershipResponse);
		
		return ResponseBuilder.buildOk(activateMembershipRequest);
		}
		else
		{
		return ResponseBuilder.buildFailure(activateMembershipRequest); 
		}
	}
	
	// other API supporting membership microservice will go below e.g. getMember,getMembership,Update,Delete
	
}
