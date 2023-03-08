package com.example.emailtransaction.member;

import com.example.emailtransaction.EmailSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberEventHandler {
    private final EmailSenderService emailSenderService;

    @EventListener
    public void memberSignedUpEventListener(MemberSignedUpEvent dto) {
        emailSenderService.sendSignUpEmail(dto.getMember());
    }
}
