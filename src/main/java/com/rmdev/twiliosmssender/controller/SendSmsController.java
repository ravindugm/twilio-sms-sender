package com.rmdev.twiliosmssender.controller;

import com.rmdev.twiliosmssender.entity.SmsRequest;
import com.rmdev.twiliosmssender.service.SmsSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sms")
public class SendSmsController {

    private final SmsSenderService smsSenderService;

    @Autowired
    public SendSmsController(SmsSenderService smsSenderService) {
        this.smsSenderService = smsSenderService;
    }

    @PostMapping
    public void sendSms(@Validated @RequestBody SmsRequest smsRequest) {
        smsSenderService.sendSms(smsRequest);
    }
}
