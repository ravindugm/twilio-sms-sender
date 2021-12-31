package com.rmdev.twiliosmssender.service;

import com.rmdev.twiliosmssender.entity.SmsRequest;

public interface SmsSender {

    public void sendSms(SmsRequest smsRequest);

}
