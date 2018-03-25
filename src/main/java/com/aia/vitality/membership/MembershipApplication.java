package com.aia.vitality.membership;

import com.aia.vitality.membership.controller.MembershipController;
import com.aia.vitality.membership.dto.ActivateMembershipRequest;

/**
 * Hello world!
 *
 */
public class MembershipApplication 
{
    public static void main( String[] args )
    {
        MembershipController membershipFrontContoller=new MembershipController();
        ActivateMembershipRequest activateMembershipRequest=new ActivateMembershipRequest();
        membershipFrontContoller.invokeMembershipProcess(activateMembershipRequest);
    }
}
