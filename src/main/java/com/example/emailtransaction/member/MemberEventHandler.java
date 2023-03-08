package com.example.emailtransaction.member;

import com.example.emailtransaction.EmailSenderService;
import com.example.emailtransaction.coupon.CouponIssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberEventHandler {
    private final EmailSenderService emailSenderService;
    private final CouponIssueService couponIssueService;

    @EventListener
    public void memberSignedUpEventListener(MemberSignedUpEvent dto) {
        emailSenderService.sendSignUpEmail(dto.getMember());
        couponIssueService.issueSignUpCoupon(dto.getMember().getId());
    }
}
