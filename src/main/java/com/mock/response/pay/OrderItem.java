package com.mock.response.pay;

import lombok.Data;

@Data
public class OrderItem {
    private String itemName;
    private String itemNum;
    private String amount;
}
