package com.rmdev.twiliosmssender.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@NonNull
public class SmsRequest {

    private String phoneNumber;
    private String message;

}
