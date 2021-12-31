package com.rmdev.twiliosmssender.service;

import com.rmdev.twiliosmssender.entity.SmsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SmsSenderService {

    private final SmsSender smsSender;

    @Autowired
    public SmsSenderService(@Qualifier("twilio") TwilioSmsSender smsSender) {
        this.smsSender = smsSender;

    }

    public void sendSms(SmsRequest smsRequest) {
        smsSender.sendSms(smsRequest);
    }
}
