package com.mock.request;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrderReminderQueryRequest {
    private String appId;
    private String userId;
}
